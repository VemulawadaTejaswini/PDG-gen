
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int q = scanner.nextInt();
        final Node[] nodes = new Node[n];

        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new Node();
        }

        for (int i = 0; i < n - 1; i++) {
            final int a = scanner.nextInt() - 1;
            final int b = scanner.nextInt() - 1;

            nodes[a].addRelation(nodes[b]);
            nodes[b].addRelation(nodes[a]);
        }

        for (int i = 0; i < q; i++) {
            final int node = scanner.nextInt() - 1;
            final int operation = scanner.nextInt();
            nodes[node].addValue(operation);
        }

        recursive(nodes[0], null);

        for (final Node node : nodes) {
            System.out.print(node.getValue() + " ");
        }
    }

    private static void recursive(final Node node, final Node parent) {
        for (final Node relatedNode : node.getRelatedNodes()) {
            if (relatedNode == parent) {
                continue;
            }

            relatedNode.addValue(node.getValue());

            recursive(relatedNode, node);
        }
    }

    static class Node {
        private int value = 0;
        private final List<Node> relatedNodes = new ArrayList<>();

        void addValue(final int value) {
            this.value += value;
        }

        int getValue() {
            return value;
        }

        void addRelation(final Node node) {
            relatedNodes.add(node);
        }

        List<Node> getRelatedNodes() {
            return relatedNodes;
        }
    }
}
