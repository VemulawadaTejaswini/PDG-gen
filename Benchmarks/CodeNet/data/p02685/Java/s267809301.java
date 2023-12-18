import java.util.*;

public class Main {

    private static final long MOD = 998244353;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        long[] mm = new long[N];
        long tmp = M;
        mm[N-1] = M;
        for (int k = N-2; k >= 0; k--) {
            tmp *= (long)(M-1);
            tmp %= MOD;
            mm[k] = tmp;
        }

        long ans = 0;
        for (int k = 0; k <= K; k++) {
            if (k == 0) {
                ans += mm[k];
            } else {
                long tt = mm[k]*(N-k);
                tt %= MOD;
                ans += tt;
            }
            ans %= MOD;
        }

        System.out.println(ans);
    }
}

