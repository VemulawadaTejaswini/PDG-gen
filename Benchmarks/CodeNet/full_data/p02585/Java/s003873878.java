
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(final String[] args) {
        final FastScanner scanner = new FastScanner(System.in);
        final int n = scanner.nextInt();
        final int k = scanner.nextInt();
        final List<Integer> p = IntStream.range(0, n)
            .mapToObj(i -> scanner.nextInt())
            .collect(Collectors.toList());
        final List<Integer> c = IntStream.range(0, n)
            .mapToObj(i -> scanner.nextInt())
            .collect(Collectors.toList());

        final UnionFindTree tree = new UnionFindTree(n);
        for (int i = 1; i <= n; i++) {
            tree.unit(i, p.get(i - 1));
        }

        final Map<Integer, List<Integer>> groups = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            groups.computeIfAbsent(tree.getRoot(i), v -> new ArrayList<>()).add(i);
        }

        long largest = Long.MIN_VALUE;
        for (final List<Integer> group : groups.values()) {
            if (k <= group.size()) {
                largest = Math.max(largest, findLargestStream(p, c, group, k));
                continue;
            }

            final long sum = group.stream()
                .mapToLong(i -> c.get(i - 1))
                .sum();
            if (sum <= 0) {
                final int max = group.stream()
                    .mapToInt(i -> c.get(i - 1))
                    .max()
                    .orElseThrow();
                if (max <= 0) {
                    largest = Math.max(largest, max);
                    continue;
                }
                largest = Math.max(largest, findLargestStream(p, c, group, group.size()));
                continue;
            }

            final long base = k / group.size() * sum;
            final int mod = k % group.size();
            final long additional = mod == 0? 0:findLargestStream(p, c, group, mod);
            largest = Math.max(largest, base + additional);
        }
        System.out.println(largest);
    }

    private static long findLargestStream(final List<Integer> p, final List<Integer> c, final List<Integer> group, final int limit) {
        long largest = Long.MIN_VALUE;
        for (final int initial : group) {
            long sum = 0;
            for (int j = initial, k = 0; k < limit; k++) {
                j = p.get(j - 1);
                sum += c.get(j - 1);
                largest = Math.max(largest, sum);
            }
        }
        return largest;
    }

    private static class UnionFindTree {
        private final Integer[] nodes;
        private final List<Integer> indices = new ArrayList<>();

        UnionFindTree(final int numOfNodes) {
            this.nodes = init(numOfNodes);
        }

        private Integer[] init(final int numOfNodes) {
            return IntStream.rangeClosed(0, numOfNodes)
                .boxed()
                .toArray(Integer[]::new);
        }

        /**
         * 引数のノードが属している木の根を返す．
         *
         * @param nodeNumber ノードの番号
         * @return 根，つまり属している集合の中の一番小さい値
         */
        int getRoot(final int nodeNumber) {
            final int rootNode = nodes[nodeNumber];
            if (rootNode == nodeNumber) {
                for (final Integer index : indices) {
                    nodes[index] = rootNode;
                }
                indices.clear();
                return nodeNumber;
            }

            indices.add(nodeNumber);
            return getRoot(rootNode);
        }

        /**
         * 引数のノードが属する集合を合体させる．
         *
         * @param nodeA ノード
         * @param nodeB ノード
         */
        void unit(final int nodeA, final int nodeB) {
            final int rootA = getRoot(nodeA);
            final int rootB = getRoot(nodeB);

            if (rootA == rootB) {
                return;
            }

            nodes[Math.max(rootA, rootB)] = Math.min(rootA, rootB);
        }
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

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
    