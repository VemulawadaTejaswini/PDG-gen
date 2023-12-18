import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
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
    GLongestPath solver = new GLongestPath();
    solver.solve(1, in, out);
    out.close();
  }

  static class GLongestPath {

    List<Integer>[] g;
    int[] degree;
    boolean[] vis;
    int[] dist;

    void count(int u) {
      vis[u] = true;
      for (int v : g[u]) {
        dist[v] = Math.max(dist[v], dist[u] + 1);
        --degree[v];
        if (degree[v] == 0) {
          count(v);
        }
      }
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      int m = in.nextInt();
      g = GraphUtils.generateGraph(n + 1);
      degree = new int[n + 1];
      vis = new boolean[n + 1];
      dist = new int[n + 1];
      for (int i = 0; i < m; ++i) {
        int u = in.nextInt(), v = in.nextInt();
        g[u].add(v);
        degree[v]++;
      }
      for (int i = 1; i <= n; ++i) {
        if (!vis[i] && degree[i] == 0) {
          count(i);
        }
      }
      out.println(ArrayUtils.max(dist));
    }

  }

  static interface FastIO {

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

  static class ArrayUtils {

    public static int max(int[] arr) {
      int val = arr[0];
      for (int i = 1; i < arr.length; i++) {
        if (arr[i] > val) {
          val = arr[i];
        }
      }
      return val;
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

  static class GraphUtils {

    private GraphUtils() {
    }

    public static <T> List<T>[] generateGraph(int n) {
      List<T>[] graph = new ArrayList[n];
      for (int i = 0; i < n; i++) {
        graph[i] = new ArrayList<>();
      }
      return graph;
    }

  }
}

