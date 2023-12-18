import java.util.*;

public class Main {

	static int indexOf(int[] a, int v) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == v) return i;
		}
		return -1;
	}

	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	static void fill(int i, int[] C, int[] src, int[] dst, int[] len, int N) {
		if (C[i] >= 0) return;
		int ix = indexOf(dst, i);
		// System.out.print(i + ": " + ix + " -- ");
		// printArray(dst);
		if (ix < 0) {
			// ROOT!
			C[i] = 0;
			return;
		}
		int prev = src[ix];
		if (C[prev] == 0) {
			fill(prev, C, src, dst, len, N);
		}
		C[i] = C[prev] + len[ix];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] u = new int[N - 1];
		int[] v = new int[N - 1];
		int[] w = new int[N - 1];
		for (int i = 0; i < N - 1; i++) {
			u[i] = sc.nextInt();
			v[i] = sc.nextInt();
			w[i] = sc.nextInt();
		}
		int [] C = new int[N + 1];
		for (int i = 0; i < C.length; i++) {
			C[i] = -1;
		}
		for (int i = 1; i <= N; i++) {
			fill(i, C, u, v, w, N);
		}
		// printArray(C);
		for (int i = 1; i <= N; i++) {
			System.out.println(C[i] %2 == 0 ? 0 : 1);
		}
	}
}
