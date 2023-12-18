import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] B = new int[N];
		for (int i = 0; i < N - 1; ++i) {
			B[i] = sc.nextInt();
		}
		// B[i] >= max(A[i], A[i+1]
		// B[i-1] >= max(A[i-1], A[i])
		// min(B[i], B[i-1]) >= A[i]
		long ans = 0;
		for (int i = 0; i < N; ++i) {
			ans += Math.min((i == N - 1 ? 1L << 60 : B[i]), (i > 0 ? B[i - 1] : 1L << 60));
		}
		System.out.println(ans);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
