import java.util.Scanner;
 
class Main{
    static Node node;
    static Node root;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            str = sc.next();
            if (str.equals("print")) {
                inorder(root);
                System.out.println();
                preorder(root);
                System.out.println();
            } else if (str.equals("insert")) {
                Node z = new Node();
                z.key = sc.nextInt();
                insert(z);
            } else if (str.equals("find")) {
                int k = sc.nextInt();
                find(k);
                System.out.println();
            } else if (str.equals("delete")) {
 
                Node z = new Node();
                z.key = sc.nextInt();
                delete(z);
            }
 
        }
    }
    static void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(" " + node.key);
        inorder(node.right);
    }
 
    static void preorder(Node node) {
        if (node == null) return;
        System.out.print(" " + node.key);
        preorder(node.left);
        preorder(node.right);
    }
 
    static void insert(Node z) {
        if (root == null) {
            root = z;
            return;
        }
        Node y = null;
        Node x = root;
        while (x != null) {
            y = x;
            if (z.key < x.key) x = x.left;
            else x = x.right;
        }
 
        if (z.key < y.key) y.left = z;
        else y.right = z;
    }
 
    static void find(int k) {
        node = root;
        while (true) {
            if (node.key > k) {
                if (node.left == null) {
                    System.out.print("no");
                    return;
                } else {
                    node = node.left;
                }
            } else if (node.key < k) {
                if (node.right == null) {
                    System.out.print("no");
                    return;
                } else {
                    node = node.right;
                }
            } else if (node.key == k) {
                System.out.print("yes");
                return;
            }
        }
    }
 
    static void delete(Node z) {
        Node p = null;
        node = root;
        while (z.key != node.key) {
            p = node;
            if (node.key > z.key) node = node.left;
            else if (node.key < z.key) node = node.right;
        }
        if (node.left == null && node.right == null) {
            if (p.key < node.key) p.right = null;
            else p.left = null;
        } else if (node.left == null) {
            if (p.key < node.key) p.right = node.right;
            else p.left = node.right;
        } else if (node.right == null) {
            if (p.key < node.key) p.right = node.left;
            else p.left = node.left;
        } else {
            Node node2 = node;
            p = node;
            node = node.right;
            while(node.left!=null){
                p = node;
                node = node.left;
            }
            //System.out.println(node.key + " " + node2.key+" "+p.key);
            node2.key = node.key;
             
            if (node.left == null && node.right == null) {
                //System.out.println(node.key + " " + node2.key+" "+p.key);
                if (p.key <= node.key) p.right = null;
                else p.left = null;
            } else if (node.left == null) {
                if (p.key < node.key) p.right = node.right;
                else p.left = node.right;
            } else if (node.right == null) {
                if (p.key < node.key) p.right = node.left;
                else p.left = node.left;
            }
        }
    }
}
 
class Node {
    int key;
    Node left;
    Node right;
    Node() {
        key = -1;
        left = null;
        right = null;
    }
}
