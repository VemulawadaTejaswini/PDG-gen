import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;


public class Main {
  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    int N = sc.nextInt();
    int M = sc.nextInt();

    int[] from = new int[M];
    int[] to = new int[M];
    long[] w = new long[M];
    for (int i = 0; i < M; i++) {
      from[i] = sc.nextInt() - 1;
      to[i] = sc.nextInt() - 1;
      w[i] = -sc.nextLong();
    }

    int[][] g = packD(N, from, to);
    boolean[] flg = new boolean[N];
    dfs(g, 0, flg, new boolean[N]);

    long[] ret = bf(from, to, w, N, 0, flg);
    if (ret == null) {
      System.out.println("inf");
    } else {
      System.out.println(-ret[N - 1]);
    }

  }

  private static boolean dfs(int[][] g, int now, boolean[] flg, boolean[] visited) {
    if (now == g.length - 1) {
      flg[now] = true;
      return true;
    }

    visited[now] = true;
    for (int next : g[now]) {
      if (!visited[next]) {
        boolean ret = dfs(g, next, flg, visited);
        if (ret) {
          flg[now] = true;
          break;
        }
      }
    }
    return flg[now];
  }
  
  public static int[][] packD(int n, int[] from, int[] to){ return packD(n, from, to, from.length);}
  public static int[][] packD(int n, int[] from, int[] to, int sup)
  {
      int[][] g = new int[n][];
      int[] p = new int[n];
      for(int i = 0;i < sup;i++)p[from[i]]++;
      for(int i = 0;i < n;i++)g[i] = new int[p[i]];
      for(int i = 0;i < sup;i++){
          g[from[i]][--p[from[i]]] = to[i];
      }
      return g;
  }
  
  
  public static long[] bf(int[] from, int[] to, long[] w, int n, int start, boolean[] flg) {
    long[] d = new long[n];
    Arrays.fill(d, Long.MAX_VALUE / 100000);
    d[start] = 0;
    int m = from.length;

    for (int r = 0; r < n - 1; r++) {
      boolean updated = false;
      for (int j = 0; j < m; j++) {
        if (d[from[j]] + w[j] < d[to[j]]) {
          d[to[j]] = d[from[j]] + w[j];
          updated = true;
        }
      }
      if (!updated)
        break;
    }
    for (int i = 0; i < m; i++) {
      if (d[from[i]] + w[i] < d[to[i]]) {
        if (flg[to[i]])
          return null;
      }
    }
    return d;
  }

}


class FastScanner {
  public static String debug = null;

  private final InputStream in = System.in;
  private int ptr = 0;
  private int buflen = 0;
  private byte[] buffer = new byte[1024];
  private boolean eos = false;

  private boolean hasNextByte() {
    if (ptr < buflen) {
      return true;
    } else {
      ptr = 0;
      try {
        if (debug != null) {
          buflen = debug.length();
          buffer = debug.getBytes();
          debug = "";
          eos = true;
        } else {
          buflen = in.read(buffer);
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
      if (buflen < 0) {
        eos = true;
        return false;
      } else if (buflen == 0) {
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

  private static boolean isPrintableChar(int c) {
    return 33 <= c && c <= 126;
  }

  private void skipUnprintable() {
    while (hasNextByte() && !isPrintableChar(buffer[ptr]))
      ptr++;
  }

  public boolean isEOS() {
    return this.eos;
  }

  public boolean hasNext() {
    skipUnprintable();
    return hasNextByte();
  }

  public String next() {
    if (!hasNext())
      throw new NoSuchElementException();
    StringBuilder sb = new StringBuilder();
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
    return (int) nextLong();
  }

  public long[] nextLongList(int n) {
    return nextLongTable(1, n)[0];
  }

  public int[] nextIntList(int n) {
    return nextIntTable(1, n)[0];
  }

  public long[][] nextLongTable(int n, int m) {
    long[][] ret = new long[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        ret[i][j] = nextLong();
      }
    }
    return ret;
  }

  public int[][] nextIntTable(int n, int m) {
    int[][] ret = new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        ret[i][j] = nextInt();
      }
    }
    return ret;
  }
}
