import java.util.*;

public class Main {
    static int MAX = 10010017;  // (1 ≦ k ≦ n ≦ 10^7 程度)
    static int MOD = 1000000007;
    static long[] fac;  // 階乗
    static long[] finv;
    static long[] inv;  // 逆元
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        // 2r + b = x
        // r + 2b = y
        // -> r - b = x - y
        // -> (b = x - 2r)
        // -> r - x + 2r = x - y
        // -> r = 2x/3 -y/3
        // -> b = 2y/3 -x/3
        
        if ((x + y) % 3 != 0) {
            System.out.println(0);
            return;
        }
        
        int r = 2 * x / 3 - y / 3;
        int b = 2 * y / 3 - x / 3;
        
        COMinit();
        
        // ans[i]: 赤玉(yx^2)と青玉(xy^2)を並べるパターン数
        long ans = nCkMOD(r+b, r);
        System.out.println(ans);
        
    }
    
    // テーブルを作る前処理
    public static void COMinit() {        
        fac = new long[MAX];
        finv = new long[MAX];
        inv = new long[MAX];
        
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < MAX; i++){
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD%i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }
    }
    
    // 二項係数計算(1 ≦ k ≦ n ≦ 10^7 程度)
    public static long nCkMOD(int n, int k){
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
    }
    
    public static long modpow(long a, long n) {
        long res = 1;
        while (n > 0) {
            long tmp = n & 1;
            if (tmp > 0) res = res * a % MOD;
            a = a * a % MOD;
            n >>= 1;
        }
        return res;
    }
}