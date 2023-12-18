
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();

        final Map<Integer, List<Integer>> graph = new HashMap<>();
        final int maxVertex = makeVertex(n - 1, n, n);
        final boolean[] exists = new boolean[maxVertex + 1];
        final Set<Integer> startVertex = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            int parent = makeVertex(i, scanner.nextInt(), n);
            if (!exists[parent]) {
                exists[parent] = true;
                startVertex.add(parent);
            }
            for (int j = 2; j <= n - 1; j++) {
                final int current = makeVertex(i, scanner.nextInt(), n);
                startVertex.remove(current);
                graph.computeIfAbsent(parent, v -> new ArrayList<>()).add(current);
                parent = current;
            }
        }

        int max = -1;
        final int[] memo = new int[maxVertex + 1];
        Arrays.fill(memo, -1);
        for (final int vertex : startVertex) {
            final int depth = dfs(graph, vertex, new boolean[maxVertex + 1], memo);
            if (depth == -1) {
                System.out.println(-1);
                return;
            }
            max = Math.max(max, depth);
        }
        System.out.println(max);
    }

    private static int dfs(final Map<Integer, List<Integer>> graph, final int current, final boolean[] isVisited, final int[] memo) {
        isVisited[current] = true;
        final List<Integer> children = graph.get(current);
        if (children == null) {
            memo[current] = 1;
            isVisited[current] = false;
            return 1;
        }
        if (memo[current] > 0) {
            isVisited[current] = false;
            return memo[current];
        }

        int max = -1;
        for (final int child : children) {
            if (isVisited[child]) {
                return -1;
            }
            final int depth = dfs(graph, child, isVisited, memo);
            if (depth == -1) {
                return -1;
            }
            max = Math.max(max, depth);
        }

        isVisited[current] = false;
        memo[current] = max + 1;
        return max + 1;
    }

    private static int makeVertex(final int a, final int b, final int n) {
        return Math.min(a, b) * (n + 1) + Math.max(a, b);
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
