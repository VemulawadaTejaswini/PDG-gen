import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int k = s.nextInt();
    int[] h = new int[n];
    for (int i=0;i<n;i++) {
      h[i] = s.nextInt();
    }
    int[] dp = new int[n];
    Arrays.fill(dp, 1000000000+5);
    dp[0] = 0;
    for (int i=0;i<n;i++) {
      for (int j=i+1; j<i+k+1; j++) {
        if (j<n) {
          dp[j] = Math.min(dp[j], dp[i]+Math.abs(h[i]-h[j]));
        }
      }
    }
    System.out.println(dp[n-1]);
  }
}
