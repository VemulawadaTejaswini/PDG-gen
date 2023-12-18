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
	
	public static long trial(final int N, long[] xs, long[] ys, int x_sign, int y_sign) {
		long x = 0, y = 0;
		boolean[] used = new boolean[N];
		
		for(int i = 0; i < N; i++) {
			final boolean x_ok = Long.signum(xs[i]) == Integer.signum(x_sign) || Long.signum(xs[i]) == 0;
			final boolean y_ok = Long.signum(ys[i]) == Integer.signum(y_sign) || Long.signum(ys[i]) == 0;
			
			if(x_ok && y_ok) {
				x += xs[i];
				y += ys[i];
				used[i] = true;
			}
		}
		
		long answer = x * x + y * y;
		for(int step = 0; step <= 1000; step++) {
			long max_value = x * x + y * y;
			
			boolean[] curr_used = used.clone();
			
			for(int process = 0; process < 10000; process++) {
				final int i = (int)(Math.random() * N);
				if(curr_used[i]) { continue; }
				
				final long next_value = (x + xs[i]) * (x + xs[i]) + (y + ys[i]) * (y + ys[i]); 
				if(max_value < next_value) {
					max_value = next_value;
					curr_used[i] = true;
				}
			}
			
			if(max_value > answer) {
				answer = max_value;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			long[] xs = new long[N];
			long[] ys = new long[N];
			
			for(int i = 0; i < N; i++) {
				xs[i] = sc.nextLong();
				ys[i] = sc.nextLong();
			}
			
			long answer = Math.max(
							Math.max(
									trial(N, xs, ys, +1, +1), 
									trial(N, xs, ys, +1, -1)
							),
							Math.max(
									trial(N, xs, ys, -1, +1),
									trial(N, xs, ys, -1, -1)
							));
			
			System.out.printf("%.12f\n", Math.sqrt(answer));
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