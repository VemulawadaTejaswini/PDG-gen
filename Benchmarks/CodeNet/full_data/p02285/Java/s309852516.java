import java.util.*;

class ND {
    int val; 
    ND left, right;  
    int height;

    public void reset_height () {
        this.height = Math.max(height(left), height(right)) + 1;
    }

    public static int height(ND n) {
        if (n == null) return 0;
        else return n.height;
    }

    public ND (int val, ND left,  ND right) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.height = Math.max(height(left), height(right))+ 1;
    }
}

class BST {
    public static void display_AOJ1 (ND n) {
        if (n.left != null) display_AOJ1(n.left);
        System.out.printf(" %d", n.val);
        if (n.right != null) display_AOJ1(n.right);
    }
    public static void display_AOJ2 (ND n) {
        System.out.printf(" %d", n.val);
        if (n.left != null) display_AOJ2(n.left);
        if (n.right != null) display_AOJ2(n.right);
    }

    public static int min_bst(ND p) {
        if (p.left == null) return p.val;
        return min_bst(p.left);
    }

    public static boolean search_bst(ND p, int d) {
        if (p == null) return false;
        if (p.val == d) return true;
        if (d < p.val) return search_bst(p.left, d);
        else return search_bst(p.right, d);
    }

    public static ND insert_bst(ND p, int d) {
        if (p == null) return new ND(d, null, null);
        if (d < p.val) p.left = insert_bst(p.left, d);
        else p.right = insert_bst(p.right, d);
        p.reset_height();
        return p;
    }

    public static ND delete_min_bst (ND p) {
        if (p.left == null) return p.right;
        p.left = delete_min_bst(p.left);
        p.reset_height();
        return p;
    }

    public static ND delete_bst(ND p, int d) {
        if (p == null) return null;
        if (p.val == d) {
            if (p.right == null) return p.left;
            p.val = min_bst(p.right);
            p.right = delete_min_bst(p.right);
            p.reset_height();
            return p;
        }
        if (d < p.val) p.left = delete_bst(p.left, d);
        else p.right = delete_bst(p.right, d);
        p.reset_height();
        return p;
    }
}

public class Main {
    public static void main (String[] args) {
        ND root = null;
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String cmd = sc.next();
            if (cmd.equals("insert")) {
                int val = sc.nextInt();
                root = BST.insert_bst(root, val);
            } else if (cmd.equals("find")) {
                int val = sc.nextInt();
                boolean exist = BST.search_bst(root, val);
                if (exist) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            } else if (cmd.equals("delete")) {
                int val = sc.nextInt();
                root = BST.delete_bst(root, val);
            } else {
                BST.display_AOJ1(root);
                System.out.println();
                BST.display_AOJ2(root);
                System.out.println();
            }
        }
    }
}
