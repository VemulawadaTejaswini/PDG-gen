import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] argv) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int W = Integer.parseInt(str[1]);

        int[] v = new int[n];
        int[] w = new int[n];
        int sumOfV = 0;
        for (int i = 0; i < n; i++) {
            str = br.readLine().split(" ");
            v[i] = Integer.parseInt(str[0]);
            w[i] = Integer.parseInt(str[1]);
            sumOfV += v[i];
        }


        int[][] dp = new int[n+1][sumOfV+1];
        dp[n][0] = 0;
        for(int i=1; i<=sumOfV; i++) dp[n][i] = Integer.MAX_VALUE/2;

        for(int i=n-1; i>=0; i--){
            for(int j=0; j<=sumOfV; j++){
                if(v[i] > j){
                    dp[i][j] = dp[i+1][j];
                } else {
                    dp[i][j] = Integer.min(dp[i+1][j], dp[i+1][j-v[i]] + w[i]);
                }
            }
        }
        int ans = sumOfV;
        while(dp[0][ans] > W) ans--;
        System.out.println(ans);
    }

}