import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    private static int getInt() {
        try {
            return Integer.parseInt(READER.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int[] getIntArr(int n) {
        int[] ans = new int[n];

        StringTokenizer stringTokenizer = null;
        try {
            stringTokenizer = new StringTokenizer(READER.readLine(), " ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < n && stringTokenizer.hasMoreTokens(); i++) {
            ans[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        return ans;
    }

    private static int solve() {
        int[] nk = getIntArr(2);
        int n = nk[0];
        int k = nk[1];
        if (n == 0 || k == 0) {
            return 0;
        }
        int[] hs = getIntArr(n);
        return solveInternal(n, k, hs);
    }

    private static int solveInternal(int n, int k, int[] hs) {
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = Math.abs(hs[1] - hs[0]);
        for (int i = 2; i < n; i++) {
            int lowBound = Math.max(0, i - k);
            int best = dp[lowBound] + Math.abs(hs[i] - hs[lowBound]);
            for (int j = lowBound + 1; j <= i - 1; j++) {
                int cost = dp[j] + Math.abs(hs[i] - hs[j]);
                if (cost < best) {
                    best = cost;
                }
            }
            dp[i] = best;
        }

//        for (int i = 0; i < dp.length; i++) {
//            System.out.println(dp[i]);
//        }
        return dp[n - 1];
    }

    public static void main(String... args) {
        System.out.println(solve());
//        System.out.println(solveInternal(10, 4, new int[]{40, 10, 20, 70, 80, 10, 20, 70, 80, 60}));
    }
}
