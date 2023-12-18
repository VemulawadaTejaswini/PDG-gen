/**
 * Created at 20:48 on 2019-08-04
 */

import java.io.*;
import java.util.*;
import java.util.function.Predicate;

public class Main {

  static FastScanner sc = new FastScanner();
  static PrintStream out = System.out;
  static PrintWriter pw = new PrintWriter(out);

  static final int[] dx = {0, 1, 0, -1};
  static final int[] dy = {-1, 0, 1, 0};

  static final long MOD = (long) (1e9 + 7);
  static final long INF = Long.MAX_VALUE / 2;

  public static class Solver {
    public Solver() {

      int N = sc.nextInt();

      int K = sc.nextInt();

      int[] A = sc.nextIntArray(N, false);

      boolean[] ng = new boolean[(int)1e6+1];

      int ans = 1;

      for (int mod = 2; mod <= 1e6; mod++) {
        if (ng[mod]) continue;

        int[] B = new int[N];
        int sum = 0;
        for (int i=0; i<N; i++) {
          B[i] = A[i] % mod;
          if (B[i] > mod/2) B[i] -= mod;
          sum += B[i];
        }

        if (sum % mod != 0) {
          for (int j=mod; j<=1e6; j += mod) {
            ng[j] = true;
          }
          continue;
        }

        Arrays.sort(B);

        int q = sum / mod;

        int times = 0;
        if (q >= 0) {
          for (int i=0; i<N-q; i++) {
            if (B[i] > 0) times += B[i];
          }
        } else if (q < 0) {
          for (int i=-q; i<N; i++) {
            if (B[i] < 0) times -= B[i];
          }
        }

        if (times <= K) ans = mod;
      }

      out.println(ans);

    }


    public static class BinarySearch {

      /*
       * [l, r)の区間でchecker.test()を実行する
       * rightOK ... 右側OK左側NGならtrue, 右側NG左側OKならfalse
       */
      public static long binarySearchLong(Predicate<Long> checker, long l, long r, boolean rightOK) {
        long ng, ok;

        if (rightOK) {
          ok = r-1;
          ng = l;
          if (!checker.test(ok)) {
            return r;
          }
        } else {
          ok = l;
          ng = r-1;
          if (!checker.test(ok)) {
            return l-1;
          }
        }

        /* ok と ng のどちらが大きいかわからないことを考慮 */
        while (Math.abs(ok - ng) > 1) {
          long mid = (ok + ng) / 2;

          if (checker.test(mid)) ok = mid;
          else ng = mid;
        }

        return ok;
      }

      /*
       * [l, r)の区間でchecker.test()を実行する
       */
      public static int binarySearch(Predicate<Integer> checker, int l, int r, boolean rightOK) {

        int ng, ok;

        if (rightOK) {
          ok = r-1;
          ng = l;
          if (!checker.test(ok)) {
            return r;
          }
        } else {
          ok = l;
          ng = r-1;
          if (!checker.test(ok)) {
            return l-1;
          }
        }

        while (Math.abs(ok - ng) > 1) {
          int mid = (ok + ng) / 2;

          if (checker.test(mid)) ok = mid;
          else ng = mid;
        }

        return ok;
      }

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
