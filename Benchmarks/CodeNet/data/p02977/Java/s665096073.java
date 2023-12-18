import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
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

    int s;
    OutputWriter out;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      this.out = out;
      int n = in.nextInt();
      s = n;
      if (n == 1 || (n & (n - 1)) == 0) {
        out.printLine("No");
        return;
      }
      out.printLine("Yes");
      calc(n, 1, 0);
    }

    void calc(int n, int mult, int shift) {
      if (n % 2 == 1) {
        if (n == 1) {
          throw new RuntimeException();
        }
        for (int i = 2; i <= n; i += 2) {
          out.printLine((shift + 1 * mult) + " " + (shift + i * mult));
          out.printLine((shift + i * mult) + " " + (shift + (i + 1) * mult));
          out.printLine((shift + 1 * mult) + " " + (shift + s + (i + 1) * mult));
          out.printLine((shift + s + (i + 1) * mult) + " " + (shift + s + i * mult));
        }
        out.printLine((shift + 3 * mult) + " " + (shift + s + 1 * mult));
        return;
      }
      calc(n / 2, mult * 2, shift);
      calc(n / 2, mult * 2, shift - mult);
      out.printLine((shift + 1 * mult) + " " + (shift + 2 * mult));
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

