import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] dp = new int[1000000 + 1];
    int[] dp2 = new int[1000000 + 1];
    for (int i = 1; i < dp.length; i++) {
      dp[i] = i;
      dp2[i] = i;
    }
    for (int i = 1; ; i++) {
      int k = (i * (i + 1) * (i + 2)) / 6;
      if (k >= 1000000) {
        break;
      }
      for (int j = 0; j + k < 1000000; j++) {
        dp[j + k] = Math.min(dp[j + k], dp[j] + 1);
      }
      if (k % 2 == 0) {
        for (int j = 0; j + k < 1000000; j++) {
          dp2[j + k] = Math.min(dp2[j + k], dp2[j] + 1);
        }
      }
    }

    while (true) {
      int n = sc.nextInt();
      if (n == 0) {
        break;
      }
      System.out.println(dp[n] + " " + dp2[n]);
    }
  }

  static int calc(int n, int[] lib) {
    int[] dp = new int[n + 1];
    for (int i = 0; i <= n; i++) {
      dp[i] = i;
    }
    for (int i = 1; i < lib.length; i++) {
      int[] dp2 = new int[n + 1];
      int v = lib[i];
      if (lib[i] > n) {
//        System.out.println("--------");
//        for (int o = 0; o < i; ++o) {
//          for (int j = 0; j <= n; ++j) {
//            System.out.printf(" %2d", dp[o][j]);
//          }
//          System.out.println();
//        }

        return dp[n];
      }
      for (int j = 0; j <= n; j++) {
        if (dp[j] == Integer.MAX_VALUE) {
          continue;
        }
        for (int k = 0; j + k * v <= n; k++) {
          dp2[j + k * v] = Math.min(dp2[j + k * v], dp[j] + k);
        }
        dp = dp2.clone();
      }
    }
    return dp[n];
  }
}