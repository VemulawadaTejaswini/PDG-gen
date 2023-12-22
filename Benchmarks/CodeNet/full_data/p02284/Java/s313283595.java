import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) {
    
    new Main().run();
  }

  public void run() {

    try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      final int n = Integer.parseInt(br.readLine());
      String op;
      String[] words;
      Tree tree = new Tree();
      int t;

      for(int i=0,k=0; i<n; i++,k=0){
        words = br.readLine().split(" ");
        op  = words[k++];

        switch( op ) {
          case "insert" :
            tree.insert(Integer.parseInt(words[k]));
            break;
          case "find" :
            t = Integer.parseInt(words[k]);
            System.out.println( tree.find(t) ? "yes" : "no" );
            break;
          default :
            tree.dispRoundPath();
        }
      }

    }
    catch(IOException e) {
      System.out.println("IOException!");
    }
  }
}

class Tree {

  static final BTreeNode NIL = new BTreeNode(-1);
  BTreeNode root;
  StringBuilder buf;

  public Tree() {
    root = NIL;
    buf = new StringBuilder();
    exist = false;
  }

  public void insert(int val) {
    BTreeNode y = NIL;
    BTreeNode x = root;
    BTreeNode z = new BTreeNode(val);

    while( !x.equals(NIL) ) {
      y = x;
      if( z.key < x.key )
        x = x.left;
      else
        x = x.right;
    }
    z.parent = y;

    if( y.equals(NIL) )
      root = z;
    else if( z.key < y.key )
      y.left = z;
    else
      y.right = z;
  }
  boolean find(int target) {
    BTreeNode x = root;

    while( !x.equals(NIL) ) {
      if( target == x.key )
        return true;
      else if( target < x.key )
        x = x.left;
      else
        x = x.right;
    }

    return false;
  }
  
  void preParse(BTreeNode u) {
    if( !u.equals(NIL) ) {
      buf.append(" ").append(u.key);
      preParse(u.left);
      preParse(u.right);
    }
  }
  void inParse(BTreeNode u) {
    if( !u.equals(NIL) ) {
      inParse(u.left);
      buf.append(" ").append(u.key);
      inParse(u.right);
    }
  }

  void dispRoundPath() {

    inParse(root);
    buf.append("\n");
    preParse(root);
    buf.append("\n");

    System.out.print(buf);
    buf.setLength(0);
  }
}

class BTreeNode {
  final int key;
  BTreeNode parent,left,right;

  public BTreeNode(final int key) {
    this.key = key;
    this.parent =
    this.left =
    this.right = Tree.NIL;
  }

  @Override
  public boolean equals(Object o) {
    if(o == this) return true;
    if(o == null) return false;
    if(!(o instanceof BTreeNode)) return false;

    BTreeNode node = (BTreeNode)o;
    if(!(this.key == node.key)) return false;

    return true;
  }
}
