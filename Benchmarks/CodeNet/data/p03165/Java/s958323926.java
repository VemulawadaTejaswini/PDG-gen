import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    String a = in.next();
    String b = in.next();
    System.out.println(new Solver().solve(a, b));
  }
}

class Solver {
  public String solve(String a, String b) {
    int m = a.length();
    int n = b.length();
    int[][] dp = new int[3100][3100];
    int[][] res = new int[3100][3100];
    for (int i = 0; i <= 3099; ++i) {
      for (int j = 0; j <= 3099; ++j) {
        dp[i][j] = -3100;
      }
    }
    dp[0][0] = 0;
    for (int i = 0; i <= m; ++i) {
      for (int j = 0; j <= n; ++j) {
        if (i + 1 <= m) {
          if (dp[i + 1][j] < dp[i][j]) {
            dp[i + 1][j] = dp[i][j];
            res[i + 1][j] = 0;
          }
        }
        if (j + 1 <= m) {
          if (dp[i][j + 1] < dp[i][j]) {
            dp[i][j + 1] = dp[i][j];
            res[i][j + 1] = 1;
          }
        }
        if (i + 1 <= m && j + 1 <= n && a.charAt(i) == b.charAt(j)) {
          if (dp[i + 1][j + 1] < dp[i][j] + 1) {
            dp[i + 1][j + 1] = dp[i][j] + 1;
            res[i + 1][j + 1] = 2;
          }
        }
      }
    }
    int na = m;
    int nb = n;
    StringBuilder sb = new StringBuilder();
    while (na > 0 && nb > 0) {
      if (res[na][nb] == 2) {
        na--;
        nb--;
        sb.append(a.charAt(na));
      } else if (res[na][nb] == 1) {
        nb--;
      } else {
        na--;
      }
    }
    return sb.reverse().toString();
  }
}
