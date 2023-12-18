
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int n;
    static int x;
    static int[][] dp;
    static int[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[0][i] = a[i];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = Math.min(dp[i-1][(n+j-1)%n], dp[i-1][j]);
            }
        }

        int ret = (int) 1e9;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += dp[i][j];
            }
            ret = Math.min(ret, sum+x*i);
        }

        System.out.println(ret);
    }
}
