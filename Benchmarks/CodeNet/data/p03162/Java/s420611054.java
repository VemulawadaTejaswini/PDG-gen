import java.util.*;
import java.lang.*;


public class Main {
    static int n;
    static int[] a;
    static int[] b;
    static int[] c;
    static int[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n + 1];
        b = new int[n + 1];
        c = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        dp = new int[3][n + 1];
        dp[0][1] = a[1];
        dp[1][1] = b[1];
        dp[2][1] = c[1];
        natsu(1);
        System.out.println(Math.max(dp[0][n], Math.max(dp[1][n], dp[2][n])));
    }
    static void natsu(int l) {
        if (l == n) {
            return;
        }
        dp[0][l + 1] = Math.max(dp[1][l], dp[2][l]) + a[l + 1];
        dp[1][l + 1] = Math.max(dp[0][l], dp[2][l]) + b[l + 1];
        dp[2][l + 1] = Math.max(dp[0][l], dp[1][l]) + c[l + 1];
        natsu(l + 1);
    }
}