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
 *
 * @author Rustam Musin (t.me/musin_acm)
 */
public class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    OutputWriter out = new OutputWriter(outputStream);
    CHonestOrUnkind2 solver = new CHonestOrUnkind2();
    solver.solve(1, in, out);
    out.close();
  }

  static class CHonestOrUnkind2 {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
      int n = in.readInt();
      Guy[] a = new Guy[n];
      for (int i = 0; i < n; i++) {
        int k = in.readInt();
        Opinion[] opinions = new Opinion[k];
        for (int j = 0; j < k; j++) {
          int at = in.readInt() - 1;
          int type = in.readInt();
          opinions[j] = new Opinion(at, type);
        }
        a[i] = new Guy(opinions);
      }
      int ans = 0;
      for (int m = 0; m < 1 << n; m++) {
        int[] type = new int[n];
        for (int i = 0; i < n; i++) {
          if (get(m, i)) {
            type[i] |= 1;
            for (Opinion op : a[i].opinions) {
              type[op.personIndex] |= op.isHonest ? 1 : 2;
            }
          } else {
            type[i] |= 2;
          }
        }
        boolean ok = true;
        for (int t : type) ok &= t != 3;
        if (ok) ans = Math.max(ans, Integer.bitCount(m));
      }
      out.print(ans);
    }

    boolean get(int m, int b) {
      return ((m >> b) & 1) == 1;
    }

    class Guy {
      Opinion[] opinions;

      Guy(Opinion[] opinions) {
        this.opinions = opinions;
      }

    }

    class Opinion {
      int personIndex;
      boolean isHonest;
      int isHonest1;

      public Opinion(int personIndex, int isHonest1) {
        this.personIndex = personIndex;
        this.isHonest1 = isHonest1;
        isHonest = isHonest1 == 1;
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

    public void print(int i) {
      writer.print(i);
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

