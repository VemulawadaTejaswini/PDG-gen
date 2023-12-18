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

    static final int[] dx = new int[]{-1, 1, 0, 0};
    static final int[] dy = new int[]{0, 0, -1, 1};
    char[][] a;
    int[] q;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      int m = in.nextInt();
      int k = in.nextInt();
      int sx = -1, sy = -1;
      a = new char[n][];
      for (int i = 0; i < n; ++i) {
        a[i] = in.nextToken().toCharArray();
        for (int j = 0; j < m; ++j) {
          if (a[i][j] == 'S') {
            sx = i;
            sy = j;
          }
        }
      }
      int[][] d = new int[n][m];
      for (int i = 0; i < n; ++i) {
        Arrays.fill(d[i], -1);
      }
      d[sx][sy] = 0;
      q = new int[n * m + 10];
      int ql = 0, qr = 0;
      q[ql++] = sx * m + sy;
      int res = -1;
      while (ql > qr) {
        int x = q[qr] / m;
        int y = q[qr] % m;
        int dist = d[x][y];
        ++qr;
        for (int dir = 0; dir < 4; ++dir) {
          int nx = x + dx[dir];
          int ny = y + dy[dir];
          int nd = dist + 1;
          if (a[nx][ny] == '#' && nd < k + 1) {
            nd = k + 1;
          }
          if (nx == 0 || nx == n - 1 || ny == 0 || ny == m - 1) {
            res = nd;
            break;
          }
          if (d[nx][ny] != -1) {
            continue;
          }
          d[nx][ny] = nd;
          q[ql++] = nx * m + ny;
        }
        if (res != -1) {
          break;
        }
      }
      res = res / k + (res % k == 0 ? 0 : 1);
      out.printLine(res);
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

    public String nextToken() {
      int c = readSkipSpace();
      StringBuilder sb = new StringBuilder();
      while (!isSpace(c)) {
        sb.append((char) c);
        c = read();
      }
      return sb.toString();
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

