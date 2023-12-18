import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException, NumberFormatException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[][] arr = new int[n][3];
        String[] s;
        for(int i=0 ; i <n ; i++)
        {
            s = br.readLine().trim().split("\\s+");
            for(int j=0 ; j<3 ; j++)
                arr[i][j] = Integer.parseInt(s[j]);
        }

        int[][] dp = new int[n][3];
        for(int i=0 ; i<3 ; i++)
            dp[0][i] = arr[0][i];

        for(int i=1 ; i<n ; i++)
        {
            for(int j=0 ; j<3 ; j++)
            {
                int x = (j+1) % 3;
                int y = (j+2) % 3;

                dp[i][j] = arr[i][j] + Math.max(dp[i-1][x], dp[i-1][y]);
            }
        }

        int ans = Math.max(dp[n-1][0], Math.max(dp[n-1][1], dp[n-1][2]));

        System.out.println(ans);
    }
}
