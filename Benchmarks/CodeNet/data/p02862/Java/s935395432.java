import java.util.Scanner;

public class Main {

	private static final int MAX = 10000000;
	private static final long[] fac = new long[MAX];
	private static final long[] finv = new long[MAX];
	private static final long[] inv = new long[MAX];
	private static final int MOD = 1_000_000_007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();

		int n = x+y;
		if(n%3 != 0){
			System.out.println(0);
			return;
		}
		COMinit();
		if(x > y){
			System.out.println(COM(n/3,n*2-x));
		}else if(x == y){
			System.out.println(COM(n/3, n/6));
		}else if(x < y) {
			System.out.println(COM(n/3,n*2-y));
		}
	}

	private static void COMinit() {
		fac[0] = fac[1] = 1;
		finv[0] = finv[1] = 1;
		inv[0] = inv[1] = 1;
		for(int i = 2;i < MAX;i++) {
			fac[i] = fac[i-1] * i %MOD;
			inv[i] = MOD - inv[MOD%i] * (MOD/i) % MOD;
			finv[i] = finv[i-1] * inv[i] %MOD;
		}
	}
	private static long COM(int n,int k) {
		if(n < k) {
			return 0;
		}
		if(n < 0 || k < 0) {
			return 0;
		}
		return fac[n] * (finv[k] * finv[n-k] % MOD)%MOD;
	}
}