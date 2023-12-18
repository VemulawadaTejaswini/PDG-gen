import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[4];
        int sum = 0;
        for(int i = 0 ; i < n ; ++i){
            int x = scanner.nextInt();
            sum+=x;
            arr[x]++;
        }
        double[][][] dp = new double[n+1][n+1][n+1];
        for(int k=0 ; k<=n ;++k){
                for(int j = 0 ; j <=n  ; ++j){
                    for(int i =0 ; i<=n ;++i){
                        if(i!=0||j!=0||k!=0){
                        int temp = 0;
                        if(i>0 && dp[k][j][i-1]!=0) temp++;
                        if(j<n && k>0 && dp[k-1][j+1][i]!=0) temp++;
                        if(i<n && j>0 && dp[k][j-1][i+1]!=0) temp++;
                        if(temp!=0)
                            dp[k][j][i] /= temp;
                        dp[k][j][i] += (double) n/(i+j+k);
                        if(i<n) dp[k][j][i+1] += dp[k][j][i];
                        if(k<n && j>0) dp[k+1][j-1][i] += dp[k][j][i];
                        if(i>0 && j<n)dp[k][j+1][i-1] += dp[k][j][i];
                    }
                }
            }
        }
        System.out.println(dp[arr[3]][arr[2]][arr[1]]);
    }
}