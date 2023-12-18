/*
 *created by Kraken on 28-03-2020 at 17:05
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
		int[] res = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {
				int dis = Math.min(Math.abs(i - j), Math.min(Math.abs(i - x) + 1 + Math.abs(j - y), Math.abs(j - x) + 1 + Math.abs(i - y)));
				res[dis]++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < n; i++) {
			sb.append(res[i]).append("\n");
		}
		System.out.print(sb.toString());
	}

	static class FastReader {

		BufferedReader br;

		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
