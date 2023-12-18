import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;
 
public class Main {
	
	public static final long MOD = 1000000007;
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			long[] as = new long[N];
			for(int i = 0; i < N; i++) { as[i] = sc.nextLong(); }
			
			long[][] x_y = new long[N + 1][N];
			for(int i = 0; i < N; i++) {
				x_y[1][i] = as[i] * (N % 2 != 0 ? 1 : -1);
			}
			
			for(int len = 2; len <= N; len++) {
				
				for(int st = 0; st + len <= N; st++) {
					final int start = st;
					final int end = st + len;
					
					final int left = st, left_other = st + 1;;
					final int right = st + len - 1, right_other = st;
					final long left_value = as[left];
					final long right_value = as[right];
					
					boolean own_turn = (N - len) % 2 == 0;
					if(own_turn) {
						final long left_x_y  = left_value  + x_y[len - 1][left_other];
						final long right_x_y = right_value + x_y[len - 1][right_other];
						
						if(left_x_y > right_x_y) {
							x_y[len][st] = left_x_y;
						}else {
							x_y[len][st] = right_x_y;
						}
					}else {
						final long left_x_y  = -left_value  + x_y[len - 1][left_other];
						final long right_x_y = -right_value + x_y[len - 1][right_other];
						
						if(left_x_y > right_x_y) {
							x_y[len][st] = right_x_y;
						}else {
							x_y[len][st] = left_x_y;
						}
					}
				}
			}
			
			//System.out.println(Arrays.deepToString(x_y));
			
			System.out.println(x_y[N][0]);
		}
	}
 
	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;
 
		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}
 
		private void getLine() throws IOException {
			while(!hasNext()){
				tok = new StringTokenizer(br.readLine());
			}
		}
 
		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}
 
		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
 
		public int[] nextIntArray(int n) throws IOException {
			final int[] ret = new int[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextInt();
			}
			return ret;
		}
 
		public long[] nextLongArray(int n) throws IOException {
			final long[] ret = new long[n];
			for(int i = 0; i < n; i++){
				ret[i] = this.nextLong();
			}
			return ret;
		}
 
		public void close() throws IOException {
			br.close();
		}
	}
}