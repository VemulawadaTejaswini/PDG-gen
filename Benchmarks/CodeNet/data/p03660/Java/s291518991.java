/**
 * Created at 22:36 on 2019-09-02
 */

import java.io.*;
import java.util.*;

public class Main {

  static FastScanner sc = new FastScanner();
  static Output out = new Output(System.out);

  static final int[] dx = {0, 1, 0, -1};
  static final int[] dy = {-1, 0, 1, 0};

  static final long MOD = (long) (1e9 + 7);
  static final long INF = Long.MAX_VALUE / 2;

  static final int e5 = (int) 1e5;

  public static class Solver {
    public Solver() {

      int N = sc.nextInt();

      Tree tree = new Tree();
      tree.read(N, false, 0, 0);

      int count = tree.dfs(tree.nodes[N-1].par((tree.nodes[N-1].rank-1) / 2));

      out.println(count >= N-count ? "Snuke" : "Fennec");
    }

    public class Tree {

      Node[] nodes;
      long initCost;
      int root;
      int V;

      /*
       * N: 頂点の数
       * M: 辺の数
       * hasCost: 辺にコストがあるか
       * initCost: 頂点の初期コスト
       * root: 根の番号
       */
      public void read(int N, boolean hasCost, long initCost, int root) {
        this.initCost = initCost;
        this.root = root;
        V = N;

        nodes = new Node[N];
        for (int i=0; i<N; i++) {
          nodes[i] = new Node(i, initCost);
        }

        for (int i=0; i<V-1; i++) {
          int from = sc.nextInt()-1;
          int to = sc.nextInt()-1;
          long cost = (hasCost ? sc.nextLong() : 1);
          Edge e = new Edge(from, to, cost);
          nodes[from].edges.add(e);
          e = new Edge(to, from, cost);
          nodes[to].edges.add(e);
        }

        setParent(root, root);

      }

      private void setParent(int i, int par) {
        nodes[i].par = par;
        Iterator<Edge> itr = nodes[i].edges.iterator();
        while (itr.hasNext()) {
          Edge e = itr.next();
          if (e.to == par) {
            itr.remove();
          }
          else {
            e.to().rank = nodes[i].rank+1;
            setParent(e.to, i);
          }
        }
      }

      public int[][] tour() {
        int[] tour = new int[2*V-1];
        tour(tour, 0, root);

        int[] start = new int[V];
        int[] end = new int[V];
        Arrays.fill(start, -1);
        for (int i=0; i<2*V-1; i++) {
          if (start[tour[i]] == -1) start[tour[i]] = i;
          end[tour[i]] = i;
        }

        return new int[][] {tour, start, end};
      }

      private int tour(int[] tour, int p, int s) {

        tour[p++] = s;

        for (Edge e: nodes[s].edges) {
          p = tour(tour, p, e.to);
          tour[p++] = s;
        }

        return p;

      }

      public int dfs(Node from) {

        int res = 1;

        for (Edge e: from.edges) {

          res += dfs(e.to());

        }

        return res;
      }

      public class Node {
        int id;
        int par;
        long cost;
        LinkedList<Edge> edges;
        boolean done;
        int rank;

        public Node(int id, long cost) {
          this.id = id;
          this.cost = cost;
          par= -1;
          edges = new LinkedList<Edge>();
          rank = 0;
          done = false;
        }

        public boolean isRoot() {
          return par == id;
        }

        public boolean isLeaf() {
          return edges.size() == 0;
        }

        public Node par() {
          return nodes[par];
        }

        public Node par(int k) {
          if (k == 0) return this;
          else return par().par(k-1);
        }

      }

      public class Edge {
        int from, to;
        long cost;
        public Edge(int from, int to, long cost) {
          this.from = from;
          this.to = to;
          this.cost = cost;
        }
        public Node from() {
          return nodes[from];
        }
        public Node to() {
          return nodes[to];
        }
      }

    }

  }

  public static void main(String[] args) {
    new Solver();
    out.flush();
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

  static class Output extends PrintWriter {

    public Output(PrintStream ps) {
      super(ps);
    }

    public void print(int[] a, String separator) {
      for (int i = 0; i < a.length; i++) {
        if (i == 0) print(a[i]);
        else print(separator + a[i]);
      }
      println();
    }

    public void print(long[] a, String separator) {
      for (int i = 0; i < a.length; i++) {
        if (i == 0) print(a[i]);
        else print(separator + a[i]);
      }
      println();
    }

    public void print(String[] a, String separator) {
      for (int i = 0; i < a.length; i++) {
        if (i == 0) print(a[i]);
        else print(separator + a[i]);
      }
      println();
    }

    public void print(ArrayList a, String separator) {
      for (int i = 0; i < a.size(); i++) {
        if (i == 0) print(a.get(i));
        else print(separator + a.get(i));
      }
      println();
    }
  }

}
