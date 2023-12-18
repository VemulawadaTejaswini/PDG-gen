
import java.util.Scanner;


public class Main {
	static final long MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		sc.close();

		long nn = 0;
		long nCa = 0;
		long nCb = 0;
		nn = modpow(2, n, MOD);
		nCa = comb(n, a);
		nCb = comb(n, b);

		long ans = nn - 1 -nCa - nCb;
		while(ans < 0) {
			ans += MOD;
		}
		//System.out.println(nn);
		//System.out.println(nCa);
		//System.out.println(nCb);
		System.out.println(ans);

	}

	//フェルマーの小定理を利用して,pを法としてのaの逆元a^p-2を求める
	public static long MODinv(long a ,long p) {
		return modpow(a ,p-2 ,p);
	}

	//a^n (mod p)を二分累乗法で計算する
	public static long modpow(long a, long n, long p) {
		long ans = 1;
		while(n > 0) {
			if(n%2 == 1) {
				ans = ans * a % p;
			}
			n = n / 2;
			a = a * a % p;
		}
		return ans;
	}

	//nCrをMODを法として計算する
	static long comb(long n, long r) {
		if(n==0 && r==0) return 1;
		if(n<r || n<0) return 0;

		//分子を計算
		long numerator = 1;
		for(long i = n; i > n - r; i--) {
			numerator = numerator * i % MOD;
		}
		//System.out.println("numerator :" + numerator);
		
		long denominator = 1;
		for(long i = r; i > 0; i--) {
			denominator = denominator * i % MOD;
		}
		//System.out.println("denominator :" + denominator);
		
		//分母の逆元を計算
		long denominatorInv = MODinv(denominator, MOD);
		//System.out.println("denominatorInv :" + denominatorInv);

		return numerator * denominatorInv % MOD;
	}









}





