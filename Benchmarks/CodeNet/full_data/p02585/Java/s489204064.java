
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class Main {

		public static void main(String[] args) {
			InputStream inputStream = System.in;
			OutputStream outputStream = System.out;
			FastInput in = new FastInput(inputStream);
			PrintWriter out = new PrintWriter(outputStream);
			ABC175D solver = new ABC175D();
			solver.solve(1, in, out);
			out.close();
		}

		static class ABC175D {
			
			static List<List<Integer>> L;
			static long inf = 10000000000000000L * -1L;
			static BitSet bs;

			public void solve(int testNum, FastInput in, PrintWriter out) {
				
				int n = in.nextInt();
				int k = in.nextInt();
				
				int []p = in.nextIntArray(n);
				int []c = in.nextIntArray(n);
				
				L = new ArrayList<>();
				
				for(int i = 0 ; i < n ;i++) {
					L.add(new ArrayList<Integer>());	
				}
				
				long ans = inf;
				long []sum = new long[n];
				int []len = new int [n];
				bs = new BitSet(n);
							
				for(int i = 0 ; i < n ;i++) {
					bs.set(i);
					int num = p[i]-1;
					int cnt = 0;
					for(int j = 0 ; j <= k ; j++) {
							cnt++;
							sum[i] += (long)c[num];
							ans = Math.max(sum[i], ans);
							L.get(i).add(num);
							if(bs.get(num)) {
								break;
							}
							bs.set(num);
							num = p[num]-1;
					}
					sum[i] *= (long)k/cnt;
					len[i] = cnt;
					bs.clear();
				}
				
				for(int i = 0 ; i < n ;i++) {
					int l = k%len[i];
					for(int j = 0 ; j < l ; j++) {
						ans = Math.max(ans,sum[i]);
						int id = L.get(i).get(j);
						sum[i] += (long)c[id];
					}
					ans = Math.max(ans, sum[i]);
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
		
