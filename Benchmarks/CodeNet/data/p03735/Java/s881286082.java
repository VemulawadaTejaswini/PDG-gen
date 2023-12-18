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
import java.util.TreeSet;

public class Main {
	
	public static class State implements Comparable<State> {
		int step, selected;
		long r_min, r_max, b_min, b_max;
		
		public State(int step, int select, long r_min, long r_max, long b_min, long b_max){
			this.step = step;
			this.selected = select;
			this.r_min = r_min;
			this.r_max = r_max;
			this.b_min = b_min;
			this.b_max = b_max;
		}
		
		public long cost(){
			return (r_max - r_min) * (b_max - b_min);
		}
		
		public int compareTo(State arg0){
			return Long.compare(this.cost(), arg0.cost());
		}
	}
	
	public static void main(String[] args) throws IOException {
		try(Scanner sc = new Scanner(System.in)){
			final int N = sc.nextInt();
			
			long[] rs = new long[N];
			long[] bs = new long[N];
			
			for(int i = 0; i < N; i++){
				rs[i] = sc.nextLong();
				bs[i] = sc.nextLong();
			}
			
			PriorityQueue<State> queue = new PriorityQueue<State>();
			queue.add(new State(1, 0, rs[0], rs[0], bs[0], bs[0]));
			
			HashMap<Integer, HashSet<TreeSet<Long>>> visited = new HashMap<Integer, HashSet<TreeSet<Long>>>();
			for(int i = 0; i < N; i++){
				visited.put(i, new HashSet<TreeSet<Long>>());
			}
			
			while(!queue.isEmpty()){
				final State state = queue.poll();
				if(state.step == N){
					System.out.println(state.cost());
					break;
				}
				
				TreeSet<Long> set = new TreeSet<Long>();
				set.add(state.r_max);
				set.add(state.r_min);
				
				if(visited.get(state.step).contains(set)){ continue; }
				visited.get(state.step).add(set);
				
				{
					final long r_min = Math.min(state.r_min, rs[state.step]);
					final long r_max = Math.max(state.r_max, rs[state.step]);
					final long b_min = Math.min(state.b_min, bs[state.step]);
					final long b_max = Math.max(state.b_max, bs[state.step]);
					
					queue.add(new State(state.step + 1, 0, r_min, r_max, b_min, b_max));
				}
				{
					final long r_min = Math.min(state.r_min, bs[state.step]);
					final long r_max = Math.max(state.r_max, bs[state.step]);
					final long b_min = Math.min(state.b_min, rs[state.step]);
					final long b_max = Math.max(state.b_max, rs[state.step]);
					
					queue.add(new State(state.step + 1, 1, r_min, r_max, b_min, b_max));
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