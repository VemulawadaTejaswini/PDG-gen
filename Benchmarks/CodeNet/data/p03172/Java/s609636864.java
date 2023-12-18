import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        // number of candies left, till i th child
        int[][] dp = new int[n][k+1];
        int[][] sum = new int[n][k+1];

        int total = 0;
        for(int i = 0; i < k+1; i++){
            if(i <= a[0])
                dp[0][i] = 1;
            total += dp[0][i];
            sum[0][i] = total;
        }

        long mod = 1000000007;

        for(int i = 1; i < n; i++){
            for(int j = 0; j < k+1; j++){
                dp[i][j] = sum[i-1][j] - ((j-a[i]-1 < 0) ? 0 : sum[i-1][j-a[i]-1]);
                dp[i][j] %= mod;
                sum[i][j] += ((j-1 < 0) ? 0 : sum[i][j-1])+dp[i][j];
                sum[i][j] %= mod;
            }
        }

        System.out.println(dp[n-1][k]%mod);
    }
}
