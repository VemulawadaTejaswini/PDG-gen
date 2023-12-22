import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] in = br.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int w = Integer.parseInt(in[1]);
        int[] vi = new int[n];
        int[] wi = new int[n];
        for(int i = 0; i < n; i++) {
            in = br.readLine().split(" ");
            vi[i] = Integer.parseInt(in[0]);
            wi[i] = Integer.parseInt(in[1]);
        }

        int[][] dp = new int[n + 1][w + 1];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= w; j++) {
                if(j >= wi[i]) dp[i + 1][j] = Math.max(dp[i][j], dp[i + 1][j - wi[i]] + vi[i]);
                else dp[i + 1][j] = dp[i][j];
            }
        }

        System.out.println(dp[n][w]);

        br.close();
    }
}
