import java.util.Arrays;
import java.util.Scanner;

/**
 * @author author
 *
 */
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());

    long[] h = new long[n];
    for (int i = 0; i < n; i++) {
      h[i] = Long.parseLong(sc.next());
    }

    long[] dp = new long[n];
    Arrays.fill(dp, 100000000);
    dp[0] = 0;
    
    for (int i = 1; i < h.length; i++) {
      dp[i] = Math.min(dp[i], dp[i - 1] + Math.abs(h[i] - h[i - 1]));
      if (i > 1) {
        dp[i] = Math.min(dp[i], dp[i - 2] + Math.abs(h[i] - h[i - 2]));
      }
    }
    System.out.println(dp[n - 1]);
    
  }



}
