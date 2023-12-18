
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        final int k = scanner.nextInt();

        final Map<Integer, List<Integer>> friendMap = new HashMap<>();
        final Map<Integer, List<Integer>> blockMap = new HashMap<>();
        final FastUnionFindTree tree = new FastUnionFindTree(n);
        for (int i = 0; i < m; i++) {
            final int a = scanner.nextInt();
            final int b = scanner.nextInt();

            friendMap.computeIfAbsent(a, v -> new ArrayList<>()).add(b);
            friendMap.computeIfAbsent(b, v -> new ArrayList<>()).add(a);
            tree.unit(Math.min(a, b), Math.max(a, b));
        }

        for (int i = 0; i < k; i++) {
            final int c = scanner.nextInt();
            final int d = scanner.nextInt();

            if (tree.isSame(c, d)) {
                blockMap.computeIfAbsent(c, v -> new ArrayList<>()).add(d);
                blockMap.computeIfAbsent(d, v -> new ArrayList<>()).add(c);
            }
        }

        final Map<Integer, List<Integer>> preFriendMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            final int root = tree.getRoot(i);
            preFriendMap.computeIfAbsent(root, v -> new ArrayList<>()).add(i);
        }

        final int[] answers = new int[n + 1];
        for (final List<Integer> value : preFriendMap.values()) {
            for (final int i : value) {
                final List<Integer> friends = Optional.ofNullable(friendMap.get(i)).orElse(Collections.emptyList());
                final List<Integer> blocks = Optional.ofNullable(blockMap.get(i)).orElse(Collections.emptyList());

                answers[i] = value.size() - friends.size() - blocks.size() - 1;
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(answers[i] + " ");
        }
    }

    static class FastUnionFindTree {
        private int[] nodes;
        private final List<Integer> indices = new ArrayList<>();

        FastUnionFindTree(final int numOfNodes) {
            this.nodes = init(numOfNodes);
        }

        private int[] init(final int numOfNodes) {
            final int[] array = new int[numOfNodes + 1];
            for (int i = 1; i <= numOfNodes; i++) {
                array[i] = i;
            }

            return array;
        }

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

        boolean isSame(final int nodeA, final int nodeB) {
            return getRoot(nodeA) == getRoot(nodeB);
        }

        void unit(final int nodeA, final int nodeB) {
            final int rootA = getRoot(nodeA);
            final int rootB = getRoot(nodeB);

            if (rootA == rootB) {
                return;
            }

            nodes[rootB] = rootA;
        }
    }
}
