
import java.util.Scanner;

class Main {

	static final int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();

        if((X+Y) %3 != 0) {
        	System.out.print(0);
        	return;
        }

        int m = (2 * X - Y) / 3;
        int n = X -2 * m;

        if(m < 0 || n < 0) {
        	System.out.print(0);
        	return;
        }
        
        intFactorial() ;
        System.out.println(combination(m+n, m));
	}

	//階乗時の各値をMODの元で計算しておく
	static long[] factorial = new long[10000000];
	static void intFactorial() {
		factorial[0] = 1;
		for(int i = 1; i < 10000000; i++) {
			factorial[i] = factorial[i-1] * i % MOD;
		}

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
	static long combination(int n, int r) {
		if(n==0 && r==0) return 1;
		if(n<r || n<0) return 0;
		
		return (factorial[n] * MODinv(factorial[r], MOD)) % MOD * MODinv(factorial[n-r], MOD) % MOD;
	}








}





