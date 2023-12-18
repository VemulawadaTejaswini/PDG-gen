import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;

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
    long[] primes = Eratosthenes.getPrimes(100000);

    long normalize(long t) {
      for (long p : primes) {
        long p3 = p * p * p;
        if (p3 > t) break;
        while (t % p3 == 0) t /= p3;
      }
      return t;
    }

    long pair(long t) {
      long v = 1;
      for (long p : primes) {
        if (p * p * p > t) break;
        if (t % (p * p) == 0) {
          t /= (p * p);
          v *= p;
        }
        if (t % p == 0) {
          t /= p;
          v *= p * p;
        }
      }
      if (t != 1) {
        long sq = (long) Math.sqrt(t);
        if (sq * sq == t) v *= sq;
        else v *= t * t;
      }
      return v;
    }

    void solve(FastScanner in, PrintWriter out) throws Exception {
      int N = in.nextInt();
      long[] S = new long[N];
      for (int i = 0; i < N; i++) {
        S[i] = in.nextLong();
      }
      TreeMap<Long, Integer> norms = new TreeMap<>();
      TreeMap<Long, Long> edges = new TreeMap<>();
      boolean one = false;
      for (long s : S) {
        long n = normalize(s);
        long p = pair(n);

        long check = (long) Math.cbrt(n * p);

        if (n == 1) {
          one = true;
          continue;
        }

        Integer normCount = norms.get(n);
        if (normCount == null) normCount = 0;
        norms.put(n, normCount + 1);

        if (!norms.containsKey(p)) norms.put(p, 0);
        if (n > p) {
          long t = n;
          n = p;
          p = t;
        }
        edges.put(n, p);
      }

      long ans = 0;
      for (Map.Entry<Long, Long> e : edges.entrySet()) {
        ans += Math.max(norms.get(e.getKey()), norms.get(e.getValue()));
      }
      if (one) ans++;
      out.println(ans);
    }

    public static class Eratosthenes {
      public static long[] getPrimes(int N) {
        ArrayList<Integer> primes = new ArrayList<>();
        boolean[] isComposite = new boolean[N + 1];
        primes.add(2);
        for (int i = 3; i <= N; i += 2)
          if (!isComposite[i]) {
            primes.add(i);
            for (int j = i * 2; j <= N; j += i) {
              isComposite[j] = true;
            }
          }
        long[] array = new long[primes.size()];
        for (int i = 0; i < primes.size(); i++) {
          array[i] = primes.get(i);
        }
        return array;
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
  }
}
