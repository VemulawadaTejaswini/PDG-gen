import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;

@SuppressWarnings("unchecked")
public class Main implements Runnable {

  long INF = Long.MAX_VALUE / 1000;
  long[][] dp;
  boolean[][] vis;
  TreeMap<Integer, Long>[] rules;
  int R;


  long minCost(int x, int r) {
    if (dp[r][x] >= 0) {
      return dp[r][x];
    }

    if (x % R == r) {
      dp[r][x] = 0;
      return 0;
    }
    if (vis[r][x]) {
      dp[r][x] = INF;
      return INF;
    }

    vis[r][x] = true;

    long min = INF;
    for (Map.Entry<Integer, Long> entry : rules[x].entrySet()) {
      int next = entry.getKey();
      long cost = entry.getValue();
      min = Math.min(min, cost + minCost(next, r));
    }

    dp[r][x] = min;
    return min;
  }

  private void solve(FastScanner in, PrintWriter out) {
    int N = in.nextInt();
    int M = in.nextInt();
    R = in.nextInt();
    int Q = in.nextInt();
    dp = new long[R][N + 1];
    vis = new boolean[R][N + 1];
    for (long[] d : dp) {
      Arrays.fill(d, -1);
    }

    rules = new TreeMap[N + 1];
    for (int i = 0; i <= N; i++) {
      rules[i] = new TreeMap<Integer, Long>();
    }

    for (int i = 0; i < M; i++) {
      int a = in.nextInt();
      int b = in.nextInt();
      long c = in.nextInt();
      rules[a].put(b, c);
    }

    long ans = 0;
    for (int i = 0; i < Q; i++) {
      int x = in.nextInt();
      int y = in.nextInt();
      int z = in.nextInt();

      long min = INF;
      for (int r = 0; r < R; r++) {
        long cost = minCost(x, r) + minCost(y, r);
        min = Math.min(min, cost);
      }

      if (z > min) {
        ans += (z - min);
      }
    }
    out.println(ans);
  }

  public void run() {
    PrintWriter out = new PrintWriter(System.out);
    new Main().solve(new FastScanner(), out);
    out.close();

  }


  public static void main(String[] args) {
    new Thread(null, new Main(), "", 16 * 1024 * 1024).start(); //16MB????????????????¢????????????????
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