
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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
			int max = 1000100;
			
			int []minf = new int [max];
			boolean []prime = new boolean [max];
			
			for(int i = 0 ; i < max; i++) {
				minf[i] = -1;
				prime[i] = true;
			}
			minf[0] = 0; prime[0] = false;
			minf[1] = 1; prime[1] = false;
			
			for(int i = 2 ; i < max ; i++) {
				if(prime[i]) {
					minf[i] = i;
					for(int j = i*2 ; j < max ; j += i) {
						if(minf[j] == -1) {
							minf[j] = i;
							prime[j] = false;
						}
					}
				}
			}
			
			Set<Integer> all = new HashSet<Integer>();
			List<Set<Integer>> tmp = new ArrayList<>();
			
			for(int i = 0 ; i < n ;i++) {
				tmp.add(new HashSet<Integer>());
			}
			
			boolean pair = true;
			
			for(int i = 0 ; i < n ;i++) {
				int now = a[i];
				while(now != 1) {
					if(!tmp.get(i).contains(minf[now])) {
						if(all.contains(minf[now])) {
							pair = false;
						}
						tmp.get(i).add(minf[now]);
						all.add(minf[now]);
					}
					now /= minf[now];
				}
				
			}
			
			boolean not = false;
			int gcd = a[n-1];
			
			for(int i = 0 ; i < n-1; i++) {
				gcd = gcd(gcd,a[i]);
			}
			
			if(gcd != 1) {
				not = true;
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
		
		static int gcd(int a, int b) {
			if(a < b) return gcd(b,a);
			
			return a % b == 0 ? b :gcd(b,a%b);
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
