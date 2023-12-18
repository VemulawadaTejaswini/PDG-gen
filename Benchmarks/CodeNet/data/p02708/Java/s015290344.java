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
    DSumOfLargeNumbers solver = new DSumOfLargeNumbers();
    solver.solve(1, in, out);
    out.close();
  }

  static class DSumOfLargeNumbers {
    private static final int MOD = 1000000007;

    public void solve(int testNumber, InputReader in, PrintWriter out) {
      int n = in.nextInt(), k = in.nextInt(), ans = 0;
      for (int i = k; i <= n + 1; i++) {
        long upper = (long) i * (2 * n - i + 1) / 2;
        long lower = (long) i * (i - 1) / 2;
        ans = (int) ((ans + upper - lower + 1) % MOD);
      }
      out.println(ans);
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

