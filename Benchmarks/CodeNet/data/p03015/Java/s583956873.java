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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] L = sc.next().toCharArray();

		long[] X = new long[100002];
		X[0] = 1;
		X[1] = 2;
		for (int i = 2; i < X.length; i++) {
			X[i] = X[i - 1] * 3 % MOD;
		}
		long[] Y = new long[100002];
		Y[0] = X[0];
		for (int i = 1; i < Y.length; i++) {
			Y[i] = X[i] + Y[i-1];
		}

		int LEN = L.length;
		long sum = 0;
		long two = 1;
		for (int i = 0; i < L.length; i++) {
			if (L[i] != '1') continue;
			if (i == 0) {
				int k = LEN - i;
				long v = (Y[k - 1] + 2) % MOD;
				sum += v;
				sum %= MOD;
			} else {
				int k = LEN - i;
				long v = Y[k] - 1;
				v *= two;
				v %= MOD;
				sum += v;
				sum %= MOD;
			}
			two *= 2;
			two %= MOD;
		}
		System.out.println(sum);
	}
}
