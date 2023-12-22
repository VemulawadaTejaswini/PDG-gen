import java.io.*;
import java.util.*;

class Main{

  public static void main(String[] args)throws IOException{
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int id;
    int r;
    int l;
    int root = 0;
    Nodes nodes = new Nodes();
    Node[] node = new Node[n];
    nodes.nodes = node;

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    for(int i=0 ; i<n ; i++){
      node[i] = new Node(i);
    }

    for(int i=0 ; i<n ; i++){
      /*StringTokenizer S = new StringTokenizer(bf.readLine());
      id = Integer.parseInt(S.nextToken());
      l = Integer.parseInt(S.nextToken());
      r = Integer.parseInt(S.nextToken());*/

      /*String[] s = bf.readLine().split(" ");
      id = Integer.parseInt(s[0]);
      l = Integer.parseInt(s[1]);
      r = Integer.parseInt(s[2]);*/
      id = scan.nextInt();
      l = scan.nextInt();
      r = scan.nextInt();
      if( l!=-1 ){
        node[id].l = l;
        node[l].parent = id;
      }
      if( r!=-1){
        node[id].r = r;
        node[r].parent = id;
      }
    }

    while(node[root].parent != -1){
      root = node[root].parent;
    }
    System.out.println("Preorder");
    nodes.Preord(root);
    System.out.println("\r\nInorder");
    nodes.Inord(root);
    System.out.println("\r\nPostorder");
    nodes.Postord(root);
    System.out.println();

  }
}

class Node{
  int id;
  int parent = -1;
  int r = -1;
  int l = -1;

  public Node(int id){
    this.id = id;
  }
}

class Nodes{
  Node[] nodes;

  public void Preord(int id){
    if( id==-1){
      return ;
    }
    System.out.print(" " + id);
    Preord(nodes[id].l);
    Preord(nodes[id].r);
    }

  public void Inord(int id){
    if( id==-1 ){
      return ;
    }
    Inord(nodes[id].l);
    System.out.print(" " + id);
    Inord(nodes[id].r);
  }

  public void Postord(int id){
    if( id==-1 ){
        return ;
    }
    Postord(nodes[id].l);
    Postord(nodes[id].r);
    System.out.print(" " + id);
  }
}

