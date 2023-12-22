import java.io.*;
import java.util.*;
class Main{
  static Node root = null;
  static StringBuilder bl = new StringBuilder();
  public static void main(String args[])throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String [] s = new String[2];
    for(int i = 0; i<n; i++){

      s = br.readLine().split("\\s+");

      if(s[0].charAt(0) == 'i'){
        Insert( Integer.parseInt(s[1]));
      }
      else if(s[0].charAt(0) == 'p'){
        inorder(root);
        bl.append("\n");
        preorder(root);
        bl.append("\n");
      }
    }
    System.out.print(bl);
  }
  static void Insert (int k){
    Node y = null;
    Node x = root;
    Node z = new Node();
    z.key = k;
    z.left = null;
    z.right = null;

    while(x != null){
      y = x;
      if(z.key < x.key){
        x = x.left;
      }else{
        x = x.right;
      }
    }
    z.parent = y;

    if( y == null){
      root = z;
    }else if( z.key < y.key){
      y.left = z;
    }else{
      y.right = z;
    }
  }

  static void preorder(Node u){
    if( u == null) return;
    bl.append(" ").append(u.key);
    preorder(u.left);
    preorder(u.right);
  }

  static void inorder(Node u){
    if(u == null) return;
    inorder(u.left);
    bl.append(" ").append(u.key);
    inorder(u.right);
  }

}

class Node{
  int key;
  Node parent;
  Node right;
  Node left;
  Node(){};
}
