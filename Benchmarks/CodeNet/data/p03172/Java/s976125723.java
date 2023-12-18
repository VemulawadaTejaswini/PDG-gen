import java.io.*;
import java.util.*;

class Main {
  static final Scanner in = new Scanner(System.in);
  static int N, K;

  static int[] a;
  static int dp[][];
  static final int MOD = 1000000007;

  public static void main(String[] args) throws Exception {
    N = in.nextInt();
    K = in.nextInt();
    a = new int[N];
    dp = new int[N + 1][K + 1];

    for (int i = 0; i < N; i++){ a[i] = in.nextInt();
    Arrays.fill(dp[i],-1);
  }
  Arrays.fill(dp[N],-1);

    System.out.println(F(N, K));
  }

  static int F(int i, int k) {
    // System.out.println("\tat i == " + i + " k = " + k);
    if (i == 1) {
      // System.out.println("\tat i == 0 k = "+k);
      if (k > a[0]) {
        // System.out.println("\treturning 0");
        return 0;
      }
      // System.out.println("\treturning 1");
      return 1;
    }

    if(dp[i][k] != -1)
      return dp[i][k];


    int val = 0;
    for (int j = 0; j <= a[i - 1]; j++) {
      // System.out.println("\t\tat i == " + i + " k = " + k + " j = " + j);
      if (k < j) break;
      val += F(i - 1, k - j) % MOD;
    }
    // System.out.println("\t\tat i == " + i + " k = " + k + " val = " + val);
    dp[i][k] = val % MOD;;
    return dp[i][k];
  }
}
