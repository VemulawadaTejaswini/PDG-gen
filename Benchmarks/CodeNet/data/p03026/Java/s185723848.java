
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
TODO solve
 */
public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();

        final Map<Integer, List<Integer>> tree = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            final int a = scanner.nextInt();
            final int b = scanner.nextInt();

            tree.computeIfAbsent(a, v -> new ArrayList<>()).add(b);
            tree.computeIfAbsent(b, v -> new ArrayList<>()).add(a);
        }

        final PriorityQueue<Integer> queue = IntStream.range(0, n)
                .mapToObj(i -> scanner.nextInt())
                .sorted(Integer::compareTo)
                .collect(Collectors.toCollection(() -> new PriorityQueue<>(Comparator.comparingInt(i -> -i))));

        final int[] vertexes = new int[n + 1];
        vertexes[1] = queue.poll();
        dfs(1, tree, vertexes, queue);

        final int sum = Arrays.stream(vertexes, 2, vertexes.length)
                .sum();
        final String numbers = Arrays.stream(vertexes, 1, vertexes.length)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(" "));

        System.out.println(sum);
        System.out.println(numbers);
    }

    private static void dfs(final int current, final Map<Integer, List<Integer>> tree, final int[] vertexes, final PriorityQueue<Integer> queue) {
        final List<Integer> nextVertexes = tree.get(current);
        for (final int next : nextVertexes) {
            if (vertexes[next] == 0) {
                vertexes[next] = queue.poll();
                dfs(next, tree, vertexes, queue);
            }
        }
    }

    private static class FastScanner {
        private final BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(final InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
