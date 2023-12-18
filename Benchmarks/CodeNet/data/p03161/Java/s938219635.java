import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static class Reader {
		BufferedReader br;
		StringTokenizer st;
 
		public Reader() {
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
	
	public static void main(String[] args) {
		Reader r = new Reader();
		
		int n = r.nextInt();
		int k = r.nextInt();
		int[] a = new int[n];
		int[] dp = new int[n];
		
		Arrays.fill(dp, Integer.MAX_VALUE);
		
		for (int i = 0; i < n; i++) {
			a[i] = r.nextInt();
		}
		
		dp[0] = 0;
		for (int i = 1; i < n; i++) {
			int min = Integer.MAX_VALUE;
			
			for (int j = 1; j <= k; j++) {
				if (i - j > -1) {
					min = Integer.min(min, dp[i - j] + Math.abs(a[i] - a[i - j]));
				} else {
					break;
				}
			}
			dp[i] = min;
		}
		System.out.println(dp[n - 1]);
	}
}
