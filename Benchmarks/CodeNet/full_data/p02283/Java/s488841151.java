import java.util.Scanner;
import java.util.ArrayList;
public class Main {

  public static class Node {
    int key;
    Node left;
    Node right;
    Node p;
    public Node(int key) {
      this.key = key;
      this.left = null;
      this.right = null;
      this.p = null;
    }
  }

  public static class Tree {
    Node root;
    public Tree() {
      this.root = null;
    }
  }

  public static void insert(Tree T, Node z) {
    Node y = null;
    Node x = T.root;
    while (x != null) {
      y = x;
      if (z.key < x.key)
        x = x.left;
      else
        x = x.right;
    }
    z.p = y;

    if (y == null)
      T.root = z;
    else if (z.key < y.key)
      y.left = z;
    else
      y.right = z;
  }

  public static String print_inorder(Node x) {
    String a = "";
    if (x != null) {
      a = a + print_inorder(x.left);
      a = a + " " + x.key;
      a = a + print_inorder(x.right);
    }
    return a;
  }

  public static String print_preorder(Node x) {
    String a = "";
    if (x != null) {
      a = a + " " + x.key;
      a = a + print_preorder(x.left);
      a = a + print_preorder(x.right);
    }
    return a;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int m = s.nextInt();
    ArrayList<String> results = new ArrayList<String>();
    Tree T = new Tree();
    for (int i = 0; i < m; i++) {
      String cmd = s.next();
      switch(cmd) {
        case "insert":
          int key = s.nextInt();
          Node x = new Node(key);
          insert(T, x);
          break;
        case "print":
          results.add(print_inorder(T.root));
          results.add(print_preorder(T.root));
          break;
        default:
          break;
      }
    }
    s.close();
    for (String result : results) {
      System.out.println(result);
    }
  }
}

