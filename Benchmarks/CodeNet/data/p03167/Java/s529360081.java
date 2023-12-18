
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
    m = in.ni();
    grid = new char[n][m];
    for (int i = 0; i < n; i++) {
      grid[i] = in.next().toCharArray();
    }
    dp = new Long[n][m];
    out.println(recurse(0, 0));
  }
  
  private int n, m;
  private char[][] grid;
  private Long[][] dp;
  private final long MOD = (long) 1e9 + 7;
  
  private long recurse(int row, int col) {
    if (row == n - 1 && col == m - 1) return 1;
    
    if (dp[row][col] != null) return dp[row][col];
    
    long ans = 0;
    if (row + 1 < n && grid[row + 1][col] == '.') {
      ans += recurse(row + 1, col);
      ans %= MOD;
    }
    if (col + 1 < m && grid[row][col + 1] == '.') {
      ans += recurse(row, col + 1);
      ans %= MOD;
    }
    return dp[row][col] = ans;
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
