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
	static long comb(int N , int R){
		long ret = 1;
		for(long v = N - R + 1 ; v <= N ; ++v){
			ret = (ret * v) % MOD;
		}
		for(long v = 2 ; v <= R ; ++v){
			ret = (ret * modinv(v)) % MOD;			
		}
		return ret;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		if(k > n){
			System.out.println(comb(2 * n - 1 , n));
			return ;
		}
		long S = 1;
		for(int i = 1 ; i <= k ; ++i){
			long x = comb(n, i);
			// n - i i
			long y = comb(n - 1 , i);
			S += (x * y) % MOD;
			S = S % MOD;
//			System.out.println(S+" "+all+" "+(all - S));
		}
		System.out.println(S);
		// k <= n <= 20000
		// a_1 + a_2 + a_3 = n
		// | a_1 - 1 | + | a_2 - 1 | + | a_3 - 1 | > k
		
	}
}
