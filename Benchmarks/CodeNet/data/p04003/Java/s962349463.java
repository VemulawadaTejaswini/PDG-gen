import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

/*
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
           \  .-\__  `-`  ___/-. /
         ___`. .'  /--.--\  `. . __
      ."" '<  `.___\_<|>_/___.'  >'"".
     | | :  `- \`.;`\ _ /`;.`/ - ` : | |
     \  \ `-.   \_ __\ /__ _/   .-` /  /
======`-.____`-.___\_____/___.-`____.-'======
                   `=---='
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            pass System Test!
*/

public class Main {
  private static class Task {
    class Edge {
      int to;
      int weight;
      int company;
      Edge(int to, int weight, int company) {
        this.to = to;
        this.weight = weight;
        this.company = company;
      }
    }

    private ArrayList<Edge>[] graph;

    private final int INF = Integer.MAX_VALUE / 2;

    int solve() {
      int N = graph.length;
      ArrayDeque<Edge> deque = new ArrayDeque<>();
      int[] dist = new int[N];
      Arrays.fill(dist, INF);
      dist[0] = 0;
      deque.add(new Edge(0, 0, 0));

      ArrayDeque<Integer> bfs = new ArrayDeque<>();
      TreeSet<Integer> usedBfs = new TreeSet<>();
      while (!deque.isEmpty()) {
        Edge q = deque.pollFirst();
        int v = q.to;
        int weight = q.weight;
        int company = q.company;
        if (v == N - 1) {
          return weight;
        }

        bfs.add(v);
        usedBfs.add(v);
        while (!bfs.isEmpty()) {
          int u = bfs.poll();
          for (Edge edge : graph[u]) {
            if (edge.company != company) {
              if (dist[edge.to] <= weight + 1) continue;
              dist[edge.to] = weight + 1;
              deque.add(new Edge(edge.to, weight + 1, edge.company));
              continue;
            }
            if (usedBfs.contains(edge.to)) continue;
            if (edge.to == N - 1) return weight;
            dist[edge.to] = weight;
            bfs.add(edge.to);
            usedBfs.add(edge.to);
          }
        }
        usedBfs.clear();
      }
      return -1;
    }

    void solve(FastScanner in, PrintWriter out) {
      int N = in.nextInt();
      int M = in.nextInt();
      graph = new ArrayList[N];
      for (int i = 0; i < N; i++) graph[i] = new ArrayList<>();
      for (int i = 0; i < M; i++) {
        int x = in.nextInt() - 1;
        int y = in.nextInt() - 1;
        int c = in.nextInt();
        graph[x].add(new Edge(y, 1, c));
        graph[y].add(new Edge(x, 1, c));
      }
      out.println(solve());
    }
  }

  /**
   * ここから下はテンプレートです。
   */
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

    public int[] nextIntArray(int n) {
      int[] array = new int[n];
      for (int i = 0; i < n; i++) array[i] = nextInt();
      return array;
    }

    public long[] nextLongArray(int n) {
      long[] array = new long[n];
      for (int i = 0; i < n; i++) array[i] = nextLong();
      return array;
    }

    public String[] nextStringArray(int n) {
      String[] array = new String[n];
      for (int i = 0; i < n; i++) array[i] = next();
      return array;
    }

    public char[][] nextCharMap(int n) {
      char[][] array = new char[n][];
      for (int i = 0; i < n; i++) array[i] = next().toCharArray();
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