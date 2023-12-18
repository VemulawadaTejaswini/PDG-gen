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
			final int A = sc.nextInt();
			final int B = sc.nextInt();
			final int Q = sc.nextInt();
			
			long[] ss = new long[A];
			long[] ts = new long[B];
			
			for(int i = 0; i < A; i++) {
				ss[i] = sc.nextLong();
			}
			for(int i = 0; i < B; i++) {
				ts[i] = sc.nextLong();
			}
			
			Arrays.sort(ss);
			Arrays.sort(ts);
			
			for(int q = 0; q < Q; q++) {
				final long x = sc.nextLong();
				
				long answer = Long.MAX_VALUE;
				// s_l
				{
					final int s_l_bin_index = Arrays.binarySearch(ss, x);
					if(s_l_bin_index != -1) {
						final int s_l_index = s_l_bin_index < 0 ? -(s_l_bin_index + 2) : s_l_bin_index;
						final long s_l = ss[s_l_index];
						final long s_l_cost = Math.abs(x - s_l);
						
						{
							final int t_l_bin_index = Arrays.binarySearch(ts, s_l);
							if(t_l_bin_index != -1) {
								final int t_l_index = t_l_bin_index < 0 ? -(t_l_bin_index + 2) : t_l_bin_index;
								final long t_l = ts[t_l_index];
								final long t_l_cost = Math.abs(s_l - t_l);
								
								answer = Math.min(answer, s_l_cost + t_l_cost);
							}
						}
						
						{
							final int t_r_bin_index = Arrays.binarySearch(ts, s_l);
							if(t_r_bin_index != -(B + 1)) {
								final int t_r_index = t_r_bin_index < 0 ? -(t_r_bin_index + 1) : t_r_bin_index;
								final long t_r = ts[t_r_index];
								
								if(s_l <= t_r && t_r <= x) {
									answer = Math.min(answer, s_l_cost + 0);
								}else {
									answer = Math.min(answer, s_l_cost + Math.abs(s_l - t_r));
								}
							}
						}
					}
				}
				// s_r
				{
					final int s_r_bin_index = Arrays.binarySearch(ss, x);
					if(s_r_bin_index != -(A + 1)) {
						final int s_r_index = s_r_bin_index < 0 ? -(s_r_bin_index + 1) : s_r_bin_index;
						final long s_r = ss[s_r_index];
						final long s_r_cost = Math.abs(x - s_r);
						
						{
							final int t_r_bin_index = Arrays.binarySearch(ts, s_r);
							if(t_r_bin_index != -(B + 1)) {
								final int t_r_index = t_r_bin_index < 0 ? -(t_r_bin_index + 1) : t_r_bin_index;
								final long t_r = ts[t_r_index];
								final long t_r_cost = Math.abs(s_r - t_r);
								
								answer = Math.min(answer, s_r_cost + t_r_cost);
							}
						}
						
						{
							final int t_l_bin_index = Arrays.binarySearch(ts, s_r);
							if(t_l_bin_index != -1) {
								final int t_l_index = t_l_bin_index < 0 ? -(t_l_bin_index + 2) : t_l_bin_index;
								final long t_l = ts[t_l_index];
								
								if(x <= t_l && t_l <= s_r) {
									answer = Math.min(answer, s_r_cost + 0);
								}else {
									answer = Math.min(answer, s_r_cost + Math.abs(s_r - t_l));
								}
							}
						}
					}
				}
				
				// t_l
				{
					final int t_l_bin_index = Arrays.binarySearch(ts, x);
					if(t_l_bin_index != -1) {
						final int t_l_index = t_l_bin_index < 0 ? -(t_l_bin_index + 2) : t_l_bin_index;
						final long t_l = ts[t_l_index];
						final long t_l_cost = Math.abs(x - t_l);
						
						{
							final int s_l_bin_index = Arrays.binarySearch(ss, t_l);
							if(s_l_bin_index != -1) {
								final int s_l_index = s_l_bin_index < 0 ? -(s_l_bin_index + 2) : s_l_bin_index;
								final long s_l = ss[s_l_index];
								final long s_l_cost = Math.abs(s_l - t_l);
								
								answer = Math.min(answer, t_l_cost + s_l_cost);
							}
						}
						
						{
							final int s_r_bin_index = Arrays.binarySearch(ss, t_l);
							if(s_r_bin_index != -(A + 1)) {
								final int s_r_index = s_r_bin_index < 0 ? -(s_r_bin_index + 1) : s_r_bin_index;
								final long s_r = ss[s_r_index];
								
								if(t_l <= s_r && s_r <= x) {
									answer = Math.min(answer, t_l_cost + 0);
								}else {
									answer = Math.min(answer, t_l_cost + Math.abs(t_l - s_r));
								}
							}
						}
					}
				}
				// t_r
				{
					final int t_r_bin_index = Arrays.binarySearch(ts, x);
					if(t_r_bin_index != -(B + 1)) {
						final int t_r_index = t_r_bin_index < 0 ? -(t_r_bin_index + 1) : t_r_bin_index;
						final long t_r = ts[t_r_index];
						final long t_r_cost = Math.abs(x - t_r);
						
						{
							final int s_l_bin_index = Arrays.binarySearch(ss, t_r);
							if(s_l_bin_index != -1) {
								final int s_l_index = s_l_bin_index < 0 ? -(s_l_bin_index + 2) : s_l_bin_index;
								final long s_l = ss[s_l_index];
								final long s_l_cost = Math.abs(s_l - t_r);
								
								if(t_r <= s_l && s_l <= x) {
									answer = Math.min(answer, t_r_cost + 0);
								}else {
									answer = Math.min(answer, t_r_cost + s_l_cost);
								}
							}
						}
						
						{
							final int s_r_bin_index = Arrays.binarySearch(ss, t_r);
							if(s_r_bin_index != -(A + 1)) {
								final int s_r_index = s_r_bin_index < 0 ? -(s_r_bin_index + 1) : s_r_bin_index;
								final long s_r = ss[s_r_index];
								
								answer = Math.min(answer, t_r_cost + Math.abs(s_r - t_r));
							}
						}
					}
				}

				System.out.println(answer);
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