import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
    ICoins solver = new ICoins();
    solver.solve(1, in, out);
    out.close();
  }

  static class ICoins {
    public final void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt();
      double[] p = in.nextDoubleArray(n);
      double[][] dp = new double[n][n + 1];
      dp[0][0] = 1. - p[0];
      dp[0][1] = p[0];
      for (int i = 1; i < n; i++) {
        for (int j = 0; j <= n; j++) {
          dp[i][j] = (1. - p[i]) * dp[i - 1][j];
          if (j > 0) {
            dp[i][j] += p[i] * dp[i - 1][j - 1];
          }
        }
      }
      double ans = 0.;
      for (int i = (n + 1) / 2; i <= n; i++) {
        ans += dp[n - 1][i];
      }
      out.printf("%.10f", ans);
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

    public final double nextDouble() {
      double ret = 0, div = 1;
      int c = read();
      while (c <= 32) { // probably space or junk
        c = read();
      }
      boolean neg = (c == 45); // 45 == '-'
      if (neg) {
        c = read();
      }

      do {
        ret = ret * 10 + c - 48; // 48 == '0'
      } while ((c = read()) >= 48 && c <= 57); // 48 == '0', 57 == '9'

      if (c == '.') {
        while ((c = read()) >= 48 && c <= 57) { // 48 == '0', 57 == '9'
          ret += (c - 48) / (div *= 10); // 48 == '0'
        }
      }

      if (neg) {
        return -ret;
      }
      return ret;
    }

    private static final boolean isSpaceChar(final int c) {
      return c == 32 || c == 10 || c == 13 || c == 9
          || c == -1; // 32 == ' ', 10 == '\n', 13 == '\r', 9 == '\t'
    }

    public final double[] nextDoubleArray(final int n) {
      double[] ret = new double[n];
      for (int i = 0; i < n; i++) {
        ret[i] = nextDouble();
      }
      return ret;
    }
  }
}
