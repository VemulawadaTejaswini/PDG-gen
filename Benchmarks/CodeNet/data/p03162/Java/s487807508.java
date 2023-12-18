import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }


        int[][] dp = new int[n][3];
        int ax = 0, bx = 1, cx = 2;
        dp[0][ax] = Math.max(b[0], c[0]);
        dp[0][bx] = Math.max(a[0], c[0]);
        dp[0][cx] = Math.max(a[0], c[0]);
        
        for (int i = 1; i < n; i++) {
            dp[i][ax] = a[i] + Math.max(dp[i-1][bx], dp[i-1][cx]);
            dp[i][bx] = b[i] + Math.max(dp[i-1][ax], dp[i-1][cx]);
            dp[i][cx] = c[i] + Math.max(dp[i-1][ax], dp[i-1][bx]);
        }
        
        int max = Math.max(dp[n-1][ax], dp[n-1][bx]);
        max = Math.max(max, dp[n-1][cx]);
        System.out.println(max);
    }
}

