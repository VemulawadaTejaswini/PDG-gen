/**
 * Created at 21:21 on 2019-08-18
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

  public static class Solver {
    public Solver() {

      int N = sc.nextInt();
      int Q = sc.nextInt();

      Graph tree = new Graph();
      tree.read(N, N-1, false, false);

      int[] tour = tree.tour(0);

      int[] first = new int[N];
      int[] last = new int[N];
      Arrays.fill(first, -1);
      Arrays.fill(last, -1);
      for (int i=0; i<tour.length; i++) {
        if (first[tour[i]] == -1) {
          first[tour[i]] = i;
        }
        last[tour[i]] = i;
      }

      long[] imosu = new long[2*N];

      for (int q=0; q<Q; q++) {
        int p = sc.nextInt()-1;
        int x = sc.nextInt();
        imosu[first[p]] += x;
        imosu[last[p]+1] -= x;
      }

      long[] ans = new long[N];
      long cur = 0;
      for (int i=0; i<2*N-1; i++) {
        cur += imosu[i];
        if (first[tour[i]] == i) {
          ans[tour[i]] += cur;
        }
      }

      out.print(ans, " ");

    }


    public class Graph {

      public int oneBased = 1;

      static final long INF = Long.MAX_VALUE / 2;

      Node[] nodes;

      int V,E;

      public void read(int N, int M, boolean hasCost) {
        read(N, M, hasCost, true);
      }

      /*
       * N: 頂点の数
       * M: 辺の数
       * hasCost: 辺にコストがあるか
       * directed: 有向グラフかどうか
       */
      public void read(int N, int M, boolean hasCost, boolean directed) {
        V = N;
        E = M;

        nodes = new Node[N];
        for (int i=0; i<N; i++) {
          nodes[i] = new Node(i, INF);
        }

        for (int i=0; i<M; i++) {
          int from = sc.nextInt()-oneBased;
          int to = sc.nextInt()-oneBased;
          long cost = (hasCost ? sc.nextLong() : 1);
          Edge e = new Edge(from, to, cost);
          nodes[from].edgesTo.add(e);
          nodes[to].edgesFrom.add(e);
          if (!directed) {
            Edge e2 = new Edge(to,from, cost);
            nodes[from].edgesFrom.add(e2);
            nodes[to].edgesTo.add(e2);
          }
        }
      }

      public int[] tour(int s) {

        int[] tour = new int[2*V-1];
        int p = 0;

        LinkedList<Node> stack = new LinkedList<Node>();

        stack.add(nodes[s]);

        while(!stack.isEmpty()) {
          Node from = stack.removeLast();
          tour[p++] = from.id;
          if (from.done) continue;
          for (Edge e: from.edgesTo) {
            stack.add(e.to());
          }
          from.done = true;
        }

        return tour;

      }

      public class Node {
        int id;
        long cost;
        int prev;
        int depth;
        LinkedList<Edge> edgesFrom = new LinkedList(); //このノードを終点とする辺
        LinkedList<Edge> edgesTo = new LinkedList(); //このノードを始点とする辺
        boolean done = false;

        public Node(int id, long cost) {
          this.id = id;
          this.cost = cost;
          prev = -1;
          depth = 0;
        }

        //木構造だった場合
        public Node parent() {
          return nodes[edgesFrom.get(0).to];
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
        public Node getFrom() {return from(); }
        public Node to() {
          return nodes[to];
        }
        public Node getTo() { return to(); }
      }

      public boolean[] reachableFrom(int s) {
        boolean[] visited = new boolean[V];

        LinkedList<Node> stack = new LinkedList<Node>();

        stack.add(nodes[s]);

        while(!stack.isEmpty()) {
          Node from = stack.getLast();
          visited[from.id] = true;
          for (Edge e: from.edgesTo) {
            if (!visited[e.to]) {
              stack.add(e.to());
            }
          }
        }

        return visited;
      }

      public boolean[] reachableTo(int g) {
        boolean[] visited = new boolean[V];

        LinkedList<Node> stack = new LinkedList<Node>();

        stack.add(nodes[g]);

        while(!stack.isEmpty()) {
          Node to = stack.removeLast();
          visited[to.id] = true;
          for (Edge e: to.edgesFrom) {
            if (!visited[e.from]) {
              stack.add(e.from());
            }
          }
        }

        return visited;
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
