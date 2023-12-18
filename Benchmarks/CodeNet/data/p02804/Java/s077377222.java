import java.util.*;

class Main {
	Scanner sc;
	int N, K;
	int[] A;
	static final int MOD = 1000_000_007;
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		A = new int[N+1];
		A[0] = Integer.MIN_VALUE;
		for (int i = 1; i <= N; i++) A[i] = sc.nextInt();
		Arrays.sort(A);
		
		long nCr = 1;
		long s = 0;
		
		long ans = 0;
		for (int l = K; l <= N; l++) {
			s = (s + nCr) % MOD;
			nCr = nCr * (l-1) % MOD * inv(l-K+1) % MOD;
			
			ans = (ans + A[l] * s % MOD) % MOD;
			ans = (ans - A[N-l+1] * s % MOD + MOD) % MOD;
		}
		
		System.out.println(ans);
	}
	
	private static long inv(long a) {
		long b = MOD;
		long aa = a, bb = b;
		long x0 = 1, x1 = 0;
		long y0 = 0, y1 = 1;
	
		while (b != 0) {
			long q = a / b;
			long r = a % b;
			long x2 = x0 - q * x1;
			long y2 = y0 - q * y1;
	
			a = b; b = r;
			x0 = x1; x1 = x2;
			y0 = y1; y1 = y2;
		}
		if (bb > 0 && x0 < 0) {
			long n = -x0/bb;
			if (-x0%bb != 0) n++;
			x0 += n*bb; y0 -= n*aa;
		}
	    return x0;
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
