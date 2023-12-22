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
            } else if (s.charAt(0) == 'p') {
                sb.append(" ");
                inorder(nodeRoot);
                sb.deleteCharAt(sb.length() - 1).append("\n").append(" ");
                preorder(nodeRoot);
                sb.deleteCharAt(sb.length() - 1).append("\n");
            } else if (s.charAt(0) == 'f') {
                int m = Integer.parseInt(s.substring(5));
                sb.append(find(m, nodeRoot) ? "yes\n" : "no\n");
            } else {
                int m = Integer.parseInt(s.substring(7));
                delete(m, nodeRoot);
            }
        }
        System.out.print(sb);
    }

    private static void delete(int m, Node node) {
        if (node == null) return;
        if (m > node.value) {
            if (node.right.value != m) delete(m, node.right);
            else {
                if (node.right.right == null && node.right.left == null) {
                    node.right = null;
                } else if (node.right.left == null) {
                    node.right = node.right.right;
                } else if (node.right.right == null) {
                    node.right = node.right.left;
                } else {
                    Node nd=succeed(node.right);
                    delete(nd.value, nodeRoot);
                    node.right.value = nd.value;
                }
            }
        } else if (m < node.value) {
            if (node.left.value != m) delete(m, node.left);
            else {
                if (node.left.right == null && node.left.left == null) {
                    node.left = null;
                } else if (node.left.left == null) {
                    node.left = node.left.right;
                } else if (node.left.right == null) {
                    node.left = node.left.left;
                } else {
                    Node nd=succeed(node.left);
                    delete(nd.value, nodeRoot);
                    node.left.value = nd.value;
                }
            }
        } else {
            if (node.right == null && node.left == null) {
                node = null;
            } else if (node.left == null) {
                node = node.right;
            } else if (node.right == null) {
                node = node.left;
            } else {
                Node nd=succeed(node);
                delete(nd.value, nodeRoot);
                node.value = nd.value;
            }
        }
    }

    private static Node succeed(Node node) {
        Node node1 = node.right;
        while (node1.left!=null){
            node1=node1.left;
        }
        return node1;
    }

    private static boolean find(int m, Node node) {
        if (node == null) return false;
        if (m > node.value) {
            return find(m, node.right);
        } else if (m < node.value) {
            return find(m, node.left);
        } else {
            return true;
        }
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

        public Node(int value) {
            this.value = value;
        }
    }
}
