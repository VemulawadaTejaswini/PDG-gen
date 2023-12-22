import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

class Node {
    Integer id;
    Node left;
    Node right;
}

class Main {
    static Map<Integer, Node> nodes = new HashMap<>();
    static Node root;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Integer id = sc.nextInt();
            Integer leftId = sc.nextInt();
            Integer rightId = sc.nextInt();
            Node node = createNode(id);
            node.left = createChildrenNode(leftId);
            node.right = createChildrenNode(rightId);

            if (i == 0) {
                root = node;
            } else {
                if (node.left == root || node.right == root) {
                    root = node;
                }
            }
        }

        System.out.println("Preorder");
        System.out.println(preParse(root));
        System.out.println("Inorder");
        System.out.println(inParse(root));
        System.out.println("Postorder");
        System.out.println(postParse(root));
    }

    public static String preParse(Node node) {
        if (node == null) {
            return "";
        }
        return " " + node.id + preParse(node.left) + preParse(node.right);
    }

    public static String inParse(Node node) {
        if (node == null) {
            return "";
        }
        return inParse(node.left) + " " + node.id + inParse(node.right);
    }

    public static String postParse(Node node) {
        if (node == null) {
            return "";
        }
        return postParse(node.left) + postParse(node.right) + " " + node.id;
    }

    public static Node createChildrenNode(Integer childrenId) {
        if (childrenId == -1) {
            return null;
        }
        return createNode(childrenId);
    }

    public static Node createNode(Integer id) {
        Node node = nodes.get(id);
        if (node == null) {
            node = new Node();
            node.id = id;
            nodes.put(id, node);
        }

        return node;
    }
}

