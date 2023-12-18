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
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			int[] ls = new int[N];
			
			for(int i = 0; i < N; i++) {
				ls[i] = sc.nextInt();
			}
			Arrays.sort(ls);
			
			final int MAX = Arrays.stream(ls).max().getAsInt();
			final int SIZE = MAX * 2;
			int[] counts = new int[SIZE + 1];
			for(int i = 0; i < N; i++) {
				counts[ls[i]]++;
			}
			
			for(int i = 1; i <= SIZE; i++) {
				counts[i] += counts[i - 1];
			}
			
			long answer = 0;
			for(int i = 0; i < N; i++) {
				final int fst = ls[i];
				
				for(int j = i + 1; j < N; j++) {
					final int snd = ls[j];
					
					final int count = Math.max(0, counts[fst + snd - 1] - (j + 1));
					//System.out.println(fst + " " + snd + " : " + count);
					
					answer += count;
				}
			}
			
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