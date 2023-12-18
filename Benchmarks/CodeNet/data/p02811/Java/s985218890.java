import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
//		StringBuilder out = new StringBuilder();
		int k = sc.nextInt();
		int n = sc.nextInt();
		if(k*500 >= n) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	static int calc(int[] arr, int n) {
		int res = 0;
		boolean[] seen = new boolean[n];
		for(int i = 0; i < n-1; i++) {
			int k = 0;
			for(int j = 0; j < n; j++) {
				if(!seen[j] && j < arr[i]) k++;
			}
			seen[arr[i]] = true;
			res += k;
			res *= (n-i-1);
		}
		return res;
	}

	static class FastScanner {
		public BufferedReader reader;
		public StringTokenizer tokenizer;
		public FastScanner() {
			reader = new BufferedReader(new InputStreamReader(System.in), 32768);
			tokenizer = null;
		}
		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}
		public int nextInt() {
			return Integer.parseInt(next());
		}
		public long nextLong() {
			return Long.parseLong(next());
		}
		public double nextDouble() {
			return Double.parseDouble(next());
		}
		public String nextLine() {
			try {
				return reader.readLine();
			} catch(IOException e) {
				throw new RuntimeException(e);
			}
		}
	}

}
