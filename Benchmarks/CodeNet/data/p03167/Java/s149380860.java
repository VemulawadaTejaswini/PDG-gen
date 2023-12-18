import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int H = Integer.parseInt(input[0]);
        int W = Integer.parseInt(input[1]);

        int dp[][] = new int[H + 1][W + 1];
        input = br.readLine().split("");

        for (int i = 0; i < W; i++) {
            if (input[i].equals("."))
                dp[1][i + 1] = 1;
            else break;
        }
        for (int i = 2; i <= H; i++) {
            input = br.readLine().split("");
            for (int j = 1; j <= W; j++) {
                if (input[j - 1].equals(".")) {
                    long x = dp[i - 1][j] + dp[i][j - 1];
                    x %= 1000000007;
                    dp[i][j] = (int)x;
                }
            }
        }
        System.out.println(dp[H][W]);
    }
}