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
    TaskC solver = new TaskC();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskC {

    static final int BUBEN = 4200;
    int[][] buf;
    int len;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      //int n = 2000;
      int[] a = new int[n];
      int s = 0;
      for (int i = 0; i < n; ++i) {
        a[i] = in.nextInt();
        //a[i] = 2000;
        s += a[i];
      }
      Arrays.sort(a);
      buf = new int[2][BUBEN * 2];
      len = 1;
      buf[0][0] = a[a.length - 1];
      for (int i = a.length - 2; i >= 0; --i) {
        add(a[i]);
      }

//        Assert.assertTrue(len % 2 == 1);
      int res = -1;
      for (int i = len - 1; i >= 0; --i) {
        int x = buf[0][i];
        if (Math.abs(2 * x - s) < Math.abs(2 * res - s)) {
          res = x;
        }
      }
      out.printLine(res);
    }

    private void add(int val) {
      int nlen = 0;
      int[] a = buf[0];
      //int L = a[0] + val, R = a[len - 1];
      int[] b = buf[1];
      b[nlen++] = val;
      for (int pos1 = 0, pos2 = 0; pos1 < len || pos2 < len; ) {
        if (pos1 < len && (pos2 >= len || a[pos1] <= a[pos2] + val)) {
          if (b[nlen - 1] < a[pos1]) {
            b[nlen++] = a[pos1];
          }
          ++pos1;
        } else {
          if (b[nlen - 1] < a[pos2] + val) {
            b[nlen++] = a[pos2] + val;
          }
          ++pos2;
        }
      }
      //Assert.assertTrue(nlen % 2 == 1);
      int delta = (nlen - BUBEN + 5) / 2;
      if (delta < 0) {
        delta = 0;
      }
      for (int i = delta; i < nlen - delta; ++i) {
        a[i - delta] = b[i];
      }
      len = nlen - 2 * delta;
      // if (delta > 0) {
      //     Assert.assertTrue(a[0] >= L);
      //     Assert.assertTrue(a[len - 1] <= R);
      // }
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

  }
}

