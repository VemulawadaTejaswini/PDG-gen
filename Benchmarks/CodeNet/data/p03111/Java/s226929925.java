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
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			int limit = 3;
			final int A = sc.nextInt();
			final int B = sc.nextInt();
			final int C = sc.nextInt();
			
			int[] lens = new int[N];
			for(int i = 0; i < N; i++) {
				lens[i] = sc.nextInt();
			}
			
			int[] bit_lens = new int[1 << N];
			for(int bit = 0; bit < (1 << N); bit++) {
				for(int i = 0; i < N; i++) {
					if((bit & (1 << i)) != 0) {
						bit_lens[bit] += lens[i];
					}
				}
			}
			
			long answer = Integer.MAX_VALUE;
			
			for(int fst_bit = 1; fst_bit < (1 << N); fst_bit++) {
				final int fst = Math.abs(A - bit_lens[fst_bit]) + (Integer.bitCount(fst_bit) - 1) * 10;					
				
				for(int snd_bit = 1; snd_bit < (1 << N); snd_bit++) {
					if((fst_bit & snd_bit) != 0) { continue; }
					final int snd = Math.abs(B - bit_lens[snd_bit]) + (Integer.bitCount(snd_bit) - 1) * 10;					
					
					for(int thd_bit = 1; thd_bit < (1 << N); thd_bit++) {
						if((fst_bit & thd_bit) != 0) { continue; }
						if((snd_bit & thd_bit) != 0) { continue; }
						
						final int thd = Math.abs(C - bit_lens[thd_bit]) + (Integer.bitCount(thd_bit) - 1) * 10;
						
						answer = Math.min(answer, fst + snd + thd);
					}
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