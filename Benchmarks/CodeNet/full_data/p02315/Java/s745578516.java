import java.util.Scanner;
public class NapSak{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int W= sc.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];
        for(int i = 0;i < n;i++){
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }
        int[][] dp = new int[n+1][W+1];
        for(int i = 0;i <= W;i++){
            dp[0][i] = 0;
        }
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= W;j++){
                if(j - w[i-1] >= 0){
                    dp[i][j] = Math.max(dp[i-1][j-w[i-1]] + v[i-1],dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][W]);
    }
}

