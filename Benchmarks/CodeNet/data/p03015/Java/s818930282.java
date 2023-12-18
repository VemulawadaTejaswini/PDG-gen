import java.util.*;

/**
 *
 */
public class Main {
    public static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String L = sc.next();

        System.out.println(solve(L));
    }

    /**
     * http://kmjp.hatenablog.jp/entry/2019/06/09/0900
     *
     * @param L
     * @return
     */
    private static long solve(String L) {
        L = "0" + L;
        int N = L.length();
        long ans=0;
        long v=1, a=1;

        long[] s = new long[100002];
        s[0] = 1;
        for (int i=0; i<N; i++) {
            s[i+1] = s[i];
            if (L.charAt(i) == '1') {
                s[i+1] = s[i+1]*2 % MOD;
            }
        }

        for (int i=N-1; i>=1; i--) {
            if (L.charAt(i) == '1') {
                v = v*2 % MOD;
                ans += a*s[i]%MOD;
            }
            a = a*3%MOD;
        }

        return ans%MOD;
    }
}
