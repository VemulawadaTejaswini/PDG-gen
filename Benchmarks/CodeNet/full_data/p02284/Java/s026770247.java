import java.util.Scanner;

public class Main {

    private static Node root = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String command = scanner.next();
            switch (command) {
                case "insert":
                    insert(scanner.nextInt());
                    break;
                case "find":
                    System.out.println(find(root, scanner.nextInt()) ? "yes" : "no");
                    break;
                case "print":
                    print();
                    break;
            }
        }
    }

    private static void insert(int id) {
        if (root == null) {
            root = new Node(id, null);
            return;
        }
        Node current = root;
        Node parent = null;
        while (current != null) {
            parent = current;
            if (id < current.id) {
                current = parent.left;
            } else  {
                current = parent.right;
            }
        }
        Node newNode = new Node(id, parent);
        if (id < parent.id) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
    }

    private static boolean find(Node node, int id) {
        if (node == null) return false;
        if (node.id == id) return true;
        if (node.id < id) return find(node.right, id);
        return find(node.left, id);
    }

    private static void print() {
        printInOrder(root);
        System.out.print("\n");
        printPreorder(root);
        System.out.print("\n");
    }

    private static void printPreorder(Node node) {
        if (node == null) return;
        System.out.print(" " + node.id);
        printPreorder(node.left);
        printPreorder(node.right);
    }

    private static void printInOrder(Node node) {
        if (node == null) return;
        printInOrder(node.left);
        System.out.print(" " + node.id);
        printInOrder(node.right);
    }


    private static class Node {
        int id;
        Node parent;
        Node left = null;
        Node right = null;

        Node(int id, Node parent) {
            this.id = id;
            this.parent = parent;
        }
    }
}


