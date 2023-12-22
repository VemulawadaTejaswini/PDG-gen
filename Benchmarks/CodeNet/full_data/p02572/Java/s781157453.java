import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		long sum = 0;
		long squareSum = 0;
		int MOD = 1000000007;
		for(int i = 0; i < n; i++){
		    long a = sc.nextLong();
		    sum += a;
		    sum %= MOD;
		    squareSum += a*a%MOD;
		    squareSum %= MOD;
		}
		
		// 計算
		long result = 0;
		result = (sum*sum - squareSum + MOD)%MOD*inv(2, MOD)%MOD;
		
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
	
	public static long pow(long a, long n, long MOD) {
		long res=1;
		while (n>0) {
			if ((n-n/2*2)==1) {
				res=(res*a)%MOD;
			}
			a=(a*a)%MOD;
			n>>=1;
		}
		return res%MOD;
	}

	public static long inv(long a, long MOD) {
		return pow(a, MOD - 2, MOD);
	}


}
