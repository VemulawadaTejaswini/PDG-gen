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
		final int K = sc.nextInt();
		
		long[] as = new long[N];
		for(int i = 0; i < N; i++){
			as[i] = sc.nextLong();
		}
		
		if(N > 400 || K > 400){ return; }
		
		long answer = 0;
		long[] counts = new long[2 * K + 1];
		LOOP:
		for(int index = 0; index < N; index++){
			if(as[index] >= K){ continue; }
			
			Arrays.fill(counts, 0);
			counts[0] = 1;
			
			for(int other = 0; other < N; other++){
				if(as[other] >= K || other == index){ continue; }
				
				for(int i = K - 1; i >= as[other]; i--){
					counts[i] += counts[i - (int)(as[other])];
				}
			}
			
			for(int i = K - 1; i >= (K - as[index]); i--){
				if(counts[i] != 0){
					continue LOOP;
				}
			}
			
			answer++;
		}
		
		System.out.println(answer);
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