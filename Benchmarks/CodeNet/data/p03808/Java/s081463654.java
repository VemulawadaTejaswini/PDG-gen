import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		
		long[] array = new long[N];
		for(int i = 0; i < N; i++){
			array[i] = sc.nextLong();
		}
		
		long[] diff = new long[N];
		boolean all_zero = true;
		for(int i = 0; i < N; i++){
			diff[i] = (array[(i + 1) % N] - array[i]);
			
			all_zero &= (diff[i] == 0);
		}
		
		final long cycle = (long)(N) * (long)(N + 1) / 2;
		if(all_zero && array[0] % cycle != 0){
			System.out.println("NO");
			return;
		}
		
		//System.out.println(Arrays.toString(diff));
		
		long[] mod_diff = new long[N];
		for(int i = 0; i < N; i++){
			if(diff[i] < 0){
				mod_diff[i] = N - ((-diff[i]) % N);
			}else{
				mod_diff[i] = (diff[i] % N);
			}
		}
		
		//System.out.println(Arrays.toString(mod_diff));
		boolean all_same = true;
		for(int i = 1; i < N; i++){
			if(mod_diff[0] != mod_diff[i]){
				all_same = false;
				break;
			}
		}
		
		if(!all_same){
			System.out.println("NO");
			return;
		}
		
		long sum = 0;
		for(int i = 0; i < N; i++){
			sum += diff[i];
		}
		
		System.out.println(sum == 0 ? "YES" : "NO");
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
 
		public void close() throws IOException {
			br.close();
		}
	}
}