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

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      int m = in.nextInt();
      int a = in.nextInt();
      int b = in.nextInt();
      char[][] d = new char[n][m];
      for (int i = 0; i < n; ++i) {
        Arrays.fill(d[i], '.');
      }
      if (n % 2 == 1) {
        for (int i = 0; i + 1 < m; i += 2) {
          if (a > 0) {
            d[n - 1][i] = '<';
            d[n - 1][i + 1] = '>';
            --a;
          }
        }
        --n;
      }
      if (m % 2 == 1) {
        for (int i = 0; i + 1 < n; i += 2) {
          if (b > 0) {
            d[i][m - 1] = '^';
            d[i + 1][m - 1] = 'v';
            --b;
          }
        }
        --m;
      }
      for (int i = 0; i < n; i += 2) {
        for (int j = 0; j < m; j += 2) {
          if (a > 0) {
            d[i][j] = '<';
            d[i][j + 1] = '>';
            --a;
            if (a > 0) {
              d[i + 1][j] = '<';
              d[i + 1][j + 1] = '>';
              --a;
            }
          } else if (b > 0) {
            d[i][j] = '^';
            d[i + 1][j] = 'v';
            --b;
            if (b > 0) {
              d[i][j + 1] = '^';
              d[i + 1][j + 1] = 'v';
              --b;
            }
          }
        }
      }
      if (a == 0 && b == 0) {
        out.printLine("YES");
        for (int i = 0; i < d.length; ++i) {
          out.printLine(new String(d[i]));
        }
      } else {
        out.printLine("NO");
      }
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
}

