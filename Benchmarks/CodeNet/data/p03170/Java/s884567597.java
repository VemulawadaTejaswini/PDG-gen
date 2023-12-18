import java.util.*;
import java.io.*;

public class Main {

  private static void solve() {
    int n = nextInt();
    int k = nextInt();

    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = nextInt();
    }

    Arrays.sort(a);

    int[][] dp = new int[2][k + 1];

    for (int i = 0; i < a[0]; i++) {
      dp[0][i] = 1;
      dp[1][i] = 0;
    }

    for (int j = 0; j <= k; j++) {
      for (int i = 0; i < 2; i++) {
        boolean wins = false;
        for (int l = 0; l < n && !wins; l++) {
          if (j - a[l] >= 0) {
            wins = dp[1 - i][j - a[l]] == i;
          }
        }

        dp[i][j] = wins ? i : 1 - i;
      }
    }

    System.out.println(dp[0][k] == 0 ? "First" : "Second");
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