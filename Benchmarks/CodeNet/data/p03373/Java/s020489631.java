import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int A = sc.nextInt();
			final int B = sc.nextInt();
			final int C = sc.nextInt();
			
			final long X = sc.nextInt();
			final long Y = sc.nextInt();
			
			long all = A * X + B * Y;
			//System.out.println(all);
			
			for(int i = 1; i <= Math.min(X, Y); i++){
				if(A + B > 2 * C) {
					all += 2 * C;
					all -= A + B;
				}
			}
			//System.out.println(all);
			
			for(int i = 1; i <= Math.abs(X - Y); i++) {
				//System.out.println(i + " " + B + " " + (2 * C));
				if(X < Y){
					if(B > 2 * C) {
						all += 2 * C;
						all -= B;
					}
				}else {
					if(A > 2 * C){
						all += 2 * C;
						all -= A;
					}
				}
			}
			
			System.out.println(all);
			
			/*/
			try(final PrintWriter pw = new PrintWriter(System.out)){
				pw.printf("%.8f\n", (double)(answer) / all_pairs);
			}
			//*/
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
			for(int i = 0; i < n; i++){ ret[i] = this.nextInt();}
			return ret;
		}

		public long[] nextLongArray(int n) throws IOException {
			final long[] ret = new long[n];
			for(int i = 0; i < n; i++) { ret[i] = this.nextLong();}
			return ret;
		}

		public void close() throws IOException {
			br.close();
		}
	}
}