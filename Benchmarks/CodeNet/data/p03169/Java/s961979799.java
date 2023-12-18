import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        double[][][] dp = new double[301][301][301];
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] count = new int[4];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            count[arr[i]]++;
        }
        System.out.println( solve(count[1],count[2],count[3],n,dp) );
    }
    private static double solve(int a,int b,int c,int n,double[][][] dp){
        if(a==0 && b==0 && c==0) return 0;
        if(a<0 || b<0 || c<0) return 0;
        if(dp[a][b][c]>0) return dp[a][b][c];
        double remaining = (a+b+c);
        double expVal = n + a*solve(a-1,b,c,n,dp) + b*solve(a+1,b-1,c,n,dp) + c*solve(a,b+1,c-1,n,dp);
        return dp[a][b][c] = expVal/remaining;
    }
}
