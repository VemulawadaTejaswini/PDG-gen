import java.util.Scanner;

class Main {
  private final static String INSERT = "insert";
  private static Tree ROOT = null;
  private static Tree END = null;

  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int times = Integer.parseInt(sc.next());
    // List<Tree> tree = new ArrayList<>(times - 1);

    for (int i = 0; i < times; i++) {
      if (sc.next().equals(INSERT)) {
        insert(Integer.parseInt(sc.next()));
      } else {
        createBuilderInorder(ROOT);
        System.out.println();
        createBuilderByRoot(ROOT);
        System.out.println();
      }
    }
  }

  public static void insert(int key) {
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
      ROOT = z;
    } else if (z.key < y.key) {
      y.left = z;
    } else {
      y.right = z;
    }
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
}

class Tree {
  public int key;
  public Tree left;
  public Tree right;
  public Tree parent;

  public Tree() { }
}

