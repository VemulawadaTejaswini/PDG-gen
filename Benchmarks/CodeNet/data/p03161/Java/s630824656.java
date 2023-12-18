
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

    int[] h = new int[n];
    for (int i = 0; i < n; i++) {
      h[i] = Integer.parseInt(sc.next());
    }
    int[] dp = new int[n];
    Arrays.fill(dp, 10010);
    dp[0] = 0;
    dp[1] = Math.abs(h[0] - h[1]);
    

    for (int i = 2; i < n; i++) {
      int min = dp[i - 1] + Math.abs(h[i] - h[i - 1]);
      for (int j = 2; j <= k; j++) {
        if (i >= j) {
          min = Math.min(min, dp[i - j] + Math.abs(h[i] - h[i - j]));
        }
       }
      dp[i] = min;
     }
    System.out.println(dp[n - 1]);
  }

}
