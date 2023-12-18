import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        long[/* placed */][/* num */][] dp = new long[2][4][n+1];
        if(n % 2 >= 0) {
            //dp[1][ind(1, 1)][2] = a[1];
            dp[0][0][1] = dp[0][3][1] = dp[1][0][1] = dp[1][3][1] = Long.MIN_VALUE;
            dp[0][1][1] = dp[0][2][1] = dp[1][1][1] = dp[1][2][1] = Long.MIN_VALUE;
            dp[1][ind(0, 1)][1] = a[0];
            dp[0][ind(0, 0)][1] = 0;
            for(int i=1; i<n; i++) {
                int n1 = i / 2;
                int n2 = i / 2 + 1;
                dp[0][0][i] = dp[0][3][i] = dp[1][0][i] = dp[1][3][i] = Long.MIN_VALUE;
                dp[0][ind(i, n1)][i + 1] = Math.max(dp[0][ind(i - 1, n1)][i], dp[1][ind(i - 1, n1)][i]);
                dp[1][ind(i, n1)][i + 1] = dp[0][ind(i - 1, n1 - 1)][i] + a[i];
                dp[0][ind(i, n2)][i + 1] = Math.max(dp[0][ind(i-1, n2)][i], dp[1][ind(i - 1, n2)][i]);
                dp[1][ind(i, n2)][i + 1] = dp[0][ind(i - 1, n2 - 1)][i] + a[i];
            }
        }

        long res = Math.max(dp[0][ind(n-1, n/2)][n], dp[1][ind(n-1, n/2)][n]);

        System.out.println(res);
    }
    static int ind(int i, int num) {
        return (num - (i / 2) + 1);
    }

}