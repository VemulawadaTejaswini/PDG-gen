import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    String S = sc.next();
    String T = sc.next();
    int[][] dp = new int[S.length() + 1][T.length() + 1];
    for (int i = 1; i <= S.length(); i++) {
      for (int j = 1; j <= T.length(); j++) {
		if (S.charAt(i - 1) == T.charAt(j - 1)) {
          dp[i][j] = dp[i - 1][j - 1] + 1;
        } else {
          dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
        }
      }
    }
    int length = dp[S.length()][T.length()];
    char[] ans = new char[length];
    for (int i = S.length(), j = T.length(), k = length - 1; i > 0 && j > 0;) {
      if (S.charAt(i - 1) == T.charAt(j - 1)) {
        ans[k--] = S[i - 1];
        i--;
        j--;
      } else if (dp[i - 1][j] > dp[i][j - 1]) {
        i--;
      } else {
        j--;
      }
    }
    for (int i = 0; i < length; i++) System.out.print(ans[i]);
    System.out.println();
  }
}