
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

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
			
			int n =  in.nextInt();
			int []a = in.nextIntArray(n);
			
			Arrays.sort(a);
			
			List<Integer> L  = new ArrayList<Integer>();
			
			for(int i = 0 ; i < n ;i++) {
				L.add(a[i]);
			}
			
			int max = a[n-1];
			boolean pair = true;
			boolean not = false;
			BitSet bs = new BitSet(max+1);
			
			for(int i = 2 ; i <= max ; i++) {
				if(bs.get(i)) {
					continue;
				}
				int cnt = 0;
				for(int j = 1 ; i*j <= max; j++) {
					bs.set(i*j, true);
					if(L.contains(i*j)) {
						cnt++;
					}
				}
				if(cnt == n) {
					not = true;
				}
				if(cnt >= 2) {
					pair = false;
				}
			}
			
			if(not) {
				out.println("not coprime");
			}
			else if(pair) {
				out.println("pairwise coprime");
			}
			else {
				out.println("setwise coprime");
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
