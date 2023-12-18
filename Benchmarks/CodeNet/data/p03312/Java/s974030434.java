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
	
	public static long get(long[] prefix_sum, int begin, int end) {
		return prefix_sum[end] - prefix_sum[begin];
	}
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			long[] array = new long[N];
			for(int i = 0; i < N; i++) {
				array[i] = sc.nextLong();
			}
			
			long answer = Long.MAX_VALUE;
			
			long[] prefix_sum = new long[N + 1];
			for(int i = 0; i < N; i++) { prefix_sum[i + 1] = array[i]; }
			for(int i = 1; i <= N; i++) { prefix_sum[i] += prefix_sum[i - 1]; }
			
			for(int divide = 2; divide <= (N - 2); divide++) {
				final int fst_begin = 0;
				final int fst_end = divide;
				
				int fst_lower = fst_begin + 1, fst_upper = fst_end - 1;
				while(fst_lower + 1 < fst_upper) {
					final int fst_mid = (fst_lower + fst_upper) / 2;
					
					final long lower_value = get(prefix_sum, fst_mid, fst_begin);
					final long upper_value = get(prefix_sum, fst_end, fst_mid);
					final long value = lower_value - upper_value;
					//System.out.println(lower_value + " " + upper_value + " " + value);
					
					if(value > 0) {
						fst_lower = fst_mid;
					}else{
						fst_upper = fst_mid;
					}
				}
				//System.out.println(divide + " " + fst_lower + " " + fst_upper + " " + get(prefix_sum, fst_begin, fst_lower));
				//System.out.println(divide + " " + fst_lower + " " + fst_upper + " " + get(prefix_sum, fst_lower, fst_end));
				
				final int snd_begin = divide;
				final int snd_end = N;
				int snd_lower = snd_begin + 1, snd_upper = snd_end - 1;
				while(snd_lower + 1 < snd_upper) {
					final int snd_mid = (snd_lower + snd_upper) / 2;
					
					final long lower_value = get(prefix_sum, snd_mid, snd_begin);
					final long upper_value = get(prefix_sum, snd_end, snd_mid);
					final long value = lower_value - upper_value;
					//System.out.println(lower_value + " " + upper_value + " " + value);
					
					if(value > 0) {
						snd_lower = snd_mid;
					}else{
						snd_upper = snd_mid;
					}
				}
				
				{
					final long P = get(prefix_sum, fst_begin, fst_lower);
					final long Q = get(prefix_sum, fst_lower, fst_end);
					final long R = get(prefix_sum, snd_begin, snd_lower);
					final long S = get(prefix_sum, snd_lower, snd_end);
					
					final long max = Math.max(Math.max(P, Q), Math.max(R, S));
					final long min = Math.min(Math.min(P, Q), Math.min(R, S));
					
					answer = Math.min(answer, Math.abs(max - min));
				}
				{
					final long P = get(prefix_sum, fst_begin, fst_upper);
					final long Q = get(prefix_sum, fst_upper, fst_end);
					final long R = get(prefix_sum, snd_begin, snd_lower);
					final long S = get(prefix_sum, snd_lower, snd_end);
					
					final long max = Math.max(Math.max(P, Q), Math.max(R, S));
					final long min = Math.min(Math.min(P, Q), Math.min(R, S));
					
					answer = Math.min(answer, Math.abs(max - min));
				}
				{
					final long P = get(prefix_sum, fst_begin, fst_lower);
					final long Q = get(prefix_sum, fst_lower, fst_end);
					final long R = get(prefix_sum, snd_begin, snd_upper);
					final long S = get(prefix_sum, snd_upper, snd_end);
					
					final long max = Math.max(Math.max(P, Q), Math.max(R, S));
					final long min = Math.min(Math.min(P, Q), Math.min(R, S));
					
					answer = Math.min(answer, Math.abs(max - min));
				}
				{
					final long P = get(prefix_sum, fst_begin, fst_upper);
					final long Q = get(prefix_sum, fst_upper, fst_end);
					final long R = get(prefix_sum, snd_begin, snd_upper);
					final long S = get(prefix_sum, snd_upper, snd_end);
					
					final long max = Math.max(Math.max(P, Q), Math.max(R, S));
					final long min = Math.min(Math.min(P, Q), Math.min(R, S));
					
					answer = Math.min(answer, Math.abs(max - min));
				}
				
				//System.out.println(divide + " " + snd_lower + " " + fst_upper + " " + get(prefix_sum, snd_begin, snd_lower));
				//System.out.println(divide + " " + snd_lower + " " + fst_upper + " " + get(prefix_sum, snd_lower, snd_end));
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