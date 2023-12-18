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
    int i, j;
    i = 0;
    for (char si : s.toCharArray()) {
      i ++;
      j = 0;
      for (char ti : t.toCharArray()) {
        j ++;
        if (si == ti) {
          dp[i + 1][j + 1] = dp[i][j] + si;
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
