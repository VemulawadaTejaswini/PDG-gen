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
import java.util.Comparator;
import java.util.Collections;
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

    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.nextInt();
      ArrayList<ii> a = new ArrayList<>();
      for (int i = 0; i < n; ++i) {
        a.add(new ii(in.nextInt(), in.nextInt()));
      }
      int res = 0;
      Collections.sort(a, new Comparator<ii>() {

        public int compare(ii e1, ii e2) {
          return Integer.compare(e1.first, e2.first);
        }
      });
      res = Math.max(res, calc(a));
      Collections.sort(a, new Comparator<ii>() {

        public int compare(ii e1, ii e2) {
          return -Integer.compare(e1.first, e2.first);
        }
      });
      res = Math.max(res, calc(a));
      Collections.sort(a, new Comparator<ii>() {

        public int compare(ii e1, ii e2) {
          return Integer.compare(e1.second, e2.second);
        }
      });
      res = Math.max(res, calc(a));
      Collections.sort(a, new Comparator<ii>() {

        public int compare(ii e1, ii e2) {
          return -Integer.compare(e1.second, e2.second);
        }
      });
      res = Math.max(res, calc(a));
      Collections.sort(a, new Comparator<ii>() {

        public int compare(ii e1, ii e2) {
          return Integer.compare(e1.second - e1.first, e2.second - e2.first);
        }
      });
      res = Math.max(res, calc(a));
      Collections.sort(a, new Comparator<ii>() {

        public int compare(ii e1, ii e2) {
          return -Integer.compare(e1.second - e1.first, e2.second - e2.first);
        }
      });
      res = Math.max(res, calc(a));
      out.printLine(res);
    }

    private int calc(ArrayList<ii> a) {
      int res = 0;
      int r1 = 1000 * 1000 * 1000 + 1, l1 = -1;
      int[] minR = new int[a.size() + 1];
      minR[a.size()] = 1000 * 1000 * 1000 + 1;
      int[] maxL = new int[a.size() + 1];
      maxL[a.size()] = -1;
      for (int i = a.size() - 1; i >= 0; --i) {
        minR[i] = Math.min(minR[i + 1], a.get(i).second);
        maxL[i] = Math.max(maxL[i + 1], a.get(i).first);
      }
      for (int i = 0; i < a.size() - 1; ++i) {
        ii e = a.get(i);
        l1 = Math.max(l1, e.first);
        r1 = Math.min(r1, e.second);
        int l2 = maxL[i + 1];
        int r2 = minR[i + 1];
        int cur = 0;
        if (l1 <= r1) {
          cur += r1 - l1 + 1;
        }
        if (l2 <= r2) {
          cur += r2 - l2 + 1;
        }
        if (cur > res) {
          res = cur;
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

  static class ii implements Comparable<ii> {

    public int first;
    public int second;

    public ii() {
    }

    public ii(int first, int second) {
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

      ii ii = (ii) o;

      if (first != ii.first) {
        return false;
      }
      if (second != ii.second) {
        return false;
      }

      return true;
    }

    public int hashCode() {
      int result = first;
      result = 31 * result + second;
      return result;
    }

    public int compareTo(ii o) {
      if (first != o.first) {
        return first < o.first ? -1 : 1;
      }
      if (second != o.second) {
        return second < o.second ? -1 : 1;
      }
      return 0;
    }

    public String toString() {
      return "{" +
          "first=" + first +
          ", second=" + second +
          '}';
    }

  }
}

