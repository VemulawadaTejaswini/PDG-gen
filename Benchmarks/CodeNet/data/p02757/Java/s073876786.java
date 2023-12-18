
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        String s = " " + sc.next();
        long[][] dp = new long[2][P];
        dp[0][0] = 0;
        long ans = 0;
        int x = 0;
        for (int i = 1; i <= N; i++) {
            x = 1 - x;
            int n = s.charAt(i) - '0';
            Arrays.fill(dp[x], 0);
            for (int j = 0; j < P; j++) {
                dp[x][(j * 10 + n) % P] += dp[1 - x][j];
            }
            dp[x][n % P] += 1;
            ans += dp[x][0];
//            debug(dp[i]);
        }
//        long[] cnt = new long[P];
//        long ans1 = 0;
//        int start = 0;
//        for (int i = 1; i <= N; i++) {
//            int n = s.charAt(i) - '0';
//            cnt[(start + n % P) % P]++;
//            ans1 += cnt[start];
//            debug(start, cnt[start], cnt);
//            start = (start + n % P) % P;
//
//        }
        System.out.println(ans);
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }

}
