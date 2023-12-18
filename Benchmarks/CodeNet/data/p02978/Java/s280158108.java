import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 *
 * @author ilyakor
 */
public class Main {

  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    OutputWriter out = new OutputWriter(outputStream);
    TaskD solver = new TaskD();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskD {

    int n;
    long[] a;
    long[][][][] d;
    static final int H = 216;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      n = in.nextInt();
      a = new long[n];
      for (int i = 0; i < n; ++i) {
        a[i] = in.nextLong();
      }
      d = new long[n][n][H][H];
      for (int i = 0; i < d.length; ++i) {
        for (int j = 0; j < d[i].length; ++j) {
          for (int k = 0; k < d[i][j].length; ++k) {
            Arrays.fill(d[i][j][k], -1);
          }
        }
      }
      long res = calc(0, n - 1, 1, 1);
      res += a[0] + a[n - 1];
      out.printLine(res);
    }

    private long calc(int l, int r, int cl, int cr) {
      if (l + 1 == r) {
        return 0;
      }
      if (cl < 128 && cr < 128 && d[l][r][cl][cr] != -1) {
        return d[l][r][cl][cr];
      }
      long res = Long.MAX_VALUE;
      for (int i = l + 1; i < r; ++i) {
        long cur = a[i] * (cl + cr);
        cur += calc(l, i, cl, cl + cr);
        cur += calc(i, r, cl + cr, cr);
        if (cur < res) {
          res = cur;
        }
      }
      if (cl < H && cr < H) {
        d[l][r][cl][cr] = res;
      }
      return res;
    }

  }

  static class OutputWriter {

    private final PrintWriter writer;

    public OutputWriter(OutputStream outputStream) {
      writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
    }

    public OutputWriter(Writer writer) {
      this.writer = new PrintWriter(writer);
    }

    public void print(Object... objects) {
      for (int i = 0; i < objects.length; i++) {
        if (i != 0) {
          writer.print(' ');
        }
        writer.print(objects[i]);
      }
    }

    public void printLine(Object... objects) {
      print(objects);
      writer.println();
    }

    public void close() {
      writer.close();
    }

  }

  static class InputReader {

    private InputStream stream;
    private byte[] buffer = new byte[10000];
    private int cur;
    private int count;

    public InputReader(InputStream stream) {
      this.stream = stream;
    }

    public static boolean isSpace(int c) {
      return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public int read() {
      if (count == -1) {
        throw new InputMismatchException();
      }
      try {
        if (cur >= count) {
          cur = 0;
          count = stream.read(buffer);
          if (count <= 0) {
            return -1;
          }
        }
      } catch (IOException e) {
        throw new InputMismatchException();
      }
      return buffer[cur++];
    }

    public int readSkipSpace() {
      int c;
      do {
        c = read();
      } while (isSpace(c));
      return c;
    }

    public int nextInt() {
      int sgn = 1;
      int c = readSkipSpace();
      if (c == '-') {
        sgn = -1;
        c = read();
      }
      int res = 0;
      do {
        if (c < '0' || c > '9') {
          throw new InputMismatchException();
        }
        res = res * 10 + c - '0';
        c = read();
      } while (!isSpace(c));
      res *= sgn;
      return res;
    }

    public long nextLong() {
      long sgn = 1;
      int c = readSkipSpace();
      if (c == '-') {
        sgn = -1;
        c = read();
      }
      long res = 0;
      do {
        if (c < '0' || c > '9') {
          throw new InputMismatchException();
        }
        res = res * 10L + (long) (c - '0');
        c = read();
      } while (!isSpace(c));
      res *= sgn;
      return res;
    }

  }
}

