import java.util.Scanner;
public class Main{
    public static boolean find(Tree T, long k){
        Node x = T.root;
        while(true){
            if(x == null)
                break;
            if(x.key == k)
                return true;
            else if(k < x.key)
                x = x.left;
            else 
                x = x.right;
        }
        return false;
    }
    public static void inorder(Node root){
        if(root == null)
            return;
        if(root.left != null)
            inorder(root.left);
        System.out.print(" " + root.key);
        if(root.right != null)
            inorder(root.right);
    }
    public static void preorder(Node root){
        if(root == null)
            return;
        System.out.print(" " + root.key);
        if(root.left != null)
            preorder(root.left);
        if(root.right != null)
            preorder(root.right);
    }
    public static void insert(Tree T, Node k){
        Node y = new Node(0);
        Node x = T.root;
        while(x != null){
            y = x;
            if(k.key < x.key)
                x = x.left;
            else
                x = x.right;
        }
        k.parent = y;
        if(y == null)
            T.root = k;
        else if(k.key < y.key)
            y.left = k;
        else
            y.right = k;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        String nul = sc.next();
        Node first = new Node(sc.nextInt());
        Tree T = new Tree(first);
        for(int i = 1 ; i < m ; i++){
            String order = sc.next();
            if(order.equals("print")){
                inorder(T.root);
                System.out.println();
                preorder(T.root);
                System.out.println();
            }
            else if(order.equals("insert")){
                long v = sc.nextLong();
                insert(T,new Node(v));
            }
            else{
                long k = sc.nextLong();
                if(find(T,k))
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
        }
    }
}
class Tree{
    Node root = null;
    Tree(Node root){
        this.root = root;
    }
}
class Node{
    long key;
    Node parent;
    Node left = null;
    Node right = null;
    Node(long key){
        this.key = key;
    }
}
