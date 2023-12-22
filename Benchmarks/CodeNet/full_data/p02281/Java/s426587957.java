import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    
    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      int n = Integer.parseInt(br.readLine());
      int id,left,right;
      String[] words;
      Tree tree = new Tree(n);

      for(int i=0,k=0; i<n; i++,k=0){
        words = br.readLine().split(" ");
        id = Integer.parseInt(words[k++]);
        left  = Integer.parseInt(words[k++]);
        right = Integer.parseInt(words[k++]);

        tree.nodeInit(id,left,right);
      }

      tree.dispRoundPath(tree.getTreeRoot());
    }
    catch(IOException e) {
      System.out.println("IOException!");
    }
  }
}

class Tree {

  static final int NIL = -1;
  BTreeNode[] node;
  StringBuilder buf;

  public Tree(int size) {
    node = new BTreeNode[size];
    for (int i=0; i < size; i++) {
      node[i] = new BTreeNode();
    }
    buf = new StringBuilder(size*3);
  }

  void nodeInit(int id, int left, int right) {
    node[id].id = id;
    node[id].left = left;
    node[id].right = right;
    setParent(id);
  }
  int getTreeRoot() {
    int root=0;

    for (BTreeNode e : node) {
      if(e.parent == Tree.NIL)
        root = e.id;
    }

    return root;
  }
  void setParent(int id) {
    if(node[id].left != Tree.NIL)
      node[ node[id].left ].parent = id;
    if(node[id].right != Tree.NIL)
      node[ node[id].right ].parent = id;
  }

  void preParse(int u) {
    if(u != NIL){
      buf.append(" ").append(u);
      preParse(node[u].left);
      preParse(node[u].right);
    }
  }
  void inParse(int u) {
    if(u != NIL) {
      inParse(node[u].left);
      buf.append(" ").append(u);
      inParse(node[u].right);
    }
  }
  void postParse(int u) {
    if(u != NIL) {
      postParse(node[u].left);
      postParse(node[u].right);
      buf.append(" ").append(u);
    }
  }

  void dispRoundPath(int root) {

    buf.append("Preorder\n");
    preParse(root);
    buf.append("\n")
      .append("Inorder\n");
    inParse(root);
    buf.append("\n")
      .append("Postorder\n");
    postParse(root);
    buf.append("\n");

    System.out.print(buf);
  }
}

class BTreeNode {
  int id,parent,left,right;

  public BTreeNode() {
    this.id =
    this.parent =
    this.left =
    this.right = Tree.NIL;
  }
}
