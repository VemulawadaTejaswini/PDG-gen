import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final int INF = 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] tmp = br.readLine().split(" ");
        int d = Integer.parseInt(tmp[0]);
        int n = Integer.parseInt(tmp[1]);
        int[] t = new int[d];
        for(int i = 0; i < d; i++) {
            t[i] = Integer.parseInt(br.readLine());
        }
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for(int j = 0; j < n; j++) {
            tmp = br.readLine().split(" ");
            a[j] = Integer.parseInt(tmp[0]);
            b[j] = Integer.parseInt(tmp[1]);
            c[j] = Integer.parseInt(tmp[2]);
        }

        int[][] dp = new int[d][n];
        for(int j = 0; j < n; j++) {
            if(t[0] < a[j] || b[j] < t[0]) dp[0][j] = -INF;
        }

        for(int i = 0; i < d - 1; i++) {
            for(int j = 0; j < n; j++) {
                if(a[j] <= t[i + 1] && t[i + 1] <= b[j]) {
                    for(int k = 0; k < n; k++) {
                        dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][k] + Math.abs(c[j] - c[k]));
                    }
                }else {
                    dp[i + 1][j] = -INF;
                }
            }
        }

        int ans = -INF;
        for(int j = 0; j < n; j++) {
            ans = Math.max(ans, dp[d - 1][j]);
        }
        System.out.println(ans);
    }
}
