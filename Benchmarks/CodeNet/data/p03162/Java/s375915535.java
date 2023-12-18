import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    Scanner in = new Scanner(inputStream);
    OutputWriter out = new OutputWriter(outputStream);
    Solution solver = new Solution();
    solver.solve(1, in, out);
    out.close();
  }

  static class Solution {
    public void solve(int testNumber, Scanner in, OutputWriter out) {
      int n = in.nextInt();
      long[][] costs = new long[n][3];
      long[][] dp = new long[n][3];
      for (int i = 0; i < n; ++i) {
        for (int j = 0; j < 3; ++j) {
          costs[i][j] = in.nextInt();
          dp[i][j] = Long.MIN_VALUE;
        }
      }

      for (int j = 0; j < 3; ++j) {
        dp[0][j] = costs[0][j];
      }

      for (int i = 0; i < n - 1; ++i) {
        for(int j = 0; j < 3; ++j) {
          int jj = (j + 1) % 3;
          int kk = (j + 2) % 3;

          dp[i + 1][jj] = Math.max(dp[i + 1][jj], dp[i][j] + costs[i + 1][jj]);
          dp[i + 1][kk] = Math.max(dp[i + 1][kk], dp[i][j] + costs[i + 1][kk]);
        }
      }

      long ans = Long.MIN_VALUE;
      for (int j = 0; j < 3; ++j) {
        ans = Math.max(ans, dp[n - 1][j]);
      }

      out.println(ans);
    }
  }



  static class InputReader implements FastIO {

    private InputStream stream;
    private static final int DEFAULT_BUFFER_SIZE = 1 << 16;
    private static final int EOF = -1;
    private byte[] buf = new byte[DEFAULT_BUFFER_SIZE];
    private int curChar;
    private int numChars;

    public InputReader(InputStream stream) {
      this.stream = stream;
    }

    public int read() {
      if (this.numChars == EOF) {
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
            return EOF;
          }
        }

        return this.buf[this.curChar++];
      }
    }

    public int nextInt() {
      int c;
      for (c = this.read(); isSpaceChar(c); c = this.read()) {
      }

      byte sgn = 1;
      if (c == 45) {
        sgn = -1;
        c = this.read();
      }

      int res = 0;

      while (c >= 48 && c <= 57) {
        res *= 10;
        res += c - 48;
        c = this.read();
        if (isSpaceChar(c)) {
          return res * sgn;
        }
      }

      throw new InputMismatchException();
    }

    public long nextLong() {
      int c;
      for (c = this.read(); isSpaceChar(c); c = this.read()) {
      }

      byte sgn = 1;
      if (c == 45) {
        sgn = -1;
        c = this.read();
      }

      long res = 0;

      while (c >= 48 && c <= 57) {
        res *= 10L;
        res += c - 48;
        c = this.read();
        if (isSpaceChar(c)) {
          return res * sgn;
        }
      }
      throw new InputMismatchException();
    }

    public static boolean isSpaceChar(int c) {
      return c == 32 || c == 10 || c == 13 || c == 9 || c == EOF;
    }

    public long[] nextLongArray(int n) {
      long[] arr = new long[n];
      for (int i = 0; i < n; i++) {
        arr[i] = nextLong();
      }
      return arr;
    }

  }

  static class OutputWriter extends PrintWriter {

    public OutputWriter(OutputStream os, boolean autoFlush) {
      super(os, autoFlush);
    }

    public OutputWriter(Writer out) {
      super(out);
    }

    public OutputWriter(Writer out, boolean autoFlush) {
      super(out, autoFlush);
    }

    public OutputWriter(String fileName) throws FileNotFoundException {
      super(fileName);
    }

    public OutputWriter(String fileName, String csn)
        throws FileNotFoundException, UnsupportedEncodingException {
      super(fileName, csn);
    }

    public OutputWriter(File file) throws FileNotFoundException {
      super(file);
    }

    public OutputWriter(File file, String csn)
        throws FileNotFoundException, UnsupportedEncodingException {
      super(file, csn);
    }

    public OutputWriter(OutputStream out) {
      super(out);
    }

    public void flush() {
      super.flush();
    }

    public void close() {
      super.close();
    }

  }

  static interface FastIO {}
}