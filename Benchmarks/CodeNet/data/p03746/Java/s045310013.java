

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();

        final Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < m; i++) {
            final int a = scanner.nextInt();
            final int b = scanner.nextInt();
            graph.computeIfAbsent(a, v -> new ArrayList<>()).add(b);
            graph.computeIfAbsent(b, v -> new ArrayList<>()).add(a);
        }

        final Optional<Map.Entry<Integer, List<Integer>>> simpleNode = graph.entrySet().stream()
            .filter(entry -> entry.getValue().size() == 1)
            .findFirst();
        if (simpleNode.isPresent()) {
            System.out.println(2);
            System.out.println(simpleNode.get().getKey() + " " + simpleNode.get().getValue().get(0));
            return;
        }

        final Map.Entry<Integer, List<Integer>> min = graph.entrySet().stream()
            .filter(e -> e.getValue().size() == 2)
            .findFirst()
            .orElseThrow();

        final boolean[] isVisited = new boolean[n + 1];
        final int begin = min.getValue().get(0);
        final int dest = min.getValue().get(1);
        isVisited[begin] = true;
        final Deque<Integer> queue = dfs(graph, begin, dest, isVisited);
        assert queue != null;
        queue.addFirst(min.getKey());
        System.out.println(queue.size());
        final String answer = queue.stream()
            .map(i -> Integer.toString(i))
            .collect(Collectors.joining(" "));
        System.out.println(answer);
    }

    private static Deque<Integer> dfs(final Map<Integer, List<Integer>> graph, final int current, final int dest, final boolean[] isVisited) {
        if (current == dest) {
            final Deque<Integer> queue = new ArrayDeque<>();
            queue.add(dest);
            return queue;
        }

        final List<Integer> nextCandidates = graph.get(current);
        for (final int next : nextCandidates) {
            if (isVisited[next]) {
                continue;
            }

            isVisited[next] = true;
            final Deque<Integer> queue = dfs(graph, next, dest, isVisited);
            if (queue != null) {
                queue.addFirst(current);
                return queue;
            }
        }

        return null;
    }

    private static class FastScanner {
        private final BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(final InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (final IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (final IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
