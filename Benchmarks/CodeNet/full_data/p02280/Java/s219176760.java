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
      int id;
      String[] words;
      Tree tree = new Tree(n);

      for(int i=0,k=0; i<n; i++,k=0){
        words = br.readLine().split(" ");
        id = Integer.parseInt(words[k++]);
        tree.node[id].id    = id;
        tree.node[id].left  = Integer.parseInt(words[k++]);
        tree.node[id].right = Integer.parseInt(words[k++]);

        tree.NodeInit(id);
      }

      int root=0;
      for (BTreeNode e : tree.node) {
        tree.setSibling(e.id);
        if(e.parent == Tree.NIL)
          root = e.id;
      }
      tree.setDepth(root, 0);
      tree.setHeight(root);

      System.out.print(tree.dispTreeNode());
    }
    catch(IOException e) {
      System.out.println("IOException!");
    }
  }
}

class Tree {

  static final int NIL = -1;
  BTreeNode[] node;

  public Tree(int size) {
    node = new BTreeNode[size];
    for (int i=0; i < size; i++) {
      node[i] = new BTreeNode();
    }
  }

  void NodeInit(int id){
    node[id].setDegree();
    setParent(id);
  }
  void setParent(int id) {
    if(node[id].left != Tree.NIL)
      node[ node[id].left ].parent = id;
    if(node[id].right != Tree.NIL)
      node[ node[id].right ].parent = id;
  }
  void setSibling(int id) {
    int parent = node[id].parent;
    if( parent != Tree.NIL) {
      node[id].sibling =
        node[parent].left != node[id].id ? node[parent].left : node[parent].right;
    }
  }
  void setDepth(int u, int p) {
    node[u].setDepth(p);

    if( node[u].left != Tree.NIL )
      setDepth(node[u].left, p+1);
    if( node[u].right != Tree.NIL )
      setDepth(node[u].right, p+1);
  }
  int setHeight(int u) {

    if( node[u].degree == 2 ) {
      int l = node[u].left;
      int r = node[u].right;
      node[u].setHeight(
        Math.max(setHeight(node[l].id)+1, setHeight(node[r].id)+1)
      );
      return node[u].getHeight();
    }
    if( node[u].degree == 1 ) {
      int v = Math.max(node[u].left,node[u].right );
      node[u].setHeight( setHeight(node[v].id)+1 );
      return node[u].getHeight();
    }

    node[u].setHeight(0);
    return 0;
  }

  public String dispTreeNode() {
    StringBuilder s = new StringBuilder();

    for (BTreeNode n : node)
      s.append(n).append("\n");

    return s.toString();
  }
}

class BTreeNode {
  int id,degree,parent,sibling;
  private int depth,height,type;
  int left,right;

  public BTreeNode() {
    this.id =
    this.degree =
    this.parent =
    this.sibling =
    this.left =
    this.right = Tree.NIL;
  }
  public BTreeNode(int id, int left, int right) {
    this.id = id;
    this.left = left;
    this.right = right;
    this.degree =
    this.parent =
    this.sibling = Tree.NIL;
  }

  /**
   * @return the height
   */
  public int getHeight() {
    return height;
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
  /**
   * @param degree the degree to set
   */
  public void setDegree() {
    if( left == right )
      this.degree = 0;
    else if ((left == Tree.NIL) || (right == Tree.NIL))
      this.degree = 1;
    else
      this.degree = 2;
  }
  /**
   * @param height the height to set
   */
  public void setHeight(int height) {
    this.height = height;
  }
  public void setType(int t) {
    this.type = t;
  }

  @Override
  public String toString() {
    return "node " + id + ": parent = " + parent + ", sibling = " + sibling
      + ", degree = " + degree + ", depth = " + depth + ", height = " + height +
      ", " + getType();
  }
}
