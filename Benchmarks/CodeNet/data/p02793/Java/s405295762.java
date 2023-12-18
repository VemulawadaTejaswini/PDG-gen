import java.util.*;

class Main {
	static final int[] P;
	static {
		List<Integer> primes = new ArrayList<>();
		for (int i = 2; i <= 1000000; i++) {
			int n = (int)Math.sqrt(i);
			int j = 2;
			for (; j <= n; j++) if (i%j == 0) break;
			if (j > n) primes.add(i);
		}
		P = new int[primes.size()];
		for (int i = 0; i < P.length; i++) P[i] = primes.get(i);
	}
	Scanner sc;
	int N;
	int[] A;
	static final int MOD = 1000_000_007;
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		A = new int[N];
		for (int i = 0; i < N; i++) A[i] = sc.nextInt();
		long lcm = 1;
		
		for (int i = 0; i < P.length; i++) {
			long p = 1;
			for (int j = 0; j < N; j++) {
				while (A[j] % (p*P[i]) == 0) p *= P[i];
			}
			lcm = (lcm * p)%MOD;
		}
		
		long ans = 0;
		for (int i = 0; i < N; i++) {
			long b = lcm * inv(A[i]) % MOD;
			ans = (ans + b) % MOD;
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
