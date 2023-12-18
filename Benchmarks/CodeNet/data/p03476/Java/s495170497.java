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
	
	public static void main(String[] args) throws IOException {
		try (Scanner sc = new Scanner(System.in)) {
			final int Q = sc.nextInt();
			
			final int MAX = 100000;
			boolean[] is_prime = new boolean[MAX + 1];
			Arrays.fill(is_prime, true);
			is_prime[0] = is_prime[1] = false;
					
			for(int i = 2; i * i <= MAX; i++){
				if(!is_prime[i]){ continue; }
				
				for(int j = 2 * i; j <= MAX; j += i){
					is_prime[j] = false;
				}
			}
			
			int[] prefixs = new int[MAX + 1];
			for(int i = 0; i <= MAX; i++){
				if(is_prime[i] && is_prime[(i + 1) / 2]){
					prefixs[i]++;
				}
			}
			for(int i = 1; i <= MAX; i++){
				prefixs[i] += prefixs[i - 1];
			}
			
			
			for(int q = 0; q < Q; q++){
				final int l = sc.nextInt();
				final int r = sc.nextInt();
				
				System.out.println(prefixs[r] - prefixs[l - 1]);
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