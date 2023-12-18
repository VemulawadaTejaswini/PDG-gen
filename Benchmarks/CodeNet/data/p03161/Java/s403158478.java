import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int n = in.nextInt();
    int k = in.nextInt();
    int[] h = new int[n];
    for (int i = 0; i < n; i++) {
      h[i] = in.nextInt();
    }
    final Solver solve = new Solver();
    System.out.println(solve.solve(h, k));
  }
}

class Solver {
  public int solve(int[] h, int k) {
    int n = h.length;
    int[] dp = new int[n + 1];
    dp[1] = 0;
    for (int i = 2; i <= n; i++) {
      dp[i] = Integer.MAX_VALUE;
      for (int j = i - 1; j >= 1 && j >= i-k; j--) {
        dp[i] = Math.min(Math.abs(h[i - 1] - h[j - 1]) + dp[j], dp[i]);
      }
    }
    return dp[n];
  }
}
