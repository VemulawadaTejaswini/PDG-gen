import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] a = new int[N];
    int min = 1_000_000;
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt();
      min = Math.min(min, a[i]);
    }

    boolean[] dp = new boolean[K + 1];
    for (int i = min; i <= K; i++) for (int j = 0; j < N; j++) if (i >= a[j]) dp[i] |= !dp[i - a[j]];
    System.out.println(dp[K] ? "First" : "Second");
  }
}
