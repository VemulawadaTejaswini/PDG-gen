import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.io.BufferedWriter;
import java.util.Set;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 * @author GYSHGX868
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
    public void solve(int testNumber, InputReader in, OutputWriter out) {
      long h = in.nextLong();
      long w = in.nextLong();
      int n = in.nextInt();
      Set<TaskD.Rectangle> rectangles = new HashSet<>();
      Set<TaskD.Rectangle> virtualCenters = new HashSet<>();
      for (int i = 0; i < n; i++) {
        int a = in.nextInt();
        int b = in.nextInt();
        // (a, b) as center
        rectangles.add(new TaskD.Rectangle(a, b));
        // (a, b) as boundary, so add virtual center
        virtualCenters.add(new TaskD.Rectangle(a, b));
        virtualCenters.add(new TaskD.Rectangle(a - 1, b));
        virtualCenters.add(new TaskD.Rectangle(a - 2, b));
        virtualCenters.add(new TaskD.Rectangle(a, b - 1));
        virtualCenters.add(new TaskD.Rectangle(a, b - 2));
        virtualCenters.add(new TaskD.Rectangle(a - 1, b - 1));
        virtualCenters.add(new TaskD.Rectangle(a - 1, b - 2));
        virtualCenters.add(new TaskD.Rectangle(a - 2, b - 1));
        virtualCenters.add(new TaskD.Rectangle(a - 2, b - 2));
      }
      long total = Math.max(0, h - 2) * Math.max(0, w - 2);
      long[] answer = new long[10];
      Iterator<TaskD.Rectangle> iterator = virtualCenters.iterator();
      while (iterator.hasNext()) {
        TaskD.Rectangle center = iterator.next();
        if (center.a > h - 2 || center.b > w - 2 || center.a < 1 || center.b < 1) {
          continue;
        }
        TaskD.Rectangle[] surroundings = new TaskD.Rectangle[]{
            center,
            new TaskD.Rectangle(center.a, center.b + 1),
            new TaskD.Rectangle(center.a, center.b + 2),
            new TaskD.Rectangle(center.a + 1, center.b),
            new TaskD.Rectangle(center.a + 1, center.b + 1),
            new TaskD.Rectangle(center.a + 1, center.b + 2),
            new TaskD.Rectangle(center.a + 2, center.b),
            new TaskD.Rectangle(center.a + 2, center.b + 1),
            new TaskD.Rectangle(center.a + 2, center.b + 2),
        };
        int count = 0;
        for (int j = 0; j < 9; j++) {
          TaskD.Rectangle current = surroundings[j];
          if (rectangles.contains(current)) {
            count++;
          }
        }
        answer[count]++;
      }
      long sum = 0;
      for (int i = 1; i < 10; i++) {
        sum += answer[i];
      }
      answer[0] = total - sum;
      for (int i = 0; i < 10; i++) {
        out.printLine(answer[i]);
      }
    }

    private static class Rectangle implements Comparable<TaskD.Rectangle> {
      int a;
      int b;

      public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
      }

      public int compareTo(TaskD.Rectangle other) {
        if (a == other.a) {
          return Integer.compare(b, other.b);
        }
        return Integer.compare(a, other.a);
      }

      public boolean equals(Object o) {
        if (this == o) {
          return true;
        }
        if (o == null || getClass() != o.getClass()) {
          return false;
        }
        TaskD.Rectangle rectangle = (TaskD.Rectangle) o;
        return a == rectangle.a && b == rectangle.b;
      }

      public int hashCode() {
        return Objects.hash(a, b);
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

    public void printLine(long i) {
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

    public int nextInt() {
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

    public long nextLong() {
      int c = read();
      while (isSpaceChar(c)) {
        c = read();
      }
      int sgn = 1;
      if (c == '-') {
        sgn = -1;
        c = read();
      }
      long res = 0;
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
      boolean isSpaceChar(int ch);

    }

  }
}

