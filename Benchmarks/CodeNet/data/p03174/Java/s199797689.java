import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int matches(boolean[][] compatible){
        int[] dp = new int[1<<compatible.length];
        dp[0] = 1;

        for (int mask = 0; mask < (1 << compatible.length) - 1; mask++) {
            int i = Integer.bitCount(mask);
            for (int j = 0; j < compatible.length; j++) {
                int setCheck = mask & (1 << j);
                if(compatible[i][j] && (setCheck == 0)){
                    int high = mask ^ (1 << j);
                    dp[high] += dp[mask];
                    if (dp[high] > mod){
                        dp[high] -= mod;
                    }
                }
            }
        }
        return dp[dp.length - 1];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        boolean[][] compat = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            for (int j = 0; j < N; j++) {
                int t = Integer.parseInt(st.nextToken());
                if (t == 0){
                    compat[i][j] = false;
                }else {
                    compat[i][j] = true;
                }
            }
        }
        System.out.println(matches(compat));
    }
    private static int mod = (int) (1e9+7);
}
