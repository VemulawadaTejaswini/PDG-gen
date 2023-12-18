import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.Writer;
import java.io.UnsupportedEncodingException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author MaxHeap
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    OutputWriter out = new OutputWriter(outputStream);
    EKnapsack2 solver = new EKnapsack2();
    solver.solve(1, in, out);
    out.close();
  }

  static class EKnapsack2 {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      int w = in.nextInt();
      int[] weights = new int[n];
      int[] value = new int[n];
      final int MAX_VALUE = n * 1000;
      IOUtils.readIntArrays(in, weights, value);
      long[] dp = ArrayUtils.createLongArray(MAX_VALUE + 1, Factories.INF);
      dp[0] = 0;
      for (int j = 0; j < n; ++j) {
        for (int i = MAX_VALUE - value[j]; i >= 0; --i) {
          dp[i + value[j]] = Math.min(
              dp[i] + weights[j],
              dp[i + value[j]]
          );
        }
      }

      for (int i = MAX_VALUE - 1; i >= 0; --i) {
        if (dp[i] <= w) {
          out.println(i);
          return;
        }
      }
      throw new RuntimeException();
    }

  }

  static final class Factories {

    public static int INF = 1 << 30;

    private Factories() {
    }

  }

  static interface FastIO {

    int nextInt();

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

  static final class IOUtils {

    private IOUtils() {
      throw new RuntimeException("IOUtils cannot be created");
    }

    public static void readIntArrays(FastIO in, int[]... arrays) {
      for (int i = 0; i < arrays[0].length; i++) {
        for (int j = 0; j < arrays.length; j++) {
          arrays[j][i] = in.nextInt();
        }
      }
    }

  }

  static class ArrayUtils {

    public static long[] createLongArray(int count, long value) {
      long[] array = new long[count];
      Arrays.fill(array, value);
      return array;
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

    public static boolean isSpaceChar(int c) {
      return c == 32 || c == 10 || c == 13 || c == 9 || c == EOF;
    }

  }
}

