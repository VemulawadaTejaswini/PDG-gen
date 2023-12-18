import java.util.*;
import java.io.*;

public class Main {

  private static void solve() {
    char[] s = next().toCharArray();
    char[] t = next().toCharArray();

    int n = s.length;
    int m = t.length;

    int[][] dp = new int[n][m];
    int[][][] bt = new int[n][m][2];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        Arrays.fill(bt[i][j], -1);
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (s[i] == t[j]) {
          if (i - 1 >= 0 && j - 1 >= 0) {
            dp[i][j] = dp[i - 1][j - 1] + 1;
            bt[i][j][0] = i - 1;
            bt[i][j][1] = j - 1;
          } else {
            dp[i][j] = 1;
          }
        } else {
          if (i - 1 >= 0) {
            if (dp[i][j] < dp[i - 1][j]) {
              dp[i][j] = dp[i - 1][j];
              bt[i][j][0] = i - 1;
              bt[i][j][1] = j;
            }
          }

          if (j - 1 >= 0) {
            if (dp[i][j] < dp[i][j - 1]) {
              dp[i][j] = dp[i][j - 1];
              bt[i][j][0] = i;
              bt[i][j][1] = j - 1;
            }
          }
        }
      }
    }

    int curX = n - 1;
    int curY = m - 1;
    StringBuilder sb = new StringBuilder();
    while (curX != -1 && curY != -1) {
      if (s[curX] == t[curY]) {
        sb.append(s[curX]);
      }
      int oldX = curX;
      int oldY = curY;
      curX = bt[oldX][oldY][0];
      curY = bt[oldX][oldY][1];
    }

    System.out.println(sb.reverse().toString());
  }

  private static void run() {
    br = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(System.out);

    solve();

    out.close();
  }

  private static StringTokenizer st;
  private static BufferedReader br;
  private static PrintWriter out;

  private static String next() {
    while (st == null || !st.hasMoreElements()) {
      String s;
      try {
        s = br.readLine();
      } catch (IOException e) {
        return null;
      }
      st = new StringTokenizer(s);
    }
    return st.nextToken();
  }

  private static int nextInt() {
    return Integer.parseInt(next());
  }

  private static long nextLong() {
    return Long.parseLong(next());
  }

  public static void main(String[] args) {
    run();
  }
}