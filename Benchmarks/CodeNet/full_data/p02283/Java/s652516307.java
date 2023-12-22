import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {
  private final static String INSERT = "insert";
  private static Tree ROOT = null;
  private static Tree END = null;

  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int times = Integer.parseInt(sc.next());
    List<Tree> tree = new ArrayList<>(times - 1);

    for (int i = 0; i < times; i++) {
      if (sc.next().equals(INSERT)) {
        insert(tree, Integer.parseInt(sc.next()));
      } else {
        setEnd();
        createBuilderInorder(ROOT);
        System.out.println();
        createBuilderByRoot(ROOT);
        System.out.println();
      }
    }
  }

  public static void insert(List<Tree> tree, int key) {
    Tree y = null;
    Tree x = ROOT;
    Tree z = new Tree();
    z.key = key;

    while (x != null) {
      y = x;
      if (z.key < x.key) {
        x = x.left;
      } else {
        x = x.right;
      }
    }

    z.parent = y;

    if (y == null) {
      tree.add(z);
      ROOT = z;
    } else if (z.key < y.key) {
      y.left = z;
      tree.add(z);
    } else {
      y.right = z;
      tree.add(z);
    }
  }

  public static void setEnd() {
    Tree current = ROOT;
    while (current.right != null) {
      current = current.right;
    }

    END = current;
  }

  public static void createBuilderInorder(Tree tree) {
    if (tree != null) {
      createBuilderInorder(tree.left);
      System.out.print(" ");
      System.out.print(tree.key);
      createBuilderInorder(tree.right);
    }
  }

  public static void createBuilderByRoot(Tree tree) {
    if (tree != null) {
      System.out.print(" ");
      System.out.print(tree.key);
      createBuilderByRoot(tree.left);
      createBuilderByRoot(tree.right);
    }
  }

  public static void printArr() {

  }
}

class Tree {
  public int key;
  public Tree left;
  public Tree right;
  public Tree parent;

  public Tree() { }
}

