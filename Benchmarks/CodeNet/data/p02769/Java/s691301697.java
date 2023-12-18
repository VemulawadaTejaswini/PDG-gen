import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int MOD = 1000000007;
		
		// 計算
		long result = 0;
		Combination comb = new Combination(n);
		for(int i = 0; i <= min(k, n-1); i++){
		    long temp = 0;
		    temp += comb.combination(n, i);
		    temp %= MOD;
		    temp *= comb.combination(n-1, n-i-1);
		    temp %= MOD;
		    result += temp;
		    result %= MOD;
		}

		// 出力
		System.out.println(result);
	}
}

class Combination {
    static final int MOD = 1000000007;
    long[] fact;
    long[] invFact;
    long[] inv;
    
    public Combination (int n) {
        fact = new long[n+1];
        invFact = new long[n+1];
        inv = new long[n+1];
        fact[0] = 1;
        fact[1] = 1;
        invFact[0] = 1;
        invFact[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < n+1; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
            invFact[i] = invFact[i - 1] * inv[i] % MOD;
        }
    }
    
    public long combination(int n, int k) {
        if (n < k || n < 0 || k < 0) {
            return 0;
        }
        return fact[n] * (invFact[k] * invFact[n - k] % MOD) % MOD;
    }
}
