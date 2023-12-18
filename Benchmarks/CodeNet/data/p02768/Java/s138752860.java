import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int MOD = 1000000007;
		
		// 計算
		long result = 0;
		Combination comb = new Combination(b);
		result += pow(2, n, MOD)-1;
		result %= MOD;
		result += MOD;
		result -= comb.calc(n, a);
		result %= MOD;
		result += MOD;
		result -= comb.calc(n, b);
		result %= MOD;
		
		
		/*
		for(int i = 0; i < 1<<n; i++){
		    long temp = 0;
		    int cnt = Integer.bitCount(i);
		    if(cnt == a || cnt == b) continue;
		    result += comb.combination(n, i);
		    result %= MOD;
		}
		*/
		
		// 出力
		System.out.println(result);
	}
	
	public static long pow(long a, long n, long MOD) {
	    long res=1;
	    while (n>0) {
	        if ((n-n/2*2)==1) {
	            res=(res*a)%MOD;
	        }
	        a=(a*a)%MOD;
	        n>>=1;
	    }
	    return res%MOD;
	}

	
}

class Combination {
    static final int MOD = 1000000007;
    long[] fact;
    long[] invFact;
    long[] inv;
    
    public Combination (int n) {
        //fact = new long[n+1];
        invFact = new long[n+1];
        inv = new long[n+1];
        //fact[0] = 1;
        //fact[1] = 1;
        invFact[0] = 1;
        invFact[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < n+1; i++) {
            //fact[i] = fact[i - 1] * i % MOD;
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
    
    public long calc(int n, int k) {
	    long res=1;
	    if(n-k < k) k = n-k;
	    for(int i = 0; i < k; i++){
	        res *= n-i;
	        res %= MOD;
	    }
	    res *= invFact[k];
	    
	    return res%MOD;
	}
}
