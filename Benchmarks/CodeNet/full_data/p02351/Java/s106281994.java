/**
 * Created at 23:31 on 2019-07-09
 */

import java.io.*;
import java.util.*;

public class Main {

  static FastScanner sc = new FastScanner();
  static PrintStream out = System.out;
  static PrintWriter pw = new PrintWriter(out);

  static final int[] dx = {0, 1, 0, -1};
  static final int[] dy = {-1, 0, 1, 0};

  static final long MOD = (long) (1e9 + 7);
  static final long INF = Long.MAX_VALUE / 2;

  public static class Solver {
    public Solver() {

      int n = sc.nextInt();
      int q = sc.nextInt();

      SegmentTree seg = new SegmentTree(new long[n]);

      for (int i=0; i<q; i++) {
        int com = sc.nextInt();
        if (com == 0) {
          seg.put(sc.nextInt()-1, sc.nextInt(), sc.nextLong());
        } else {
          out.println(seg.query(sc.nextInt()-1, sc.nextInt()).val);
        }
      }

    }

    /*
     * 使うときはf()とinitialValを設定する
     * 場合によってはNodeにフィールドを追加する必要がある
     * そのときはupdateなども変更する
     */
    public static class SegmentTree {

      static final long INF = Long.MAX_VALUE / 2;

      Node[] tree;
      int N = 1; //元配列の要素数以上で最小の2の冪乗
      int size; //木のサイズ
      Node initialNode;

      /*
       * operation と prop の演算を書き換えることで応用可能
       * ex. Math.max(a, b), Math.min(a, b), a + b
       * 初期値はこの関数を元に決める必要がある
       * (maxなら-Inf, minならInf, a+bなら0)
       */
      public static class Node {
        static long initialVal = 0;
        static long initialLazy = 0;
        long val;
        long lazy;

        public Node() {
          val = initialVal;
          lazy = initialLazy;
        }
        public Node(long val) {
          this.val = val;
          lazy = initialLazy;
        }

        public Node operation(Node nl, Node nr) {
          val = nl.val + nr.val;
          return this;
        }
        public void prop(Node par) {
          lazy += par.lazy/2;
        }
        public void prop(long x, int l, int r) {
          lazy += x * (r-l);
        }
        public void update() {
          val += lazy;
          lazy = initialLazy;
        }
      }

      public void update(int k, long x) {
        k += N-1;
        tree[k] = new Node(x);

        while(k != 0) {
          k = parent(k);
          tree[k].operation(tree[childL(k)], tree[childR(k)]);
        }
      }

      private void prop(int k) {
        if (childL(k) < size) { //葉じゃなければ
          tree[childL(k)].prop(tree[k]);
          tree[childR(k)].prop(tree[k]);
        }
        tree[k].update();
      }

      public void put(int a, int b, long x) {
        put(a, b, 0, 0, N, x);
      }

      private void put(int a, int b, int k, int l, int r, long x) {
        if (tree[k].lazy != Node.initialLazy) {
          prop(k);
        }

        if (r <= a || b <= l) return; //区間外
        if (a <= l && r <= b) { //区間に完全に含まれる
          tree[k].prop(x, l, r);
          prop(k);
        } else { //一部区間外
          put(a, b, childL(k), l, (l + r) / 2, x);
          put(a, b, childR(k), (l + r) / 2, r, x);
          tree[k].operation(tree[childL(k)], tree[childR(k)]);
        }
      }

      public SegmentTree(long[] A) {
        initialNode = new Node();

        //元配列の要素数が2の冪乗でない場合,2の冪乗サイズに拡大して初期値をつめておく
        while (N < A.length) N *= 2;

        size = N*2-1;
        tree = new Node[size];

        for (int i=0; i<size; i++) {
          tree[i] = new Node();
        }

        for (int i=0; i<A.length; i++) {
          update(i, A[i]);
        }

      }

      public Node query(int a, int b) {
        return query(a, b, 0, 0, N);
      }

      private Node query(int a, int b, int k, int l, int r) {
        prop(k);

        if (r <= a || b <= l) return initialNode;
        if (a <= l && r <= b) return tree[k];

        return new Node().operation(query(a, b, childL(k), l, (l+r)/2), query(a, b, childR(k), (l+r)/2, r));
      }

      private int parent(int k) {
        return k % 2 == 0 ? (k-2)/2 : (k-1)/2;
      }

      private int childL(int k) {
        return 2*k+1;
      }

      private int childR(int k) {
        return 2*k+2;
      }

      public static void main(String[] args) {
        SegmentTree seg = new SegmentTree(new long[]{3,4,6,8,2,7,5,8,1,4});
        Scanner sc = new Scanner(System.in);
        while(true) {
          int command = sc.nextInt();
          if (command == 0) {
            seg.update(sc.nextInt(), sc.nextLong());
          } else if (command == 1) {
            seg.put(sc.nextInt(), sc.nextInt(), sc.nextLong());
          } else {
            System.out.println(seg.query(sc.nextInt(), sc.nextInt()).val);
          }
        }
      }

    }

  }

  public static void main(String[] args) {
    new Solver();
  }

  static class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
      if (ptr < buflen) {
        return true;
      } else {
        ptr = 0;
        try {
          buflen = in.read(buffer);
        } catch (IOException e) {
          e.printStackTrace();
        }
        if (buflen <= 0) {
          return false;
        }
      }
      return true;
    }

    private int readByte() {
      if (hasNextByte()) return buffer[ptr++];
      else return -1;
    }

    private static boolean isPrintableChar(int c) {
      return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
    }

    public boolean hasNext() {
      skipUnprintable();
      return hasNextByte();
    }

    public String next() {
      if (!hasNext()) throw new NoSuchElementException();
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while (isPrintableChar(b)) {
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
    }

    public long nextLong() {
      if (!hasNext()) throw new NoSuchElementException();
      long n = 0;
      boolean minus = false;
      int b = readByte();
      if (b == '-') {
        minus = true;
        b = readByte();
      }
      if (b < '0' || '9' < b) {
        throw new NumberFormatException();
      }
      while (true) {
        if ('0' <= b && b <= '9') {
          n *= 10;
          n += b - '0';
        } else if (b == -1 || !isPrintableChar(b)) {
          return minus ? -n : n;
        } else {
          throw new NumberFormatException();
        }
        b = readByte();
      }
    }

    public int nextInt() {
      return (int) nextLong();
    }

    public int[] nextIntArray(int N, boolean oneBased) {
      if (oneBased) {
        int[] array = new int[N + 1];
        for (int i = 1; i <= N; i++) {
          array[i] = sc.nextInt();
        }
        return array;
      } else {
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
          array[i] = sc.nextInt();
        }
        return array;
      }
    }

    public long[] nextLongArray(int N, boolean oneBased) {
      if (oneBased) {
        long[] array = new long[N + 1];
        for (int i = 1; i <= N; i++) {
          array[i] = sc.nextLong();
        }
        return array;
      } else {
        long[] array = new long[N];
        for (int i = 0; i < N; i++) {
          array[i] = sc.nextLong();
        }
        return array;
      }
    }
  }

}

