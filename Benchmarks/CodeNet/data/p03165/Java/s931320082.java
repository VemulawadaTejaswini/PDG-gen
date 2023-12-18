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

		String s, t;

		public void solve(int testNumber, InputReader in, PrintWriter out) throws Exception {

			s = in.next();
			t = in.next();
			int dp[][] = new int[s.length()+1][t.length()+1];
			int p[][] = new int[s.length()+1][t.length()+1];
//			int len = lcs(s.length()-1, t.length()-1);
//			System.out.println(len);
//			
//			1->up,2->left,3->diagonal
			for(int i=0;i<=s.length();i++)
				dp[i][0] = 0;
			for(int i=0;i<=t.length();i++)
				dp[0][i] = 0;
			
			for(int i=1; i<=s.length(); i++){
				for(int j=1; j<=t.length(); j++){
					int c1 = dp[i-1][j];
					int c2 = dp[i][j-1];
					int c3 = 0;
					if(s.charAt(i-1)==t.charAt(j-1))
						c3 = 1+ dp[i-1][j-1];
					
					if(c1>=c2 && c1>=c3){
						dp[i][j] = c1;
						p[i][j] = 1;
					}
					else if(c2>=c1 && c2>=c3){
						dp[i][j] = c2;
						p[i][j] = 2;
					}
					else if(c3>=c1 && c3>=c2){
						dp[i][j] = c3;
						p[i][j] = 3;
					}
				}
			}
			
			StringBuilder st = new StringBuilder("");
			int i=s.length();
			int j=t.length();
			while(i>0 && j>0){
				if(p[i][j]==3){
					st.append(s.charAt(i-1));
					i--;
					j--;
				}
				if(p[i][j]==2)
					j--;
				if(p[i][j]==1)
					i--;
			}
			
			System.out.println(st.reverse());
			
		}
		
		
		private int lcs(int i, int j) {

			if (i >= 0 && j >= 0) {
				int len1 = lcs(i, j - 1);
				int len2 = lcs(i - 1, j);
				int len3 = 0;
				if(s.charAt(i)==t.charAt(j))
					len3 = 1+lcs(i-1, j-1);
				
				return Math.max(len1, Math.max(len2, len3));
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