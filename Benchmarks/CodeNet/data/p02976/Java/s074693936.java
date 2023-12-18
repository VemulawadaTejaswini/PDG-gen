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
import java.util.ArrayList;
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
    TaskB solver = new TaskB();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskB {

    OutputWriter out;
    ArrayList<Integer>[] g;
    int[] u;
    int[] d;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      this.out = out;
      int n = in.nextInt();
      int m = in.nextInt();
      g = new ArrayList[n];
      for (int i = 0; i < n; ++i) {
        g[i] = new ArrayList<>();
      }
      for (int i = 0; i < m; ++i) {
        int x = in.nextInt() - 1;
        int y = in.nextInt() - 1;
        g[x].add(y);
        g[y].add(x);
      }
      if (m % 2 == 1) {
        out.printLine(-1);
        return;
      }
      u = new int[n];
      d = new int[n];
      dfs(0, -1);
      int s = 0;
      for (int i = 0; i < n; ++i) {
        if (d[i] % 2 != 0) {
          throw new RuntimeException();
        }
        s += d[i];
      }
      if (s != m) {
        throw new RuntimeException();
      }
    }

    private boolean dfs(int x, int p) {
      u[x] = 1;
      boolean res = false;
      for (int y : g[x]) {
        if (y == p) {
          continue;
        }
        if (u[y] == 2) {
          continue;
        }
        if (u[y] == 1) {
          res = !res;
          out.printLine((x + 1) + " " + (y + 1));
          ++d[x];
        } else {
          boolean r = dfs(y, x);
          if (r) {
            out.printLine((y + 1) + " " + (x + 1));
            ++d[y];
          } else {
            res = !res;
            out.printLine((x + 1) + " " + (y + 1));
            ++d[x];
          }
        }
      }
      u[x] = 2;
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

  }
}

