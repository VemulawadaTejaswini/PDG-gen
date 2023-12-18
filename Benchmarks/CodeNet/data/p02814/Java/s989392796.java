import java.util.*;

class Main {
	Scanner sc;
	int N, M;
	int[] A;
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		A = new int[N];
		for (int i = 0; i < N; i++) A[i] = sc.nextInt();
		
		System.out.println(count());
	}
	
	private int count() {
		int l = Integer.lowestOneBit(A[0]);
		if (l <= 1) return 0;
		for (int i = 0; i < N; i++) {
			int m = Integer.lowestOneBit(A[i]);
			if (l != m) return 0;
			A[i] /= 2;
		}
		long lcm = 1;
		for (int i = 0; i < N; i++) {
			lcm = lcm*A[i]/gcd(lcm, A[i]);
			if (lcm > M) return 0;
		}
		return (int)((M/lcm+1)/2);
		
	}
	
	private static long gcd(long a, long b) {
		long c = a;
		while ( b%a != 0) {
			c = b%a;
			b = a; a = c;
		}
		return c;
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}