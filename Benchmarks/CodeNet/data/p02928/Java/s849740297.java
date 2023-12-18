/**
 * Created at 20:53 on 2019-08-24
 */

import java.io.*;
import java.util.*;

public class Main {

  static FastScanner sc = new FastScanner();
  static Output out = new Output(System.out);

  static final int[] dx = {0, 1, 0, -1};
  static final int[] dy = {-1, 0, 1, 0};

  static final long MOD = (long) (1e9 + 7);
  static final long INF = Long.MAX_VALUE / 2;

  public static class Solver {
    public Solver() {

      int N = sc.nextInt();

      long K = sc.nextLong();

      int[] A = sc.nextIntArray(N, false);

      long[] l = new long[N];
      long[] all = new long[N];

      BinaryIndexedTree bit = new BinaryIndexedTree(new long[N]);

      for (int i=0; i<N; i++) {
        l[i] = bit.sum(A[i], N);
        bit.add(A[i], 1);
      }
      for (int i=0; i<N; i++) {
        all[i] = bit.sum(A[i], N);
      }

      long ans = 0;
      for (int i=0; i<N; i++) {
        ans = Mod.add(ans, Mod.mul(K, l[i]), Mod.div(Mod.mul(K, K-1, all[i]), 2));
      }

      out.println(ans);

    }


    public static class Mod {

      static final long MOD = (long) (1e9 + 7);

      public static long[] fact;

      public Mod(int n) {
        fact = new long[n+1];
      }

      public Mod(long n) {
        fact = new long[(int)n+1];
      }

      public static long comb(long n, long r) {
        if (r < 0 || r > n) return 0;
        return (((factorial(n) * factorialInverse(r)) % MOD) * factorialInverse(n - r)) % MOD;
      }

      public static long factorial(long n) {
        if (n == 0) return 1;
        if (fact[(int) n] == 0) {
          return fact[(int) n] = (n * factorial(n - 1)) % MOD;
        } else {
          return fact[(int) n];
        }
      }

      public static long factorialInverse(long n) {
        return inverse(factorial(n));
      }

      public static long inverse(long n) {
        return power(n, MOD - 2);
      }

      public static long power(long a, long b) {
        if (b == 0) return 1;

        if (b % 2 == 0) {
          long p = power(a, b / 2);
          return (p * p) % MOD;
        } else {
          return (a * power(a, b - 1)) % MOD;
        }
      }

      public static long add(long... a) {
        long ans = 0;
        for (int i=0; i<a.length; i++) {
          ans = (ans + a[i]) % MOD;
        }
        return ans;
      }

      public static long sub(long a, long b) {
        return (a - b + MOD) % MOD;
      }

      public static long mul(long... a) {
        long ans = 1;
        for (int i=0; i<a.length; i++) {
          ans = (ans * a[i]) % MOD;
        }
        return ans;
      }

      public static long div(long a, long b) {
        return (a * Mod.inverse(b)) % MOD;
      }

    }

    public class BinaryIndexedTree {

      int oneBased = 1;

      int N;
      long[] tree;

      public BinaryIndexedTree(long[] A) {
        this.N = A.length;
        tree = new long[N+1];
        for (int i=1; i<=N; i++) {
          add(i, A[i-1]);
        }
      }

      public void add(int i, long x) {
        i += 1-oneBased;
        while(i <= N) {
          tree[i] += x;
          i += i & (-i);
        }
      }

      public long sum(int i) {
        i += 1-oneBased;
        long res = 0;
        while(i > 0) {
          res += tree[i];
          i -= i & (-i);
        }
        return res;
      }

      public long sum(int from, int to) {
        return sum(to) - sum(from);
      }

    }

  }

  public static void main(String[] args) {
    new Solver();
    out.flush();
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

  static class Output extends PrintWriter {

    public Output(PrintStream ps) {
      super(ps);
    }

    public void print(int[] a, String separator) {
      for (int i = 0; i < a.length; i++) {
        if (i == 0) print(a[i]);
        else print(separator + a[i]);
      }
      println();
    }

    public void print(long[] a, String separator) {
      for (int i = 0; i < a.length; i++) {
        if (i == 0) print(a[i]);
        else print(separator + a[i]);
      }
      println();
    }

    public void print(String[] a, String separator) {
      for (int i = 0; i < a.length; i++) {
        if (i == 0) print(a[i]);
        else print(separator + a[i]);
      }
      println();
    }

    public void print(ArrayList a, String separator) {
      for (int i = 0; i < a.size(); i++) {
        if (i == 0) print(a.get(i));
        else print(separator + a.get(i));
      }
      println();
    }
  }

}
