import java.util.*;

public class Main {
    static final long MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		Combination cmb = new Combination(n + 1);
		long ans = 0;
		for (int i = 0; n - i >= k; i++) {
		    ans += ((MOD * 10 + arr[n - 1 - i]) % MOD * cmb.getComb(n - 1 - i, k - 1)) % MOD;
		    ans %= MOD;
		    ans += (((MOD * 10 - arr[i]) % MOD) * cmb.getComb(n - 1 - i, k - 1)) % MOD;
		    ans %= MOD;
		}
		System.out.println(ans);
   }

}

class Combination {
    static final int MOD = 1000000007;
    long[] fac;
    long[] finv;
    long[] inv;
    
    public Combination (int size) {
        fac = new long [size];
        finv = new long [size];
        inv = new long [size];
        fac[0] = 1;
        fac[1] = 1;
        finv[0] = 1;
        finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < size; i++) {
            fac[i] = fac[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            finv[i] = finv[i - 1] * inv[i] % MOD;
        }
    }
    
    
    public long getComb(int n, int k) {
        if (n < k || n < 0 || k < 0) {
            return 0;
        }
        return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
    }
    
}

