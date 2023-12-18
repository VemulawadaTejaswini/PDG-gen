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
    EKnapsack2 solver = new EKnapsack2();
    solver.solve(1, in, out);
    out.close();
  }

  static class EKnapsack2 {
    public final void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt();
      int maxW = in.nextInt();
      int[] w = new int[n];
      int[] v = new int[n];
      int sumV = 0;
      for (int i = 0; i < n; i++) {
        w[i] = in.nextInt();
        sumV += v[i] = in.nextInt();
      }

      long[][] dp = new long[n][sumV + 1];
      Arrays.fill(dp[0], Constants.INF64);
      dp[0][v[0]] = w[0];
      dp[0][0] = 0;
      for (int i = 1; i < n; i++) {
        for (int j = 0; j <= sumV; j++) {
          dp[i][j] = dp[i - 1][j];
          if (j >= v[i]) {
            dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - v[i]] + w[i]);
          }
        }
      }
      for (int i = sumV; i >= 0; i--) {
        if (dp[n - 1][i] <= maxW) {
          out.println(i);
          return;
        }
      }
      throw new RuntimeException("Impossible");
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
  }

  static class Constants {
    public static final long INF64 = 0x3f3f3f3f3f3f3f3fL;
  }
}
