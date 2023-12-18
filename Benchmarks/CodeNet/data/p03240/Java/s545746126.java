
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
	ABC112C solver = new ABC112C();
	solver.solve(1, in, out);
	out.close();
}

static class ABC112C {

	public void solve(int testNum, FastInput in, PrintWriter out) {
		
		int n = in.nextInt();
		
		int []x = new int [n];
		int []y = new int [n];
		int []h = new int [n];
		
		int sx = -1,sy = -1, sh = -1;
		for(int i = 0 ; i < n ;i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
			h[i] = in.nextInt();
			if(h[i] >= 1) {
				sx = x[i];
				sy = y[i];
				sh = h[i];
			}
		}
		
		
		
		for(int nx = 0 ; nx <= 100 ; nx++) {
			for(int ny = 0 ; ny <= 100 ; ny++) {
				int nh = sh + Math.abs(nx - sx) + Math.abs(ny - sy);
				boolean jdg = true;
				
				for(int i = 0 ; i < n ; i++) {
					int dist = Math.abs(x[i] - nx) + Math.abs(ny - y[i]);
					int tmp = Math.max(nh - dist, 0);
					
					if(tmp != h[i]) {
						jdg = false;
					}
				}
				
				if(jdg) {
					out.println(nx+" "+ny+" "+nh);
				}
			}
		}
		
		

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


