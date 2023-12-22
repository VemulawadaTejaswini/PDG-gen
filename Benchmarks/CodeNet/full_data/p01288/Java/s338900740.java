import java.util.*;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int q = scan.nextInt();
    Node[] nodes = new Node[n];
    nodes[0] = new Node();
    nodes[0].mark = true;
    nodes[0].num = 0;
    for(int i = 1; i < n; i++) {
      nodes[i] = new Node();
      nodes[i].num = i;
      nodes[scan.nextInt()-1].setChild(nodes[i]);
    }
    int result = 0;
    for(int i = 0; i < q; i++) {
      switch(scan.next()) {
        case "Q":
          result += nodes[scan.nextInt()-1].saiki()+1;
          break;
        case "M":
          nodes[scan.nextInt()-1].mark = true;
          break;
      }
    }
    System.out.println(result);
  }
}

class Node{
  Node parent;
  boolean mark;
  int num;
  Node() {
  }
  void setChild(Node _node) {
    _node.parent = this;
  }
  int saiki() {
    return (mark)?num:parent.saiki();
  }
}