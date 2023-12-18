
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main implements Closeable {

  private InputReader in = new InputReader(System.in);
  private PrintWriter out = new PrintWriter(System.out);

  public void solve() {
    n = in.ni();
    int w = in.ni();
    weight = new int[n];
    values = new int[n];
    int V = 0;
    for (int i = 0; i < n; i++) {
      weight[i] = in.ni();
      values[i] = in.ni();
      V += values[i];
    }
    dp = new Long[n][V + 1];
    long result = 0;
    for (int val = V; val >= 0; val--) {
      long weight = recurse(0, val);
      if (weight <= w) {
        result = val;
        break;
      }
    }
    out.println(result);
  }

  private int n;
  private int[] weight, values;
  private Long[][] dp;

  private Long recurse(int idx, int val) {
    long oo = (long) 1e18;
    if (idx == n) return val == 0 ? 0L : oo;

    if (dp[idx][val] != null) return dp[idx][val];

    long ans = recurse(idx + 1, val);
    if (values[idx] <= val) {
      ans = Math.min(ans, weight[idx] + recurse(idx + 1, val - values[idx]));
    }

    return dp[idx][val] = ans;
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
