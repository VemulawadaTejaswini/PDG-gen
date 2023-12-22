import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {

  static Random gen;
  static final long INF = 1 << 29;

  static class Node {

    public long v;            // ???
    public Node left, right;  // ?????????????????????????????? 
    public int count;         //???????????????????????¨????????¨?????¨?????????????????????????????°
    public long plus;         // ?????????????????????????????¶???????????????
    public long minimum;      // ???????????????????????¨????????¨?????¨???????????????????????????????°????
    public Node(long v) {
        this.v = v;
        this.plus = 0;
        update(this);
    }

    public Node clone() {
        Node n = new Node(this.v);
        n.left = this.left;
        n.right = this.right;
        n.plus = this.plus;
        return update(n);
    }

    public Node update(Node a) {
        if(a == null) return null;
        a.count = 1;
        if(a.left != null) a.count += a.left.count;
        if(a.right != null) a.count += a.right.count;
        a.minimum = Math.min(Math.min(a.left != null ? a.left.minimum : INF, a.right != null ? a.right.minimum : INF), a.v);
        return a;
    }

    public int count(Node a) {
        return a == null ? 0 : a.count;
    }
  }


  public static Node merge(Node a, Node b) {
    if(b == null) return a;
    if(a == null) return b;
    if(gen.nextInt(a.count + b.count(b)) < a.count) { // a is larger
      Node ac = propagate(a);
      ac.right = merge(ac.right, b);
      return ac.update(ac);
    } else {
      Node bc = propagate(b);
      bc.left = merge(a, bc.left);
      return bc.update(bc);
    }
  }
  
  // a?????¨?????¨???[0, K),[K, N)?????????????????????????????????????????????Node[]??§??????.
  public static Node[] split(Node a, int K) {
    if(a == null) return new Node[]{null, null};
    Node ac = propagate(a); // ????????????????????????????????????propagate?????????
    if(K <= a.count(a.left)) {
      Node[] s = split(ac.left, K);
      ac.left = s[1];
      s[1] = ac.update(ac); // ??????????????????????????????(??????s[1]??????????????¨????????????????????\???????????°????????????????????§???
      return s;
    } else {
      Node[] s = split(ac.right, K - ac.count(ac.left) - 1);
      ac.right = s[0];
      s[0] = ac.update(ac);
      return s;
    }
  }

  // ????????¨?????????????????\?????????
  public static Node insert(Node a, int K, Node b) {
    if(a == null) return b;
    int buf = gen.nextInt(a.count + b.count(b));
    if(buf < a.count) {    // a is larger
      Node ac = a.clone();
      if(K <= a.count(a.left)) {
        ac.left = insert(ac.left, K, b);
      } else {
        ac.right = insert(ac.right, K - ac.count(ac.left) - 1, b);
      }
      return ac.update(ac);
    } else {
      // root?????????????????????
      Node[] ch = split(a, K);
      b.left = ch[0] ; b.right = ch[1];
      return b.update(b);
    }
  }

  // ?????¶?????????split&merge)?????¨???
  public static Node propagate(Node a) {
    if(a == null) return null;
    if(a.plus == 0) return a.clone();
    Node ac = a.clone();
    if(a.left != null) {
      Node acleft = a.left.clone();
      acleft.plus += a.plus;
      acleft.update(acleft);
      ac.left = acleft;
    }
    if(a.right != null) {
      Node acright = a.right.clone();
      acright.plus += a.plus;
      acright.update(acright);
      ac.right = acright;
    }
    ac.v += ac.plus;
    ac.plus = 0;  // propagate??????
    return ac.update(ac);
  }

  public static Node erase(Node a, int K) {
    Node[] ac = split(a, K + 1);
    Node[] bc = split(ac[0], K);
    Node b = merge(bc[0], ac[1]);
    return b.update(b);
  }

  public static long query(Node a, int l, int r) {
    if(a == null || r <= 0 || a.count <= l) {
      return INF;
    }
    if(l <= 0 && a.count <= r) {
      return a.minimum;
    } else {
      int c = a.count(a.left);
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
      root = insert(root, root == null ? 0 : root.count(root), new Node(v));
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