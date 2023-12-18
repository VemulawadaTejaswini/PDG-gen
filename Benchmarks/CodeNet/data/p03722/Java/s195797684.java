
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();

        final Map<Integer, List<Edge>> graph = new HashMap<>();
        for (int i = 0; i < m; i++) {
            final int a = scanner.nextInt();
            final int b = scanner.nextInt();
            final int c = scanner.nextInt();

            graph.computeIfAbsent(a, v -> new ArrayList<>()).add(new Edge(a, b, c));
        }

        final Deque<Edge> queue = new ArrayDeque<>(graph.get(1));
        final long[] array = new long[n + 1];
        Arrays.fill(array, Long.MIN_VALUE);
        array[1] = 0;

        for (int i = 0; i < n * n; i++) {
            if (queue.isEmpty()) {
                System.out.println(array[n]);
                return;
            }

            final Edge edge = queue.pollFirst();
            if (array[edge.from] + edge.weight <= array[edge.to]) {
                continue;
            }
            array[edge.to] = array[edge.from] + edge.weight;
            final List<Edge> next = graph.get(edge.to);
            if (next != null) {
                queue.addAll(next);
            }
        }

        queue.clear();
        queue.addAll(graph.get(1));
        final boolean[] isClosed = new boolean[n + 1];
        for (int i = 0; i < n * n; i++) {
            final Edge edge = queue.pollFirst();
            if (isClosed[edge.from]) {
                isClosed[edge.to] = true;
            }
            if (array[edge.from] + edge.weight <= array[edge.to]) {
                continue;
            }
            array[edge.to] = array[edge.from] + edge.weight;
            isClosed[edge.to] = true;
            final List<Edge> next = graph.get(edge.to);
            if (next != null) {
                queue.addAll(next);
            }
        }

        if (isClosed[n]) {
            System.out.println("inf");
        } else {
            System.out.println(array[n]);
        }
    }

    static class Edge {
        int from;
        int to;
        long weight;

        Edge(final int from, final int to, final long weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }
    }
}
