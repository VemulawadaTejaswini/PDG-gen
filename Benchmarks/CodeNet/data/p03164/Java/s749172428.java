import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int n = in.nextInt();
    int W = in.nextInt();
    int[] w = new int[n];
    int[] v = new int[n];
    for (int i = 0; i < n; i++) {
      w[i] = in.nextInt();
      v[i] = in.nextInt();
    }
    final Solver solve = new Solver();
    System.out.println(solve.solve(W, w, v));
  }
}


class Solver {
  public long solve(int W, int[] w, int[] v) {
    int n = w.length;
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += v[i];
    }
    long[] dp = new long[sum+1];
    Arrays.fill(dp, n * 1000 + 1);
    dp[0] = 0;
    for (int i = 0; i < n; i++) {
      for (int j = sum; j >= v[i]; j--) {
        dp[j] = Math.min(dp[j], dp[j-v[i]]+w[i]);
      }
    }
    long answer = 0;
    for (int i = 0; i < dp.length; i++) {
      if (dp[i] <= W) {
        answer = Math.max(answer, i);
      }
    }
    return answer;
  }
}
