import java.io.*;

public class Main {
    static final int MAX_GRAM = 5001;
    static final int MAX_SHOP = 3;
    static final int INF = 10000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br
        = new BufferedReader(new InputStreamReader(System.in));

        int[] gram = {200, 300, 500};
        int[] price = {380, 550, 850};
        double[] disc = {0.8, 0.85, 0.88};
        int[][] dp = new int[MAX_SHOP][MAX_GRAM];
        for (int i = 0; i < MAX_SHOP; i++) {
            for (int j = 0; j < MAX_GRAM; j++) {
                dp[i][j] = INF;
            }
        }
        
        dp[0][0] = dp[1][0] = dp[2][0] = 0;
        for (int j = 1; j <= 5000 / 200; j++) {
            int mod = j % 5;
            dp[0][200 * j] = (int)((380 * (j - mod)) * 0.8 + 380 * mod);
        }

        for (int j = 1; j <= 5000 / 300; j++) {
            int mod = j % 4;
            dp[1][300 * j] = (int)((550 * (j - mod)) * 0.85 + 550 * mod);
        }

        for (int j = 1; j < 5000 / 500; j++) {
            int mod = j % 3;
            dp[2][500 * j] = (int)((850 * (j - mod)) * 0.88 + 850 * mod);
        }

        for (int i = 0; i < MAX_SHOP; i++) {
            for (int j = 200; j <= MAX_GRAM; j += 100) {
                for (int k = 1; (k * gram[i]) <= j; k++) {
                    int diff = j - (k * gram[i]);
                    dp[2][j] = Math.min(dp[2][j], dp[2][diff] + dp[i][k * gram[i]]);
                }
            }
        }

        String line;
        while (true) {
            line = br.readLine();
            int g = Integer.parseInt(line);
            if (g == 0) break;
            System.out.println(dp[2][g]);
        }
    }
}