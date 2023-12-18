
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
    x = in.next().toCharArray();
    y = in.next().toCharArray();
    n = x.length;
    m = y.length;
    dp = new Integer[n][m];
    recurse(0, 0);
    restore();
  }
  
  private int n, m;
  private char[] x, y;
  private Integer[][] dp;
  
  private int recurse(int i, int j) {
    if (i == n || j == m) return 0;
    
    if (dp[i][j] != null) return dp[i][j];
    int ans = Math.max(recurse(i + 1, j), recurse(i, j + 1));
    if (x[i] == y[j]) {
      ans = Math.max(1 + recurse(i + 1, j + 1), ans);
    }
    return dp[i][j] = ans;
  }
  
  private void restore() {
    int i = 0, j = 0;
    while (i < n && j < m && dp[i][j] > 0) {
      int diagonal = i + 1 < n && j + 1 < m ? (dp[i + 1][j + 1] != null ? dp[i + 1][j + 1] : 0) : 0;
      if (dp[i][j] == 1 + diagonal) {
        out.print(x[i]);
        i++;
        j++;
      } else {
        if (dp[i + 1][j] >= dp[i][j + 1]) {
          i++;
        } else {
          j++;
        }
      }
    }
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
