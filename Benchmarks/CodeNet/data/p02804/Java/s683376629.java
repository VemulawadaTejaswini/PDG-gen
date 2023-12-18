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
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        
        COMinit();
        
        // ans: f(x) = max(x) - min(x) の和
        long ans = 0;
        
        // 4 2
        // 1 1 3 4
        // min: a[0]*3c1 a[1]*2c1 a[2]*1c1
        // max: a[3]*3c1 a[2]*2c1 a[1]*1c1
        
        // 8 3
        // 1 1 2 3 4 5 6 6
        // min: a[0]*7c2 a[1]*6c2 ... a[5]*2c2
        // max: a[7]*7c2 a[6]*6c2 ... a[2]*2c2
        
        
        // max
        for (int i = n-1; i >= k-1; i--) {
            ans += array[i] * nCkMOD(i, k-1);
            ans %= MOD;
        }
        
        // min
        for (int i = 0; i <= n - k; i++) {
            ans -= array[i] * nCkMOD(n-1-i, k-1);
            ans %= MOD;
        }
        
        if (ans < 0) ans += MOD;
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
    // nCk = n! / (k! * (n-k)!)
    public static long nCkMOD(int n, int k){
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
    }
    
    // 順列計算
    // nPk = n! / (n-k)!
    public static long nPkMOD(int n, int k){
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        return (fac[n] * finv[n - k]) % MOD;
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