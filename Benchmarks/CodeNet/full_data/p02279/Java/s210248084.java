import java.util.Scanner;

class Node{
  int id;
  int deg;
  int depth;
  Node parent = null;
  Node left = null;
  Node right = null;


  int getParentID(){
    if(parent == null)
      return -1;
    else
      return parent.id;
  }

  String getType(){
    if(parent == null)
      return "root";
    else if(left != null)
      return "internal node";
    else
      return "leaf";
  }

  void printChildren(){
    Node u = this.left;
    System.out.print("[");
    while(u != null){
      if(u.right == null)
        System.out.print(u.id);
      else
        System.out.print(u.id + ", ");
      u = u.right;
    }
    System.out.println("]");
  }

  void printInfo(){
    System.out.print("node " + id + ": ");
    System.out.print("parent = " + this.getParentID() + ", ");
    System.out.print("depth = " + depth + ", ");
    System.out.print(this.getType() + ", ");
    printChildren();
  }

  void setDepth(int d){
    this.depth = d;
    if(this.right != null)
      this.right.setDepth(d);
    if(this.left != null)
      this.left.setDepth(d+1);
  }
}

class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    Node[] node = new Node[n];
    for(int i = 0; i < n; i++)
      node[i] = new Node();

    for(int i = 0; i < n; i++){
      int id = stdIn.nextInt();
      int deg = stdIn.nextInt();
      node[i].id = id;
      node[i].deg = deg;
      int tmp = 0;
      for(int j = 0; j < deg; j++){
        int cid = stdIn.nextInt();
        node[cid].parent = node[id];
        if(j == 0)
          node[id].left = node[cid];
        else
          node[tmp].right = node[cid];
        tmp = cid;
      }
    }

    node[0].setDepth(0);
    for(int i = 0; i < n; i++)
      node[i].printInfo();
  }
}