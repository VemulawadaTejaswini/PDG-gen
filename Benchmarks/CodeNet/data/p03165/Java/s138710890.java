/*
 *created by Kraken on 27-04-2020 at 18:05
 */
import java.util.*;
import java.io.*;

public class Main {

  public static void main(String[] args) {
    FastReader sc = new FastReader();
    String s = sc.next(), t = sc.next();
    if (s.length() < t.length()) {
      String temp = s;
      s = t;
      t = temp;
    }
    int n = s.length(), m = t.length();
    int[][] dp = new int[n + 1][m + 1];
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        if (s.charAt(i - 1) == t.charAt(j - 1))
          dp[i][j] = dp[i - 1][j - 1] + 1;
        else
          dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
      }
    }
    String sb = "";
    int i = n, j = m;
    while (i > 0 && j > 0) {
      if (dp[i - 1][j - 1] == dp[i][j] - 1 && s.charAt(i - 1) == t.charAt(j - 1)) {
        sb = s.charAt(i - 1) + sb;
        i--; j--;
      } else {
        if (dp[i - 1][j] > dp[i][j - 1]) i--;
        else j--;
      }
    }
    System.out.println(sb);
  }

  static class FastReader {

    BufferedReader br;

    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        }
        catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      }
      catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }
  }
}
