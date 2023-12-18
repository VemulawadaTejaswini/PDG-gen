import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    String a = in.next();
    String b = in.next();
    System.out.println(new Solver().solve(a, b, a.length(), b.length()));
  }
}

class Solver {
  public int max(int a, int b) {
    return a > b ? a : b;
  }

  public String solve(String a, String b, int m, int n) {
    int[][] dp = new int[m + 1][n + 1];
    for (int i = 0; i <= m; ++i) {
      for (int j = 0; j <= n; ++j) {
        if (i == 0 || j == 0) {
          dp[i][j] = 0;
        } else if (a.charAt(i - 1) == b.charAt(j - 1)) {
          dp[i][j] = 1 + dp[i - 1][j - 1];
        } else {
          dp[i][j] = max(dp[i-1][j], dp[i][j-1]);
        }
//        System.out.print(dp[i][j] + " ");
      }
//      System.out.println();
    }
    int curr_max = dp[m][n] + 1;
    int[] idx = new int[dp[m][n]];
    for (int i = m; i > 0; --i) {
      boolean flag = true;
      for (int j = n; j > 0; --j) {
        if (dp[i][j] > dp[i - 1][j]
            && dp[i][j] > dp[i][j - 1]
            && curr_max != dp[i][j] && flag) {
          curr_max = dp[i][j];
          idx[curr_max - 1] = i - 1;
          flag = false;
        }
      }
    }
    StringBuilder answer = new StringBuilder();
    for (int i = 0; i < idx.length; ++i) {
      answer.append(a.charAt(idx[i]));
    }
    return answer.toString();
  }
}
