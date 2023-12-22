

import java.util.*;
import java.io.*;

public class Main {
	static FastReader in = new FastReader();

	public static void main(String[] args) {
		solve();
	}

	
	static int n, k;
	static int[] arr;
	
	static void solve() {
		n = in.nextInt();
		k = in.nextInt();
		arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = in.nextInt();
		
		int min = 1, max = (int) 1e9 + 100;
		
		while(min != max)
		{
			int mid = (min + max) / 2;
			if(possible(mid, arr, k)) max = mid;
			else min = mid + 1;
		}
		
		System.out.println(min);
		
	}
	
	static boolean possible(int ans, int[] a, int k)
	{
		for(int i : a) k -= (i + ans - 1) / ans - 1;
		return k >= 0;
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



