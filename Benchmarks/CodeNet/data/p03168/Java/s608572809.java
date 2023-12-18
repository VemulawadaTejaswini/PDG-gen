import java.io.*;
public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        double[][] dp = new double[N + 1][N + 1];
        dp[0][0] = 1;

        String[] s = in.readLine().split(" ");

        for (int i = 1; i <= N; i++) {
            double p = Double.parseDouble(s[i - 1]);
            dp[i][0] = dp[i - 1][0] * (1 - p);
            for (int j = 1; j <= N; j++) {
                dp[i][j] = dp[i - 1][j - 1] * p + dp[i - 1][j] * (1 - p);
            }
        }

        double ans = 0;
        for (int i = (N + 1) / 2; i <= N; i++) {
            ans += dp[N][i];
        }

        System.out.println(ans);
    }
}
