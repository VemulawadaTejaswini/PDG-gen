
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();

        final int[] indexToValue = new int[n];
        final int[] valueToIndex = new int[n];
        for (int i = 0; i < n; i++) {
            final int tmp = scanner.nextInt() - 1;
            indexToValue[i] = tmp;
            valueToIndex[tmp] = i;
        }

        final UnionFindTree tree = new UnionFindTree(n);
        for (int i = 0; i < m; i++) {
            final int a = scanner.nextInt() - 1;
            final int b = scanner.nextInt() - 1;
            tree.unit(Math.min(a, b), Math.max(a, b));
        }

        for (int i = 0; i < n; i++) {
            if (indexToValue[i] == i || !tree.isSame(i, indexToValue[i])) {
                continue;
            }

            int index = valueToIndex[i];
            int value = indexToValue[i];
            valueToIndex[i] = i;
            indexToValue[i] = i;
            indexToValue[index] = value;
            valueToIndex[value] = index;
        }

        int answer = 0;
        for (int i = 0; i < indexToValue.length; i++) {
            if(indexToValue[i] == i){
                answer++;
            }
        }

        System.out.println(answer);
    }

    static class UnionFindTree {
        private int[] nodes;

        UnionFindTree(final int numOfNodes) {
            this.nodes = init(numOfNodes);
        }

        public int[] getNodes() {
            return nodes;
        }

        private int[] init(final int numOfNodes) {
            final int[] array = new int[numOfNodes];
            for (int i = 0; i < array.length; i++) {
                array[i] = i;
            }

            return array;
        }

        int getRoot(final int nodeNumber) {
            final int rootNode = nodes[nodeNumber];
            if (rootNode == nodeNumber) {
                return nodeNumber;
            }

            return getRoot(rootNode);
        }

        boolean isSame(final int nodeA, final int nodeB) {
            final int rootA = getRoot(nodeA);
            final int rootB = getRoot(nodeB);

            return rootA == rootB;
        }

        void unit(final int nodeA, final int nodeB) {
            final int rootA = getRoot(nodeA);
            final int rootB = getRoot(nodeB);

            if (rootA == rootB) {
                return;
            }

            nodes[rootA] = rootB;
        }
    }
}
