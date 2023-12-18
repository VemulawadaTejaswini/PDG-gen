
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
    int k = Integer.parseInt(sc.next());

    long[] h = new long[n];
    for (int i = 0; i < n; i++) {
      h[i] = Long.parseLong(sc.next());
    }
    long[] dp = new long[n];
    Arrays.fill(dp, 10010);
    dp[0] = 0;
    

    for (int i = 1; i < n; i++) {
      for (int j = 1; j <= k; j++) {
        if (i >= j) {
          dp[i] = Math.min(dp[i], dp[i - j] + Math.abs(h[i] - h[i - j]));
        }
      }
      }
    System.out.println(dp[n - 1]);
  }

}
