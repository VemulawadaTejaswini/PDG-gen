import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long[][] dp=new long[n][11];
        dp[0][0]=dp[0][6]=dp[0][7]=dp[0][9]=1;
        long mod=1000000007;
        for(int i=1;i<n;i++){
            dp[i][0]=(dp[i-1][0]+dp[i-1][1]+dp[i-1][4]+dp[i-1][5]+dp[i-1][6]+dp[i-1][8]+dp[i-1][9])%mod;
            dp[i][1]=(dp[i-1][0]+dp[i-1][8])%mod;
            dp[i][2]=(dp[i-1][1])%mod;
            dp[i][3]=(dp[i-1][0]+dp[i-1][8])%mod;
            dp[i][4]=(dp[i-1][3])%mod;
            dp[i][5]=(dp[i-1][0])%mod;
            dp[i][6]=(dp[i-1][5]+dp[i-1][6]+dp[i-1][7]+dp[i-1][9]+dp[i-1][10])%mod;
            dp[i][7]=(dp[i-1][2]+dp[i-1][4]+dp[i-1][6]+dp[i-1][7]+dp[i-1][9]+dp[i-1][10])%mod;
            dp[i][8]=(dp[i-1][2]+dp[i-1][3]+dp[i-1][7]+dp[i-1][10])%mod;
            dp[i][9]=(dp[i-1][2]+dp[i-1][3]+dp[i-1][5]+dp[i-1][6]+dp[i-1][7]+dp[i-1][8]+dp[i-1][9])%mod;
            dp[i][10]=(dp[i-1][3])%mod;
        }
        long output=0;
        for(long a:dp[n-1]){
            output+=a;
        }
        System.out.println(output%mod);
    }
}