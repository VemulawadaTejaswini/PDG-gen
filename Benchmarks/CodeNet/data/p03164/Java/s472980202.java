import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

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
		int v[];
		int n;
		int W;
		HashMap<Integer, Integer> dp[];
		
		public void solve(int testNumber, InputReader in, PrintWriter out) throws Exception {

			n = in.nextInt();
			W = in.nextInt();
			w = new int[n];
			v = new int[n];
			for(int i=0; i<n; i++){
				w[i] = in.nextInt();
				v[i] = in.nextInt();
			}
			
			dp = new HashMap[n];
			for(int i=0; i<n; i++)
				dp[i] = new HashMap<>();
			
			int max = maxsum(n-1, W);
			System.out.println(max);
			
		}

		private int maxsum(int i, int w2) {
			
			if(i>=0 && w2>0){
				if (dp[i].containsKey(w2))
						return dp[i].get(w2);
				
				int notinc = 0;
				if(i-1>=0 && !dp[i-1].containsKey(w2))
					dp[i-1].put(w2,maxsum(i-1, w2));
				
				notinc = i-1>=0?dp[i-1].get(w2):0;
				
				int inc = 0;
				if(w[i]<=w2){
					if(i-1>=0 && !dp[i-1].containsKey(w2-w[i]))
						dp[i-1].put(w2-w[i],maxsum(i-1, w2-w[i]));
						
					inc = (i-1>=0?dp[i-1].get(w2-w[i]):0) + v[i];
				}
				
				dp[i].put(w2,Math.max(notinc, inc));
				return dp[i].get(w2);
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