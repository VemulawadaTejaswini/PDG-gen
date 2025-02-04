
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
                
            } else if (order.startsWith("f")){
                System.out.println(findNodeWithKey(sc.nextInt()).equals(nil) ? "no" : "yes");
                
            } else {
                deleteNodeWithKey(sc.nextInt());
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
        } else if (toDel.parent.equals(childOfDeled)) {
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

