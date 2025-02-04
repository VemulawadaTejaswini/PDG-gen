import java.util.Scanner;

public class Main {
	static final long MOD = 1000000007;
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
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		String S = sc.next();
		long all = modpow(26, K + S.length());
		long fact[] = new long[K + S.length() + 1];
		fact[0] = 1;
		fact[1] = 1;
		for(int i = 2 ; i < fact.length; ++i){
			fact[i] = (i * fact[i - 1]) % MOD;
		}
		long sum = 0;
		for(int i = 0 ; i < S.length() ; ++i){
			long res = K + S.length() - i;
			long pat = modpow(25, res);
			pat = (pat * comb(K + S.length() , i , fact)) % MOD;
			sum = (sum + pat) % MOD;
		}
		long ret = (all - sum + MOD) % MOD;
		System.out.println(ret);
	}
}
