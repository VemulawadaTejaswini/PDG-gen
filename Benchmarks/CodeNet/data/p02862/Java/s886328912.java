import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
	
	public static long mod_inv(long a, long m){
		return (a == 1 ? 1 : (1 - m*mod_inv(m%a, a)) / a + m);
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int X = sc.nextInt();
			final int Y = sc.nextInt();
			final long MOD = 1000000007;
						
			if((2 * X - Y) % 3 != 0 || (2 * Y - X) % 3 != 0) {
				System.out.println(0);
				return;
			}
			
			final int X_times = (2 * X - Y) / 3;
			final int Y_times = (2 * Y - X) / 3;
			if(X_times < 0 || Y_times < 0) {
				System.out.println(0);
				return;
			}
			
			final int MAX = Math.max(X_times, Y_times);
			final int MIN = Math.min(X_times, Y_times);
			if(MIN == 0) {
				System.out.println(1);
				return;
			}
			
			long answer = 1;
			for(int i = (MIN + MAX); i > MAX; i--) {
				answer *= i;
				answer %= MOD;
			}
			for(int i = 1; i <= MIN ; i++) {
				answer *= mod_inv(i, MOD);
				answer %= MOD;
			}
			
			//System.out.println(X_times + " " + Y_times);
			System.out.println(answer);
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