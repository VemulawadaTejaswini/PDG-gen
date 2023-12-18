import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * TODO AtCoder Beginner Contest 102 D "Equal Cut"
 */
public class Main {

	public static void main(String[] args) {

		InputScanner in = new InputScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int N = in.nextInt();
		int[] A = in.nextIntArray(N);

		long[] sumA = new long[N];
		sumA[0] = A[0];
		for (int i = 1; i < N; i++) {
			sumA[i] = sumA[i - 1] + A[i];
		}

		long ans = Long.MAX_VALUE;
		int left = 0;
		int right = 2;
		for (int i = 1; i <= N - 3; i++) {

			long subL = getSubL(sumA, left, i);
			long subR = getSubR(sumA, i, right);

			for (int j = left + 1; j < i; j++) {
				long sub = getSubL(sumA, j, i);
				if (subL > sub) {
					subL = sub;
					left = j;
				} else {
					break;
				}
			}

			for (int j = right + 1; j < N; j++) {
				long sub = getSubR(sumA, i, j);
				if (subR > sub) {
					subR = sub;
					right = j;
				} else {
					break;
				}
			}

			long P = sumA[left];
			long Q = sumA[i] - sumA[left];
			long R = sumA[right] - sumA[i];
			long S = sumA[N - 1] - sumA[right];

			long max = Math.max(Math.max(P, Q), Math.max(R, S));
			long min = Math.min(Math.min(P, Q), Math.min(R, S));

			ans = Math.min(ans, max - min);
		}

		out.println(ans);

		in.close();
		out.close();

	}

	private static long getSubL(long[] sumA, int fowardIndex, int backIndex) {

		long forwardSum = sumA[fowardIndex];
		long backSum = sumA[backIndex] - sumA[fowardIndex];

		return Math.abs(forwardSum - backSum);
	}

	private static long getSubR(long[] sumA, int fowardIndex, int backIndex) {

		long forwardSum = sumA[backIndex] - sumA[fowardIndex];
		long backSum = sumA[sumA.length - 1] - sumA[backIndex];

		return Math.abs(forwardSum - backSum);
	}

	/*
	 * extends java.util.Scanner
	 */
	static class InputScanner{

		Scanner scanner;

		public InputScanner(InputStream inputStream) {
			this.scanner = new Scanner(inputStream);
		}

		public int nextInt() {
			return scanner.nextInt();
		}

		public long nextLong() {
			return scanner.nextLong();
		}

		public double nextDouble() {
			return scanner.nextDouble();
		}
		public String next() {
			return scanner.next();
		}

		public int[] nextIntArray(int n) {
			int[] ret = new int[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.nextInt();
			}
			return ret;
		}

		public long[] nextLongArray(int n) {
			long[] ret = new long[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.nextLong();
			}
			return ret;
		}

		public String[] nextStringArray(int n) {
			String[] ret = new String[n];
			for (int i = 0; i < n; i++) {
				ret[i] = scanner.next();
			}
			return ret;
		}

		public String[] nextStringArray(String splitStr) {
			String[] ret = scanner.next().split(splitStr);
			return ret;
		}

		public void close() {
			scanner.close();
		}
	}

}
