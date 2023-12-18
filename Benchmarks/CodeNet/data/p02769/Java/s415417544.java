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
		int n = sc.nextInt();
		int k = sc.nextInt();
		long fact[] = new long[2 * n];
		fact[0] = 1;
		fact[1] = 1;
		for(int i = 2 ; i < fact.length ; ++i){
			fact[i] = ((long)(i) * fact[i - 1]) % MOD;
		}
		if(k > n){
			System.out.println(comb(2 * n - 1 , n, fact));
			return ;
		}
		long S = 1;
		for(int i = 1 ; i <= k ; ++i){
			long x = comb(n, i, fact);
			long y = comb(n - 1 , i, fact);
			S += (x * y) % MOD;
			S = S % MOD;
		}
		System.out.println(S);
		
	}
}
