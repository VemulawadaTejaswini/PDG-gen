import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

class Node {
    Integer id;
    Node parent;
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
            node.left = createChildrenNode(node, leftId);
            node.right = createChildrenNode(node, rightId);
        }
        Node root = findRoot();
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

    public static Node createChildrenNode(Node node, Integer childrenId) {
        if (childrenId == -1) {
            return null;
        }
        Node childrenNode = createNode(childrenId);
        childrenNode.parent = node;
        return childrenNode;
    }

    public static Node createNode(Integer id) {
        Node node = nodes.get(id);
        if (node == null) {
            node = new Node();
            node.id = id;
            node.parent = null;
            nodes.put(id, node);
        }

        return node;
    }

    public static Node findRoot() {
      return nodes.values().stream().filter(node -> node.parent == null).collect(Collectors.toList()).get(0);
    }
}

