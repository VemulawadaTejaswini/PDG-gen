import java.util.*;
import java.io.*;

public class Main {

  private static void solve() {
    int n = nextInt();
    int K = nextInt();
    int[] h = new int[n];

    for (int i = 0; i < n; i++) {
      h[i] = nextInt();
    }

    int[] dp = new int[n];

    Arrays.fill(dp, Integer.MAX_VALUE);
    dp[0] = 0;
    for (int i = 0; i < n; i++) {
      for (int k = 1; k <= K; k++) {
        if (i + k < n) {
          dp[i + k] = Math.min(dp[i + k], dp[i] + Math.abs(h[i + k] - h[i]));
        }
      }
    }

    System.out.println(dp[n - 1]);
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