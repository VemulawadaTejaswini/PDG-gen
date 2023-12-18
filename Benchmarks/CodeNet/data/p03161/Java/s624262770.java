import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] h = new int[N];
    for (int i = 0; i < N; i++) h[i] = scanner.nextInt();

    int[] dp = new int[N];
    for (int i = 1; i < N; i++) {
      dp[i] = Integer.MAX_VALUE;
      for (int j = 1; j <= K && j <= i; j++) {
        dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(h[i] - h[i - j]));
      }
    }
    System.out.println(dp[N - 1]);
  }
}
