import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  private static class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;

    public FastScanner(InputStream in) {
      reader = new BufferedReader(new InputStreamReader(in));
      tokenizer = null;
    }

    public String next() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          tokenizer = new StringTokenizer(reader.readLine());
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }
      return tokenizer.nextToken();
    }

    public String nextLine() {
      if (tokenizer == null || !tokenizer.hasMoreTokens()) {
        try {
          return reader.readLine();
        } catch (IOException e) {
          throw new RuntimeException(e);
        }
      }

      return tokenizer.nextToken("\n");
    }

    public long nextLong() {
      return Long.parseLong(next());
    }

    public int nextInt() {
      return Integer.parseInt(next());
    }

    public double nextDouble() {
      return Double.parseDouble(next());
    }

    public int[] nextIntArray(int n) {
      int[] a = new int[n];
      for (int i = 0; i < n; i++)
        a[i] = nextInt();
      return a;
    }

    public long[] nextLongArray(int n) {
      long[] a = new long[n];
      for (int i = 0; i < n; i++)
        a[i] = nextLong();
      return a;
    }
  }

  public static void main(String[] args) {
    FastScanner sc = new FastScanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    char[][] maze = new char[h][w];
    for (int i = 0; i < h; i++) {
      String row = sc.next();
      for (int j = 0; j < w; j++) {
        maze[i][j] = row.charAt(j);
      }
    }
    long[][] dp = new long[h * w][h * w];
    for (int i = 0; i < h * w; i++) {
      int ii = i / w;
      int ij = i % w;
      for (int j = 0; j < h * w; j++) {
        if (maze[ii][ij] == '#') {
          dp[i][j] = Integer.MAX_VALUE;
          continue;
        }
        int ji = j / w;
        int jj = j % w;
        if (maze[ji][jj] == '#') {
          dp[i][j] = Integer.MAX_VALUE;
          continue;
        }
        if (ii == ji && ij == jj) {
          dp[i][j] = 0;
        } else if (Math.abs(ii - ji) + Math.abs(ij - jj) == 1) {
          dp[i][j] = 1;
        } else {
          dp[i][j] = Integer.MAX_VALUE;
        }
      }
    }
    for (int k = 0; k < h * w; k++) {
      for (int i = 0; i < h * w; i++) {
        for (int j = 0; j < h * w; j++) {
          dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k][j]);
        }
      }
    }
    long max = 0;
    for (int i = 0; i < h * w; i++) {
      for (int j = 0; j < h * w; j++) {
        if (dp[i][j] == Integer.MAX_VALUE) continue;
        max = Math.max(max, dp[i][j]);
      }
    }
    System.out.println(max);
  }
}