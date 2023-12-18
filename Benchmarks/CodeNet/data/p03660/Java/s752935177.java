
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();

        final Map<Integer, List<Integer>> tree = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            final int a = scanner.nextInt();
            final int b = scanner.nextInt();

            tree.computeIfAbsent(a, v -> new ArrayList<>()).add(b);
            tree.computeIfAbsent(b, v -> new ArrayList<>()).add(a);
        }

        final boolean[] isVisited = new boolean[n + 1];
        isVisited[1] = true;
        final Deque<Integer> route = search(tree, isVisited, 1, n);
        route.addFirst(1);

        final Deque<Integer> fennecRoute = new ArrayDeque<>();
        final Deque<Integer> snukeRoute = new ArrayDeque<>();
        while (true) {
            fennecRoute.add(route.pollFirst());
            if (route.isEmpty()) break;
            snukeRoute.add(route.pollLast());
            if (route.isEmpty()) break;
        }

        final boolean[] isAdded = new boolean[n + 1];
        for (final int toVisit : fennecRoute) {
            isAdded[toVisit] = true;
        }
        for (final int toVisit : snukeRoute) {
            isAdded[toVisit] = true;
        }

        while (true) {
            if (fennecRoute.isEmpty()) {
                System.out.println("Snuke");
                return;
            }
            final int fennecCurrent = fennecRoute.pollFirst();
            for (final int fennecNext : tree.get(fennecCurrent)) {
                if (!isAdded[fennecNext]) {
                    fennecRoute.add(fennecNext);
                }
            }

            if (snukeRoute.isEmpty()) {
                System.out.println("Fennec");
                return;
            }
            final int snukeCurrent = snukeRoute.pollFirst();
            for (final int snukeNext : tree.get(snukeCurrent)) {
                if (!isAdded[snukeNext]) {
                    snukeRoute.add(snukeNext);
                }
            }
        }
    }

    private static Deque<Integer> search(final Map<Integer, List<Integer>> tree, final boolean[] isVisited, final int current, final int dest) {
        if (current == dest) {
            final Deque<Integer> route = new ArrayDeque<>();
            route.add(dest);
            return route;
        }

        for (final int next : tree.get(current)) {
            if (!isVisited[next]) {
                isVisited[next] = true;
                final Deque<Integer> route = search(tree, isVisited, next, dest);
                if (!route.isEmpty()) {
                    return route;
                }
            }
        }

        return new ArrayDeque<>();
    }
}
