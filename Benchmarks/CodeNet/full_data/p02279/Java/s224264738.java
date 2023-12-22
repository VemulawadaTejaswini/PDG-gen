import java.util.*;
import java.io.*;
class Main{
  public static void main(String args[]){
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int n = Integer.parseInt(br.readLine());
    StringBuilder build = new StringBuilder();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int id,d,c,left=0;
    Node node[] = new Node[n];
    for(int i = 0 ; i < n; i++){
      node[i] = new Node();
    }
    for(int i = 0; i<n; i++){
      // StringTokenizer token = new StringTokenizer(br.readLine());
      id = sc.nextInt();
      d = sc.nextInt();
      for(int j = 0; j<d;j++){
        c = sc.nextInt();
        if(j == 0 )node[id].left = c;
        else node[left].right_sibling = c;
        left = c;
        node[c].parent = id;
      }
    }

    for(int i = 0; i<n; i++){
      build.append("node ").append(i).append(": parent = ").append(node[i].parent).append(", depth = ").append(getDepth(i , node)).append(", ");
      if(node[i].parent == -1){
        build.append("root, [");
        PrintCildren(i,node,build);
      }
      else if(node[i].left == -1){
        build.append("leaf, [");
      }
      else {
        build.append("internal node, [");
        PrintCildren(i,node,build);
      }
      build.append("]\n");
    }
    System.out.print(build);
  }

  static int getDepth(int u, Node node[]){
    int d = 0;
    while(node[u].parent != -1){
      u = node[u].parent;
      d++;
    }
    return d;
  }

  static void PrintCildren(int u, Node node[], StringBuilder bl){
    int c = node[u].left;
    if(c!=-1){
      bl.append(c);
      c = node[c].right_sibling;
    }
    while(c != -1){
      // System.out.print(c);
      bl.append(", ").append(c);
      c = node[c].right_sibling;
    }
  }
}

class Node{
  int parent = -1;
  int left = -1;
  int right_sibling = -1;
  Node(int parent, int left, int right_sibling){
    this.parent = parent;
    this.left = left;
    this.right_sibling = right_sibling;
  }
  Node(){}

  }
