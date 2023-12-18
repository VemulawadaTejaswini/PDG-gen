
import java.util.*;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aArr = new int[n];

        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }

        long[][][] dp = new long[n + 1][3][2];
        for (long[][] x: dp) {
            for (long[] x2: x) {
                Arrays.fill(x2, Integer.MIN_VALUE);
            }
        }
        // x o x o x o x
        // o x x x o x o
        dp[0][0][0] = 0;


        // dp[i][j][k] ... i番目までの整数列で、ひとつおきじゃないやつj個、(直前の数を使っていなければk = 0)の最大値
//        debug(dp);
        for (int i = 0; i < n; i++) {
            dp[i + 1][0][1] = dp[i][0][0] + hoge(aArr[i]);
            dp[i + 1][1][1] = dp[i][1][0] + hoge(aArr[i]);
            dp[i + 1][2][1] = dp[i][2][0] + hoge(aArr[i]);
            dp[i + 1][0][0] = dp[i][0][1];
            dp[i + 1][1][0] = Math.max(dp[i][0][0], dp[i][1][1]);
            dp[i + 1][2][0] = Math.max(dp[i][1][0], dp[i][2][1]);
        }


        List<Long> arr = Arrays.asList(dp[n][0][0] ,dp[n][1][0], dp[n][2][0],
                dp[n][0][1], dp[n][1][1],dp[n][2][1] );
//        debug(arr);
        System.out.println(Collections.max(arr));
//        System.out.println(Math.max(
//                dp[n][0][0] + dp[n][1][0] + dp[n][2][0],
//                dp[n][0][1] + dp[n][1][1] + dp[n][2][1]
//        ));
    }

    long hoge(long i) {
        return i == Integer.MIN_VALUE ? 0 : i;
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
