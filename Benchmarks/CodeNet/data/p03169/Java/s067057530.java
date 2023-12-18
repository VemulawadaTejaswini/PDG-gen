import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int goal = 0;
    for (int i = 0; i < N; i++) goal += pow(N + 1, scanner.nextInt() - 1);

    double[] dp = new double[goal + 1];
    for (int i = 1; i <= goal; i++) {
      int s = i % (N + 1);
      int t = i / (N + 1) % (N + 1);
      int u = i / (N + 1) / (N + 1);
      int g = s + t + u;
      dp[i] = (double) N / g;
      if (s > 0) dp[i] += dp[i - 1] * s / g;
      if (t > 0) dp[i] += dp[i - N] * t / g;
      if (u > 0) dp[i] += dp[i - N * N - N] * u / g;
    }
    System.out.println(dp[goal]);
  }

  private static int pow(int a, int b) {
    int res = 1;
    while (b > 0) {
      res *= a;
      b--;
    }
    return res;
  }
}
