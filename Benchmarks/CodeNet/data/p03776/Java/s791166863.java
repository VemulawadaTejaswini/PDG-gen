import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		final int A = sc.nextInt();
		final int B = sc.nextInt();
		
		long[] vs = new long[N];
		for(int i = 0; i < N; i++){
			final long v = sc.nextLong();
			vs[i] = v;
		}
		
		TreeMap<Long, Integer> counts = new TreeMap<Long, Integer>(Collections.reverseOrder());
		for(final long v : vs){
			if(!counts.containsKey(v)){
				counts.put(v, 0);
			}
			counts.put(v, counts.get(v) + 1);
		}
		
		long[][] comp = new long[N + 1][N + 1];
		comp[0][0] = 1;
		for(int i = 0; i < N; i++){
			for(int j = 0; j <= i; j++){
				comp[i + 1][j] += comp[i][j];
				comp[i + 1][j + 1] += comp[i][j];
			}
		}
		
		int rest = A;
		long sum = 0;
		for(final long v : counts.keySet()){
			final int count = counts.get(v);
			
			if(count <= rest){
				sum += v * count;
				rest -= count;
			}else{
				if(sum == 0){
					System.out.println(v);
					long opt = 0;
					
					for(int i = rest; i <= count; i++){
						opt += comp[count][i];
					}
					
					System.out.println(opt);
				}else{
					sum += v * rest;
					System.out.printf("%.08f\n", sum / (double)(A));
					System.out.println(comp[count][rest]);
					return;
				}
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