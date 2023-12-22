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

  public static boolean find_helper(Node x, int k) {
    if (x == null)
      return false;
    if (x.key == k)
      return true;
    if (k <= x.key)
      return find_helper(x.left, k);
    else
      return find_helper(x.right, k);
  }

  public static String find(Node x, int k) {
    if (find_helper(x, k))
      return "yes";
    return "no";
  }

  public static Node find_to_delete(Node x, int k) {
    if (x == null)
      return null;
    if (x.key == k)
      return x;
    if (k <= x.key)
      return find_to_delete(x.left, k);
    else
      return find_to_delete(x.right, k);
  }

  public static void splice_successor_and_replace_key(Node z) {
    Node y = z.right;
    Node p = z;
    while (y.left != null) {
      p = y;
      y = y.left;
    }
    if (z.key == p.key)  // Successor was z's right child
      z.right = null;
    else
      p.left = null;
    z.key = y.key;
  }

  public static void update_parent_with(Tree t, Node z, Node y) {
    // Z has no parent
    if (z.p == null)
      t.root = y;
    // Z is left child of parent
    else if (z.p.left != null && z.p.left.key == z.key)
      z.p.left = y;
    // Z is right child of parent
    else
      z.p.right = y;
    if (y != null)
      y.p = z.p;
  }

  public static void delete(Tree t, int k) {
    Node z = find_to_delete(t.root, k);
    if (z == null)  // K does not exist in tree
      return;
    if (z.left == null && z.right == null)  // Z has no children
      update_parent_with(t, z, null);
    else if (z.right == null)               // Z has only a left child
      update_parent_with(t, z, z.left);
    else if (z.left == null)                // Z has only a right child
      update_parent_with(t, z, z.right);
    else                                    // Z has two children
      splice_successor_and_replace_key(z);
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
        case "find":
          int k = s.nextInt();
          results.add(find(T.root, k));
          break;
        case "delete":
          k = s.nextInt();
          delete(T, k);
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

