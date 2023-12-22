import java.util.Scanner;

public class Main {
    
    static Node NIL;
    static Node root;
    static StringBuilder sb;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        NIL = new Node(-1);
        root = NIL;
        sb = new StringBuilder();
        int m = Integer.parseInt(sc.next());
        
        for(int i = 0; i < m; i++){
            String s = sc.next();
            switch (s) {
                case "insert":
                    intsert(Integer.parseInt(sc.next()));
                    break;
                case "find":
                    if(find(root, Integer.parseInt(sc.next())) != NIL){
                        sb.append("yes").append(System.lineSeparator());
                    }else{
                        sb.append("no").append(System.lineSeparator());
                    }
                    break;
                case "delete":
                    Node z = find(root, Integer.parseInt(sc.next()));
                    if(z != NIL){
                        delete(z);
                    }
                    break;
                case "print":
                    inPerse(root);
                    sb.append(System.lineSeparator());
                    prePerse(root);
                    sb.append(System.lineSeparator());
                    break;
            }
        }
        System.out.print(sb);
    }
    
    static void intsert(int key){
        
        Node y = NIL;
        Node x = root;
        Node z = new Node(key);
        
        while(x != NIL){
            y = x;
            if(z.key < x.key){
                x = x.left;
            }else{
                x = x.right;
            }
        }
        z.parent = y;
        
        if(y == NIL){
            root = z;
        }else if(z.key < y.key){
            y.left = z;
        }else{
            y.right = z;
        }
    }
    
    static Node find(Node x, int key){
        
        while(x != NIL && key != x.key){
            if(key < x.key){
                x = x.left;
            }else{
                x = x.right;
            }
        }
        return x;
    }
    
    static void delete(Node z){
        
        Node y;
        if(z.left == NIL || z.right == NIL){
            y = z;
        }else{
            y = getSuccessor(z);
        }
        
        Node x;
        if(y.left != NIL){
            x = y.left;
        }else{
            x = y.right;
        }
        
        if(x != NIL){
            x.parent = y.parent;
        }
        
        if(y.parent == NIL){
            root = x;
        }else if(y == y.parent.left){
            y.parent.left = x;
        }else{
            y.parent.right = x;
        }
        
        if(y != z){
            z.key = y.key;
        }
    }
    
    static Node getSuccessor(Node x){
        
        if(x.right != NIL){
            return getMinimum(x.right);
        }
        
        Node y = x.parent;
        while(y != NIL && x == y.right){
            x = y;
            y = y.parent;
        }
        return y;
    }
    
    static Node getMinimum(Node x){
        
        while(x.left != NIL){
            x = x.left;
        }
        return x;
    }
    
    static void prePerse(Node u){
        
        if(u == NIL) return;
        sb.append(" ").append(u.key);
        prePerse(u.left);
        prePerse(u.right);
    }
    
    static void inPerse(Node u){
        
        if(u == NIL) return;
        inPerse(u.left);
        sb.append(" ").append(u.key);
        inPerse(u.right);
    }
    
    static class Node {
        int key;
        Node parent, left, right;

        public Node(int key) {
            this.key = key;
            parent = NIL;
            left = NIL;
            right = NIL;
        }
    }
}
