
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		FastInput in = new FastInput(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		Sample solver = new Sample();
		solver.solve(1, in, out);
		out.close();
	}
	
	static class Sample {
	
		public void solve(int testNum, FastInput in, PrintWriter out) {
			
			int n = in.nextInt();
			int m = in.nextInt();
			
			Unionfind uf = new Unionfind(n);
	
			for(int i = 0 ; i < m ;i++) {
				int a = in.nextInt()-1;
				int b = in.nextInt()-1;
				uf.union(a, b);
			}
			
			int ans = 0;
			
			for(int i = 0 ; i < n ;i++) {
				ans = Math.max(ans, uf.size(i));
			}
			
			out.println(ans);
			
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
	
static class Unionfind {
		 
		private int[] data;
		
		public Unionfind(int size) {
			this.data = new int [size];
			clear();
		}
		
		public void clear() {
			Arrays.fill(data, -1);
		}
		
		public void union(int x , int y ) {
			if((x = root(x)) != (y = root(y))) {
				if(data[y] < data[x]) {
					final int t = x;
					x = y;
					y = t;
				}
				data[x] += data[y];
				data[y] = x;
			}
		}
		
		public int root(int x) {
			if(data[x] < 0) {
				return x;
			}
			else {
				return data[x] = root(data[x]);
			}
		}
		public int size(int x) {
			return -1*data[root(x)];
			
		}
		
		public boolean same(int x, int y) {
			return root(x) == root(y);
		}
	}

}
