import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        int[] coin = new int[m];
        str = br.readLine().split(" ");
        for (int i = 0; i < m; i++) coin[i] = Integer.parseInt(str[i]);
        Arrays.sort(coin);

        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE - 1);
        dp[0] = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < m; j++) {
                if (i - coin[j] < 0) break;

                dp[i] = Integer.min(dp[i], dp[i-coin[j]] + 1);
            }
        }
        System.out.println(dp[n]);

    }
}