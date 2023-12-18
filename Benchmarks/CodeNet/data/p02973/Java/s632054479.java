import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; ++i) {
			A[i] = sc.nextLong();
		}
		long[] B = new long[N];
		B[0] = A[0];
		int p = 1;
		for (int i = 1; i < N; ++i) {
			int ok = p;
			int ng = -1;
			while (ok - ng > 1) {
				int middle = (ok + ng) / 2;
				if (B[middle] < A[i]) {
					ok = middle;
				} else {
					ng = middle;
				}
			}
			B[ok] = A[i];
			if (p == ok)
				++p;
		}
		System.out.println(p);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}