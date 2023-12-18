/**
 * Created at 00:22 on 2019-08-12
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

  public static int oneBased = 1;
  public static long P;

  public static class Solver {
    public Solver() {

      int N = sc.nextInt();
      int M = sc.nextInt();
      P = sc.nextLong();

      Bellman_Ford bell = new Bellman_Ford(N, M);

      long cost = -bell.shortestPath(0, N-1);

      out.println(cost == INF ? -1 : Math.max(0, cost));

    }
  }

  public static class Bellman_Ford extends Graph{

    static final long INF = Long.MAX_VALUE / 2;

    int N, M;

    public Bellman_Ford(int N, int M) {
      this.N = N;
      this.M = M;
      read(N, M, true);
    }

    public long shortestPath(int s, int g) {

      for (int i = 0; i < N; i++) {
        nodes[i].cost = INF;
      }

      nodes[s].cost = 0;
      boolean updated;

      for (int t = 0; t < 2*N; t++) {
        updated = false;

        for (int i = 0; i < N; i++) {
          Node from = nodes[i];
          if (from.cost == INF) continue;
          for (Edge e : nodes[i].edgesTo) {
            Node to = e.to();
            long newCost = from.cost + e.cost;
            if (newCost < to.cost) {
              to.cost = (t < N-1 ? newCost : -INF);
              updated = true;
            }
          }
        }

        if (!updated) break;
      }

      return nodes[g].cost;

    }

  }

  public static class Graph {

    static final long INF = Long.MAX_VALUE / 2;

    Node[] nodes;

    /*
     * N: 頂点の数
     * M: 辺の数
     * hasCost: 辺にコストがあるか
     */
    public void read(int N, int M, boolean hasCost) {
      nodes = new Node[N];
      for (int i=0; i<N; i++) {
        nodes[i] = new Node(i, INF);
      }

      for (int i=0; i<M; i++) {
        int from = sc.nextInt()-oneBased;
        int to = sc.nextInt()-oneBased;
        long cost = -(hasCost ? sc.nextLong() : 1) + P;
        Edge e = new Edge(from, to, cost);
        nodes[from].edgesTo.add(e);
        nodes[to].edgesFrom.add(e);
      }
    }

    public class Node {
      int id;
      long cost;
      ArrayList<Edge> edgesFrom = new ArrayList(); //このノードを終点とする辺
      ArrayList<Edge> edgesTo = new ArrayList(); //このノードを始点とする辺
      boolean done = false;

      public Node(int id, long cost) {
        this.id = id;
        this.cost = cost;
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
      public Node to() {
        return nodes[to];
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
