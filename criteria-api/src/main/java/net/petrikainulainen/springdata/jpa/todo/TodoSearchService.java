package net.petrikainulainen.springdata.jpa.todo;

import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * This service provides finder methods for {@link net.petrikainulainen.springdata.jpa.todo.Todo} objects.
 *
 * @author Petri Kainulainen
 */
public interface TodoSearchService {

    /**
     * Finds todo entries whose title or description contains the given search term.
     * This search is case insensitive.
     * @param searchTerm    The search term.
     * @param sort          The sort specification.
     * @return
     */
    List<TodoDTO> findBySearchTerm(String searchTerm, Sort sort);
}
