import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

class Main {

  static class Solver {
    final FastScanner sc;
    final PrintWriter writer;

    Solver(final FastScanner sc, final PrintWriter writer) {
      this.sc = sc;
      this.writer = writer;
    }

    void run() {
      int h = sc.nextInt();
      int w = sc.nextInt();
      char[][] s = new char[h][w];
      for (int i = 0; i < h; i++) {
        s[i] = sc.next().toCharArray();
      }
      int maxStep = 0;
      for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
          // search start position
          if (s[i][j] == '#') {
            continue;
          }
          int step = bfs(s, h, w, i, j);
          maxStep = Math.max(maxStep, step);
        }
      }
      writer.println(maxStep);
    }

    private int bfs(char[][] map, int h, int w, int i, int j) {
      int maxStep = 0;
      boolean[][] visited = new boolean[h][w];
      Queue<int[]> queue = new LinkedList<>();
      queue.add(new int[] { i, j, 0 });
      visited[i][j] = true;
      int[][] move = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
      while (!queue.isEmpty()) {
        int[] element = queue.poll();
        for (int[] m : move) {
          int newH = element[0] + m[0];
          int newW = element[1] + m[1];
          if (newH >= 0 && newH < h && newW >= 0 && newW < w && map[newH][newW] == '.' && !visited[newH][newW]) {
            visited[newH][newW] = true;
            int nextStep = element[2] + 1;
            maxStep = Math.max(maxStep, nextStep);
            queue.add(new int[] { newH, newW, nextStep });
          }
        }
      }
      return maxStep;
    }
  }

  public static void main(final String[] args) {
    final FastScanner sc = new FastScanner();
    final PrintWriter w = new PrintWriter(System.out);
    new Solver(sc, w).run();
    w.flush();
    w.close();
  }

  // CRT stuff
  static class MOD {
    private static final int MOD = (int) 1e9 + 7;

    static long plus(long x, long y) {
      x %= MOD;
      y %= MOD;
      return (x + y) % MOD;
    }

    static long sub(long x, long y) {
      x %= MOD;
      y %= MOD;
      return (x - y + MOD) % MOD;
    }

    static long multi(long x, long y) {
      x %= MOD;
      y %= MOD;
      return x * y % MOD;
    }

    static long div(long x, long y) {
      x %= MOD;
      y %= MOD;
      return x * pow(y, MOD - 2) % MOD;
    }

    static long pow(final long a, final long p) {
      if (p == 0)
        return 1;
      if (p % 2 == 0) {
        final long halfP = p / 2;
        final long root = pow(a, halfP);
        return root * root % MOD;
      } else
        return a * pow(a, p - 1) % MOD;
    }
  }

  // FastScanner
  static class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    public FastScanner() {
    }

    private boolean hasNextByte() {
      if (ptr < buflen) {
        return true;
      } else {
        ptr = 0;
        try {
          buflen = in.read(buffer);
        } catch (final IOException e) {
          e.printStackTrace();
        }
        if (buflen <= 0) {
          return false;
        }
      }
      return true;
    }

    private int readByte() {
      if (hasNextByte())
        return buffer[ptr++];
      else
        return -1;
    }

    private boolean isPrintableChar(final int c) {
      return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
      while (hasNextByte() && !isPrintableChar(buffer[ptr]))
        ptr++;
      return hasNextByte();
    }

    public String next() {
      if (!hasNext())
        throw new NoSuchElementException();
      final StringBuilder sb = new StringBuilder();
      int b = readByte();
      while (isPrintableChar(b)) {
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
    }

    public long nextLong() {
      if (!hasNext())
        throw new NoSuchElementException();
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
      final long nl = nextLong();
      if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
        throw new NumberFormatException();
      return (int) nl;
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }

    public int[] nextIntArray(final int n) {
      final int[] a = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = nextInt();
      return a;
    }

    public long[] nextLongArray(final int n) {
      final long[] a = new long[n];
      for (int i = 0; i < n; i++)
        a[i] = nextLong();
      return a;
    }
  }
}