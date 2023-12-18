/**
 * Created at 20:56 on 2019-07-07
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

    static long[] fact;
    static long[] factInverse;

    public Solver() {

      int N = sc.nextInt();
      long K = sc.nextLong();

      fact = new long[(int)(1e5+1)];
      factInverse = new long[(int)(1e5+1)];

      read(N, N-1, false);

      long ans = K;

      ArrayDeque<Node> queue = new ArrayDeque<Node>();

      ans = mul(ans, permutation(K-1, nodes[0].edgesTo.size())); //親ノードはないので引かなくていい

      for (Edge e: nodes[0].edgesTo) {
        queue.add(e.getTo());
      }

      nodes[0].done = true;

      while(!queue.isEmpty()) {
        Node n = queue.poll();
        ans = mul(ans, permutation(K-2, n.edgesTo.size()-1)); //親ノードを引く
        for (Edge e: n.edgesTo) {
          if (!e.getTo().done)
            queue.add(e.getTo());
        }
        n.done = true;
      }

      out.println(ans);

    }

    public long mul(long... a) {
      long ans = 1;
      for (int i=0; i<a.length; i++) {
        ans = (ans * a[i]) % MOD;
      }
      return ans;
    }

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
        int from = sc.nextInt()-1;
        int to = sc.nextInt()-1;
        long cost = (hasCost ? sc.nextLong() : 1);
        Edge e = new Edge(from, to, cost);
        nodes[from].edgesTo.add(e);
        nodes[to].edgesFrom.add(e);
        e = new Edge(to, from, cost);
        nodes[from].edgesFrom.add(e);
        nodes[to].edgesTo.add(e);
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
      public long cost() {
        return cost;
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
      public Node getFrom() {
        return nodes[from];
      }
      public Node getTo() {
        return nodes[to];
      }
    }


    public static long power(long a, long b) {
      if (b == 0) return 1;

      if (b % 2 == 0) {
        long p = power(a, b/2);
        return (p * p) % MOD;
      } else {
        return (a * power(a, b - 1)) % MOD;
      }
    }

    public static long factorial(long n) {
      if (n == 0) return 1;
      if (fact[(int)n] == 0) {
        return fact[(int)n] = (n * factorial(n - 1)) % MOD;
      } else {
        return fact[(int)n];
      }
    }

    public static long factorialInverse(long n) {
      if (factInverse[(int)n] == 0) {
        return factInverse[(int)n] = power(factorial(n), MOD - 2);
      } else {
        return factInverse[(int)n];
      }
    }

    public static long comb(long n, long r) {
      if (r < 0 || r > n) return 0;
      return (((factorial(n) * factorialInverse(r)) % MOD) * factorialInverse(n-r)) % MOD;
    }

    public static long permutation(long n, long r) {
      if (r < 0 || r > n) return 0;
      return (factorial(n) * factorialInverse(n-r)) % MOD;
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
