/**
 * Created at 20:51 on 2019-06-29
 */

import java.io.*;
import java.util.*;

public class Main {

  static FastScanner sc = new FastScanner();

  static int[] dx = {0, 1, 0, -1};
  static int[] dy = {-1, 0, 1, 0};

  static long MOD = (long) (1e9 + 7);

  static long[] fact;

  public static void main(String[] args) {

    new Main().run();

  }

  public void run() {

    int N = sc.nextInt();
    int K = sc.nextInt();

    /*

    long[][][][] dp = new long[N][K+1][K+1][2];

    dp[0][1][1][1] = 1;
    dp[0][0][0][0] = 1;

    for (int i=1; i<N; i++) {
      for (int j=0; j<=Math.min(K, N); j++) {
        for (int k=0; k<=j; k++) {
          dp[i][j][k][0] = (dp[i-1][j][k][0] + dp[i-1][j][k][1]) % MOD;
          if (j != 0 && k != 0) {
            dp[i][j][k][1] = (dp[i - 1][j - 1][k - 1][0] + dp[i - 1][j - 1][k][1]) % MOD;
          }
        }
      }
    }

    for (int i=1; i<=K; i++) {
      System.out.println(dp[N-1][K][i][0] + dp[N-1][K][i][1]);
    }

    */

    fact = new long[N+1];

    for (int i=1; i<=K; i++) {
      //System.out.println(comb(N-K+1, i));
      //System.out.println(comb(K - 1, i - 1));
      System.out.println(comb(N-K+1, i) * comb(K - 1, i - 1));
    }

  }

  public static long power(long a, long b) {
    if (b == 0) return 1;

    if (b % 2 == 0) {
      long p = power(a, b/2);
      return (p * p) % MOD;
    } else {
      return (a * power(a, b - 1)) % MOD;
    }
  }

  public static long factorial(long n) {
    if (n == 0) return 1;
    if (fact[(int)n] == 0) {
      return fact[(int)n] = (n * factorial(n - 1)) % MOD;
    } else {
      return fact[(int)n];
    }
  }

  public static long factorialInverse(long n) {
    return power(factorial(n), MOD-2);
  }

  public static long comb(long n, long r) {
    if (r < 0 || r > n) return 0;
    return (((factorial(n) * factorialInverse(r)) % MOD) * factorialInverse(n-r)) % MOD;
  }

  public static class Mathf {

    public static int max(int[] a) {
      int M = a[0];
      for (int i = 1; i < a.length; i++) {
        M = Math.max(M, a[i]);
      }
      return M;
    }

    public static int min(int[] a) {
      int m = a[0];
      for (int i = 1; i < a.length; i++) {
        m = Math.min(m, a[i]);
      }
      return m;
    }

    public static long max(long[] a) {
      long M = a[0];
      for (int i = 1; i < a.length; i++) {
        M = Math.max(M, a[i]);
      }
      return M;
    }

    public static long min(long[] a) {
      long m = a[0];
      for (int i = 1; i < a.length; i++) {
        m = Math.min(m, a[i]);
      }
      return m;
    }

  }

  /*
    add()でインデックスを指定しない場合指定されたソート順に違わない位置に追加する
    (ただしソートされていることが前提となる)
    Comparatorが0を返したとき、それらの順序は保証しない
    (TreeSet, TreeMapと違い削除はしない)
   */
  static class TreeList<E> extends ArrayList<E> {

    Comparator<? super E> comparator;

    TreeList(Comparator<? super E> c) {
      super();
      comparator = c;
    }

    /*
      ソート済みのリストに要素を追加する
     */
    public boolean add(E e) {
      int lowIndex = 0;
      int highIndex = size() - 1;
      int index = 0;

      if (size() == 0) {
        super.add(e);
        return true;
      }

      if (comparator.compare(e, get(0)) < 0) {
        index = 0;
      } else if (comparator.compare(e, get(highIndex)) > 0) {
        index = highIndex + 1;
      } else {
        while (lowIndex <= highIndex) {

          if (highIndex == lowIndex + 1 || highIndex == lowIndex) {
            index = highIndex;
            break;
          }

          int midIndex = (lowIndex + highIndex) / 2;
          ;

          if (comparator.compare(e, get(midIndex)) > 0) {
            lowIndex = midIndex;
          } else {
            highIndex = midIndex;
          }

        }
      }

      super.add(index, e);
      return true;
    }

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
