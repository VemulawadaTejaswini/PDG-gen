import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    char[] s = scanner.next().toCharArray();

    int max = 0;
    int[][] dp = new int[N + 1][N + 1];
    for (int j = N - 1; j > 0; j--) {
      for (int i = j - 1; i >= 0; i--) {
        dp[i][j] = s[i] == s[j] ? dp[i + 1][j + 1] + 1 : 0;
        max = Math.max(max, Math.min(dp[i][j], j - i));
      }
    }
    System.out.println(max);
  }
}
