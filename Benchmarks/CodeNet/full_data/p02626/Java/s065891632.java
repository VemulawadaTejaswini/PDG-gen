import java.util.*;
import java.io.*;

public class Main {

	static long x1, x2, xor;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		long[] arr = sc.nextLongArr(n);
		xor = 0;
		long sum = arr[0] + arr[1];
		for (int i = 2; i < arr.length; i++) {
			xor ^= arr[i];
		}
		x1 = arr[0];
		x2 = arr[1];
		if (sum - xor < 0 || (sum - xor) % 2 == 1) {
			pw.println(-1);
			pw.close();
			return;
		}
		long fixed = (sum - xor) / 2;
		if ((xor ^ fixed) != xor + fixed) {
			pw.println(-1);
			pw.close();
			return;
		}
		for (int i = 60; i >= 0; i--) {
			long bit = (1l << i);
			if ((bit & xor) == 0)
				continue;
			if (fixed + bit <= x1) {
				fixed += bit;
			}
		}
		pw.println(fixed == 0 ? -1 : Math.max(arr[0] - fixed, -1));

		pw.close();
	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public int[] nextIntArr(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(next());
			}
			return arr;
		}

		public long[] nextLongArr(int n) throws IOException {
			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Long.parseLong(next());
			}
			return arr;
		}

	}

}
