import java.util.Random;
import java.util.Scanner;
 
// Randomized Binary Search Tree
public class Main {
 
  static Random gen;
  static final long INF = 1 << 29;
 
  static class Node {
 
    public long v;
    public Node left, right;
    public int count;
    public long minimum;
 
    public Node(long v) {
      this.v = v;
      update(this);
    }
  }

  public static Node update(Node a) {
    if(a == null) return null;
    a.count = 1;
    if(a.left != null) a.count += a.left.count;
    if(a.right != null) a.count += a.right.count;
    a.minimum = Math.min(Math.min(a.left != null ? a.left.minimum : INF, a.right != null ? a.right.minimum : INF), a.v);
    return a;
  }

  public static int count(Node a) {
    return a == null ? 0 : a.count;
  }

  public static Node merge(Node a, Node b) {
    if(b == null) return a;
    if(a == null) return b;
    if(gen.nextInt(a.count + b.count) < a.count) { // a is larger
      a.right = merge(a.right, b);
      return update(a);
    } else {
      b.left = merge(a, b.left);
      return update(b);
    }
  }

  // [0, K), [K, n)
  public static Node[] split(Node a, int K) {
    if(a == null) return new Node[]{null, null};
    if(K <= count(a.left)) {
      Node[] s = split(a.left, K);
      a.left = s[1];
      s[1] = update(a);
      return s;
    } else {
      Node[] s = split(a.right, K - count(a.left) - 1);
      a.right = s[0];
      s[0] = update(a);
      return s;
    }
  }
 
  public static Node insert(Node a, int K, Node b) {
    if(a == null) return b;
    Node[] s = split(a, K);
    return merge(merge(s[0], b), s[1]);
  }
 
  public static Node erase(Node a, int K) {
    Node[] ac = split(a, K + 1);
    Node[] bc = split(ac[0], K);
    Node b = merge(bc[0], ac[1]);
    return update(b);
  }
 
  public static long query(Node a, int l, int r) {
    if(a == null || r <= 0 || a.count <= l) {
      return INF;
    }
    if(l <= 0 && a.count <= r) {
      return a.minimum;
    } else {
      int c = count(a.left);
      long lv = query(a.left, l, r);
      long rv = query(a.right, l - c - 1, r - c - 1);
      long ret = Math.min(lv, rv);
      if(l <= c && c < r) ret = Math.min(ret, a.v);
      return ret;
    }
  }
 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    gen = new Random(1);
    int n = sc.nextInt();
    int Q = sc.nextInt();
    int[] x = new int[n];
 
    for(int i = 0; i < n; i++) {
      x[i] = sc.nextInt();
    }
 
    Node root = null;
 
    for(int v : x) {
      root = insert(root, root == null ? 0 : count(root), new Node(v));
    }
 
    for(int i = 0; i < Q; i++) {
      int t = sc.nextInt();
      if(t == 0) {
        int l = sc.nextInt();
        int r = sc.nextInt();
        Node[] a = split(root, r + 1);
        Node[] b = split(a[0], r);
        Node[] c = split(b[0], l);
        root = merge(c[0], b[1]);
        root = merge(root, c[1]);
        root = merge(root, a[1]);
      } else if(t == 1) {
        int l = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(query(root, l, r + 1));
      } else {
        int pos = sc.nextInt();
        int v = sc.nextInt();
        root = erase(root, pos);
        root = insert(root, pos, new Node(v));
      }
    }
  }
}