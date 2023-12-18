import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;
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
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			long[] xs = new long[N];
			long[] ls = new long[N];
			for(int i = 0; i < N; i++) {
				xs[i] = sc.nextLong();
				ls[i] = sc.nextLong();
			}
			
			TreeSet<Long> set = new TreeSet<Long>();
			for(int i = 0; i < N; i++) {
				set.add(xs[i] - (ls[i]));
				set.add(xs[i] - (ls[i] - 1));
				set.add(xs[i]);
				set.add(xs[i] + (ls[i] - 1));
				set.add(xs[i] + (ls[i]));
			}
			
			ArrayList<Long> list = new ArrayList<Long>(set);
			final int size = list.size();
			
			int[] sums = new int[size + 1];
			for(int i = 0; i < N; i++) {
				final int l = Collections.binarySearch(list, xs[i] - (ls[i] - 1));
				final int r = Collections.binarySearch(list, xs[i] + (ls[i] - 1));
				
				sums[l]++;
				sums[r + 1]--;
			}
			
			for(int i = 1; i <= size; i++) {
				sums[i] += sums[i - 1]; 
			}
			
			
			int answer = 0, prev = 0;
			for(int i = 0; i <= size; i++) {
				if(prev != 1 && sums[i] == 1) {
					answer += 1;
				}
				
				prev = sums[i];
			}
			
			//System.out.println(Arrays.toString(sums));
			
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