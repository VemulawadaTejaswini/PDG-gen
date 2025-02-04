

import java.util.Scanner;

public class Main {
    static Node nil = new Node(-1, null, null, null);
    static Node root = nil;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String order = sc.next();
            if (order.startsWith("i")) {
                    insert(new Node(sc.nextInt(), nil, nil, nil));
                    
            } else if (order.startsWith("p")){
                printInorder(root);
                System.out.println();
                printPreorder(root);
                System.out.println();
                
            } else {
                hasNodeWithKey(sc.nextInt());
            }
        }
    }
    
    static boolean hasNodeWithKey(int key) {
        Node nd = root;
        while (!nd.equals(nil) && nd.val != key) {
                nd = (nd.val > key) ? nd.left : nd.right;
        }
        return !nd.equals(nil);
    }
    
    static void insert(Node z) {
        if (root.equals(nil)) {
            root = z;
            return;
        }
        
        Node p = root; // zの親
        while (true) {
            if (p.val > z.val) {
                if (p.left.equals(nil)) {
                    p.left = z;
                    break;
                } else {
                    p = p.left;
                }
            } else {
                if (p.right.equals(nil)) {
                    p.right = z;
                    break;
                } else {
                    p = p.right;
                }
            }
        }
    }
    
    // 螺旋本の擬似コードから
//    static void insertOtehon(Node nd, Node z) {
//        Node y = nil; // parent of x
//        Node x = nd;
//        while (!x.equals(nil)) {
//            y = x; // 親を設定
//            if (z.val < x.val) {
//                x = x.left;
//            } else {
//                x = x.right;
//            }
//        }
//        z.parent = y;
//        
//        //  Tが空の場合
//        if (y.equals(nil))
//            root = z;
//        else if (z.val < y.val)
//            y.left = z;
//        else {
//            y.right = z;
//        }
//    }
    
    static void printInorder(Node arg) {
        Node nd = arg;
        if(!nd.equals(nil)) {
            printInorder(nd.left);
            System.out.print(" " + nd.val);
            printInorder(nd.right);
        }
    }
    
    static void printPreorder(Node arg) {
        Node nd = arg;
        if(!nd.equals(nil)) {
            System.out.print(" " + nd.val);
            printPreorder(nd.left);
            printPreorder(nd.right);
        }
    }
    
    static class Node {
        int val;
        Node parent;
        Node left;
        Node right;
        
        Node (int val, Node parent, Node left, Node right) {
            this.val = val;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }
        Node (int val) {
            this.val = val;
            this.parent = nil;
            this.left = nil;
            this.right = nil;
        }
    }
}

