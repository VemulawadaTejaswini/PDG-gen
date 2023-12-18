import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

  private void solve(FastScanner in, PrintWriter out) {
    long N = in.nextInt();
    long A = in.nextInt();
    long B = in.nextInt();
    long max = B * (N - 1) + A;
    long min = A * (N - 1) + B;
    out.println(max - min + 1);
  }

  private int length(LCA lca, int a, int b, int c, int d) {
    return lca.getLength(a, d) + lca.getLength(b, d) + lca.getLength(c, d);
  }

  private int[] get(LCA lca, int a, int b, int c) {
    int d1 = lca.getLCA(a, b);
    int d2 = lca.getLCA(b, c);
    int d3 = lca.getLCA(a, c);

    int l1 = length(lca, a, b, c, d1);
    int l2 = length(lca, a, b, c, d2);
    int l3 = length(lca, a, b, c, d3);

    int min = Math.min(l1, Math.min(l2, l3));
    if (min == l1) {
      return new int[]{d1, l1};
    } else if (min == l2) {
      return new int[]{d2, l2};
    } else {
      return new int[]{d3, l3};
    }
  }

  class LCA {

    ArrayList<ArrayList<Integer>> G;
    int[][] parent;
    int[] depth;
    int root, logV;

    void build(int root) {
      Arrays.fill(depth, -1);
      ArrayDeque<Integer> stack = new ArrayDeque<>();
      stack.addFirst(root);
      parent[0][root] = -1;
      depth[root] = 0;
      while (!stack.isEmpty()) {
        int v = stack.peekFirst();
        for (int u : G.get(v)) {
          if (depth[u] >= 0) {
            continue;
          }
          parent[0][u] = v;
          depth[u] = depth[v] + 1;
          stack.addFirst(u);
        }
        if (stack.peekFirst() == v) {
          stack.pollFirst();
        }
      }
    }

    LCA(final ArrayList<ArrayList<Integer>> adj) {
      int V = adj.size();
      root = 0;
      G = adj;
      depth = new int[V];

      logV = 1;
      for (int i = 1; i <= V; ) {
        i *= 2;
        logV++;
      }
      parent = new int[logV][V];

      build(root);

      for (int k = 0; k + 1 < logV; ++k) {
        for (int v = 0; v < V; ++v) {
          if (parent[k][v] < 0) {
            parent[k + 1][v] = -1;
          } else {
            parent[k + 1][v] = parent[k][parent[k][v]];
          }
        }
      }
    }

    int getLCA(int u, int v) {
      if (depth[u] > depth[v]) {
        int tu = u;
        u = v;
        v = tu;
      }
      for (int k = 0; k < logV; ++k) {
        if (((depth[v] - depth[u]) >> k & 1) != 0) {
          v = parent[k][v];
        }
      }
      if (u == v) {
        return u;
      }
      for (int k = logV - 1; k >= 0; --k) {
        if (parent[k][u] != parent[k][v]) {
          u = parent[k][u];
          v = parent[k][v];
        }
      }
      return parent[0][u];
    }

    int getLength(int u, int v) {
      int lca = getLCA(u, v);
      return depth[u] + depth[v] - depth[lca] * 2;
    }
  }

  public static void main(String[] args) {
    PrintWriter out = new PrintWriter(System.out);
    new Main().solve(new FastScanner(), out);
    out.close();
  }

  private static class FastScanner {

    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int bufferLength = 0;

    private boolean hasNextByte() {
      if (ptr < bufferLength) {
        return true;
      } else {
        ptr = 0;
        try {
          bufferLength = in.read(buffer);
        } catch (IOException e) {
          e.printStackTrace();
        }
        if (bufferLength <= 0) {
          return false;
        }
      }
      return true;
    }

    private int readByte() {
      if (hasNextByte()) {
        return buffer[ptr++];
      } else {
        return -1;
      }
    }

    private static boolean isPrintableChar(int c) {
      return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
        ptr++;
      }
    }

    boolean hasNext() {
      skipUnprintable();
      return hasNextByte();
    }

    public String next() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while (isPrintableChar(b)) {
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
    }

    public int loadChar(char[] buf) {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      int pos = 0;
      int b = readByte();
      while (isPrintableChar(b)) {
        buf[pos] = (char) b;
        b = readByte();
        pos++;
      }
      return pos;
    }

    long nextLong() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
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

    double nextDouble() {
      return Double.parseDouble(next());
    }

    double[] nextDoubleArray(int n) {
      double[] array = new double[n];
      for (int i = 0; i < n; i++) {
        array[i] = nextDouble();
      }
      return array;
    }

    double[][] nextDoubleMap(int n, int m) {
      double[][] map = new double[n][];
      for (int i = 0; i < n; i++) {
        map[i] = nextDoubleArray(m);
      }
      return map;
    }

    public int nextInt() {
      return (int) nextLong();
    }

    public int[] nextIntArray(int n) {
      int[] array = new int[n];
      for (int i = 0; i < n; i++) {
        array[i] = nextInt();
      }
      return array;
    }

    public long[] nextLongArray(int n) {
      long[] array = new long[n];
      for (int i = 0; i < n; i++) {
        array[i] = nextLong();
      }
      return array;
    }

    public String[] nextStringArray(int n) {
      String[] array = new String[n];
      for (int i = 0; i < n; i++) {
        array[i] = next();
      }
      return array;
    }

    public char[][] nextCharMap(int n) {
      char[][] array = new char[n][];
      for (int i = 0; i < n; i++) {
        array[i] = next().toCharArray();
      }
      return array;
    }

    public int[][] nextIntMap(int n, int m) {
      int[][] map = new int[n][];
      for (int i = 0; i < n; i++) {
        map[i] = nextIntArray(m);
      }
      return map;
    }
  }
}
