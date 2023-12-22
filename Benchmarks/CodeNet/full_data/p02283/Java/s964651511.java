
import java.util.Scanner;
public class Main {

    static int n;
    static Node node;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        BinTree tree = new BinTree();
        sc.nextLine();
        for(int i = 0; i < n - 1;i++){
            String s = sc.nextLine().split(" ")[1];
            tree.insert(Integer.parseInt(s));
        }
        tree.inorder(tree.root);
        System.out.println();
        tree.preorder(tree.root);
    }

}

class BinTree{

    Node root=null ;
    void insert(int v){
        Node x = root;
        Node y = null;
        Node z = new Node();
        
        z.key = v;
        while( x != null){
            y = x;
            if(z.key < x.key){
                x = x.l;
            }else{
                x = x.r;
            }
        }
        z.p = y;
        if(y == null){
            root = z;
        }else{
            if(z.key < y.key){
                y.l = z;
            }else{
                y.r = z;
            }
        }
    }
    
    void preorder(Node n){
        if(n == null) return;
        System.out.print(" " + n.key);
        preorder(n.l);
        preorder(n.r);
        return;
    }
    void inorder(Node n){
        if(n == null) return;
        inorder(n.l);
        System.out.print(" " + n.key);
        inorder(n.r);
        return;
    }
    
}
class Node{
    Integer key = null;
    Node r,l,p;
    
}

