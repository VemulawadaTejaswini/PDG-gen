import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;

import java.util.PriorityQueue;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;


public class Main {
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			
			final int X = sc.nextInt();
			
			long[] cs = new long[N];
			long[][] as = new long[N][M];
			
			for(int i = 0; i < N; i++) {
				cs[i] = sc.nextLong();
				for(int j = 0; j < M; j++) {
					as[i][j] = sc.nextLong();
				}
			}
			
			long answer = Long.MAX_VALUE;
			long[] values = new long[M];
			
			for(int bit = 0; bit < (1 << N); bit++) {
				long sum = 0;
				Arrays.fill(values, 0);
				
				for(int item = 0; item < N; item++) {
					if((bit & (1 << item)) == 0) { continue; }
					
					sum += cs[item];
					for(int j = 0; j < M; j++) {
						values[j] += as[item][j];
					}
				}
				
				final long min = Arrays.stream(values).min().getAsLong();
				if(min >= X) { answer = Math.min(answer, sum); }
			}
			
			if(answer >= Long.MAX_VALUE) { answer = -1; }
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
