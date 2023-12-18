import java.util.*;

import static java.lang.System.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = ni();
        long[] A = nlarr(N);

        // 降順でdpする(そうしないと、未変更(ここで変更)のときの値が最大値にならない)
        Arrays.sort(A);

        // 0:未変更 1:未変更(ここで変更) 2: 変更済
        long[][] dp = new long[N][3];
        dp[N - 1][0] = A[N - 1];
        dp[N - 1][1] = 1_000_000_000L;
        dp[N - 1][2] = -1;
        for (int i = N - 2; i >= 0; i--) {
            dp[i][0] = gcd(dp[i + 1][0], A[i]);
            dp[i][1] = dp[i + 1][0];

            if (i + 1 == N - 1) {
                dp[i][2] = A[i];
            } else {
                dp[i][2] = Math.max(gcd(dp[i + 1][2], A[i]), gcd(dp[i + 1][1], A[i]));
            }
        }

        out.println(Math.max(dp[0][2], dp[0][1]));
    }

    //参考: https://www.suzushin7.jp/entry/2016/11/05/calculate-least-common-multiple-in-java/
    //最大公約数 ユークリッドの互除法 O(logN)
    public static long gcd(long m, long n) {
        if (m < n) return gcd(n, m);
        if (n == 0) return m;
        return gcd(n, m % n);
    }

    //最小公倍数lcm ユークリッドの互除法 O(logN)
    public static long lcm(long m, long n) {
        return m * (n / gcd(m, n));  //m*nでlong型のオーバフローを発生させないため、先に割り算から行う
    }

    static int ni() {
        return sc.nextInt();
    }

    static long nl() {
        return sc.nextLong();
    }

    static String ns() {
        return sc.next();
    }

    static int[] niarr(int N) {
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    static long[] nlarr(int N) {
        long[] a = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextLong();
        }
        return a;
    }
}