import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nw = br.readLine().split(" ");
        
        int N = Integer.parseInt(nw[0]);
        int W = Integer.parseInt(nw[1]);
        
        int[][] weight = new int[N][2];
        
        for(int i=0; i<N; i++) {
            String[] input = br.readLine().split(" ");
            weight[i][0] = Integer.parseInt(input[0]);
            weight[i][1] = Integer.parseInt(input[1]);
        }
        
        System.out.println(getMaxValue(weight, W));
    }

    private static long getMaxValue(int[][] weight, int W) {
        long[][] dp = new long[weight.length + 1][W+1];
        
        for(int i=1; i<=weight.length; i++) {
            for(int j=1; j<=W; j++) {
                dp[i][j] = dp[i-1][j];
                
                if(weight[i-1][0] <= j) {
                    dp[i][j] = Math.max(dp[i][j], weight[i-1][1] + dp[i-1][j-weight[i-1][0]]);
                }
            }
        }
        
        return dp[weight.length][W];
    }
}
