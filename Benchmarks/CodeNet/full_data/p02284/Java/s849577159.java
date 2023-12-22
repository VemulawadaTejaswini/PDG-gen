import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static Node root;

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String[] input = br.readLine().split(" ");
            if(input.length == 2){
                if(input[0].charAt(0) == 'i'){
                    insert(Integer.parseInt(input[1]));
                }else{
                    Node target = find(root, Integer.parseInt(input[1]));
                    if(target != null) sb.append("yes\n");
                    else sb.append("no\n");
                }
            }else{
                System.out.print(sb);
                inorder(root);
                System.out.println("");
                preorder(root);
                System.out.println("");
            }
        }
    }
 public static void insert(int key){
        Node x_parent = null;
        Node x = root;
        Node z = new Node(key);
         while(x != null){
             x_parent = x;
             if(z.key < x.key){
                 x = x.left;
             }else{
                 x = x.right;
             }
         }
         z.parent = x_parent;

         if(x_parent == null){
             root = z;
         }else{
            if(z.key < x_parent.key){
                x_parent.left = z;
            }else{
                x_parent.right = z;
            }
        }
    }

    public static Node find(Node node, int key){
        while(node != null && key != node.key){
            if(key < node.key) node = node.left;
            else node = node.right;
        }
        return node;
    }

    public static void inorder(Node node){
        if(node == null)return;
        inorder(node.left);
        System.out.print(" " + node.key);
        inorder(node.right);
    }
public static void preorder(Node node){
        if(node == null)return;
        System.out.print(" " + node.key);
        preorder(node.left);
        preorder(node.right);
    }


}

class Node{
    int key;
    Node right, left, parent;

    Node(int key){
        this.key = key;
        this.right = null; this.left = null; this.parent = null;
    }
}