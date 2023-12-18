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
    class Q {
      int p, v;
      int org;
      int d;
      Q(int v, int p, int org, int d) {
        this.v = v;
        this.p = p;
        this.org = org;
        this.d = d;
      }
    }

    private final long INF = Long.MAX_VALUE;

    long[] solve(FastScanner in) {
      int N = in.nextInt();
      ArrayList<Integer>[] tree = new ArrayList[N];
      for (int i = 0; i < N; i++) {
        tree[i] = new ArrayList<>();
      }
      for (int i = 0; i < N - 1; i++) {
        int a = in.nextInt() - 1;
        int b = in.nextInt() - 1;
        tree[a].add(b);
        tree[b].add(a);
      }
      long[] solved = new long[N];
      Arrays.fill(solved, INF);

      long[][] range = new long[2][N];
      for (long[] r : range) Arrays.fill(r, INF);

      int[] odd = new int[N];// odd->1, even->0
      Arrays.fill(odd, -1);

      ArrayDeque<Q> deque = new ArrayDeque<>();
      int K = in.nextInt();
      for (int i = 0; i < K; i++) {
        int v = in.nextInt() - 1;
        int p = in.nextInt();
        solved[v] = p;
        deque.add(new Q(v, -1, v, 0));
      }

      while (!deque.isEmpty()) {
        Q q = deque.pollFirst();
        for (int u : tree[q.v]) {
          int d = q.d + 1;
          if (u == q.p) continue;
          if (solved[u] != INF) {
            if (solved[u] < solved[q.org] - d && solved[q.org] + d < solved[u])
              return null;
            if (d % 2 != Math.abs(solved[u] - solved[q.org]))
              return null;
            continue;
          }
          if (odd[u] != -1 && odd[u] != (solved[q.org] + d) % 2)
            return null;
          if (range[0][u] < INF && (solved[q.org] + d < range[0][u] || range[1][u] < solved[q.org] - d))
            return null;

          odd[u] = (int) ((solved[q.org] + d) % 2);
          if (range[0][u] == INF) range[0][u] = solved[q.org] - d;
          range[0][u] = Math.max(solved[q.org] - d, range[0][u]);
          range[1][u] = Math.min(solved[q.org] + d, range[1][u]);
          deque.add(new Q(u, q.v, q.org, d));
        }
      }

      long[][] rangeSort = new long[N - K][2];
      int cur = 0;
      for (int i = 0; i < N; i++) {
        if (solved[i] != INF) continue;
        rangeSort[cur][0] = range[1][i] - range[0][i];
        rangeSort[cur][1] = i;
        cur++;
      }

      Arrays.sort(rangeSort, new Comparator<long[]>() {
        @Override
        public int compare(long[] o1, long[] o2) {
          return Long.compare(o1[0], o2[0]);
        }
      });
      for (long[] r : rangeSort) {
        int i = (int) r[1];
        if (range[1][i] - range[0][i] < 0) return null;
        solved[i] = range[0][i];
        for (int u : tree[i]) {
          if (solved[u] != INF) continue;
          range[0][u] = Math.max(range[0][u], solved[i] - 1);
          range[1][u] = Math.min(range[1][u], solved[i] + 1);
        }
      }
      return solved;
    }

    void solve(FastScanner in, PrintWriter out) throws Exception {
      long[] ans = solve(in);
      if (ans == null) {
        out.println("No");
      } else {
        out.println("Yes");
        for (long i : ans) {
          out.println(i);
        }
      }
    }

    class RMQ {
      private int N;
      private long[] seg;

      RMQ(int M) {
        N = Integer.highestOneBit(M) * 2;
        seg = new long[N * 2];
        Arrays.fill(seg, 0);
      }

      void update(int k, long value) {
        seg[k += N - 1] = value;
        while (k > 0) {
          k = (k - 1) / 2;
          seg[k] = Math.max(seg[k * 2 + 1], seg[k * 2 + 2]);
        }
      }

      //[a, b)
      long query(int a, int b) {
        return query(a, b, 0, 0, N);
      }

      long query(int a, int b, int k, int l, int r) {
        if (r <= a || b <= l) return 0;
        if (a <= l && r <= b) return seg[k];
        long x = query(a, b, k * 2 + 1, l, (l + r) / 2);
        long y = query(a, b, k * 2 + 2, (l + r) / 2, r);
        return Math.max(x, y);
      }
    }
  }

  /**
   * ここから下はテンプレートです。
   */
  public static void main(String[] args) throws Exception {
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