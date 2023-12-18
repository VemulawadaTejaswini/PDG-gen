import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
    TaskD solver = new TaskD();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskD {

    ArrayList<Integer>[] g;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      Assert.assertTrue(n > 1);
      //int n = 99;
      g = new ArrayList[n + 2];
      for (int i = 0; i < g.length; ++i) {
        g[i] = new ArrayList<>();
      }
      for (int i = 0; i < n - 1; ++i) {
        int x = in.nextInt() - 1;
        int y = in.nextInt() - 1;
        // int x, y;
        // if (i < 48) {
        //     x = i;
        //     y = i + 1;
        // } else {
        //     x = i - 48;
        //     y = i + 1;
        // }
        g[x].add(y);
        g[y].add(x);
      }
      ComparablePair<Long, Long> ans = solveSimple(n);
      for (int z = 0; z < n; ++z) {
        if (g[z].size() == 1) {
          g[n].add(z);
          g[z].add(n);
          {
            ComparablePair<Long, Long> cur = solveSimple(n + 1);
            if (cur.compareTo(ans) < 0) {
              ans = cur;
            }
          }
          // for (int t = 0; t < n + 1; ++t) if (g[t].size() == 1) {
          //     g[n + 1].add(t);
          //     g[t].add(n + 1);
          //     ComparablePair<Long, Long> cur = solveSimple(n + 2);
          //     if (cur.compareTo(ans) < 0)
          //         ans = cur;
          //     g[n + 1].clear();
          //     g[t].remove(g[t].size() - 1);
          // }
          g[n].clear();
          g[z].remove(g[z].size() - 1);

        }
      }
      out.printLine(ans.first + " " + ans.second);
    }

    public ComparablePair<Long, Long> solveSimple(int n) {
      ArrayList<Integer>[] layers = new ArrayList[n + 4];
      for (int i = 0; i < layers.length; ++i) {
        layers[i] = new ArrayList<>();
      }
      for (int i = 0; i < n; ++i) {
        layers[dfs(i, -1)].add(i);
      }
      long[] d = new long[layers.length];
      int res = 0;
      for (int i = layers.length - 2; i >= 0; --i) {
        if (layers[i].isEmpty()) {
          d[i] = d[i + 1];
          continue;
        }
        ++res;
        long deg = 0;
        for (int x : layers[i]) {
          deg = Math.max(deg, g[x].size());
        }
        --deg;
        Assert.assertTrue(deg >= 0);
        boolean finLayer = i == 0 || layers[i - 1].isEmpty();
        if (d[i + 1] == 0) {
          Assert.assertTrue(deg == 0);
          d[i] = 1;
          if (finLayer) {
            Assert.assertTrue(layers[i].size() == 2);
            d[i] *= layers[i].size();
          }
          continue;
        }
        if (finLayer) {
          for (int j = i - 1; j >= 0; --j) {
            Assert.assertTrue(layers[j].isEmpty());
          }
          if (layers[i].size() == 1) {
            ++deg;
          } else {
            Assert.assertTrue(layers[i].size() == 2);
            deg *= 2L;
          }
        }
        Assert.assertTrue(deg > 0);
        Assert.assertTrue(d[i + 1] < Long.MAX_VALUE / deg);
        long cur = d[i + 1] * (long) deg;
        d[i] = cur;
      }
      Assert.assertTrue(d[0] > 1);
      return new ComparablePair<Long, Long>((long) res, d[0]);
    }

    private int dfs(int x, int p) {
      int res = 1;
      for (int y : g[x]) {
        if (y != p) {
          res = Math.max(res, dfs(y, x) + 1);
        }
      }
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

  static class Pair<P, Q> {

    public P first;
    public Q second;

    public Pair() {
    }

    public Pair(P first, Q second) {
      this.first = first;
      this.second = second;
    }


    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      Pair pair = (Pair) o;

      if (first != null ? !first.equals(pair.first) : pair.first != null) {
        return false;
      }
      if (second != null ? !second.equals(pair.second) : pair.second != null) {
        return false;
      }

      return true;
    }


    public int hashCode() {
      int result = first != null ? first.hashCode() : 0;
      result = 31 * result + (second != null ? second.hashCode() : 0);
      return result;
    }

  }

  static class Assert {

    public static void assertTrue(boolean flag) {
      if (!flag) {
        while (true) {
          ;
        }
      }
//        if (!flag)
//            throw new AssertionError();
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

  static class ComparablePair<P extends Comparable, Q extends Comparable> extends
      Pair<P, Q> implements Comparable<Pair<P, Q>> {

    public ComparablePair() {
    }

    public ComparablePair(P first, Q second) {
      super(first, second);
    }

    public int compareTo(Pair<P, Q> other) {
      int valP = first.compareTo(other.first);
      if (valP != 0) {
        return valP;
      }
      return second.compareTo(other.second);
    }

  }
}

