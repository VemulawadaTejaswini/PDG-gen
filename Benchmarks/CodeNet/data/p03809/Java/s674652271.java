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
 * Built using CHelper plug-in
 * Actual solution is at the top
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

    ArrayList<Integer>[] g;
    int[] need;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      g = new ArrayList[n];
      for (int i = 0; i < n; ++i) {
        g[i] = new ArrayList<>();
      }
      need = new int[n];
      for (int i = 0; i < n; ++i) {
        need[i] = in.nextInt();
      }
      for (int i = 0; i < n - 1; ++i) {
        int x = in.nextInt() - 1;
        int y = in.nextInt() - 1;
        g[x].add(y);
        g[y].add(x);
      }
      if (n == 2) {
        if (need[0] == need[1]) {
          out.printLine("YES");
        } else {
          out.printLine("NO");
        }
        return;
      }
      int root = 0;
      while (g[root].size() <= 1) {
        ++root;
      }
      TaskC.Seg res = dfs(root, -1);
      out.printLine((res.l <= 0 && res.r >= 0 && res.l % 2 == 0) ? "YES" : "NO");
    }

    private TaskC.Seg dfs(int x, int par) {
      if (g[x].size() == 1) {
        return new TaskC.Seg(need[x], need[x]);
      }
      long sl = 0, sr = 0, ml = 0, mr = 0;
      for (int y : g[x]) {
        if (y != par) {
          TaskC.Seg s = dfs(y, x);
          if (s.l > s.r) {
            return new TaskC.Seg(0, -2);
          }
          sl += s.l;
          sr += s.r;
          if (ml < s.l) {
            ml = s.l;
          }
          if (mr < s.r) {
            mr = s.r;
          }
        }
      }
      long maxConn = (sr - mr + Math.min(mr, sr - mr)) / 2L;
      if (sl < need[x]) {
        sl = need[x] + (sl % 2 == need[x] % 2 ? 0 : 1);
      }
      if (sr > maxConn + need[x]) {
        sr = maxConn + need[x] - (sr % 2 == (maxConn + need[x]) % 2 ? 0 : 1);
      }
      if (sl > sr) {
        return new TaskC.Seg(0, -2);
      }
      sl = 2 * need[x] - sl;
      sr = 2 * need[x] - sr;
      {
        long t = sl;
        sl = sr;
        sr = t;
      }
      if (sl < 0) {
        sl = Math.abs(sl) % 2;
      }
      if (sl > sr) {
        return new TaskC.Seg(0, -2);
      }

      return new TaskC.Seg(sl, sr);
    }

    static class Seg {

      long l;
      long r;

      public Seg(long l, long r) {
        this.l = l;
        this.r = r;
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

