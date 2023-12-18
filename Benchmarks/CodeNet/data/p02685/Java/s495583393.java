import java.util.Scanner;

public class Main{
	static Scanner sc = new Scanner(System.in);
	static long mod = 998244353;
	public static void main(String[] args) {
		int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
		initComb();
		long ans = 0;
		for(int i=0;i<=k;i++) {
			ans += comb(n-1, i) * pow(m-1, n-i-1) % mod;
			ans %= mod;
		}
		ans = ans * m % mod;//先頭の塗り方
		System.out.println(ans);
	}
	static long fact[] = new long[200200];
	static long revFact[] = new long[200200];
	
	static void initComb() {
		fact[0] = 1;
		for(int i=1;i<200200;i++) {
			fact[i] = fact[i-1] * i % mod;
		}
		revFact[200199] = div(1, fact[200199]); 
		for(int i=200199;i>=1;i--) {
			revFact[i-1] = revFact[i] * i % mod;
		}
	}
	
	static long div(long x, long y) {
		return x * pow(y, mod - 2) % mod;
	}
	
	static long pow(long a, long x) {
		if(x == 0)return 1;
		if(x % 2 == 1) return a * pow(a, x-1) % mod;
		long root = pow(a, x / 2);
		return root * root % mod;
	}
	
	static long comb(int x, int y) {
		if( x < y )return 0;
		long up = fact[x];
		long down = fact[x - y] * fact[y] % mod;
		return div(up, down);
	}
}