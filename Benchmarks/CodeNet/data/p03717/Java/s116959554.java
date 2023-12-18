

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;


public class Main {
  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    int N = sc.nextInt();
    int M = sc.nextInt();


    Map<Integer, List<int[]>> color = new HashMap<>();
    for (int i = 0; i < M; i++) {
      int l = sc.nextInt();
      int r = sc.nextInt();
      int x = sc.nextInt();
      if (!color.containsKey(r)) {
        color.put(r, new ArrayList<>());
      }
      color.get(r).add(new int[]{l, r, x, r - l});
    }
    
    int mod = 1_000_000_007;

    int[][][] dp = new int[N + 2][N + 2][N + 2];
    dp[0][0][0] = 1;
    for (int i = 0; i <= N; i ++) {
      for (int j = 0; j <= N; j ++) {
        for (int k = 0; k <= N; k ++) {
          int[] now = new int[]{i, j, k};
          Arrays.sort(now);

          if (color.containsKey(now[2])) {
            for (int[] v : color.get(now[2])) {
              if (v[2] == 1) {
                if (now[2] - now[1] <= v[3]) {
                  dp[i][j][k] = 0;
                }
              } else if (v[2] == 2) {
                if (now[2] - now[1] > v[3] || now[2] - now[0] <= v[3]) {
                  dp[i][j][k] = 0;
                }
              } else {
                if (now[2] - now[0] > v[3]) {
                  dp[i][j][k] = 0;
                }
              }
            }
          }
          
          dp[now[2] + 1][j][k] = (dp[now[2] + 1][j][k] + dp[i][j][k]) % mod;
          dp[i][now[2] + 1][k] = (dp[i][now[2] + 1][k] + dp[i][j][k]) % mod;
          dp[i][j][now[2] + 1] = (dp[i][j][now[2] + 1] + dp[i][j][k]) % mod;
        }
      }
    }
    
    int ret = 0;
    for (int i = 0; i <= N; i ++) {
      for (int j = 0; j <= N; j ++) {
        ret = (ret + dp[N][i][j]) % mod;
        ret = (ret + dp[i][N][j]) % mod;
        ret = (ret + dp[i][j][N]) % mod;
      }
    }
    System.out.println(ret);
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
