
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final long MOD = 998244353;
	static long modpow(long n, long y){
		if(y == 0){
			return 1;
		}else if(y == 1){
			return n % MOD;
		}else{
			if(y % 2 == 0){
				long r = modpow(n , y / 2);
				return (r * r) % MOD;
			}else{
				long r = modpow(n , y / 2);
				long r2 = (r * r) % MOD;
				return (r2 * n) % MOD;				
			}
		}
	}
	static long modinv(long n){
		return modpow(n , MOD - 2);
	}
	static long comb(int N , int R, long fact[]){
		long ret = fact[N];
		ret = (ret * modinv(fact[R])) % MOD;
		ret = (ret * modinv(fact[N - R])) % MOD;
		return ret;
	}

	
	static long sum(long A[] , long mod){
		long ret = 0;
		for(long l : A){
			ret = (ret + l) % mod;
		}
		return ret;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long M = sc.nextLong();
		int K = sc.nextInt();		
		long dp[] = new long[K + 1];
		dp[0] = M;
		long fact[] = new long[N + K + 1];
		fact[0] = 1;
		fact[1] = 1;
		for(int i = 2 ; i < fact.length ; ++i){
			fact[i] = ((long)(i) * fact[i - 1]) % MOD;
		}
		long S = M;
		long dpk = 0;
		for(int n = 1 ; n < N; ++n){
			/*
			long next[] = new long[K + 1];			
			next[0] = ((M - 1) * dp[0]) % MOD;
			for(int k = 1 ; k < dp.length ; ++k){
				next[k] = (dp[k - 1] + (M - 1) * dp[k]) % MOD;
			}
			*/		
			if(n - K == 0){
//				nextS -= M;
			}
			if(n - K - 1 >= 0){
				dpk = M * modpow(M - 1, n - K - 1);
				dpk = dpk % MOD;
				long comb = comb(n - 1, K, fact);
				dpk = (dpk * comb) % MOD;
//				System.out.println("*"+dpk+" "+comb);
			}
			long nextS = (S * M - dpk + MOD) % MOD;
//			long Sp = sum(dp , MOD);			
//			long Sn = sum(next , MOD);
//			System.out.println(Sp+" "+ Sn+" "+(Sp * M - dp[K]) % MOD);
//			System.out.println(dpk+" "+dp[K]);
//			System.out.println(S+" "+nextS);
			S = nextS;
//			dp = next;		
		}
		/*
		long ret = 0;
		for(long d : dp){
			ret = (ret + d) % MOD;
		}
		*/
		System.out.println(S);
	}
}
