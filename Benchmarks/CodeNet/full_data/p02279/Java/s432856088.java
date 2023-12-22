import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    
    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      int id,degree;
      int[] child;
      String[] words;
      Tree tree = new Tree(n);

      for(int i=0,k=0; i<n; i++,k=0){
        words = br.readLine().split(" ");
        id = Integer.parseInt(words[k++]);
        tree.node[id].id     = id;
        tree.node[id].degree = degree = Integer.parseInt(words[k++]);
        tree.node[id].child  = child  = new int[degree];

        for (int j=0,c=0,l=0; j<degree; j++,l=c) {
          c = child[j] = Integer.parseInt(words[k++]);

          if( j==0 ) tree.node[id].leftChild = c;
          else tree.node[l].rightSibling = c;

          tree.node[c].parent = id;
        }
      }

      int root=0;
      for (TreeNodeB e : tree.node)
        if(e.parent == Tree.NIL) root = e.id;
      tree.calcDepth(root, 0);

      System.out.print(tree.dispTreeNode());
    }
    catch(IOException e) {
      System.out.println("IOException!");
    }
  }
}

class Tree {

  static final int NIL = -1;
  TreeNodeB[] node;

  public Tree(int size) {
    node = new TreeNodeB[size];
    for (int i=0; i < size; i++) {
      node[i] = new TreeNodeB();
    }
  }

  void calcDepth(int u, int p) {
    do {
      node[u].setDepth(p);

      if( node[u].leftChild != Tree.NIL )
        calcDepth(node[u].leftChild, p+1);
      
      u = node[u].rightSibling;
    } while( u != Tree.NIL);
  }

  public String dispTreeNode() {
    StringBuilder s = new StringBuilder();

    for (TreeNodeB n : node)
      s.append(n).append("\n");

    return s.toString();
  }
}

class TreeNodeB {
  int id,degree,parent;
  private int depth,type;
  int leftChild,rightSibling;
  int[] child;

  public TreeNodeB() {
    this.id =
    this.degree =
    this.parent =
    this.leftChild =
    this.rightSibling = Tree.NIL;
  }

  public String getType() {
    switch(type) {
      case 0:
        return "root";
      case 1:
        return "internal node";
      default:
        return "leaf";
    }
  }
  public void setDepth(int d) {
    depth = d;
    if(depth > 0) {
      if(degree > 0)
        setType(1);
      else
        setType(2);
    }
  }
  public void setType(int t) {
    this.type = t;
  }

  @Override
  public String toString() {
    return "node " + id + ": parent = " + parent + ", depth = " + depth + ", "
      + getType() +", " + Arrays.toString(child);
  }
}
