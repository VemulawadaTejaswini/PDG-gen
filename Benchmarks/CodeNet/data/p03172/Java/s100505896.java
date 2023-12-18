import java.util.*;

public class Main {
    public static long solve(int arr[],int n,int k){
        long mod = (long)(10e9 + 7);
        long dp[][] = new long[n+1][k+1];

        for(int j=0;j<=k;j++){
            dp[1][j] = (j > arr[1]) ? 0 : 1;
        }

        for(int i=2;i<=n;i++){
            for(int j=0;j<=k;j++){
                if(j == 0){
                    dp[i][j] = dp[i-1][j];
                }
                else{
                    dp[i][j] = (mod +  dp[i][j-1] + dp[i-1][j] - ( (j-arr[i]-1 >= 0) ? dp[i-1][j-arr[i]-1] : 0 ) )% mod;
                }
            }
        }

        return dp[n][k];
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n+1];
        for(int i=1;i<=n;i++) arr[i] = sc.nextInt();
        System.out.println(solve(arr,n,k));
    }
}