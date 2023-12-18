
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    // TODO solve
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        final int r = scanner.nextInt();

        final int[] toVisit = new int[r];
        for (int i = 0; i < r; i++) {
            toVisit[i] = scanner.nextInt() - 1;
        }

        final Map<Integer, List<Destination>> graph = new HashMap<>();
        for (int i = 0; i < m; i++) {
            final int a = scanner.nextInt() - 1;
            final int b = scanner.nextInt() - 1;
            final int c = scanner.nextInt();

            graph.computeIfAbsent(a, v -> new ArrayList<>()).add(new Destination(b, c));
            graph.computeIfAbsent(b, v -> new ArrayList<>()).add(new Destination(a, c));
        }

        final long[][] min = new long[n][n];

        for (int i = 0; i < toVisit.length; i++) {
            final int from = toVisit[i];
            for (int j = i + 1, toVisitLength = toVisit.length; j < toVisitLength; j++) {
                final int to = toVisit[j];
                if (from == to) {
                    continue;
                }

                final long[] minDistances = new long[n];
                Arrays.fill(minDistances, -1);
                minDistances[from] = 0;

                final PriorityQueue<Destination> queue = new PriorityQueue<>(Comparator.comparingLong(o -> o.distance));
                queue.addAll(graph.get(from));
                final Destination poll = queue.poll();
                minDistances[poll.city] = poll.distance;
                dijkstra(minDistances, poll.city, to, graph, queue);

                min[from][to] = minDistances[to];
                min[to][from] = minDistances[to];
            }
        }

        final Set<Integer> set = Arrays.stream(toVisit)
                .boxed()
                .collect(Collectors.toSet());

        permutation(0, r, set, new int[r], min);
        System.out.println(answer);
    }

    static long answer = Long.MAX_VALUE;

    private static void permutation(final int level, final int length, final Set<Integer> set, final int[] per, final long[][] min) {
        if (level == length) {
            long temp = 0;
            for (int i = 0; i < per.length - 1; i++) {
                temp += min[per[i]][per[i + 1]];
            }
            answer = Math.min(answer, temp);
            return;
        }

        for (final int element : set) {
            final Set<Integer> set2 = new HashSet<>(set);
            set2.remove(element);
            per[level] = element;
            permutation(level + 1, length, set2, per, min);
        }
    }

    private static void dijkstra(final long[] distances, final int current, final int finalDestination, final Map<Integer, List<Destination>> graph, final PriorityQueue<Destination> queue) {
        if (distances[finalDestination] >= 0 || queue.isEmpty()) {
            return;
        }

        for (final Destination dest : graph.get(current)) {
            if (dest.city == current || distances[dest.city] >= 0) {
                continue;
            }

            queue.add(new Destination(dest.city, distances[current] + dest.distance));
        }

        Destination nextCity;
        while (distances[(nextCity = queue.poll()).city] >= 0) ;

        distances[nextCity.city] = nextCity.distance;
        dijkstra(distances, nextCity.city, finalDestination, graph, queue);
    }

    static class Destination {
        int city;
        long distance;

        Destination(final int city, final long distance) {
            this.city = city;
            this.distance = distance;
        }
    }
}
