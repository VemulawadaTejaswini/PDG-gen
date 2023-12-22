import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.TreeMap;

@SuppressWarnings("unchecked")
public class Main {

  private static void dfs(int v, int[] color, ArrayList<Integer>[] forest) {
    for (int u : forest[v]) {
      if (color[u] >= 0) {
        continue;
      }
      color[u] = color[v];
      dfs(u, color, forest);
    }
  }

  private static int depthDfs(int v, int p, int[] depth, ArrayList<Integer>[] tree) {
    int maxDepth = 0;
    for (int u : tree[v]) {
      if (u == p) {
        continue;
      }

      maxDepth = Math.max(maxDepth, depthDfs(u, v, depth, tree) + 1);
    }
    depth[v] = maxDepth;
    return maxDepth;
  }

  private static int[] center(int v, ArrayList<Integer>[] tree) {
    int N = tree.length;
    int[] dist = new int[N];
    Arrays.fill(dist, N);
    int v1 = bfs(v, tree, dist);
    int v2 = bfs(v1, tree, dist);
    int diameter = dist[v2];
    if (diameter % 2 == 0) {
      int radius = diameter / 2;
      for (int i = 0; i < N; i++) {
        if (dist[i] == radius) {
          return new int[]{i};
        }
      }
    } else {
      int c1 = -1, c2 = -1;
      for (int i = 0; i < N; i++) {
        if (dist[i] == diameter / 2) {
          c1 = i;
        } else if (dist[i] == (diameter + 1) / 2) {
          c2 = i;
        }
      }
      if (c1 < 0 || c2 < 0) {
        throw new IllegalArgumentException();
      }
      return new int[]{c1, c2};
    }
    throw new IllegalArgumentException();
  }

  private static int bfs(int v, ArrayList<Integer>[] tree, int[] dist) {
    int N = tree.length;
    Arrays.fill(dist, N);
    dist[v] = 0;
    ArrayDeque<Integer> deque = new ArrayDeque<>();
    deque.add(v);
    while (!deque.isEmpty()) {
      int u = deque.poll();
      for (int n : tree[u]) {
        if (dist[n] > dist[u] + 1) {
          dist[n] = dist[u] + 1;
          deque.add(n);
        }
      }
    }

    int to = v;
    for (int i = 0; i < N; i++) {
      if (dist[i] == N) {
        continue;
      }
      if (dist[to] < dist[i]) {
        to = i;
      }
    }
    return to;
  }

  long[] random;
  int MOD = (int) (1e9 + 7);

  private long hash(int v, int p, ArrayList<Integer>[] tree, int[] depth) {
    long rand = random[depth[v]];
    long hash = 1;
    for (int u : tree[v]) {
      if (u == p) {
        continue;
      }
      long child = hash(u, v, tree, depth);
      hash *= (child + rand);
      hash %= MOD;
    }
    return hash;
  }

  public static ArrayDeque<Integer> getPrimes(int N) {
    ArrayList<Integer> primes = new ArrayList<>();
    boolean[] isComposite = new boolean[N + 1];
    primes.add(2);
    for (int i = 3; i <= N; i += 2) {
      if (!isComposite[i]) {
        primes.add(i);
        for (int j = i * 2; j <= N; j += i) {
          isComposite[j] = true;
        }
      }
    }
    Collections.shuffle(primes);
    return new ArrayDeque<>(primes);
  }

  TreeMap<Long, Integer> hashCount = new TreeMap<>();

  private void solve(FastScanner in, PrintWriter out) {
    random = new long[300000];
    ArrayDeque<Integer> primes = getPrimes(10000000);
    for (int i = 0; i < random.length; i++) {
      random[i] = primes.poll();
    }
    {
      int N1 = in.nextInt();
      int M1 = in.nextInt();
      ArrayList<Integer>[] forest = new ArrayList[N1];
      for (int i = 0; i < N1; i++) {
        forest[i] = new ArrayList<>();
      }

      for (int i = 0; i < M1; i++) {
        int u = in.nextInt() - 1;
        int v = in.nextInt() - 1;
        forest[u].add(v);
        forest[v].add(u);
      }

      int[] color = new int[N1];
      int[] depth = new int[N1];
      int k = 0;
      Arrays.fill(color, -1);
      for (int i = 0; i < N1; i++) {
        if (color[i] < 0) {
          color[i] = k;
          k++;
          dfs(i, color, forest);

          int[] center = center(i, forest);
          if (center.length == 1) {
            depthDfs(center[0], -1, depth, forest);
          } else {
            depthDfs(center[0], center[1], depth, forest);
            depthDfs(center[1], center[0], depth, forest);
          }
        }
      }

      int[] maxDepth = new int[k];
      for (int i = 0; i < N1; i++) {
        maxDepth[color[i]] = Math.max(maxDepth[color[i]], depth[i]);
      }

      boolean[] vis = new boolean[k];
      for (int i = 0; i < N1; i++) {
        if (maxDepth[color[i]] == depth[i] && !vis[color[i]]) {
          //root
          vis[color[i]] = true;
          long h = hash(i, -1, forest, depth);
          Integer x = hashCount.get(h);
          if (x == null) {
            x = 0;
          }
          hashCount.put(h, x + 1);
        }
      }
    }
    {
      int N = in.nextInt();
      ArrayList<Integer>[] tree = new ArrayList[N];
      for (int i = 0; i < N; i++) {
        tree[i] = new ArrayList<>();
      }
      for (int i = 0; i < N - 1; i++) {
        int u = in.nextInt() - 1;
        int v = in.nextInt() - 1;
        tree[u].add(v);
        tree[v].add(u);
      }
      int[] depth = new int[N];
      int[] color = new int[N];
      Arrays.fill(color, -1);
      color[0] = 0;
      dfs(0, color, tree);
      int[] center = center(0, tree);
      if (center.length == 1) {
        depthDfs(center[0], -1, depth, tree);
      } else {
        depthDfs(center[0], center[1], depth, tree);
      }

      int max = 0;
      for (int i = 0; i < N; i++) {
        max = Math.max(max, depth[i]);
      }
      for (int i = 0; i < N; i++) {
        if (depth[i] == max) {
          long h = hash(i, -1, tree, depth);
          Integer x = hashCount.get(h);
          if (x == null) {
            x = 0;
          }
          out.println(x);
          return;
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