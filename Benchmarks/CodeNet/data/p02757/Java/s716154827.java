import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int P = scanner.nextInt();
    char[] S = scanner.next().toCharArray();
    long[][] dp = new long[N + 1][P];
    for (int i = 0; i < N; i++) {
      int a = S[i] - '0';
      dp[i + 1][a % P] = 1;
      for (int j = 0; j < P; j++) {
        int k = (10 * j + a) % P;
        dp[i + 1][k] += dp[i][j];
      }
    }
    long res = 0;
    for (int i = 1; i <= N; i++) res += dp[i][0];
    System.out.println(res);
  }
}
