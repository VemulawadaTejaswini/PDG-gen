import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
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

	public static void main(String[] args) {
		FastReader fr = new FastReader();
		
		int N = fr.nextInt();
		int W = fr.nextInt();
		
		int[] w = new int[N];
		int[] v = new int[N];
		
		for (int i = 0; i < N; i++) {
			w[i] = fr.nextInt();
			v[i] = fr.nextInt();
		}
		
		long[] dp = new long[1000000]; 
		
		for (int i = 0; i < N; i++) {
			for (int j = W; j >= 0; j--) {
				if (j+w[i] <= W) {
					dp[j + w[i]] = Math.max(dp[j + w[i]], dp[j] + v[i]);
				}
			}
		}
		
		long res = 0;
		for (int i = 0; i <= W; i++) {
			res = Math.max(dp[i], res);
		}
		
		System.out.println(res);
	}

}
