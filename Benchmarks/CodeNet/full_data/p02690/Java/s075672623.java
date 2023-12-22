import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author koneko096
 */
public class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    InputReader in = new InputReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    DIHateFactorization solver = new DIHateFactorization();
    solver.solve(1, in, out);
    out.close();
  }

  static class DIHateFactorization {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
      int x = in.nextInt();
      for (int i = 0; i < 100; ++i) {
        for (int j = 100; j >= -100; j--) {
          long ii = pow5(i);
          long jj = pow5(j);
          if (ii - jj == x) {
            out.printf("%d %d\n", i, j);
            return;
          }
          if (jj - ii == x) {
            out.printf("%d %d\n", j, i);
            return;
          }
        }
      }
    }

    private long pow5(int c) {
      return (long) c * c * c * c * c;
    }

  }


  static class InputReader {
    private BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
      reader = new BufferedReader(new InputStreamReader(stream), 32768);
      tokenizer = null;
    }

    public String next() {
      while (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

  }
}

