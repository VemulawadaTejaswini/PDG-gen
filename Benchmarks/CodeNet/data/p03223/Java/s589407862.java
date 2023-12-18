import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static boolean isOdd(int val) {
		return ((val & 1) != 0);
	}

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			final int N = in.nextInt();
			final int[] A = new int[N];
			for (int i = 0; i < N; ++i) {
				A[i] = in.nextInt();
			}

			final int halfN = N / 2;
			Arrays.sort(A);
			if (isOdd(N)) {

				int r1 = 0;
				r1 -= 2 * Arrays.stream(A, 0, halfN).sum();
				r1 += 2 * Arrays.stream(A, halfN, N).sum();
				r1 -= A[halfN];
				r1 -= A[halfN + 1];

				int r2 = 0;
				r2 -= 2 * Arrays.stream(A, 0, halfN + 1).sum();
				r2 += 2 * Arrays.stream(A, halfN + 1, N).sum();
				r2 += A[halfN];
				r2 += A[halfN - 1];

				System.out.println(Math.max(r1, r2));

			} else {
				int r = 0;
				r -= 2 * Arrays.stream(A, 0, halfN).sum();
				r += 2 * Arrays.stream(A, halfN, N).sum();
				r -= A[halfN];
				r += A[halfN - 1];

				System.out.println(r);
			}
		}
	}
}
