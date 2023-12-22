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
	public static final int TYPES = 26;
	
	public static long calc(final int D, int[] cs, int[][] ss, int[] answers) {
		int[] lasts = new int[TYPES];
		
		long score = 0;
		for(int i = 0; i < D; i++) {
			final int type = answers[i];
			
			score += ss[i][type];
			lasts[type] = i + 1;
			
			for(int j = 0; j < TYPES; j++) {
				score -= cs[j] * ((i + 1) - lasts[j]);
			}
		}
		
		return score;
	}
	
	
	public static void main(String[] args) throws IOException {	
		try(final Scanner sc = new Scanner(System.in)){
			
			final int D = sc.nextInt();
			
			int[] cs = new int[TYPES];
			for(int i = 0; i < TYPES; i++) {
				cs[i] = sc.nextInt();
			}
			
			int[][] ss = new int[D][TYPES]; 
			for(int i = 0; i < D; i++) {
				for(int j = 0; j < TYPES; j++) {
					ss[i][j] = sc.nextInt();
				}
			}
			
			int[] answers = new int[D];
			for(int i = 0; i < D; i++) {
				int max = Integer.MIN_VALUE, max_index = -1;
				
				for(int j = 0; j < TYPES; j++) {
					if(max < ss[i][j]) {
						max = ss[i][j];
						max_index = j;
					}
				}
				
				answers[i] = max_index;
			}
			//System.out.println(calc(D, cs, ss, answers));
			
			//*
			{
				int[] lasts = new int[TYPES];
				
				for(int i = 0; i < D; i++) {
					long cur_max = Long.MIN_VALUE; int cur_index = -1;
					
					for(int type = 0; type < TYPES; type++) {
						int old_last = lasts[type];
						lasts[type] = i + 1;
					
						long delta = ss[i][type];
						for(int j = 0; j < TYPES; j++) {
							delta -= cs[j] * ((i + 1) - lasts[j]);
						}
						
						if(cur_max < delta) {
							cur_max = delta;
							cur_index = type;
						}
						
						lasts[type] = old_last;
					}
					
					lasts[cur_index] = i + 1;
					answers[i] = cur_index;
				}
			}
			//*/
			
			long score = calc(D, cs, ss, answers);
			//System.out.println(score); sc.next();
			
			
			final int M = 200000;
			for(int i = 0; i < M; i++) {
				final int d = (int)(Math.random() * D);
				final int q = (int)(Math.random() * TYPES);
				
				final int old_q = answers[d];
				answers[d] = q;
				
				final long next_score = calc(D, cs, ss, answers);
				//boolean forces = (M - i) / (double)(M) > Math.random();
				//System.out.println(score + " -> " + next_score);
				if(score >= next_score) {
					answers[d] = old_q;
				}else {
					score = next_score;
				}
				
			}
			
			for(int i = 0; i < D; i++) {
				System.out.println((answers[i] % TYPES) + 1);
			}
			
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
