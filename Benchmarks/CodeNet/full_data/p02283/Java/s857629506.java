import java.util.*;

public class Main {
    class Node {
        int key;
        Node left = null, right = null, parent = null;
        Node(int key) {
            this.key = key;
        }
    }

    Node tree;

    void inorder(Node t, StringBuilder sb) {
        if (t == null) {
            return;
        }
        if (t.left != null) {
            inorder(t.left, sb);
        }
        sb.append(t.key);
        sb.append(" ");
        if (t.right != null) {
            inorder(t.right, sb);
        }
    }

    void preorder(Node t, StringBuilder sb) {
        if (t == null) {
            return;
        }
        sb.append(t.key);
        sb.append(" ");
        if (t.left != null) {
            preorder(t.left, sb);
        }
        if (t.right != null) {
            preorder(t.right, sb);
        }
    }

void insert(Node z) {
       Node y = null;
       Node x = tree;
       while (x != null) {
           y = x;
           if (z.key < x.key) {
               x = x.left;
           } else {
               x = x.right;
           }
       }
       z.parent = y;
       if (y == null) {
           this.tree = z;
       } else if (z.key < y.key) {
           y.left = z;
       } else {
           y.right = z;
       }
    }
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String inst = sc.next();
            if ("insert".equals(inst)) {
                insert(new Node(sc.nextInt()));
            } else {
                StringBuilder sb = new StringBuilder();
                inorder(tree, sb);
                System.out.println(sb.toString());
                sb.setLength(0);
                preorder(tree, sb);
                System.out.println(sb.toString());
            }
        }
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
