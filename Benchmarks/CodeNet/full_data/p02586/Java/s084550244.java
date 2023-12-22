
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastInput in = new FastInput(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		ABC175E solver = new ABC175E();
		solver.solve(1, in, out);
		out.close();
	}

	static class ABC175E {
		
		public void solve(int testNum, FastInput in, PrintWriter out) {
			
			int r = in.nextInt();
			int c = in.nextInt();
			int k = in.nextInt();
			
			Map<String,Integer> hm = new HashMap<String, Integer>();
			
			for(int i = 0 ; i < k ;i++) {
				int y = in.nextInt();
				int x = in.nextInt();
				int v = in.nextInt();
				hm.put(String.valueOf(y-1)+"_"+String.valueOf(x-1),v);
			}
			
			long [][][]dp = new long [r+1][c+1][4];
			
			for(int i = 0 ; i <= r ;i++) {
				for(int j = 0 ; j <= c ;j++) {
					for(int l = 0 ; l < 4 ;l++) {
						dp[i][j][l] = -1;
					}
				}
			}
			dp[0][0][0] = 0;
			long ans = 0;
			
			for(int i = 0 ; i < r ; i++) {
				for(int j = 0 ; j <= c ;j++) {
					String d = String.valueOf(i)+"_"+String.valueOf(j);
					for(int q = 0 ; q <= 3 ; q++) {
						if(q == 3 || j == c) {
							dp[i+1][j][0] = Math.max(dp[i][j][q], dp[i+1][j][0]);
						}
						else if(!hm.containsKey(d)) {
							dp[i+1][j][0] = Math.max(dp[i][j][q], dp[i+1][j][0]);
							dp[i][j+1][q] = Math.max(dp[i][j+1][q], dp[i][j][q]);
						}
						else {
							dp[i+1][j][0] = Math.max((long)(dp[i][j][q] + hm.get(d)), dp[i+1][j][0]);	//拾った後行での行動を終了する
							dp[i][j+1][q] = Math.max(dp[i][j+1][q], dp[i][j][q]);	//拾わずに行を移動する
							dp[i][j+1][q+1] = Math.max((long)(dp[i][j][q] +hm.get(d)), dp[i][j+1][q+1]); 	//拾った後さらに行を進める 
						}
					}
				}
			}
			for(int i = 0 ; i <= c ; i++) {
				ans = Math.max(dp[r][i][0], ans);
			}
			
			out.println(ans);
		}

		}

	}	
	
	 class FastInput{
	private final BufferedReader in;
	private String[] buff;
	private int index = 0;
	
	public FastInput(InputStream im) {
		in = new BufferedReader(new InputStreamReader(im));
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




