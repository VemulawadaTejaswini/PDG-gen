import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {

  private static final Scanner sc = new Scanner(System.in);

  public static void main(String... args) {
    int nodes = Integer.parseInt(sc.next());
    List<Tree> tree = new ArrayList<>(nodes);

    Tree parentNode = new Tree(-1);

    for (int i = 0; i < nodes; i++) {
      Tree node = new Tree(Integer.parseInt(sc.next()));
      tree.add(node);
      parentNode = node;
      setTree(tree, Integer.parseInt(sc.next()), parentNode);
    }
    setParentNodes(tree);
    for (int i = 0; i < tree.size(); i++) {
      System.out.print(tree.get(i).getNode() + ": ");
      System.out.println(tree.get(i).getParentNode());
    }
    check(tree);
  }

  public static void setTree(List<Tree> tree, int times, Tree parentNode) {
    for (int i = 0; i < times; i++) {
      Tree node = new Tree(Integer.parseInt(sc.next()));
      parentNode.setChildren(node);
    }
  }

  public static void setParentNodes(List<Tree> tree) {

    Tree[] nodes = new Tree[tree.size()];


    for (int i = 0; i < tree.size(); i++) {
      for (int j = 0; j < tree.get(i).getChildren().size(); j++) {
        tree.get(i).getChildren().get(j).setParentNode(tree.get(i));
        System.out.println(tree.get(i).getChildren().get(j).getNode() + ": parent = "
            + tree.get(i).getChildren().get(j).getParentNode().getNode());
      }
    }
    tree.get(0).setParentNode(new Tree(-1));
  }

  public static void check(List<Tree> tree) {
    for (Tree node: tree) {
      System.out.print("node " + node.getNode() + ": ");
      System.out.print("parent = " + node.getParentNode() + ", ");
      System.out.print("depth = "  + node.getDepth() + ", ");
      System.out.print((node.isLeaf() ? "leaf" : "internal node"));
      // System.out.print(
      //       "node " + node.getNode() + ": "
      //     + "parent = " + node.getParentNode().getNode() + ", "
      //     + "depth = "  + node.getDepth() + ", "
      //     + (node.isLeaf() ? "leaf" : "internal node"));

      printList(node.getChildren());
    }
  }

  public static void printList(List<Tree> list) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < list.size(); i++) {
      sb.append(list.get(i).getNode()).append(", ");
    }
    int length = sb.length();
    if (length != 0) {
      sb.delete(length - 2, length);
    }
    sb.insert(0, "[").append("]");
    System.out.println(sb);
  }
}

class Tree {
  private int node;
  private Tree parentNode;
  private int depth;
  private List<Tree> children = new ArrayList<>();
  private boolean isLeaf = true;


  public Tree() {
    this(0);
  }

  public Tree(int node) {
    this.node = node;
  }

  public final int getNode() {
    return node;
  }

  public final Tree getParentNode() {
    System.out.println(parentNode);
    return parentNode;
  }

  public final void setParentNode(Tree parentNode) {
    this.parentNode = parentNode;
  }

  public final int getDepth() {
    int depth = 0;
    Tree parent = this.parentNode;
    while (parent.node != -1) {
      depth++;
      parent = parent.parentNode;
    }

    return depth;
  }

  public final List<Tree> getChildren() {
    return children;
  }

  public final void setChildren(Tree child) {
    children.add(child);
  }

  public final boolean isLeaf() {
    return isLeaf;
  }
}

