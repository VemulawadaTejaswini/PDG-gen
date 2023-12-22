
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {
	InputStream inputStream = System.in;
	OutputStream outputStream = System.out;
	FastInput in = new FastInput(inputStream);
	PrintWriter out = new PrintWriter(outputStream);
	ABC179D solver = new ABC179D();
	solver.solve(1, in, out);
	out.close();
}

static class ABC179D {
	
	static int mod = 998244353;
			  
	public void solve(int testNum, FastInput in, PrintWriter out) {

		int n = in.nextInt();
		int k = in.nextInt();
		
		int []p = new int [n+2];
		
		for(int i = 0 ; i < k ; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			p[a]++;
			p[b+1]--;
		}
		
		List<Integer> L = new ArrayList<Integer>();
		int []sum = new int [n+2];
		sum[0] = p[0];
		for(int i = 0 ; i <= n ;i++) {
			sum[i+1] = sum[i] + p[i+1];
			if(sum[i] > 0) {
				L.add(i);
			}
		}
		
		long []dp = new long [n+1];
		dp[1] = 1;
		for(int i = 1 ; i <= n ;i++) {
			for(int num : L) {
				if(i + num > n) {
					break;
				}
				else {
					dp[i+num] = (dp[i+num] + dp[i])%mod;
				}
			}
		}
		out.println(dp[n]);
		
		
		
		
		
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
