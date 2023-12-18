import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] h = new int[N+1];

    for (int i = 1; i < N+1; i++) {
      h[i] = sc.nextInt();
    }

    sc.close();

    int[] dp = new int[N+1];

    Arrays.fill(dp, Integer.MAX_VALUE);

    dp[0] = 0;
    dp[1] = 0;
    dp[2] = Math.abs(h[2] - h[1]);

    for (int i = 3; i < N+1; i++) {
      for (int j = 1; j <= K && 1 <= i - j; j++) {
        dp[i] = Math.min(dp[i], dp[i-j] + Math.abs(h[i]-h[i-j]));
      }
    }

    System.out.println(dp[N]);

  }

}