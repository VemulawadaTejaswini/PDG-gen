import java.io.*;
import java.util.*;
import java.math.*;

/*
	Author:	Koushik Sahu
	Date: 28-Aug-2020 10:17:59 pm
*/

public class Main {

	static FastScanner fs = new FastScanner();

	public static void main(String[] args) {
		String s;
		s = fs.next();
		int ans = 0;
		int[] arr = new int[3];
		for(int i=0; i<3; i++) {
			if(s.charAt(i)=='R') arr[i] = 1;
			else arr[i] = 0;
		}
		for(int i=1; i<3; i++) {
			if(arr[i]==1) arr[i] += arr[i-1];
		}
		ans = Math.max(arr[0], Math.max(arr[1], arr[2]));
		System.out.println(ans);
	}

	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		public String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}

		public String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public int[] readArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public long[] readLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}
	}

}