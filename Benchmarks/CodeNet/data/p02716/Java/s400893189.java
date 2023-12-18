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
	/*
	public static long gcd(long a, long b){
		return b == 0 ? a : gcd(b, a % b);
	}
	*/
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			long[] as = new long[N];
			for(int i = 0; i < N; i++) {
				as[i] = sc.nextLong();
			}
			
			if(N % 2 == 0) {
				long fst_answer = 0, snd_answer = 0;
				for(int i = 0; i < N; i += 2) {
					fst_answer += as[i];
				}
				for(int i = 1; i < N; i += 2) {
					snd_answer += as[i];
				}
				
				System.out.println(Math.max(fst_answer, snd_answer));
				return;
			}else if(N == 1) {
				System.out.println(as[0]);
				return;
			}else if(N == 3) {
				System.out.println(Math.max(as[0], Math.max(as[1], as[2])));
				return;
			}
			
			final int STATES = 1 << 3;
			final int SKIPS = 3;
			long[][][] DP = new long[N + 1][STATES][SKIPS];
			for(int i = 0; i <= N; i++) {
				for(int state = 0; state < STATES; state++) {
					for(int skip = 0; skip < SKIPS; skip++) {
						DP[i][state][skip] = Integer.MIN_VALUE;
						DP[i][state][skip] = Integer.MIN_VALUE;
					}
				}
			}
			DP[0][0][0] = 0;
			for(int i = 0; i < N; i++) {
				for(int state = 0; state < STATES; state++) {
					for(int skip = 0; skip < SKIPS; skip++) {
						if(DP[i][state][skip] <= Integer.MIN_VALUE) { continue; }
						final boolean p__= (state & (1 << 2)) != 0;
						final boolean _p_ = (state & (1 << 1)) != 0;
						final boolean __p = (state & (1 << 0)) != 0;
					
						if(__p) {
							DP[i + 1][((state << 1) & (STATES - 1)) | 0][skip + 0] = Math.max(DP[i + 1][((state << 1) & (STATES - 1)) | 0][skip], DP[i][state][skip]);
						}else {
							DP[i + 1][((state << 1) & (STATES - 1)) | 1][skip + 0] = Math.max(DP[i + 1][((state << 1) & (STATES - 1)) | 1][skip], DP[i][state][skip] + as[i]);
							if(skip < SKIPS - 1) {
								DP[i + 1][((state << 1) & (STATES - 1)) | 0][skip + 1] = Math.max(DP[i + 1][((state << 1) & (STATES - 1)) | 0][skip], DP[i][state][skip]);
							}
						}
					}
				}
			}
			
			long answer = 0;
			
			for(int state = 0; state < STATES; state++) {
				for(int skip = 0; skip < SKIPS; skip++) {
					final boolean p__= (state & (1 << 0)) != 0;
					final boolean _p_ = (state & (1 << 1)) != 0;
					final boolean __p = (state & (1 << 2)) != 0;
				
					if(p__ && _p_) { continue; }
					if(_p_ && __p) { continue; }
					
					if(DP[N][state][skip] <= Integer.MIN_VALUE) { continue; }
					
					//System.out.println(DP[N][state][skip]);
					answer = Math.max(answer, DP[N][state][skip]);
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
