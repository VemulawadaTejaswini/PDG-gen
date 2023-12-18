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
    TaskB solver = new TaskB();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskB {

    int n;
    int[] a;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      n = in.nextInt();
      a = new int[n];
      int m = in.nextInt();
      int V = in.nextInt();
      int P = in.nextInt();
      for (int i = 0; i < n; ++i) {
        a[i] = in.nextInt();
      }
      Arrays.sort(a);
      int l = -1, r = a.length - 1;
      while (r - l > 1) {
        int t = (l + r) / 2;
        if (check(t, m, V, P)) {
          r = t;
        } else {
          l = t;
        }
      }
      out.printLine(n - r);
    }

    private boolean check(int pos, int m, int V, int P) {
      int rem = P - 1;
      int val = a[pos] + m;
      --V;
      int s = a.length - 1;
      for (; s >= 0 /*&& a[s] > val*/ && rem > 0 && V > 0; --s) {
        if (s == pos) {
          continue;
        }
        --V;
        --rem;
      }
      if (s >= 0 && a[s] > val) {
        return false;
      }
      long sum = m * (long) V;
      for (int i = 0; i <= s && sum > 0; ++i) {
        if (i == pos) {
          continue;
        }
        int cur = Math.min(m, val - a[i]);
        if (cur > 0) {
          sum -= cur;
        }
      }
      return sum <= 0;
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

