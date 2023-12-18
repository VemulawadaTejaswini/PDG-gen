import java.util.Scanner;

import static java.lang.System.in;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        if(n<2){
            System.out.println(0);
            return;
        }
        long[][] dp = new long[n][n];
        for (int i = n-1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if(i == j)
                    dp[i][j]=0;
                else{
                    long sum = sum(arr,i,j);
                    dp[i][j] = (long)10E18;
                    for (int k = i ; k < j ; k++) {
                        dp[i][j]  = Math.min(dp[i][k] + dp[k+1][j] + sum,dp[i][j]);
                    }
                }
            }
        }

        System.out.println(dp[0][n-1]);
    }
    private static long sum(int[] arr,int i,int k){
        long sum=0;
        for (int j = i; j <= k; j++) {
            sum  +=arr[j];
        }
        return sum;
    }
}