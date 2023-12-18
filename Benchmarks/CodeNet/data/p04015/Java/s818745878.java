import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
 
public class Main {
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		final int A = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i = 0; i < N; i++){
			arr[i] = sc.nextInt();
		}
		
		final int MAX = N * A;
		
		long[][] DP = new long[N + 1][MAX + 1];
		DP[0][0] = 1;
		
		for(int index = 0; index < N; index++){
			final int value = arr[index];
			
			for(int prev_index = index; prev_index >= 0; prev_index--){
				
				for(int curr_value = MAX - value; curr_value >= 0; curr_value--){
					DP[prev_index + 1][curr_value + value] += DP[prev_index][curr_value];
				}
			}
		}
		
		long answer = 0;
		for(int i = 1; i <= N; i++){
			answer += DP[i][i * A];
		}
		//System.out.println(Arrays.deepToString(DP));
		
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
 
		public void close() throws IOException {
			br.close();
		}
	}
}