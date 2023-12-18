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
    SDigitSum solver = new SDigitSum();
    solver.solve(1, in, out);
    out.close();
  }

  static class SDigitSum {
    public final void solve(int testNumber, InputReader in, PrintWriter out) {
      char[] k = in.nextCharArray();
      int d = in.nextInt();

      int[][][][] dp = new int[k.length + 1][d][2][2];
      dp[k.length][0][0][0] = dp[k.length][0][1][0] = 1;
      for (int i = k.length - 1; i >= 0; i--) { // index we are at now?
        for (int r = 0; r < d; r++) { // what is the reminder of the sum so far?
          for (int exact = 0; exact < 2; exact++) { // is the prefix exact?
            for (int z = 0; z < 2; z++) { // is the prefix all zeroes?
              long ways = 0;
              int limit = exact == 1 ? (k[i] - '0') : 9;
              for (int digit = 0; digit <= limit; digit++) { // digit to put?
                ways +=
                    dp[i + 1][(r + digit) % d][digit == limit ? exact : 0][
                        digit == 0 && z == 1 ? 1 : 0];
              }
              if (ways >= Constants.MOD) {
                ways %= Constants.MOD;
              }
              dp[i][r][exact][z] = (int) ways;
            }
          }
        }
      }
      out.println(dp[0][0][1][1]);
    }
  }

  static class Constants {
    public static final int MOD = (int) 1e9 + 7;
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

    public final String next() {
      int c;
      while (isSpaceChar(c = this.read())) {}

      StringBuilder result = new StringBuilder();
      result.appendCodePoint(c);

      while (!isSpaceChar(c = this.read())) {
        result.appendCodePoint(c);
      }

      return result.toString();
    }

    private static final boolean isSpaceChar(final int c) {
      return c == 32 || c == 10 || c == 13 || c == 9
          || c == -1; // 32 == ' ', 10 == '\n', 13 == '\r', 9 == '\t'
    }

    public final char[] nextCharArray() {
      return next().toCharArray();
    }
  }
}
