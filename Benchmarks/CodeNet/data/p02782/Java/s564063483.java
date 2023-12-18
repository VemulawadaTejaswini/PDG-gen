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

	static long g(int R , int C){
		long fact[] = new long[R + C + 3];
		fact[0] = 1;
		fact[1] = 1;
		for(int i = 2 ; i < fact.length ; ++i){
			fact[i] = ((long)(i) * fact[i - 1]) % MOD;
		}
		long pat = fact[R + C + 2] ;
		pat = (pat * modinv(fact[R + 1])) % MOD;
		pat = (pat * modinv(fact[C + 1])) % MOD;
		return pat;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		long ret = g(r2 , c2) + g(r1 - 1 , c1 - 1) - g(r1 - 1 , c2) - g(r2, c1 - 1);
		System.out.println(ret % MOD);
	}
}
