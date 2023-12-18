
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastInput in = new FastInput(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		ABC118D solver = new ABC118D();
		solver.solve(1, in, out);
		out.close();
	}

	static class ABC118D {

		public void solve(int testNum, FastInput in, PrintWriter out) {
			
			
			int n = in.nextInt();
			int m = in.nextInt();
			
			int []a = in.nextIntArray(m);
			int []b = new int [] {2,5,5,4,5,6,3,7,6};
			
			String []dp = new String [n+101];
			
			for(int i = 0 ; i <= n+100;i++) {
				dp[i] = "X";
			}
			dp[0] = "";
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0 ; i <= n ;i++) {
				for(int j = 0 ; j < m ;j++) {
					if(dp[i].equals("X")) {
						continue;
					}
					int num = b[a[j]-1];
					dp[i+num] = MaxNum(dp[i+num], sb.append(dp[i]).append((char)('0' + a[j])).toString());
					sb.delete(0, sb.length());
				}
			}
			
			out.println(dp[n]);
			

		}
		
		static String MaxNum(String s ,String t) {
			
			if(s == "X") return t;
			

			if(s.length() != t.length()) {
				return s.length() > t.length() ? s : t;
			}
			return s.compareTo(t) >= 1 ? s : t;
		}

	}
static class FastInput{
	private final BufferedReader in;
	private String[] buff;
	private int index = 0;
	
	public FastInput(InputStream is) {
		in = new BufferedReader(new InputStreamReader(is));
	}
	String nextLine() {
		try {
			return in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	String next() {
		while (buff == null || index >= buff.length) {
			buff = nextLine().split(" ");
			index = 0;
		}
		return buff[index++];
	}
	int nextInt() {
		return Integer.parseInt(next());
	}
	
	long nextLong() {
		return Long.parseLong(next());
	}
	
	Double nextDouble() {
		return Double.parseDouble(next());
	}
	
	BigInteger nextBigInteger() {
		return new BigInteger(next());
	}
	
	BigDecimal nextBigDecimal() {
		return new BigDecimal(next());
	}
	
	public int[] nextIntArray(final int n) {
		final int[] res = new int [n];
		
		for(int i = 0 ; i < n ;i++) {
			res[i] = nextInt();
		}
		return res;
	}
	
	public long[] nextLongArray(final int n) {
		final long[] res= new long [n];
		
		for(int i = 0 ; i < n ;i++) {
			res[i] = nextLong();
		}
		return res;
	}
	
	public double[] nextDoubleArray(final int n ) {
		final double[] res = new double [n];
		
		for(int i = 0 ; i < n ;i++) {
			res[i] = nextDouble();
		}
		return res;
	}
	
	
	public int[][] nextInt2DArray(final int n , final int m){
		int [][]res = new int [n][m];
		
		for(int i = 0 ; i < n ;i++) {
			for(int j = 0 ; j < m ;j++) {
				res[i][j] = nextInt();
			}
		}
		return res;
	}
	public long[][] nextLong2DArray(final int n , final int m){
		long [][]res = new long [n][m];
		
		for(int i = 0 ; i < n ;i++) {
			for(int j = 0 ; j < m ;j++) {
				res[i][j] = nextLong();
			}
		}
		return res;
	}
	
	public char[][] nextChar2DArray(final int n){
		char [][]res = new char [n][];
		
		for(int i = 0 ; i < n ;i++) {
			String s = next();
			res[i] = s.toCharArray();
		}
		
		return res;
	}
}
}
