import java.io.*;

public class Main {

  static int n, pos, ansInp;
  static int[] pre, inp, post;

  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    Tree t = new Tree();

    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);

    for(int i = 0; i < n; i++){
      in = br.readLine().split(" ");
      if(in[0].equals("insert")){
        t.insert(new Node(Integer.parseInt(in[1])));
      }else{
        t.print();
      }
    }

    br.close();

  }
}


class Node {
  int v;
  Node p, l, r;

  Node(int v){
    this.v = v;
  }
}

class Tree {

  Node root;

  public Node insert(Node node){
    Node par = null;
    Node now = root;

    while(now != null){
      par = now;
      if(node.v > now.v) now = now.r;
      else now = now.l;
    }
    node.p = par;

    if(par == null) {
      this.root = node;
    }else if(node.v < par.v) {
      par.l = node;
    }else {
      par.r = node;
    }
    return node;
  }

  void print(){
    inorderPrint(this.root);
    System.out.println();
    preorderPrint(this.root);
    System.out.println();
  }

  void preorderPrint(Node node){
    System.out.print(' ');
    System.out.print(node.v);
    if(node.l != null)
      preorderPrint(node.l);
    if(node.r != null)
      preorderPrint(node.r);
    return;
  }

  void inorderPrint(Node node){
    if(node.l != null)
      inorderPrint(node.l);
    System.out.print(' ');
    System.out.print(node.v);
    if(node.r != null)
      inorderPrint(node.r);
    return;
  }
}
