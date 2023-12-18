import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	
	public static long roundup(long W, long H){
		final long W_lim = (W + 2) / 3;
		final long S1 = W_lim * H;
		final long H_lim = (H + 1) / 2;
		final long S2 = (W - W_lim) * H_lim;
		final long S3 = (W - W_lim) * (H - H_lim);
		
		return Math.max(S1, Math.max(S2, S3)) - Math.min(S1, Math.min(S2, S3));
	}
	
	public static long roundhalf(long W, long H){
		final long W_lim = (W + 1) / 3;
		final long S1 = W_lim * H;
		final long H_lim = (H + 1) / 2;
		final long S2 = (W - W_lim) * H_lim;
		final long S3 = (W - W_lim) * (H - H_lim);
		
		return Math.max(S1, Math.max(S2, S3)) - Math.min(S1, Math.min(S2, S3));
	}
	
	public static long rounddown(long W, long H){
		final long W_lim = W / 3;
		final long S1 = W_lim * H;
		final long H_lim = (H + 1) / 2;
		final long S2 = (W - W_lim) * H_lim;
		final long S3 = (W - W_lim) * (H - H_lim);
		
		return Math.max(S1, Math.max(S2, S3)) - Math.min(S1, Math.min(S2, S3));
	}
	
	public static long calc(long W, long H){
		return Math.min(roundup(W, H), Math.min(roundhalf(W, H), rounddown(W, H)));
	}
	
	public static void main(String[] args) throws IOException {
		try(Scanner sc = new Scanner(System.in)){
			final long W = sc.nextInt();
			final long H = sc.nextInt();
			
			final long min = Math.min(W, H);
			final long max = Math.max(W, H);
			
			if(max <= 2){
				System.out.println(1);
			}else if(max % 3 == 0 || min % 3 == 0){
				System.out.println(0);
			}else if(min <= 2){
				System.out.println(1);
			}else{
				System.out.println(Math.min(calc(W, H), calc(H, W)));
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