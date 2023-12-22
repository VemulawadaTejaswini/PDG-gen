import java.util.Scanner;
 
class Node {
    static Node root;
 
    int key;
    int priority;
    Node left;
    Node right;
 
    Node(int key, int priority) {
        this.key = key;
        this.priority = priority;
    }
 
    private Node rightRotate() {
        Node s = left;
        left = s.right;
        s.right = this;
        return s;
    }
 
    private Node leftRotate() {
        Node s = right;
        right = s.left;
        s.left = this;
        return s;
    }
 
    Node insert(Node t) {
        if(t == null) return this;
        if(key == t.key) return t;
 
        if(key < t.key) {
            t.left = insert(t.left);
            if(t.priority < t.left.priority) t = t.rightRotate();
        }else {
            t.right = insert(t.right);
            if(t.priority < t.right.priority) t = t.leftRotate();
        }
 
        return t;
    }
 
    static Node find(int key) {
        Node x = root;
        while(x != null) {
            if(key < x.key) x = x.left;
            else if(x.key < key) x = x.right;
            else return x;
        }
        return null;
    }
 
    static Node delete(Node t, int key) {
        if(t == null) return null;
        if(key < t.key) t.left = delete(t.left, key);
        else if(key > t.key) t.right = delete(t.right, key);
        else return _delete(t, key);
        return t;
    }
 
    static Node _delete(Node t, int key) {
        if(t.left == null && t.right == null) return null;
        else if(t.left == null) t = t.leftRotate();
        else if(t.right == null) t = t.rightRotate();
        else {
            if(t.left.priority > t.right.priority) t = t.rightRotate();
            else t = t.leftRotate();
        }
        return delete(t, key);
    }
 
    static String inorder(Node x) {
        String str = "";
        if(x == null) return str;
 
        if(x.left != null) str += inorder(x.left);
        str += " " + x.key;
        if(x.right != null)str += inorder(x.right);
 
        return str;
    }
 
    static String preorder(Node x) {
        String str = "";
        if(x == null) return str;
 
        str += " " + x.key;
        if(x.left != null) str += preorder(x.left);
        if(x.right != null) str += preorder(x.right);
 
        return str;
    }
}
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        Node.root = null;
        int m = sc.nextInt();
        for(int i = 0; i < m; i++) {
            String cmd = sc.next();
            if(cmd.equals("insert")) {
                Node.root = new Node(sc.nextInt(), sc.nextInt()).insert(Node.root);
            }else if(cmd.equals("find")) {
                System.out.println(Node.find(sc.nextInt()) != null? "yes" : "no");
            }else if(cmd.equals("delete")) {
                Node.root = Node.delete(Node.root, sc.nextInt());
            }else {
                System.out.println(Node.inorder(Node.root));
                System.out.println(Node.preorder(Node.root));
            }
        }
 
        sc.close();
    }
}
