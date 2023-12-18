import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/*
 * AtCoder Beginner Contest 102 C "Linear Approximation"
 */
public class Main {

	public static void main(String[] args) {

		InputScanner in = new InputScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int N = in.nextInt();
		int[] A = in.nextIntArray(N);

		int[] absA = new int[N];
		for (int i = 0; i < N; i++) {
			absA[i] = A[i] - (i + 1);
		}

		Arrays.parallelSort(absA);
		long ans = 0;
		for (int i = 0; i < N; i++) {
			ans += Math.abs(absA[i] - absA[N / 2]);
		}

		out.println(ans);

		in.close();
		out.close();

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
