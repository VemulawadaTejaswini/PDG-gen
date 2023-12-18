import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int dp[] = new int[3];
    for (int day = 1; day <= n; day++) {
      int new_dp[] = new int[3];
      int[] c = new int[3];
      for (int i = 0; i < 3; i++)
        c[i] = sc.nextInt();
      Arrays.fill(new_dp, 0);
      for (int i = 0; i < 3; ++i)
        for (int j = 0; j < 3; ++j) {
          if (i != j) {
            new_dp[i] = Math.max(new_dp[i], dp[j] + c[i]);
          }
        }
      for (int i = 0; i < 3; i++)
      dp[i] = new_dp[i];
    }
    System.out.println(Math.max(dp[0],Math.max(dp[1],dp[2])));
  }
}