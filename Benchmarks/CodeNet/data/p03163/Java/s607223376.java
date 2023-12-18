import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static long dp[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int W = Integer.parseInt(input[1]);
        dp = new long[n + 1][W + 1];
        int[] we = new int[n];
        int[] val = new int[n];
        for (int i = 0; i < n; i++) {
            input = br.readLine().split(" ");
            we[i] = Integer.parseInt(input[0]);
            val[i] = Integer.parseInt(input[1]);
        }
        System.out.println(function(W, n, we, val));
    }
    static long function(int W, int n, int[] w, int[] v) {
        if (n == 0) {
            return 0;
        }
        if (dp[n][W] != 0) return dp[n][W];
        if (W - w[n- 1] >= 0) {
            dp[n][W] = Math.max(function(W - w[n - 1], n - 1, w, v) + v[n - 1], function(W, n - 1, w, v));
        }
        else dp[n][W] = function(W, n - 1, w, v);
        return dp[n][W];
    }

}
