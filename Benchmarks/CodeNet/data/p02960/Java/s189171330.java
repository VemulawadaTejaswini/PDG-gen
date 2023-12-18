/**
 * Created at 20:53 on 2019-07-27
 */

import java.io.*;
import java.util.*;

public class Main {

  static FastScanner sc = new FastScanner();
  static PrintStream out = System.out;
  static PrintWriter pw = new PrintWriter(out);

  static final int[] dx = {0, 1, 0, -1};
  static final int[] dy = {-1, 0, 1, 0};

  static final long MOD = (long) (1e9 + 7);
  static final long INF = Long.MAX_VALUE / 2;

  public static class Solver {

    int[] m = {1, 10, 9, 12, 3, 4};

    public Solver() {

      String S = sc.next();
      int N = S.length();

      long[][] dp = new long[N+1][13];

      int[] digits = toDigits(S);

      dp[0][0] = 1;

      for (int i=1; i<=N; i++) {
        for (int j=0; j<13; j++) {
          if (digits[i-1] == -1) {
            for (int k=0; k<=9; k++) {
              dp[i][(j + m[(i-1)%6]*k)%13] = (dp[i][(j + m[(i-1)%6]*k)%13] + dp[i-1][j]) % MOD;

            }
          } else {
            dp[i][(j + m[(i-1) % 6]*digits[i-1]) % 13] = dp[i-1][j];
          }
        }
      }

      out.println(dp[N][5]);

    }

    public int[] toDigits(String b) {
      int[] digits = new int[b.length()];
      for (int i=b.length()-1; i>=0; i--) {
        if (b.charAt(i) == '?') digits[b.length()-i-1] = -1;
        else digits[b.length()-i-1] = b.charAt(i) - '0';
      }
      return digits;
    }
  }

  public static void main(String[] args) {
    new Solver();
  }

  static class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
      if (ptr < buflen) {
        return true;
      } else {
        ptr = 0;
        try {
          buflen = in.read(buffer);
        } catch (IOException e) {
          e.printStackTrace();
        }
        if (buflen <= 0) {
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

    public boolean hasNext() {
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

    public long nextLong() {
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

    public int nextInt() {
      return (int) nextLong();
    }

    public int[] nextIntArray(int N, boolean oneBased) {
      if (oneBased) {
        int[] array = new int[N + 1];
        for (int i = 1; i <= N; i++) {
          array[i] = sc.nextInt();
        }
        return array;
      } else {
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
          array[i] = sc.nextInt();
        }
        return array;
      }
    }

    public long[] nextLongArray(int N, boolean oneBased) {
      if (oneBased) {
        long[] array = new long[N + 1];
        for (int i = 1; i <= N; i++) {
          array[i] = sc.nextLong();
        }
        return array;
      } else {
        long[] array = new long[N];
        for (int i = 0; i < N; i++) {
          array[i] = sc.nextLong();
        }
        return array;
      }
    }
  }

}
