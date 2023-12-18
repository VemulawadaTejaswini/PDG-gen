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
    QFlowers solver = new QFlowers();
    solver.solve(1, in, out);
    out.close();
  }

  static class QFlowers {
    public final void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt();
      int[] h = in.nextIntArrayOneBased(n);
      int[] a = in.nextIntArrayOneBased(n);
      BIT<Long> bit =
          new BIT<Long>(n + 1) {

            public Long merge(Long a, Long b) {
              return Math.max(a, b);
            }

            public Long neutral() {
              return 0L;
            }

            public Long inverse(Long a) {
              return -a;
            }
          };

      long ans = 0;
      for (int i = 1; i <= n; i++) {
        long beauty = bit.get(h[i] - 1) + a[i];
        ans = Math.max(ans, beauty);
        bit.update(h[i], beauty);
      }
      out.println(ans);
    }
  }

  abstract static class BIT<T> {
    private final int size;
    private final T[] bit;

    public BIT(int size) {
      this.size = size;
      this.bit = (T[]) new Object[size + 1];
      Arrays.fill(this.bit, neutral());
    }

    public abstract T merge(T a, T b);

    public abstract T neutral();

    public BIT(int size, T[] arr) {
      this(size);
      for (int i = 1; i <= size; i++) {
        bit[i] = merge(bit[i], arr[i]);
        int j = i + (i & -i);
        if (j <= size) {
          bit[j] = merge(bit[j], bit[i]);
        }
      }
    }

    public final void update(int i, T v) {
      while (i <= size) {
        bit[i] = merge(bit[i], v);
        i += i & -i;
      }
    }

    public final T get(int i) {
      T s = neutral();
      i = Math.min(i, size);
      while (i > 0) {
        s = merge(s, bit[i]);
        i -= i & -i;
      }
      return s;
    }

    public String toString() {
      T[] vals = (T[]) new Object[size + 1];
      for (int i = 1; i <= size; i++) {
        vals[i] = get(i);
      }

      return "BIT{" + "size=" + size + ", bit=" + Arrays.toString(vals) + '}';
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

    public final int[] nextIntArrayOneBased(final int n) {
      int[] ret = new int[n + 1];
      for (int i = 1; i <= n; i++) {
        ret[i] = nextInt();
      }
      return ret;
    }
  }
}
