import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

//http://codeforces.com/contest/1095/problem/B
public class Main {

	public static void main(String[] args) throws Exception {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		XeniaAndBitOperations solver = new XeniaAndBitOperations();
		// int test = in.nextInt();
		// while (test-- > 0)
		solver.solve(1, in, out);
		out.close();
	}

	static class XeniaAndBitOperations {

		public void solve(int testNumber, InputReader in, PrintWriter out) throws Exception {

			int n = in.nextInt();
			int k = in.nextInt();
			int h[] = new int[n];
			int dp[] = new int[n];

			for (int i = 0; i < n; i++)
				h[i] = in.nextInt();

//			int ans = mincost(n - 1, h);
//			System.out.println(ans);
			
			dp[1] = Math.abs(h[1]-h[0]);
			for(int i=2; i<n; i++)
			{	
				int min = Integer.MAX_VALUE;
				for(int j=1; j<=k; j++){
					
					if(i-j>=0){
						int temp = dp[i-j] + Math.abs(h[i] - h[i - j]);
						if(min>temp)
							min=temp;
					}
				}
//				int cost1 = dp[i-1] + Math.abs(h[i] - h[i - 1]);
//				int cost2 = dp[i-2] + Math.abs(h[i] - h[i - 2]);
				dp[i]= min;
			}
			System.out.println(dp[n-1]);
		}

		private int mincost(int i, int[] h) {
			
			if (i > 0) {
				int cost1 = mincost(i - 1, h) + (i-1>=0 ? Math.abs(h[i] - h[i - 1]) : Integer.MAX_VALUE);
				int cost2 = mincost(i - 2, h) + (i-2>=0 ? Math.abs(h[i] - h[i - 2]) : Integer.MAX_VALUE);

				return Math.min(cost1, cost2);
			}
			
			return 0;
		}

	}

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
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

	}
}