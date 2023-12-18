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
    BBiteEating solver = new BBiteEating();
    solver.solve(1, in, out);
    out.close();
  }

  static class BBiteEating {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt(), l = in.nextInt();
      int L = l, R = l + n - 1;
      if (R < -L) {
        out.println(sum(L, R - 1));
      } else if (-L < R) {
        out.println(sum(L + 1, R));
      } else {
        out.println(sum(L, R));
      }
    }

    private int sum(int l, int r) {
      int n = r - l + 1;
      return n * (l + r) / 2;
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

