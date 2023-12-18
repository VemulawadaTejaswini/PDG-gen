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

//https://atcoder.jp/contests/dp/tasks/dp_d
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
		
		int w[];
		long v[];
		int n;
		int W;
		
		public void solve(int testNumber, InputReader in, PrintWriter out) throws Exception {

			n = in.nextInt();
			W = in.nextInt();
			w = new int[n];
			v = new long[n];
			for(int i=0; i<n; i++){
				w[i] = in.nextInt();
				v[i] = in.nextLong();
			}
			
			long dp[][] = new long[n][W+1];
//			long max = maxsum(n-1, W);
//			System.out.println(max);
			for(int i=0; i<=W; i++){
				for(int j=0; j<n ;j++){
					long notinc = j-1>=0?dp[j-1][i]:0;
					long inc = 0;
					if(w[j]<=i){
						inc = (j-1>=0?dp[j-1][i-w[j]]:0) + v[j];
					}
					dp[j][i] = Math.max(notinc, inc);
				}
			}
			System.out.println(dp[n-1][W]);
			
		}

//		private long maxsum(int i, int w2) {
//			
//			if(i>=0 && w2>0){
//				
//				long notinc = maxsum(i-1, w2);
//				long inc = 0;
//				if(w[i]<=w2)
//					inc = maxsum(i-1, w2-w[i]) + v[i];
//				
//				return Math.max(notinc, inc);
//			}
//			
//			return 0;
//		}


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