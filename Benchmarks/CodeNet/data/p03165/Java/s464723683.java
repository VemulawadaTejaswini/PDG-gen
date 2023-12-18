import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    String t = scanner.next();
    int sn = s.length();
    int tn = t.length();
    String[][] dp = new String[sn + 1][tn + 1];
    for (int i = 0; i < sn + 1; i++) {
      dp[i][0] = "";
    }
    for (int i = 0; i < tn + 1; i++) {
      dp[0][i] = "";
    }
    for (int i = 0; i < sn; i++) {
      for (int j = 0; j < tn; j++) {
        if (s.charAt(i) == t.charAt(j)) {
          dp[i + 1][j + 1] = dp[i][j] + s.charAt(i);
        } else {
          if (dp[i][j + 1].length() > dp[i + 1][j].length()) {
            dp[i + 1][j + 1] = dp[i][j + 1];
          } else {
            dp[i + 1][j + 1] = dp[i + 1][j];
          }
        }
      }
    }
    System.out.println(dp[sn][tn]);
  }
}
