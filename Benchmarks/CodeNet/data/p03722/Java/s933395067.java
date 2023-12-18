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
	
	
	public static void main(String[] args) throws IOException {
		try(Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			final int M = sc.nextInt();
			
			ArrayList<HashMap<Integer, Long>> adj = new ArrayList<HashMap<Integer, Long>>();
			for(int i = 0; i < N; i++){ adj.add(new HashMap<Integer, Long>()); }
			
			for(int i = 0; i < M; i++){
				final int a = sc.nextInt() - 1;
				final int b = sc.nextInt() - 1;
				final long c = sc.nextLong();
				
				adj.get(a).put(b, c);
			}
			
			long[] costs = new long[N];
			Arrays.fill(costs, Long.MIN_VALUE);
			costs[0] = 0;
			
			LinkedList<Integer> queue = new LinkedList<Integer>();
			boolean[] in_queue = new boolean[N];
			int[] in_count = new int[N];
			
			queue.add(0);
			in_queue[0] = true;
			in_count[0] = 1;
			
			while(!queue.isEmpty()){
				final int node = queue.poll();
				in_queue[node] = false;
				
				if(in_count[node] > N){
					System.out.println("inf");
					return;
				}
				
				for(final Entry<Integer, Long> entry : adj.get(node).entrySet()){
					final int next = entry.getKey();
					final long next_cost = costs[node] + entry.getValue();
					
					if(costs[next] < next_cost){
						costs[next] = next_cost;
						if(!in_queue[next]){
							queue.add(next);	
							in_queue[next] = true;
							in_count[next] += 1;
						}
					}
				}
			}
			
			System.out.println(costs[N - 1]);
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