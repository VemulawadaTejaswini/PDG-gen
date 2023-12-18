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
		final int M = sc.nextInt();
		
		int[] count = new int[N];
		Arrays.fill(count, 1);
		
		boolean[] DP = new boolean[N];
		DP[0] = true;
		
		for(int i = 0; i < M; i++){
			final int x = sc.nextInt() - 1;
			final int y = sc.nextInt() - 1;
			
			if(DP[x]){
				if(count[x] >= 2){
					DP[x] = true;
				}else{
					DP[x] = false;
				}
				
				DP[y] = true;
			}
			count[x] -= 1;
			count[y] += 1;
			
			//System.out.println(Arrays.toString(DP));
		}
		
		int answer = 0;
		for(int i = 0; i < N; i++){
			if(DP[i]){ answer++; }
		}
		//System.out.println(Arrays.toString(DP));
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