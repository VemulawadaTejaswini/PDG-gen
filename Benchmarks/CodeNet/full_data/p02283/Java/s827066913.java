
import java.util.*;

public class Main {

    class Node {
        int value;
        Node parent, left, right;

        public Node(int value) {
            this.value = value;
        }
    }

    Node root;
    void insert(Node z) {
        Node y = null;
        Node x = root; // nodesの根
        while (x != null) {
            y = x;
            if (z.value < x.value) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        z.parent = y;

        if (y == null) {
            root = z;
        } else if (z.value < y.value) {
            y.left = z;
        } else {
            y.right = z;
        }
    }

    void print() {
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
    }

    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(" " + node.value);
        inorder(node.right);
    }
    void preorder(Node node) {
        if (node == null) return;
        System.out.print(" " + node.value);
        preorder(node.left);
        preorder(node.right);
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            switch(sc.next()) {
                case "insert":
                    int val = sc.nextInt();
                    insert(new Node(val));
                    break;
                case "print":
                    print();
            }
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }

}
