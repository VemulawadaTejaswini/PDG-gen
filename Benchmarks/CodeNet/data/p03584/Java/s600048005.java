import java.util.Scanner;

public class Main {

	private static int K;

	private static int[] A;

	private static int[] B;

	private static long evaluate(int mask) {
		long result = 0;
		for (int i = 0; i < A.length; ++i) {
			int a = A[i];
			if ((a | mask) == mask) {
				result += B[i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		try (Scanner  in = new Scanner(System.in)) {
			final int N = in.nextInt();
			K = in.nextInt();
			A = new int[N];
			B = new int[N];
			for (int i = 0; i < N; ++i) {
				int a = in.nextInt();
				int b = in.nextInt();
				if (a <= K) {
					A[i] = a;
					B[i] = b;
				}
			}

			long result = 0;
			int lowMask = Integer.highestOneBit(K) - 1;
			int hiMask = ~lowMask;

			while (lowMask != 0) {
				result = Math.max(result, evaluate(hiMask & K));
				result = Math.max(result, evaluate(((hiMask << 1) & K) | lowMask));
				do {
					lowMask >>= 1;
					hiMask >>= 1;
				} while (lowMask != 0 && ((lowMask + 1) & K) == 0);
			}

			System.out.println(result);
		}
	}
}
