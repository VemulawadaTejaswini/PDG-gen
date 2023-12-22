import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static Node nodeRoot;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.charAt(0) == 'i') {
                int m = Integer.parseInt(s.substring(7));
                if (nodeRoot == null) {
                    nodeRoot = new Node(m);
                    continue;
                }
                insert(m, nodeRoot);
            } else {
                sb.append(" ");
                inorder(nodeRoot);
                sb.deleteCharAt(sb.length() - 1).append("\n").append(" ");
                preorder(nodeRoot);
                sb.deleteCharAt(sb.length() - 1).append("\n");
            }
        }
        System.out.print(sb);
    }

    private static void preorder(Node node) {
        if (node == null) return;
        sb.append(node.value).append(" ");
        preorder(node.left);
        preorder(node.right);
    }

    private static void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        sb.append(node.value).append(" ");
        inorder(node.right);
    }

    private static void insert(int m, Node node) {
        if (m > node.value) {
            if (node.right == null) node.right = new Node(m);
            else insert(m, node.right);
        } else {
            if (node.left == null) node.left = new Node(m);
            else insert(m, node.left);
        }
    }

    static class Node {
        int value;
        Node left;
        Node right;
        Node parent;

        public Node(int value) {
            this.value = value;
        }
    }
}
