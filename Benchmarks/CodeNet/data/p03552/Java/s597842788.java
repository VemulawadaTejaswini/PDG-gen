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

import javax.swing.text.Segment;

public class Main {
	
	public static long naive_dfs(int turn, long[] as, long Z, long W, int top){
		if(top >= as.length - 1){
			return Math.abs(Z - W);
		}
		
		if(turn == 0){
			long max = Long.MIN_VALUE;
			
			for(int next = top + 1; next < as.length; next++){
				max = Math.max(max, naive_dfs(1 - turn, as, as[next], W, next));
			}
			
			return max;
		}else{
			long min = Long.MAX_VALUE;
			
			for(int next = top + 1; next < as.length; next++){
				min = Math.min(min, naive_dfs(1 - turn, as, Z, as[next], next));
			}
			
			return min;
		}		
	}
	
	//public static long calls = 0;
	public static long memo_dfs(int turn, long[] as, long Z, long W, int top, int X_top, int Y_top, long[][] memo){
		final boolean can_use_memo = Math.min(X_top, Y_top) >= 0;
		
		//System.out.println(top + " " + Z + "[" + X_top + "]" +  " " + W + "[" + Y_top + "]");
		
		if(top >= as.length - 1){
			if(can_use_memo){
				return memo[top][turn] = Math.abs(Z - W);
			}else{
				return Math.abs(Z - W);
			}
		}else if(can_use_memo && memo[top][turn] >= 0){
			return memo[top][turn];
		}
		
		//calls++;
		
		if(turn == 0){
			long max = Long.MIN_VALUE;
			
			for(int next = top + 1; next < as.length; next++){
				max = Math.max(max, memo_dfs(1 - turn, as, as[next], W, next, next, Y_top, memo));
			}
			
			if(can_use_memo){
				return memo[top][turn] = max;
			}else{	
				return max;
			}
		}else{
			long min = Long.MAX_VALUE;
			
			for(int next = top + 1; next < as.length; next++){
				min = Math.min(min, memo_dfs(1 - turn, as, Z, as[next], next, X_top, next, memo));
			}
			
			if(can_use_memo){
				return memo[top][turn] = min;
			}else{
				return min;
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		try (Scanner sc = new Scanner(System.in)) {
			final int N = sc.nextInt();
			
			final long Z = sc.nextLong();
			final long W = sc.nextLong();
			long[] as = new long[N];
			for(int i = 0; i < N; i++){
				as[i] = sc.nextLong();
			}
			
			//System.out.println("start");
			//System.out.println(naive_dfs(0, as, Z, W, -1));
			long[][] memo = new long[N][2];
			for(int i = 0; i < N; i++){
				memo[i][0] = memo[i][1] = -1;
			}
			
			System.out.println(memo_dfs(0, as, Z, W, -1, -1, -1, memo));
			//System.out.println(calls);
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