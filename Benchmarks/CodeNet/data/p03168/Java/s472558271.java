import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		double[] p = new double[n];
		for(int i = 0; i < n; i++){
		    p[i] = sc.nextDouble();
		}
		
		// 計算
		double result = 0;
		double[][] dp  = new double[n+1][n+1];
		dp[0][0] = 1;
		for(int i = 0; i < n; i++){
		    for(int j = 0; j < n; j++){
		        dp[i+1][j+1] += dp[i][j]*p[i];
		        dp[i+1][j] += dp[i][j]*(1-p[i]);
		    }
		}
		for(int i = (n+1)/2; i <= n; i++){
		    result += dp[n][i];
		}
		
		// 出力
		System.out.println(result);
	}

	public static class Scanner {
		private BufferedReader br; private StringTokenizer tok;
		public Scanner(InputStream is) throws IOException { br = new BufferedReader(new InputStreamReader(is));}
		private void getLine() throws IOException { while(!hasNext()) tok = new StringTokenizer(br.readLine());}
		private boolean hasNext() { return tok != null && tok.hasMoreTokens();}
		public String next() throws IOException { getLine(); return tok.nextToken();}
		public int nextInt() throws IOException { return Integer.parseInt(next());}
		public long nextLong() throws IOException { return Long.parseLong(next());}
		public double nextDouble() throws IOException { return Double.parseDouble(next());}
	}
}
