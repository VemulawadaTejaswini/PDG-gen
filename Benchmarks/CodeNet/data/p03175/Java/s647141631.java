import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author NMouad21
 */
public class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    PIndependentSet solver = new PIndependentSet();
    solver.solve(1, in, out);
    out.close();
  }

  static class PIndependentSet {
    public final void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt();
      int[][] e = in.nextIntMatrix(n - 1, 2);
      int[][] t = GraphUtils.packUndirectedUnweighted(e, n);
      ModArithmetic mod = new ModArithmetic();

      int[][] ways = new int[n + 1][2];
      ArrayUtils.deepFill(ways, -1);
      (new PIndependentSet.Dfs() {

            public int go(int u, int p, int parColor) {
              if (ways[u][parColor] != -1) {
                return ways[u][parColor];
              }

              int w = 1;
              for (int v : t[u]) {
                if (v != p) {
                  w = mod.mul(w, go(v, u, 1));
                }
              }
              ways[u][parColor] = w;
              if (parColor == 1) {
                w = 1;
                for (int v : t[u]) {
                  if (v != p) {
                    w = mod.mul(w, go(v, u, 0));
                  }
                }
                ways[u][parColor] = mod.add(ways[u][parColor], w);
              }

              return ways[u][parColor];
            }
          })
          .go(1, 0, 1);

      out.println(ways[1][1]);
    }

    private interface Dfs {}
  }

  static final class GraphUtils {
    private GraphUtils() {
      throw new RuntimeException("DON'T");
    }

    public static final int[][] packUndirectedUnweighted(int[][] edges, int n) {
      int[][] g = new int[n + 1][];
      int[] size = new int[n + 1];
      for (int[] edge : edges) {
        ++size[edge[0]];
        ++size[edge[1]];
      }
      for (int i = 0; i <= n; i++) {
        g[i] = new int[size[i]];
      }
      for (int[] edge : edges) {
        g[edge[0]][--size[edge[0]]] = edge[1];
        g[edge[1]][--size[edge[1]]] = edge[0];
      }
      return g;
    }
  }

  static final class ModArithmetic {
    public static final int DEFAULT_MOD = 1_000_000_007;
    public final int m;
    public final boolean isPrime;

    public ModArithmetic() {
      this(DEFAULT_MOD, true);
    }

    public ModArithmetic(int mod) {
      this(mod, false);
    }

    public ModArithmetic(int mod, boolean isPrime) {
      if (mod <= 0) {
        throw new IllegalArgumentException("Modulo must be > 0");
      }
      this.m = mod;
      this.isPrime = isPrime;
    }

    public final int add(int a, int b) {
      a += b;
      if (a >= m) {
        a -= m;
      }
      return a;
    }

    public final int mul(int a, int b) {
      long m = a * (long) b;
      if (m >= this.m) {
        m %= this.m;
      }
      return (int) m;
    }

    public String toString() {
      return "ModArithmetic{" + "m=" + m + ", isPrime=" + isPrime + '}';
    }
  }

  static final class ArrayUtils {
    private ArrayUtils() {
      throw new RuntimeException("DON'T");
    }

    public static final void deepFill(Object o, int v) {
      if (!o.getClass().isArray()) {
        throw new IllegalArgumentException();
      }
      if (o instanceof int[]) {
        int[] arr = (int[]) o;
        Arrays.fill(arr, v);
      } else if (o instanceof Integer[]) {
        Integer[] arr = (Integer[]) o;
        Arrays.fill(arr, v);
      } else {
        Object[] objArray = (Object[]) o;
        for (Object obj : objArray) {
          deepFill(obj, v);
        }
      }
    }
  }

  static final class InputReader {
    private final InputStream stream;
    private final byte[] buf = new byte[1 << 16];
    private int curChar;
    private int numChars;

    public InputReader() {
      this.stream = System.in;
    }

    public InputReader(final InputStream stream) {
      this.stream = stream;
    }

    private final int read() {
      if (this.numChars == -1) {
        throw new UnknownError();
      } else {
        if (this.curChar >= this.numChars) {
          this.curChar = 0;

          try {
            this.numChars = this.stream.read(this.buf);
          } catch (IOException ex) {
            throw new InputMismatchException();
          }

          if (this.numChars <= 0) {
            return -1;
          }
        }

        return this.buf[this.curChar++];
      }
    }

    public final int nextInt() {
      int c;
      for (c = this.read(); isSpaceChar(c); c = this.read()) {}

      byte sgn = 1;
      if (c == 45) { // 45 == '-'
        sgn = -1;
        c = this.read();
      }

      int res = 0;

      while (c >= 48 && c <= 57) { // 48 == '0', 57 == '9'
        res *= 10;
        res += c - 48; // 48 == '0'
        c = this.read();
        if (isSpaceChar(c)) {
          return res * sgn;
        }
      }

      throw new InputMismatchException();
    }

    private static final boolean isSpaceChar(final int c) {
      return c == 32 || c == 10 || c == 13 || c == 9
          || c == -1; // 32 == ' ', 10 == '\n', 13 == '\r', 9 == '\t'
    }

    public final int[][] nextIntMatrix(final int n, final int m) {
      int[][] arr = new int[n][m];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          arr[i][j] = nextInt();
        }
      }
      return arr;
    }
  }
}
