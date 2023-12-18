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
	
	public static final long MOD = 1000000007;
	
	public static int grundy(int[] memo, int K, int[] array) {
		if(memo[K] >= 0) { return memo[K]; }
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(final int a : array) {
			if(K < a) { continue; }
			set.add(grundy(memo, K - a, array));
		}
		
		for(int i = 0; i < K; i++) {
			if(!set.contains(i)) { return memo[K] = i; }
		}
		return memo[K] = K;
	}
	
	public static void main(String[] args) throws IOException {
		try(final Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int K = sc.nextInt();
			
			final int[] array = new int[N];
			for(int i = 0; i < N; i++) { array[i] = -sc.nextInt(); }
			Arrays.sort(array);
			for(int i = 0; i < N; i++) { array[i] = -array[i]; }
			
			final int[] memo = new int[K + 1];
			Arrays.fill(memo, -1);
			
			
			Thread t = new Thread(null, null, "TT", 1000000000) {
				@Override public void run() {
					grundy(memo, K, array);
				}
			};
			t.start();
			try{
				t.join();
				System.out.println(grundy(memo, K, array) == 0 ? "Second" : "First");
			}catch(InterruptedException e){
				e.printStackTrace();
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