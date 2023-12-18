import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.DataInputStream;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.AbstractCollection;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    ETravelByCar solver = new ETravelByCar();
    solver.solve(1, in, out);
    out.close();
  }

  static class ETravelByCar {

    List<Edge>[] g;
    int n;

    public void solve(int testNumber, InputReader in, PrintWriter out) {
      n = in.nextInt();
      int m = in.nextInt();
      int capacity = in.nextInt();
      g = Graphs.createWeightedGraph(n + 1);
      for (int i = 0; i < m; ++i) {
        int u = in.nextInt(), v = in.nextInt(), c = in.nextInt();
        if (c > capacity) {
          continue;
        }
        g[u].add(new Edge(v, c));
        g[v].add(new Edge(u, c));
      }
      int[][] distance = ArrayUtils.createIntMatrix(n + 1, n + 1, Constants.INF32);
      for (int i = 0; i <= n; ++i) {
        distance[i][i] = 0;
      }
      boolean[] seen = new boolean[n + 1];
      int q = in.nextInt();
      while (q-- > 0) {
        int u = in.nextInt(), v = in.nextInt();
        out.println(computeAnswer(u, v, capacity));
      }
    }

    private int computeAnswer(int from, int to, int capacity) {
      PriorityQueue<ETravelByCar.State> pq = new PriorityQueue<>(
          Comparator.comparingInt((ETravelByCar.State st) -> st.fillCount)
              .thenComparingInt(st -> -st.capacity));
      pq.add(new ETravelByCar.State(from, 0, capacity));
      int[] fills = ArrayUtils.createIntArray(n + 1, Constants.INF32);
      while (!pq.isEmpty()) {
        ETravelByCar.State curState = pq.poll();
//      fills[curState.node] = Math.min(fills[curState.node], curState.fillCount);
        for (Edge ev : g[curState.node]) {
          int v = ev.to;
          int len = (int) ev.cost;
          if (len > curState.capacity) {
            if (curState.fillCount + 1 < fills[v]) {
              fills[v] = curState.fillCount + 1;
              ETravelByCar.State newState = new ETravelByCar.State(v, fills[v], capacity - len);
              pq.add(newState);
            }
          } else {
            if (fills[v] > curState.fillCount) {
              fills[v] = curState.fillCount;
              ETravelByCar.State newState = new ETravelByCar.State(v, curState.fillCount,
                  curState.capacity - len);
              pq.add(newState);
            }
          }
        }
      }
      return fills[to] == Constants.INF32 ? -1 : fills[to];
    }

    static class State {

      int node;
      int fillCount;
      int capacity;

      public State(int node, int fillCount, int capacity) {
        this.node = node;
        this.fillCount = fillCount;
        this.capacity = capacity;
      }

    }

  }

  static class ArrayUtils {

    public static int[] createIntArray(final int size, final int initialValue) {
      int[] ret = new int[size];
      for (int i = 0; i < size; ++i) {
        ret[i] = initialValue;
      }
      return ret;
    }

    public static int[][] createIntMatrix(final int rows, final int columns,
        final int initialValue) {
      int[][] ret = new int[rows][];
      for (int i = 0; i < rows; ++i) {
        ret[i] = createIntArray(columns, initialValue);
      }
      return ret;
    }

  }

  static class Graphs {

    private Graphs() {
    }

    public static List<Edge>[] createWeightedGraph(int n) {
      List<Edge>[] graph = new ArrayList[n];
      for (int i = 0; i < n; i++) {
        graph[i] = new ArrayList<>();
      }
      return graph;
    }

  }

  static interface FastInput {

  }

  static class Edge implements Comparable<Edge> {

    public int to;
    public long cost;

    public String toString() {
      return "Edge{" +
          "to=" + to +
          ", cost=" + cost +
          '}';
    }

    public Edge(int to, long cost) {
      this.cost = cost;
      this.to = to;
    }

    public int compareTo(Edge o) {
      return Long.compare(cost, o.cost);
    }

    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      Edge edge = (Edge) o;

      if (to != edge.to) {
        return false;
      }
      return cost == edge.cost;
    }

    public int hashCode() {
      long result = to;
      result = 31L * result + cost;
      return (int) result;
    }

  }

  static class InputReader implements FastInput {

    final private int BUFFER_SIZE = 1 << 16;
    private DataInputStream din;
    private byte[] buffer;
    private int bufferPointer;
    private int bytesRead;

    public InputReader(InputStream is) {
      din = new DataInputStream(is);
      buffer = new byte[BUFFER_SIZE];
      bufferPointer = bytesRead = 0;
    }

    public InputReader(String file_name) throws IOException {
      din = new DataInputStream(new FileInputStream(file_name));
      buffer = new byte[BUFFER_SIZE];
      bufferPointer = bytesRead = 0;
    }

    public int nextInt() {
      int ret = 0;
      byte c = read();
      while (c <= ' ') {
        c = read();
      }
      boolean neg = (c == '-');
      if (neg) {
        c = read();
      }
      do {
        ret = ret * 10 + c - '0';
      } while ((c = read()) >= '0' && c <= '9');

      if (neg) {
        return -ret;
      }
      return ret;
    }

    private void fillBuffer() {
      try {
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
      } catch (IOException e) {
        throw new RuntimeException("trying to read from null input, verify constraints ");
      }
      if (bytesRead == -1) {
        buffer[0] = -1;
      }
    }

    private byte read() {
      if (bufferPointer == bytesRead) {
        fillBuffer();
      }
      return buffer[bufferPointer++];
    }

  }

  static abstract class Constants {

    public static final int INF32 = 1 << 30;

  }
}

