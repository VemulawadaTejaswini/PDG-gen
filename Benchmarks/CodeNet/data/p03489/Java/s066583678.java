

import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]) throws Exception {

		FastReader sc = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		int n = sc.nextInt();
		Map<Integer, Integer> mp = new HashMap<>();
		while (n-- > 0) {
			int k = sc.nextInt();
			if (mp.containsKey(k))
				mp.put(k, mp.get(k) + 1);
			else
				mp.put(k, 1);

		}
		int ans = 0;
		for (Map.Entry<Integer, Integer> i : mp.entrySet()) {
			if (i.getKey() < i.getValue())
				ans += Math.abs(i.getValue()-i.getKey());
			else if (i.getKey() > i.getValue()) {
				ans +=  i.getValue();
			}
		}
		System.out.println(ans);
		out.close();

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
				} catch (IOException e) {
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
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
}
