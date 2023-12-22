import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        Node root = null;
        for (int i = 0; i < m; i++) {
            String cmd = scanner.next();
            if ("insert".equals(cmd)) {
                Node node = new Node(scanner.nextInt());
                if (root == null) {
                    root = node;
                    continue;
                }
                insert(root, node);
            } else {
                StringBuilder sb = new StringBuilder();
                root.inOrder(sb);
                sb.append("\n");
                root.preOrder(sb);
                sb.append("\n");
                System.out.print(sb.toString());
            }
        }

    }

    private static void insert(Node root, Node node) {
        Node parent = root;
        while (true) {
            if (node.key < parent.key) {
                if (parent.left == null) {
                    parent.left = node;
                    break;
                }
                parent = parent.left;
            } else {
                if (parent.right == null) {
                    parent.right = node;
                    break;
                }
                parent = parent.right;
            }
        }
    }

    private static class Node {
        int key;
        Node parent;
        Node left;
        Node right;

        private Node(int key) {
            this.key = key;
        }

        private void inOrder(StringBuilder sb) {
            if (left != null) {
                left.inOrder(sb);
            }
            sb.append(" " + String.valueOf(key));
            if (right != null) {
                right.inOrder(sb);
            }
        }

        private void preOrder(StringBuilder sb) {
            sb.append(" " + String.valueOf(key));
            if (left != null) {
                left.preOrder(sb);
            }
            if (right != null) {
                right.preOrder(sb);
            }
        }
    }
}