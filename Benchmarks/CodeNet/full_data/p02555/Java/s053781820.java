
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

	static long solve2(int N , int i, long fact[]){
		int M = N - 3 * i;
		long ret = comb(M + i - 1, i - 1, fact);
		return ret;
	}
	static long solve(int N , long fact[]){
		if(N <= 2){
			return 0;
		}
		long ret = 0;
		for(int i = 1 ; i <= N / 3 ; ++i){			
			long r = solve2(N , i, fact);
//			System.out.println(i+" "+r);
			ret = (ret + r) % MOD;
		}
		return ret;
	}
	private static long[] calcFactorial(int N) {
		long fact[] = new long[N + 1];
		fact[0] = 1;
		fact[1] = 1;
		for(int i = 2 ; i < fact.length; ++i){
			fact[i] = (i * fact[i - 1]) % MOD;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long fact[] = calcFactorial(6001);
		int N = sc.nextInt();
		long ret = solve(N, fact);
		System.out.println(ret);
	}
}
