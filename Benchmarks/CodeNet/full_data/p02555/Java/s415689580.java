import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int s = sc.nextInt();
		int MOD = 1000000007;
		
		// 計算
		long result = 1;
		long[] list = new long[2001];
		list[3] = 1;
		list[4] = 1;
		list[5] = 1;
		long[] sum = new long[2001];
		sum[3] = 1;
		sum[4] = 2;
		sum[5] = 3;
		for(int i = 6; i <= s; i++){
		   list[i] = sum[i-3] + 1;
		   list[i] %= MOD;
		   sum[i] = sum[i-1] + list[i];
		   sum[i] %= MOD;
		}
		
		result = list[s];
		
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
