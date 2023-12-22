import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    static Node root = null;
    static StringBuilder sb = new StringBuilder("");

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        String input;

        for (int i = 0; i < m; i++) {
            input = br.readLine();
            if (input.charAt(0) == 'i') {
                insert(new Node(Integer.parseInt(input.substring(7))));
            } else if (input.charAt(0) == 'f') {
                if (find(Integer.parseInt(input.substring(5)))) {
                    sb.append("yes\n");
                } else {
                    sb.append("no\n");
                }
            } else if (input.charAt(0) == 'd') {
                delete(Integer.parseInt(input.substring(7)));
            } else {
                print();
            }
        }
        System.out.print(sb);
    }

    public static void insert(Node node) {
        Node parent = null;
        Node child = root;
        while (child != null) {
            parent = child;
            if (node.key < child.key) {
                child = child.left;
            } else {
                child = child.right;
            }
        }

        node.parent = parent;
        if (parent == null) {
            root = node;
        } else if (node.key < parent.key) {
            parent.left = node;
        } else {
            parent.right = node;
        }
    }

    public static boolean find(int key) {
        Node node = root;
        while (node != null) {
            if (key == node.key) {
                return true;
            } else if (key < node.key) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
        return false;
    }

    public static void delete(int key) {
        Node node = root;
        while (node != null) {
            if (key == node.key) {

                if (node.left == null && node.right == null) {
                    if (node.parent.left.key == key) {
                        node.parent.left = null;
                    } else {
                        node.parent.right = null;
                    }
                } else if (node.left == null) {
                    if (node.parent.left.key == key) {
                        node.parent.left = node.right;
                    } else {
                        node.parent.right = node.right;
                    }
                    node.right.parent = node.parent;
                } else if (node.right == null) {
                    if (node.parent.left.key == key) {
                        node.parent.left = node.left;
                    } else {
                        node.parent.right = node.left;
                    }
                    node.left.parent = node.parent;
                } else {
                    Node nextNode = getNextNode(node);
                    node.key = nextNode.key + 1;
                    delete(nextNode.key);
                    node.key--;
                }
                break;

            } else if (key < node.key) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
    }

    private static Node getNextNode(Node node) {
        if (node.right != null) return node.right;
        else {
            Node nextNode = node.parent;
            while (nextNode != null) {
                if (node.key < nextNode.key) return nextNode;
                nextNode = nextNode.parent;
            }
        }
        return null;

    }

    public static void print() {
        printInorder(root);
        sb.append("\n");
        printPreorder(root);
        sb.append("\n");
    }

    public static void printPreorder(Node node) {
        if (node == null) return;
        sb.append(" ").append(node.key);
        printPreorder(node.left);
        printPreorder(node.right);
    }

    public static void printInorder(Node node) {
        if (node == null) return;
        printInorder(node.left);
        sb.append(" ").append(node.key);
        printInorder(node.right);
    }
}

class Node {
    public int key;
    public Node left;
    public Node right;
    public Node parent;

    public Node(int key) {
        this.key = key;
        left = right = parent = null;
    }
}