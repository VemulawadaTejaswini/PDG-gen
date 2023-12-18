import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		final int M = sc.nextInt();
		
		long[] xs = new long[N];
		long[] ys = new long[N];
		for(int i = 0; i < N; i++){
			xs[i] = sc.nextLong();
			ys[i] = sc.nextLong();
		}
		
		long[] cs = new long[M];
		long[] ds = new long[M];
		for(int i = 0; i < M; i++){
			cs[i] = sc.nextLong();
			ds[i] = sc.nextLong();
		}
		
		for(int i = 0; i < N; i++){
			long dist = Long.MAX_VALUE;
			int min_j = -1;
			
			for(int j = 0; j < M; j++){
				final long d = Math.abs(xs[i] - cs[j]) + Math.abs(ys[i] - ds[j]);
				
				if(d < dist){
					dist = d;
					min_j = j;
				}
			}
			
			System.out.println(min_j + 1);
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