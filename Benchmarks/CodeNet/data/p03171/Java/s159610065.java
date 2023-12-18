
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main  implements Closeable {

  private InputReader in = new InputReader(System.in);
  private PrintWriter out = new PrintWriter(System.out);

  public void solve() {
    n = in.ni();
    x = new long[n];
    for (int i = 0; i < n; i++) {
      x[i] = in.nl();
    }
    dp = new Long[n][n][2];
    out.println(recurse(0, n - 1, 0));
  }

  private int n;
  private long[] x;
  private Long[][][] dp;

  private Long recurse(int left, int right, int player) {
    if (left > right) return 0L;

    if (dp[left][right][player] != null) return dp[left][right][player];

    long result;
    if (player == 0) {
      result = Math.max(x[left] + recurse(left + 1, right, 1), x[right] + recurse(left, right - 1, 1));
    } else {
      result = Math.min(-x[left] + recurse(left + 1, right, 0), -x[right] + recurse(left, right - 1, 0));
    }
    return dp[left][right][player] = result;
  }

  @Override
  public void close() throws IOException {
    in.close();
    out.close();
  }

  static class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

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

    public int ni() {
      return Integer.parseInt(next());
    }

    public long nl() {
      return Long.parseLong(next());
    }

    public void close() throws IOException {
      reader.close();
    }
  }

  public static void main(String[] args) throws IOException {
    try (Main instance = new Main()) {
      instance.solve();
    }
  }
}
