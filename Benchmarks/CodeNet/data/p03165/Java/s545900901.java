import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    String a = in.next();
    String b = in.next();
    //    Random random = new Random();
    //    int count = 0;
    //    while (true) {
    //      int maxStringLength = random.nextInt(10) + 1;
    //      StringBuilder A = new StringBuilder();
    //      StringBuilder B = new StringBuilder();
    //      for (int i = 0; i < maxStringLength; ++i) {
    //        char c = (char)(random.nextInt(6) + 97);
    //        A.append(c);
    //        B.append(c);
    //      }
    //      maxStringLength = random.nextInt(10) + 1;
    //      for (int i = 0; i < maxStringLength; ++i) {
    //        char c = (char)(random.nextInt(26) + 97);
    //        B.append(c);
    //      }
    //      String a = A.toString();
    //      String b = B.toString();
    //      String outDP = new Solver().solveDP(a, b, a.length(), b.length());
    //      String outR = new Solver().solve(a, b, a.length(), b.length()).reverse().toString();
    //      int x = outDP.length();
    //      int y = outDP.length();
    //      if (x == y) {
    //        count = count+1;
    //      }
    //      else {
    //        System.out.println(a);
    //        System.out.println(b);
    //        System.out.println(outR);
    //        System.out.println(outDP);
    //        break;
    //      }
    ////      if (count % 10 == 0)
    //      System.out.println(count);
    //    }
    //    System.out.println(new Solver().solve(a, b, a.length(), b.length()).reverse());
    System.out.println(new Solver().solve(a, b, a.length(), b.length()));
  }
}

class Solver {
  public int max(int a, int b) {
    return a > b ? a : b;
  }

  public String solve(String a, String b, int m, int n) {
    int[][] dp = new int[m + 1][n + 1];
    int[][] res = new int[m + 1][n + 1];
    for (int i = 0; i <= m; ++i) {
      for (int j = 0; j <= n; ++j) {
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
    int at = dp[m][n] - 1;
    StringBuilder sb = new StringBuilder();
    while (na > 0 || nb > 0) {
      if (res[na][nb] == 2) {
        na--;
        nb--;
        sb.append(a.charAt(na));
      } else if (res[na][nb] == 0) {
        na--;
      } else {
        nb--;
      }
    }
    return sb.reverse().toString();
  }
  // recursive method to return StringBuilder containing LCS, reverse returned StringBuilder in main
  // method before printing answer
  public StringBuilder solveRecursive(String a, String b, int m, int n) {
    StringBuilder ans = new StringBuilder();
    if (m == 0 || n == 0) {
      return ans;
    } else if (a.charAt(m - 1) == b.charAt(n - 1)) {
      return ans.append(a.charAt(m - 1)).append(solveRecursive(a, b, m - 1, n - 1));
    } else {
      StringBuilder temp1 = solveRecursive(a, b, m, n - 1);
      StringBuilder temp2 = solveRecursive(a, b, m - 1, n);
      if (temp1.length() > temp2.length()) {
        return temp1;
      } else {
        return temp2;
      }
    }
  }
}
