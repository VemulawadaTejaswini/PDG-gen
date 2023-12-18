
import java.util.*;


class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();


        ncr ncr=new ncr();
        ncr.COMinit();

        long res = 0;
        for (int i = 1; i <= n; i++) {
            if (i == a || i == b) continue;
            long tmp = ncr.COM(n,i);
            res += tmp ;

        }
        System.out.println(res);


    }


}

class ncr {

    static final int MAX = 100;
    static final int MOD = 1000000007;

    long fac[] = new long[MAX];
    long finv[] = new long[MAX];
    long inv[] = new long[MAX];

    // テーブルを作る前処理
    void COMinit() {
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < MAX; i++) {
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }
    }

// 二項係数計算

    public long COM(int n, int k) {
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
    }

}