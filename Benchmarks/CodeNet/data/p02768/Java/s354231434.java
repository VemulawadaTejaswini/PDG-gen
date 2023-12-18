
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
		int a = sc.nextInt();
		int b = sc.nextInt();
		long ca = comb(n ,a);
		long cb = comb(n, b);
		long ret = modpow(2, n) - 1 - (ca + cb) + 3 * MOD;
		ret = ret % MOD;
		System.out.println(ret);
		// 16 - 1 - 4 - 4 = 8 
	}
}
