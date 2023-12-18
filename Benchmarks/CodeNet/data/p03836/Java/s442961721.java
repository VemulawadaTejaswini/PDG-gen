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
    TaskC solver = new TaskC();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int sx = in.nextInt();
      int sy = in.nextInt();
      int tx = in.nextInt();
      int ty = in.nextInt();
      int deltaX = tx - sx;
      int deltaY = ty - sy;
      // to (tx, ty)
      for (int i = 0; i < deltaY; i++) {
        out.print('U');
      }
      for (int i = 0; i < deltaX; i++) {
        out.print('R');
      }
      // to (sx, sy)
      for (int i = 0; i < deltaY; i++) {
        out.print('D');
      }
      for (int i = 0; i < deltaX; i++) {
        out.print('L');
      }
      // to (tx, ty)
      out.print('L');
      for (int i = 0; i < deltaY + 1; i++) {
        out.print('U');
      }
      for (int i = 0; i < deltaX + 1; i++) {
        out.print('R');
      }
      out.print('D');
      // to (sx, sy)
      out.print('R');
      for (int i = 0; i < deltaY + 1; i++) {
        out.print('D');
      }
      for (int i = 0; i < deltaX + 1; i++) {
        out.print('L');
      }
      out.print('U');
      out.printLine();
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

    public void printLine() {
      writer.println();
    }

    public void print(char i) {
      writer.print(i);
    }

    public void close() {
      writer.close();
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

