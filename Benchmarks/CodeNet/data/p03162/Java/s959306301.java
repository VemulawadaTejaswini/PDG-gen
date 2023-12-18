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
		
		int a[];
		int b[];
		int c[];
		
		public void solve(int testNumber, InputReader in, PrintWriter out) throws Exception {

			int n = in.nextInt();
			a = new int[n];
			b = new int[n];
			c = new int[n];
			int dp[][] = new int[n][4];
			
			for(int i=0; i<n; i++){
				a[i] = in.nextInt();
				b[i] = in.nextInt();
				c[i] = in.nextInt();
			}
			
//			int total = totalhappy(n-1, -1);
//			System.out.println(total);
			dp[0][0] = a[0];
			dp[0][1] = b[0];
			dp[0][2] = c[0];
			
			for(int i=1; i<n; i++){
				dp[i][0] = a[i] + Math.max(dp[i-1][1], dp[i-1][2]);
				dp[i][1] = b[i] + Math.max(dp[i-1][0], dp[i-1][2]);
				dp[i][2] = c[i] + Math.max(dp[i-1][0], dp[i-1][1]);
			}
			
			System.out.println(Math.max(dp[n-1][2],Math.max(dp[n-1][0], dp[n-1][1])));
			
		}

		private int totalhappy(int i, int prev) {
			
			int h1=0,h2=0,h3=0;
			
			if(i>=0){
				if(prev!=0 || prev==-1)
					h1 = a[i] + totalhappy(i-1, 0);
				if(prev!=1 || prev==-1)
					h2 = b[i] + totalhappy(i-1, 1);
				if(prev!=2 || prev==-1)
					h3 = c[i] + totalhappy(i-1, 2);
				
				return Math.max(h3, Math.max(h1, h2));
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