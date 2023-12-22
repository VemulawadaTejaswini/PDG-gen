
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
			ABC176D solver = new ABC176D();
			solver.solve(1, in, out);
			out.close();
		}

		static class ABC176D {
			
			static int h,w;
			static int [][]map;
			static char [][]grid;
			static boolean [][]visit;
			static int ans;
			static int ch,cw,dh,dw;

			public void solve(int testNum, FastInput in, PrintWriter out) {

				h = in.nextInt();
				w = in.nextInt();
				
				 ch = in.nextInt()-1;
				 cw = in.nextInt()-1;
				 dh = in.nextInt()-1;
				 dw = in.nextInt()-1;
				
				grid = in.nextChar2DArray(h);
				map = new int [h][w];
				visit = new boolean[h][w];
				
				for(int i = 0 ; i < h ;i++) {
					for(int j = 0 ; j < w ;j++) {
						map[i][j] = 1000000000;
					}
			}
				
				int []mh = {-2,-1,0,1,2};
				int []mw = {-2,-1,0,1,2};
				
				int []qh = {1,0,-1,0};
				int []qw = {0,1,0,-1};
 				
				boolean start = false;
				
				for(int i = 0 ; i < h ;i++) {
					for(int j = 0 ; j < w ;j++) {
						if(!start && grid[i][j] != '#') {
							map[i][j] = 0;
							start = true;
						}
						else if(!start && grid[i][j] == '#'){
							continue;
						}
						for(int x = 0 ; x < 5 ;x++) {
							for(int y = 0 ; y < 5 ;y++) {
								int ph = i + mh[x];
								int pw = j + mw[y];
								
								if(ph < 0 || pw < 0) {
									continue;
								}
								if(ph >= h || pw >= w) {
									continue;
								}
								if(grid[ph][pw] == '#') {
									continue;
								}
								map[ph][pw] = Math.min(map[ph][pw],map[i][j] +1);
							}
						}
							
							for(int x = 0 ; x < 4 ;x++) {
									int ph = i + qh[x];
									int pw = j + qw[x];
									
									if(ph < 0 || pw < 0) {
										continue;
									}
									if(ph >= h || pw >= w) {
										continue;
									}
									if(grid[ph][pw] == '#') {
										continue;
									}
									map[ph][pw] = Math.min(map[ph][pw],map[i][j]);
						}
					}	
				}
				
				if(map[dh][dw] == 1000000000) {
					out.println(-1);
					return;
				}
				
				out.println(Math.abs(map[ch][cw] - map[dh][dw]));
				
				
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
