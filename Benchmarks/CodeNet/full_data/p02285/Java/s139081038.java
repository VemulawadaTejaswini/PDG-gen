
import java.util.Scanner;
public class Main {
    static Node nil = new Node(Integer.MIN_VALUE, null, null, null);
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
                
            } else if (order.startsWith("f")){
                System.out.println(findNodeWithKey(sc.nextInt()).equals(nil) ? "no" : "yes");
                
            } else {
                int in  = sc.nextInt();
                deleteNodeWithKey(in);
            }
        }
    }
    static void deleteNodeWithKey(int key) {
        Node nd = findNodeWithKey(key);
        Node toDel = nil; // 削除する節点の候補
        if (nd.left.equals(nil) || nd.right.equals(nil)) {
            toDel = nd; // z が子をもたないか、子を1つもつ場合は z の節点そのものを削除
        } else {
            toDel = getSuccessor(nd); // ｚ が子を2つもつ場合は z の次節点
            // 次節点とは、二分探索技における中間順巡回でzの次に訪問される節点
        }

        Node childOfDeled = nil;
        if (!toDel.left.equals(nil)) {
            childOfDeled = toDel.left;
        } else {
            childOfDeled = toDel.right;
        }
        
        if (!childOfDeled.equals(nil)) {
            childOfDeled.parent = toDel.parent;
        }

        if (toDel.parent.equals(nil)) {
            root = childOfDeled;
        } else if (toDel.equals(toDel.parent.left)) {
            toDel.parent.left = childOfDeled;
        } else {
            toDel.parent.right = childOfDeled;
        }

        if (!toDel.equals(nd)) {
            nd.val = toDel.val;
        }
    }
    
    // 次節点の取得
    static Node getSuccessor(Node nd) {
        if (!nd.right.equals(nil)) {
            return getMinimumNode(nd.right);
        }
        
        Node pa = nd.parent;
        while (!pa.equals(nil) && nd.equals(pa.right)) {    // nd.equals(pa.right) で「親paは、「右の子になっているような節点」である」ことを表せる。
            nd = pa;
            pa = pa.parent;
        }
        return pa;
    }
    
    static Node getMinimumNode(Node arg) {
        Node nd = arg;
        while (!nd.left.equals(nil)) {
            nd = nd.left;
        }
        return nd;
    }
    
    static Node findNodeWithKey(int key) {
        Node nd = root;
        while (!nd.equals(nil) && nd.val != key) {
                nd = (nd.val > key) ? nd.left : nd.right;
        }
        return nd;
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
        z.parent = p;
    }
    
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

