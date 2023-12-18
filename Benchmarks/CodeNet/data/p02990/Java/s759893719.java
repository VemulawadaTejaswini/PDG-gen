import java.util.*;

public class Main {
	// public static void printArray(int[] a) {
	// 	for (int i = 0; i < a.length; i++) {
	// 		System.out.print(a[i] + ", ");
	// 	}
	// 	System.out.println();
	// }

	// public static<T> void printArrayT(T[] a) {
	// 	for (int i = 0; i < a.length; i++) {
	// 		System.out.print(a[i] + ", ");
	// 	}
	// 	System.out.println();
	// }

	// public static class Triple implements Comparable<Triple> {
	// 	public int A, B, C;
	// 	Triple(int A, int B, int C) {
	// 		this.A = A;
	// 		this.B = B;
	// 		this.C = C;
	// 	}

	// 	@Override
	// 	public String toString() {
	// 		return String.format("(%d, %d, %d)", A, B, C);
	// 	}

	// 	@Override
	// 	public int compareTo(Triple o) {
	// 		int a = this.A - o.A;
	// 		if (a != 0) return a;
	// 		int b = this.B - o.B;
	// 		if (b != 0) return b;
	// 		return this.C - o.C;
	// 	}
	// }

	static final long MOD = 1000000007;

	static int cnt(int N, int K, int i, int[][][] cache) {
		if (N < K) return -1;
		if (K < 1) return -1;
		// System.out.println("N = " + N + ", K = " + K + ", i = " + i);
		if (i == 1) {
			return N - K + 1;
		}
		if (cache[N][K][i] >= 0) {
			return cache[N][K][i];
		}
		boolean any = false;
		long sum = 0;
		for (int x = 1; x <= N - 2; x++) {
			for (int b = 1; b <= x; b++) {
				long right = cnt(N - x - 1, K - b, i - 1, cache);
				if (right < 0) continue;
				// System.out.println(">> " + right);
				any = true;
				sum += right % MOD;
				sum %= MOD;
			}
		}
		if (any) {
			cache[N][K][i] = (int)sum;
			return (int)sum;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[][][] cache = new int[N + 1][K + 1][K + 1];
		for (int i = 0; i <= N; i++) {
			for (int j = 0; j <= K; j++) {
				for (int k = 0; k <= K; k++) {
					cache[i][j][k] = -1;
				}
			}
		}
		for (int i = 1; i <= K; i++) {
			// System.out.println("--- k:" + i);
			System.out.println(cnt(N, K, i, cache));
		}
	}
}
