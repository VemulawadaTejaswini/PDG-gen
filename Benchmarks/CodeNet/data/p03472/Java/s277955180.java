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
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
 
public class Main {
	
	public static class Katana implements Comparable<Katana> {
		long a, b;
		
		public Katana(long a, long b){
			this.a = a;
			this.b = b;
		}

		@Override
		public int compareTo(Katana o) {
			return -Long.compare(this.b, o.b);
		}
	}
	
	public static void main(String[] args) throws IOException {
		try (Scanner sc = new Scanner(System.in)) {
			final int N = sc.nextInt();
			final long H = sc.nextLong();
			
			Katana[] ks = new Katana[N];
			
			long[] bs= new long[N];
			
			for(int i = 0; i < N; i++){
				final long a = sc.nextLong();
				final long b = sc.nextLong();
				
				ks[i] = new Katana(a, b);
				bs[i] = b;
			}
			
			Arrays.sort(bs);
			long[] b_post_sum = new long[bs.length + 1];
			for(int i = 1; i < b_post_sum.length; i++){
				b_post_sum[i] += b_post_sum[i - 1];
				b_post_sum[i] += bs[i - 1];
			}
			//System.out.println(Arrays.toString(bs));
			//System.out.println(Arrays.toString(b_post_sum));
			
			long min = Long.MAX_VALUE;
			for(final Katana katana : ks){
				final long curr_a = katana.a;
				
				int range_lower = -1, range_upper = N;
				while(range_lower + 1 < range_upper){
					final int middle = (range_lower + range_upper) / 2;
					//System.out.println("> " + bs[middle] + " " + middle);
					
					if(bs[middle] < curr_a){
						range_lower = middle;
					}else{
						range_upper = middle;
					}
				}
				//System.out.println(range_lower + " " + range_upper);
				
				int p_sum_lower = range_lower, p_sum_upper = N + 1;
				while(p_sum_lower + 1 < p_sum_upper){
					final int middle = (p_sum_lower + p_sum_upper) / 2;
					
					final long sum = b_post_sum[middle] - b_post_sum[range_upper];
					if(sum < H){
						p_sum_lower = middle;
					}else{
						p_sum_upper = middle;
					}
				}
				//System.out.println(p_sum_lower + " " + p_sum_upper);
				
				final int full_b_use_time = p_sum_upper - range_upper;
				final long full_b_use_sum = b_post_sum[p_sum_upper] - b_post_sum[range_upper];
				//System.out.println(full_b_use_time + " " + full_b_use_sum + " " + curr_a);
				
				if(full_b_use_sum < H){
					final long full_a_use_time = ((H - full_b_use_sum) + (curr_a - 1)) / (curr_a);
					//System.out.println(full_b_use_time + full_a_use_time);
					min = Math.min(min, full_b_use_time + full_a_use_time);
				}else{
					min = Math.min(min, full_b_use_time);
				}
				
			}
			
			System.out.println(min);
		}
	}
 
	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;
 
		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}
 
		private void getLine() throws IOException {
			while (!hasNext()) {
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
			for (int i = 0; i < n; i++) {
				ret[i] = this.nextInt();
			}
			return ret;
		}
 
		public long[] nextLongArray(int n) throws IOException {
			final long[] ret = new long[n];
			for (int i = 0; i < n; i++) {
				ret[i] = this.nextLong();
			}
			return ret;
		}
 
		public void close() throws IOException {
			br.close();
		}
	}
}