
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String t = sc.nextLine();
    String z = solve(s, t);
    System.out.println(z);
  }

  private static String solve(String s, String t) {
    int[][] dp = new int[s.length()][t.length()];
    dp[0][0] = s.charAt(0) == t.charAt(0) ? 1 : 0;
    for (int i = 1; i < t.length(); i++) {
      if (s.charAt(0) == t.charAt(i)) {
        dp[0][i] = 1;
      } else {
        dp[0][i] = dp[0][i - 1];
      }
    }

    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == t.charAt(0)) {
        dp[i][0] = 1;
      } else {
        dp[i][0] = dp[i - 1][0];
      }
    }

    for (int i = 1; i < s.length(); i++) {
      for (int j = 1; j < t.length(); j++) {
        if (s.charAt(i) == t.charAt(j)) {
          dp[i][j] = dp[i - 1][j - 1] + 1;
        } else {
          dp[i][j] = Math.max(Math.max(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
        }
      }
    }

    StringBuilder ans = new StringBuilder();
    int i = s.length() - 1;
    int j = t.length() - 1;
    for (; j >= 1 && i >= 1; ) {
      if (dp[i][j] == dp[i - 1][j]) {
        i--;
      } else if (dp[i][j] == dp[i][j - 1]) {
        j--;
      } else {
        ans.insert(0, t.charAt(j));
        i--;
        j--;
      }
    }

    while (i > 0) {
      if (dp[i][j] == dp[i - 1][j]) {
        i--;
      } else {
        ans.insert(0, s.charAt(i));
        break;
      }
    }
    while (j > 0) {
      if (dp[i][j] == dp[i][j - 1]) {
        j--;
      } else {
        ans.insert(0, t.charAt(j));
        break;
      }
    }
    if(s.charAt(0)==t.charAt(0)){
      ans.insert(0, t.charAt(0));
    }
    return ans.toString();
  }
}
