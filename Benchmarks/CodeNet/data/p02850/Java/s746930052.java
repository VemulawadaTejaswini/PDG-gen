import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
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
 * @author Rustam Musin (t.me/musin_acm)
 */
public class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    OutputWriter out = new OutputWriter(outputStream);
    DColoringEdgesOnTree solver = new DColoringEdgesOnTree();
    solver.solve(1, in, out);
    out.close();
  }

  static class DColoringEdgesOnTree {
    List<DColoringEdgesOnTree.Edge>[] g;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.readInt();
      g = new List[n];
      for (int i = 0; i < n; i++) g[i] = new ArrayList<>();
      DColoringEdgesOnTree.Edge[] edges = new DColoringEdgesOnTree.Edge[n - 1];
      for (int i = 1; i < n; i++) {
        int x = in.readInt() - 1;
        int y = in.readInt() - 1;
        DColoringEdgesOnTree.Edge e1 = new DColoringEdgesOnTree.Edge(i, x, y);
        DColoringEdgesOnTree.Edge e2 = new DColoringEdgesOnTree.Edge(i, y, x);
        e1.rev = e2;
        e2.rev = e1;
        g[x].add(e1);
        g[y].add(e2);
        edges[i - 1] = e1;
      }
      dfs(0, -1);
      int maxColor = 0;
      for (int i = 0; i < n; i++) for (DColoringEdgesOnTree.Edge e : g[i]) maxColor = Math.max(maxColor, e.color);
      out.printLine(maxColor);
      for (DColoringEdgesOnTree.Edge e : edges) out.printLine(e.color);
    }

    void dfs(int v, int c0) {
      int nextColor = 1;
      for (DColoringEdgesOnTree.Edge e : g[v]) {
        if (e.color != 0) continue;
        if (nextColor == c0) nextColor++;
        e.color = e.rev.color = nextColor++;
        dfs(e.to, e.color);
      }
    }

    static class Edge {
      int index;
      int from;
      int to;
      int color;
      DColoringEdgesOnTree.Edge rev;

      public Edge(int i, int from, int to) {
        index = i;
        this.from = from;
        this.to = to;
      }

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

    public void close() {
      writer.close();
    }

    public void printLine(int i) {
      writer.println(i);
    }

  }

  static class InputReader {
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;
    private InputReader.SpaceCharFilter filter;

    public InputReader(InputStream stream) {
      this.stream = stream;
    }

    public int read() {
      if (numChars == -1) {
        throw new InputMismatchException();
      }
      if (curChar >= numChars) {
        curChar = 0;
        try {
          numChars = stream.read(buf);
        } catch (IOException e) {
          throw new InputMismatchException();
        }
        if (numChars <= 0) {
          return -1;
        }
      }
      return buf[curChar++];
    }

    public int readInt() {
      int c = read();
      while (isSpaceChar(c)) {
        c = read();
      }
      int sgn = 1;
      if (c == '-') {
        sgn = -1;
        c = read();
      }
      int res = 0;
      do {
        if (c < '0' || c > '9') {
          throw new InputMismatchException();
        }
        res *= 10;
        res += c - '0';
        c = read();
      } while (!isSpaceChar(c));
      return res * sgn;
    }

    public boolean isSpaceChar(int c) {
      if (filter != null) {
        return filter.isSpaceChar(c);
      }
      return isWhitespace(c);
    }

    public static boolean isWhitespace(int c) {
      return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }

    public interface SpaceCharFilter {
      public boolean isSpaceChar(int ch);

    }

  }
}

