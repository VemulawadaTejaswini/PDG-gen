import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Main {
  private static class Task {
    ArrayList<Integer>[] graph;
    void dfs(int v, int p, int d, int K, boolean[] used) {
      used[v] = true;
      if (d == K) return;
      for (int u : graph[v]) {
        if (u == p) continue;
        dfs(u, v, d + 1, K, used);
      }
    }

    void solve(FastScanner in, PrintWriter out) {
      int N = in.nextInt();
      int K = in.nextInt();
      graph = new ArrayList[N];
      for (int i = 0; i < N; i++) graph[i] = new ArrayList<>();
      ArrayList<int[]> edges = new ArrayList<>();
      for (int i = 0; i < N - 1; i++) {
        int a = in.nextInt() - 1, b = in.nextInt() - 1;
        graph[a].add(b);
        graph[b].add(a);
        edges.add(new int[]{a, b});
      }

      int ans = N;
      if (K % 2 == 0) {
        for (int i = 0; i < N; i++) {
          boolean[] used = new boolean[N];
          dfs(i, -1, 0, K / 2, used);
          int cnt = 0;
          for (boolean b : used) if (b) cnt++;
          ans = Math.min(ans, N - cnt);
        }
      } else {
        for (int[] e : edges) {
          boolean[] used = new boolean[N];
          dfs(e[0], e[1], 0, K / 2, used);
          dfs(e[1], e[0], 0, K / 2, used);
          int cnt = 0;
          for (boolean b : used) if (b) cnt++;
          ans = Math.min(ans, N - cnt);
        }
      }
      out.println(ans);

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

    public int[] nextIntArray(int n) {
      int[] array = new int[n];
      for (int i = 0; i < n; i++) {
        array[i] = nextInt();
      }
      return array;
    }
  }
}
