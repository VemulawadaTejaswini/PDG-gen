import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long M = 1_000_000_007;
    int N = scanner.nextInt();
    int[][] a = new int[N + 1][N];
    for (int i = 1; i <= N; i++) for (int j = 0; j < N; j++) a[i][j] = scanner.nextInt();

    long[] dp = new long[1 << N];
    dp[0] = 1;

    for (int i = 1; i < 1 << N; i++) {
      int j = countOnes(i);

      for (int k = 0; k < N; k++) {
        if ((i & (1 << k)) != 0) {
          dp[i] += dp[i ^ (1 << k)] * a[j][k];
          if (dp[i] > M) dp[i] -= M;
        }
      }
    }
    System.out.println(dp[(1 << N) - 1]);
  }

  public static int countOnes(int num) {
    num = num - ((num >> 1) & 0x55555555);
    num = (num & 0x33333333) + ((num >> 2) & 0x33333333);
    num = (num + (num >> 4)) & 0x0F0F0F0F;
    num = num + (num >> 8);
    num = num + (num >> 16);
    return num & 0x0000003F;
  }
}
