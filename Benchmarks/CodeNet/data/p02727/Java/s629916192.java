/*
 *created by Kraken on 28-03-2020 at 17:05
 */

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int x = sc.nextInt(), y = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		Long[] red = new Long[a], green = new Long[b], cless = new Long[c];
		for (int i = 0; i < a; i++) red[i] = sc.nextLong();
		for (int i = 0; i < b; i++) green[i] = sc.nextLong();
		for (int i = 0; i < c; i++) cless[i] = sc.nextLong();
		Arrays.sort(red); Arrays.sort(green); Arrays.sort(cless, Comparator.reverseOrder());
		int idx = 0;
		long res = 0;
		int i = a - x, j = b - y;
		while (i < a || j < b) {
			//System.out.println("comparing: " + i + " and " + j);
			if (i < a && j < b) {
				res += Math.max(red[i], green[j]);
				if (idx < c && cless[idx] > Math.min(red[i], green[j])) {
					res += cless[idx];
					idx++;
				} else {
					res += Math.min(red[i], green[j]);
				}
			} else if (i < a) {
				if (idx < c && cless[idx] > red[i]) {
					res += cless[idx];
					idx++;
				} else {
					res += red[i];
				}
			} else {
				if (idx < c && cless[idx] > green[j]) {
					res += cless[idx];
					idx++;
				} else {
					res += green[j];
				}
			}
			//System.out.println("res: " + res);
			i++; j++;
		}
		System.out.println(res);
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
