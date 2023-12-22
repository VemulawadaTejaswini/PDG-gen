import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int N;
	static int[] A;
	static int[] B;
	static int res = -1;
	static boolean flag = false;

	public static void main(String[] args) throws NumberFormatException, IOException {
		read();
	}

	private static void read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		String[] words = br.readLine().split(" ");
		A = new int[N + 1];
		B = new int[N + 1];
		for (int i = 0; i < N + 1; i++) {
			A[i] = Integer.valueOf(words[i]);
		}
		if (!check() ) {
			System.out.println(-1);
		} else {
			search(0, 0, 0);
			System.out.println(res);
		}
		br.close();
	}

	// 2^44
	public static boolean check() {
		long sum = 0;
		for (int i = Math.min(N, 27); i >= 0; i--) {
			sum = sum + A[i] / (long) Math.pow(2, i);
			if ( i>0 && sum > (long) 2 * (Math.pow(2, i - 1) - A[i])) {
				return false;
			}
		}
		if (sum > 1) {
			return false;
		}
		return true;
	}

	public static void search(int depth, int sum, int lastB) {
		if (depth == N + 1) {
			flag = true;
			res = sum;
			return;
		}

		if (res != -1) {
			return;
		}

		if (flag) {
			return;
		}

		int a = A[depth];
		int[] range = rangeB(depth, lastB);
		int maxB = range[0];
		int minB = range[1];

		if (maxB < 0) {
			flag = true;
			return;
		}

		if (depth == N) {
			if (minB <= 0 && maxB >= 0) {
				search(depth + 1, sum + a + 0, 0);
			}
		} else {
			for (int b = maxB; b >= minB; b--) {
				B[depth] = b;
				search(depth + 1, sum + a + b, b);
			}
		}
	}

	public static int[] rangeB(int depth, int lastB) {
		if (depth == 0) {
			if (A[depth] > 1) {
				return new int[] { -1, -1 };
			} else if (A[depth] == 1) {
				return new int[] { 0, 0 };
			}
			return new int[] { 1, 1 };
		}
		int maxB = 2 * lastB - A[depth];

		if (maxB < 0) {
			return new int[] { -1, -1 };
		}

		int minB = lastB - A[depth];
		if (minB < 0) {
			minB = 0;
		}
		return new int[] { maxB, minB };
	}
}
