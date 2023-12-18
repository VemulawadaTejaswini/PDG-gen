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
    TaskB solver = new TaskB();
    solver.solve(1, in, out);
    out.close();
  }

  static class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int w = in.nextInt();
      int h = in.nextInt();
      int n = in.nextInt();
      int[] x = new int[n];
      int[] y = new int[n];
      int[] a = new int[n];
      IOUtils.readIntArrays(in, x, y, a);
      int[][] area = new int[w][h];
      for (int i = 0; i < n; i++) {
        if (a[i] == 1) {
          for (int j = 0; j < x[i]; j++) {
            for (int k = 0; k < h; k++) {
              area[j][k] = 1;
            }
          }
        } else if (a[i] == 2) {
          for (int j = x[i]; j < w; j++) {
            for (int k = 0; k < h; k++) {
              area[j][k] = 1;
            }
          }
        } else if (a[i] == 3) {
          for (int j = 0; j < w; j++) {
            for (int k = 0; k < y[i]; k++) {
              area[j][k] = 1;
            }
          }
        } else {
          for (int j = 0; j < w; j++) {
            for (int k = y[i]; k < h; k++) {
              area[j][k] = 1;
            }
          }
        }
      }
      int answer = 0;
      for (int i = 0; i < w; i++) {
        for (int j = 0; j < h; j++) {
          answer += area[i][j];
        }
      }
      out.printLine(w * h - answer);
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

  static class IOUtils {
    private IOUtils() {
    }

    public static void readIntArrays(InputReader in, int[]... arrays) {
      for (int i = 0; i < arrays[0].length; i++) {
        for (int j = 0; j < arrays.length; j++) {
          arrays[j][i] = in.nextInt();
        }
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
}

