
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
    joy = new int[n][3];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 3; j++) {
        joy[i][j] = in.ni();
      }
    }
    dp = new Integer[n][3];
    int ans = 0;
    for (int i = 0; i < 3; i++) {
      ans = Math.max(joy[0][i] + recurse(1, i), ans);
    }
    out.println(ans);
  }
  
  private int n;
  private int[][] joy;
  private Integer[][] dp;
  
  private int recurse(int idx, int last) {
    if (idx == n) return 0;
    
    if (dp[idx][last] != null) return dp[idx][last];
    
    int ans = 0;
    for (int i = 0; i < 3; i++) {
      if (i != last) {
        ans = Math.max(joy[idx][i] + recurse(idx + 1, i), ans);
      }
    }
    return dp[idx][last] = ans;
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
