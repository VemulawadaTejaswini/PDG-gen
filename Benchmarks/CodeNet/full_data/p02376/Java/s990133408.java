import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {
  private static class Task {
    void solve(FastScanner in, PrintWriter out) {
      int V = in.nextInt(), E = in.nextInt();
      Dinic dinic = new Dinic(V);
      for (int i = 0; i < E; i++) {
        int from = in.nextInt(), to = in.nextInt(), cap = in.nextInt();
        dinic.addEdge(from, to, cap);
      }
      out.println(dinic.maxFlow(0, V - 1));
    }
  }

  static class Dinic {
    private class Edge {
      int to, cap, rev;
      Edge(int to, int cap, int rev) {
        this.to = to;
        this.cap = cap;
        this.rev = rev;
      }
    }

    ArrayList<ArrayList<Edge>> g;
    int[] level;
    int[] iter;

    Dinic(int V) {
      g = new ArrayList<>(V);
      for (int i = 0; i < V; i++) g.add(new ArrayList<>());
      level = new int[V];
      iter = new int[V];
    }

    void addEdge(int from, int to, int capacity) {
      g.get(from).add(new Edge(to, capacity, g.get(to).size()));
      g.get(to).add(new Edge(from, 0, g.get(from).size() - 1));
    }

    void bfs(int s) {
      Arrays.fill(level, -1);
      ArrayDeque<Integer> deque = new ArrayDeque<>();
      level[s] = 0;
      deque.add(s);
      while (!deque.isEmpty()) {
        int v = deque.poll();
        for (Edge e : g.get(v))
          if (e.cap > 0 && level[e.to] < 0) {
            level[e.to] = level[v] + 1;
            deque.add(e.to);
          }
      }
    }

    int dfs(int v, int t, int f) {
      if (v == t) return f;
      for (int i = iter[v]; i < g.get(v).size(); i++) {
        Edge e = g.get(v).get(i);
        if (e.cap > 0 && level[v] < level[e.to]) {
          int d = dfs(e.to, t, Math.min(f, e.cap));
          if (d > 0) {
            e.cap -= d;
            g.get(e.to).get(e.rev).cap += d;
            return d;
          }
        }

      }
      return 0;
    }

    int maxFlow(int s, int t) {
      int flow = 0;
      for (; ; ) {
        bfs(s);
        if (level[t] < 0) return flow;
        Arrays.fill(iter, 0);
        int f;
        while ((f = dfs(s, t, Integer.MAX_VALUE)) > 0) {
          flow += f;
        }
      }
    }
  }

  // Template
  public static void main(String[] args) {
    OutputStream outputStream = System.out;
    FastScanner in = new FastScanner();
    PrintWriter out = new PrintWriter(outputStream);
    Task solver = new Task();
    solver.solve(in, out);
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
      if (hasNextByte()) return buffer[ptr++];
      else return -1;
    }

    private static boolean isPrintableChar(int c) {
      return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
    }

    boolean hasNext() {
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

    long nextLong() {
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
  }
}