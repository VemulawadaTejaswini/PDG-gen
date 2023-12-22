import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Set;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
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
    PrintWriter out = new PrintWriter(outputStream);
    DFriends solver = new DFriends();
    solver.solve(1, in, out);
    out.close();
  }

  static class DFriends {

    public void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt();
      int m = in.nextInt();
      Set<IntPair> pairs = new HashSet<>();
      for (int i = 0; i < m; ++i) {
        int u = in.nextInt(), v = in.nextInt();
        pairs.add(new IntPair(Math.min(u, v), Math.max(u, v)));
      }
      DFriends.Dsu ds = new DFriends.Dsu(n + 1);
      for (IntPair pair : pairs) {
        ds.merge(pair.x, pair.y);
      }
      int ans = 0;
      for (int i = 1; i <= n; ++i) {
        ans = Math.max(ans, ds.size(i));
      }
      out.println(ans);
    }

    static class Dsu {

      int[] parent;
      int[] rank;

      Dsu(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; ++i) {
          rank[i] = 1;
          parent[i] = i;
        }
      }

      int size(int u) {
        return rank[find(u)];
      }

      int find(int u) {
        return parent[u] == u ? u : (parent[u] = find(parent[u]));
      }

      void merge(int u, int v) {
        if ((u = find(u)) == (v = find(v))) {
          return;
        }
        if (rank[u] < rank[v]) {
          int t = u;
          u = v;
          v = t;
        }
        rank[u] += rank[v];
        rank[v] = 0;
        parent[v] = u;
      }

    }

  }

  static class IntPair implements Comparable<IntPair> {

    public int x;
    public int y;

    public IntPair(int x, int y) {
      this.x = x;
      this.y = y;
    }

    public IntPair(IntPair that) {
      this.x = that.x;
      this.y = that.y;
    }

    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      IntPair intPair = (IntPair) o;
      return x == intPair.x &&
          y == intPair.y;
    }

    public int hashCode() {
      return Objects.hash(x, y);
    }

    public String toString() {
      return "IntPair{" +
          "x=" + x +
          ", y=" + y +
          '}';
    }

    public int compareTo(IntPair o) {
      int c = Integer.compare(x, o.x);
      if (c == 0) {
        return Integer.compare(y, o.y);
      }
      return c;
    }

  }

  static class InputReader {

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
}

