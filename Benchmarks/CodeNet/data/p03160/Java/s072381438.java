import java.util.*;
public class Main{
    static long[][] dp = new long[1000000][3];
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long[][] a = new long[1000000][3];
        int n = sc.nextInt();
        for(int i=0; i<n; i++)
        for(int j=0; j<3; j++) a[i][j] = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                for(int k=0; k<3; k++){
                    if(j==k) continue;
                    dp[i+1][k] = Math.max(dp[i][j]+a[i][k],dp[i+1][k]);
                }
            }
        }
        long ans = 0;
        for(int j = 0; j<3; j++) ans = Math.max(ans,dp[n][j]);
        System.out.println(ans);
    }
    
}
