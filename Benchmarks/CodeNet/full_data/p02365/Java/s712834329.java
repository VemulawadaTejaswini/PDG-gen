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
	
	public static void main(String[] args) throws IOException {
		try(Scanner sc = new Scanner(System.in)){
			final int V = sc.nextInt();
			final int E = sc.nextInt();
			final int S = sc.nextInt();
			
			ArrayList<HashMap<Integer, Long>> fwd_adj = new ArrayList<HashMap<Integer, Long>>();
			ArrayList<HashMap<Integer, Long>> rev_adj = new ArrayList<HashMap<Integer, Long>>();
			for(int i = 0; i < V; i++){ fwd_adj.add(new HashMap<Integer, Long>()); }
			for(int i = 0; i < V; i++){ rev_adj.add(new HashMap<Integer, Long>()); }
			
			for(int i = 0; i < E; i++){
				final int s = sc.nextInt();
				final int t = sc.nextInt();
				final long w = sc.nextLong();
				
				if(!fwd_adj.get(s).containsKey(t)){
					fwd_adj.get(s).put(t, w);
				}else{
					fwd_adj.get(s).put(t, Math.min(w, fwd_adj.get(s).get(t)));
				}
				
				if(!rev_adj.get(t).containsKey(s)){
					rev_adj.get(t).put(s, w);
				}else{
					rev_adj.get(t).put(s, Math.min(w, rev_adj.get(t).get(s)));
				}
			}
			
			// ??????????????\???????°???????????????????????±???????
			long[] min_costs = new long[V];
			int[] min_pars = new int[V];
			min_costs[S] = 0;
			min_pars[S] = S;
			for(int start = 0; start < V; start++){
				if(start == S){ continue; }
				long min_cost = -1;
				int min_par = -1;
				
				for(final Entry<Integer, Long> entry : rev_adj.get(start).entrySet()){
					final int par = entry.getKey();
					final long cost = entry.getValue();
					
					if(min_cost < 0 || min_cost > cost){
						min_par = par;
						min_cost = cost;
					}
				}
				
				min_pars[start] = min_par;
				min_costs[start] = min_cost;
			}
			
			// ??????????????\???????????£????????????????¢????
			int cycle_start = -1;
			long cycle_sum = 0;
			boolean[] used = new boolean[V];
			for(int start = 0; start < V; start++){
				int curr = start;
				while(!used[curr] && min_pars[curr] != curr){
					used[curr] = true;
					cycle_sum += min_costs[curr];
					curr = min_pars[curr];
				}
				
				if(curr != S){
					// ?????????????????\?¬???????????°??????????????????????????????? 1 ??????????????\??????
					cycle_start = start;
					break;
				}else{
					// ????????????????????£?????¨???????????¨?????????
					Arrays.fill(used, false);
					cycle_sum = 0;
				}
			}
			
			// ????????????????????????????????????
			if(cycle_start < 0){
				System.out.println(Arrays.stream(min_costs).sum());
				return;
			}
			
			long min_diff = -1;
			for(int curr = cycle_start; curr != cycle_start; curr = min_pars[curr]){
				final int cycle_prev = min_pars[curr];
				final long cycle_cost = min_costs[curr];
				
				for(final Entry<Integer, Long> entry : rev_adj.get(curr).entrySet()){
					final int another_prev = entry.getKey();
					final long another_cost = entry.getValue();
					if(used[another_prev]){ continue; }
					
					final long diff = another_cost - cycle_cost;
					if(min_diff < 0 || min_diff > diff){
						min_diff = diff;
					}
				}
			}
			
			long sum = cycle_sum + min_diff;
			for(int i = 0; i < V; i++){
				if(used[i]){ continue; }
				sum += min_costs[i];
			}
			
			System.out.println(sum);
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