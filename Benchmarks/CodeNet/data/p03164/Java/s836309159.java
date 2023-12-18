import java.util.*;
import java.io.*;

class Main {


  

  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int N = in.nextInt();
    int W = in.nextInt();
    int[] w = new int[N];
    int[] v = new int[N];
    int sum = 0;
    for (int i = 0; i < N; i++) {
      w[i] = in.nextInt();
      v[i] = in.nextInt();
      sum += v[i];
    }

    long INF = (long) 10e15;

    // dp[i]: the min weight for a knapsack with tt value of i
    long[] dp = new long[sum + 1];
    Arrays.fill(dp, INF);
    dp[0] = 0;
    for (int i = 0; i < N; i++) {
      for (int value = sum; value >= v[i]; value--) {
        dp[value] = Math.min(dp[value], dp[value - v[i]] + w[i]);
      }
    }

    for (int i = sum; i > -1; i--) {
      if (dp[i] <= W) {
        System.out.println(i);
        break;
      }
    }
  }

}