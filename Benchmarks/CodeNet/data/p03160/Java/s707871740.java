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
    Arrays.fill(dp, 1000000);
    dp[0] = 0;
    dp[1] = Math.abs(h[0]-h[1]);
    
    for (int i = 2; i < h.length; i++) {
      long min1 = dp[i] = dp[i - 1] + Math.abs(h[i] - h[i - 1]);
      long min2 = dp[i] = dp[i - 2] + Math.abs(h[i] - h[i - 2]);
      dp[i] = Math.min(min1, min2);
      }
    System.out.println(dp[n - 1]);

    }
    
  }

