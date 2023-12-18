import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().trim().split("\\s+");
        int n = Integer.parseInt(s[0]);
        int w = Integer.parseInt(s[1]);
        int[][] arr = new int[n][2];
        for(int i = 0 ; i<n ; i++) {
            s = br.readLine().trim().split("\\s+");
            arr[i][0] = Integer.parseInt(s[0]);
            arr[i][1] = Integer.parseInt(s[1]);
        }

        long[][] dp = new long[n+1][w+1];

        for(int i=0 ; i<=n ; i++)
            dp[i][0] = 0;

        for(int i=0 ; i<=w ; i++)
            dp[0][i] = 0;

        for(int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=w ; j++)
            {
                dp[i][j] = dp[i-1][j];
                if(arr[i-1][0] <= j)
                    dp[i][j] = Math.max(dp[i][j], arr[i-1][1] + dp[i-1][j-arr[i-1][0]]);
            }
        }

        System.out.println(dp[n][w]);
    }
}