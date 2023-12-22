import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

  int N, M, V, source, sink, min, max;
  long[][] costs;

  private void solve(FastScanner in, PrintWriter out) {
    N = in.nextInt();
    M = in.nextInt();
    costs = new long[N][M];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        costs[i][j] = in.nextInt();
      }
    }

    V = N + M + 2;
    source = N + M;
    sink = N + M + 1;
    min = M / N;
    max = min + (M % N == 0 ? 0 : 1);

    long ok = (long) (1e9 + 7);
    long ng = 0;
    while (ok - ng > 1) {

      long h = (ok + ng) / 2;
      if (ok(h)) {
        ok = h;
      } else {
        ng = h;
      }
    }

    if (max - min != 0 && max - min != 1) {
      throw new IllegalStateException();
    }

    out.println(max - min);
    out.println(ok);
  }

  public boolean ok(long h) {
    Dinitz dinitz = new Dinitz(V);
    //matching edge
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        if (costs[i][j] <= h) {
          dinitz.addEdge(i, N + j, 1);
        }
      }
    }
    for (int i = 0; i < N; i++) {
      dinitz.addEdge(source, i, min);
    }
    for (int j = 0; j < M; j++) {
      dinitz.addEdge(N + j, sink, 1);
    }

    if (dinitz.maxFlow(source, sink) != min * N) {
      return false;
    }

    boolean[] done = new boolean[M];
    int check = 0;
    for (Dinitz.Edge edge : dinitz.g.get(sink)) {
      if (edge.cap > 0) {
        done[edge.to - N] = true;
        check++;
      }
    }
    if (check != min * N) {
      throw new IllegalStateException();
    }

    dinitz = null;

    Dinitz next = new Dinitz(V);
    for (int j = 0; j < M; j++) {
      if (done[j]) {
        continue;
      }
      for (int i = 0; i < N; i++) {
        if (costs[i][j] <= h) {
          next.addEdge(i, N + j, 1);
        }
      }
    }
    for (int i = 0; i < N; i++) {
      next.addEdge(source, i, max - min);
    }
    for (int j = 0; j < M; j++) {
      next.addEdge(N + j, sink, 1);
    }
    long f = next.maxFlow(source, sink);

    for (Dinitz.Edge edge : next.g.get(sink)) {
      if (edge.cap > 0) {
        done[edge.to - N] = true;
        check++;
      }
    }
    if (check != M && f == M - min * N) {
      throw new IllegalArgumentException();
    }

    return f == M - min * N;
  }

  public class Dinitz {

    class Edge {

      int to, rev;
      long cap;

      Edge(int to, long cap, int rev) {
        this.to = to;
        this.cap = cap;
        this.rev = rev;
      }
    }

    private ArrayDeque<Integer> deque = new ArrayDeque<>();
    ArrayList<ArrayList<Edge>> g;
    private int[] level;
    private int[] iter;

    Dinitz(int V) {
      g = new ArrayList<>(V);
      for (int i = 0; i < V; i++) {
        g.add(new ArrayList<>());
      }
      level = new int[V];
      iter = new int[V];
    }

    void addEdge(int from, int to, long cap) {
      g.get(from).add(new Edge(to, cap, g.get(to).size()));
      g.get(to).add(new Edge(from, 0, g.get(from).size() - 1));
    }

    private long dfs(int v, int t, long f) {
      if (v == t) {
        return f;
      }
      for (; iter[v] < g.get(v).size(); iter[v]++) {
        Edge e = g.get(v).get(iter[v]);
        if (e.cap > 0 && level[v] < level[e.to]) {
          long d = dfs(e.to, t, Math.min(f, e.cap));
          if (d > 0) {
            e.cap -= d;
            g.get(e.to).get(e.rev).cap += d;
            return d;
          }
        }
      }
      return 0;
    }

    private void bfs(int s) {
      Arrays.fill(level, -1);
      level[s] = 0;
      deque.add(s);
      while (!deque.isEmpty()) {
        int v = deque.poll();
        for (Edge e : g.get(v)) {
          if (e.cap > 0 && level[e.to] < 0) {
            level[e.to] = level[v] + 1;
            deque.add(e.to);
          }
        }
      }
    }

    long maxFlow(int s, int t) {
      long flow = 0;
      for (; ; ) {
        bfs(s);
        if (level[t] < 0) {
          return flow;
        }
        Arrays.fill(iter, 0);
        long f;
        while ((f = dfs(s, t, Long.MAX_VALUE)) > 0) {
          flow += f;
        }
      }
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