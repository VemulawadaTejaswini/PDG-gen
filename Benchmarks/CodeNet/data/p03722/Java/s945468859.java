
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

        final Edge[] edges = new Edge[m];
        for (int i = 0; i < m; i++) {
            final int a = scanner.nextInt();
            final int b = scanner.nextInt();
            final int c = scanner.nextInt();

            edges[i] = new Edge(a, b, -c);
        }

        final long[] array = new long[n + 1];
        Arrays.fill(array, Long.MAX_VALUE);
        array[1] = 0;

        int count = n;

        while (count-- > 0) {
            boolean isUpdated = false;

            for (final Edge edge : edges) {
                if (array[edge.from] != Long.MAX_VALUE && array[edge.from] + edge.weight < array[edge.to]) {
                    array[edge.to] = array[edge.from] + edge.weight;
                    isUpdated = true;
                }
            }

            if (!isUpdated) {
                System.out.println(-array[n]);
                return;
            }
        }

        System.out.println("inf");
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
