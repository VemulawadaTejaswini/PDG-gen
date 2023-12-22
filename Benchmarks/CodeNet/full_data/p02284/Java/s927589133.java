
import java.util.*;

/**
 * A
 */
public class Main {

    Node root;

    public void run() {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        
        for(int i=0; i<m; i++) {
            String str = sc.next();
            Node ans;
            if(str.startsWith("i")) {
                insert(sc.nextInt());
            } else if(str.startsWith("f")) {
                ans = find(sc.nextInt());
                if(ans != null) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            } else {
                inorder(root);
                System.out.println();
                preorder(root);
                System.out.println();
            }
        }

        sc.close();

    }

    
    public void insert(int v) {
        
        Node x = root; // root
        Node y = null; // parent of x
        Node z = new Node(v); // it will be inserted
        
        while(x != null) {
            y = x;
            if(z.id < x.id) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        if(y == null) {
            root = z;
        } else if(z.id < y.id) {
            y.left = z;
        } else {
            y.right = z;
        }
        
    }
    
    public Node find(int v) {

        Node n = root;

        while (n != null && n.id != v) {
            if(n.id > v) {
                n = n.left;
            } else {
                n = n.right;
            }
        }

        return n;

    }

    public void inorder(Node tree) {
        
        if(tree == null) {
            return;
        }

        inorder(tree.left);
        System.out.print(" "+tree.id);
        inorder(tree.right);

    }

    public void preorder(Node tree) {

        if(tree == null) {
            return;
        }

        System.out.print(" "+tree.id);
        preorder(tree.left);
        preorder(tree.right);

    }

    public static void main(String[] args) {
        new Main().run();
    }

}

class Node {

    int id;
    Node left;
    Node right;

    Node(int id) {
        this.id = id;
    }

}
