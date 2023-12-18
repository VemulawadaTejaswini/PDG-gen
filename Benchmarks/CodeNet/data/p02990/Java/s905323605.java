import java.util.Scanner;

public class Main {

	private static final int MAX = 100000;
	private static final long[] fac = new long[MAX];
	private static final long[] finv = new long[MAX];
	private static final long[] inv = new long[MAX];
	private static final int MOD = 1_000_000_007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		COMinit();
		for(int i = 1;i <= K;i++) {
			System.out.println(COM(N-K+1,i)*COM(K-1,i-1)%MOD);
		}
	}

	//累乗・累乗の逆元の前計算
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
	//組み合わせ本計算
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