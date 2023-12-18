import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long[] A = new long[N + 1];
		long[] B = new long[N];
		long sum = 0;
		for (int i = 0; i < N + 1; ++i) {
			A[i] = sc.nextLong();
			sum += A[i];
		}
		for (int i = 0; i < N; ++i) {
			B[i] = sc.nextLong();
		}
		for (int i = N - 1; i >= 0; --i) {
			long sub = Math.min(A[i + 1], B[i]);
			A[i + 1] -= sub;
			B[i] -= sub;
			A[i] -= Math.min(A[i], B[i]);
		}
		for (int i = 0; i < N + 1; ++i) {
			sum -= A[i];
		}
		System.out.println(sum);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}