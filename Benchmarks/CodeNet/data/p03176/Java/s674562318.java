import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] h = new int[N];
    int[] a = new int[N];
    for (int i = 0; i < N; i++) h[i] = scanner.nextInt();
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();

    long[] dp = new long[N + 1];
    for (int i = 1; i <= N; i++) dp[i] = -1;
    for (int i = 0; i < N; i++) {
      long max = 0;
      for (int j = 0; j < h[i]; j++) {
        if (dp[j] > max) max = dp[j];
      }
      dp[h[i]] = max + a[i];
    }

    long max = 0;
    for (int i = 0; i <= N; i++) if (dp[i] > max) max = dp[i];
    System.out.println(max);
  }
}
