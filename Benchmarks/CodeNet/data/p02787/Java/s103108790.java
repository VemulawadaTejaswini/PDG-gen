
import static java.lang.Math.max;
import static java.lang.Math.min;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int h = scanner.nextInt();
    final int n = scanner.nextInt();
    final int[] a = new int[n];
    final int[] b = new int[n];
    int max = 0;

    for (int i = 0; i < n; i++) {
      a[i] = scanner.nextInt();
      b[i] = scanner.nextInt();
      max = max(max, a[i]);
    }

    final int[][] dp = new int[n][h+max];

    dp[0][0] = b[0];
    for (int i = 1; i < h+max; i++) {
      dp[0][i] = b[0] * (int) Math.ceil((double) i /(double) a[0]);
    }
    for (int i = 1; i < n; i++) {
      for (int j = 0; j < h+max ; j++) {
        if(j >= a[i]) {
          dp[i][j] = min(dp[i][j-a[i]] + b[i] , dp[i-1][j]);
        } else {
          dp[i][j] = min(dp[i-1][j], b[i]);
        }
      }
    }

    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      min = min(min, dp[i][h]);
    }
    System.out.println(min);

  }
}
