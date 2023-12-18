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
        long[][] dp = new long[n][n];
        long s = sum(arr,0,n-1,dp);

        System.out.println(s);
    }
    private static long sum(int[] arr, int i, int j, long[][] dp){
        if(i>j) return 0;
        if(i==j) return arr[i];
        if(dp[i][j]!=0) return  dp[i][j];
        return dp[i][j] = Math.max(arr[i]-sum(arr,i+1,j,dp ),arr[j]-sum(arr,i,j-1,dp ));
    }
}