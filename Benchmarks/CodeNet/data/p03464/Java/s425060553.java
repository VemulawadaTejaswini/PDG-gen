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
	
	public static void check(final long N, long[] as){
		long ret = N;
		for(final long a : as){
			ret = (ret / a) * a;
		}
		
		if(ret != 2){ 
			System.out.println("Error : " + N);
		}else{
			System.out.println("OK : " + N);
		}
	}
	
	public static void main(String[] args) throws IOException {
		try (Scanner sc = new Scanner(System.in)) {
			final int K = sc.nextInt();
			
			long[] as = new long[K];
			for(int i = 0; i < K; i++){
				as[i] = sc.nextLong();
			}
			
			long lower = 2, upper = 2;
			for(int i = K - 1; i >= 0; i--){
				final long lower_div = ((lower + as[i] - 1) / as[i]) * as[i];
				final long upper_div = (upper / as[i]) * as[i];
				
				//System.out.println(lower_div + " " + upper_div);
				long next_lower = Integer.MAX_VALUE, next_upper = Integer.MIN_VALUE;
				
				boolean updated = false;
				if(lower <= lower_div && lower_div <= upper){
					next_lower = Math.min(next_lower, lower_div);
					next_upper = Math.max(next_upper, lower_div + (as[i] - 1));
					updated = true;
				}
				if(lower <= upper_div && upper_div <= upper){
					next_lower = Math.min(next_lower, upper_div);
					next_upper = Math.max(next_upper, upper_div + (as[i] - 1));
					updated = true;
				}
				
				if(!updated){ System.out.println(-1); return; }
				
				lower = next_lower;
				upper = next_upper;
				//System.out.println(lower + " " + upper);
			}
			
			System.out.println(lower + " " + upper);
			/*
			check(lower - 1, as);
			check(lower, as);
			check(upper, as);
			check(upper + 1, as);
			*/
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