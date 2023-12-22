import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
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
    ECoprime solver = new ECoprime();
    solver.solve(1, in, out);
    out.close();
  }

  static class ECoprime {

    final static int MAX = (int) (1e6 + 10);

    int gcd(int n1, int n2) {
      if (n2 == 0) {
        return n1;
      }
      return gcd(n2, n1 % n2);
    }

    public void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt();
      int[] arr = in.nextIntArray(n);
      int[] inArray = new int[MAX];
      for (int val : arr) {
        inArray[val]++;
      }
      boolean[] isPrime = new boolean[MAX];
      Arrays.fill(isPrime, true);
      boolean share = false;
      for (int i = 2; i < MAX; ++i) {
        if (!isPrime[i]) {
          continue;
        }
        int count = inArray[i];
        for (int j = i + i; j < MAX; j += i) {
          count += inArray[j];
          isPrime[j] = false;
        }
        if (count >= 2) {
          share = true;
          break;
        }
      }
      int g = arr[0];
      if (!share) {
        out.println("pairwise coprime");
        return;
      }
      for (int i = 0; i < n; ++i) {
        g = gcd(arr[i], g);
      }
      if (share && g == 1) {
        out.println("setwise coprime");
        return;
      }
      out.println("not coprime");
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

    public int[] nextIntArray(int n) {
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = nextInt();
      }
      return arr;
    }

  }
}

