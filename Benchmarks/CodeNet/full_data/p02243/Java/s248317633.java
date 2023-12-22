import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	public static final int INF = Integer.MAX_VALUE / 2 - 1;
	
	public static class Walk implements Comparable<Walk> {
		int node, cost;

		public Walk(int node, int cost) {
			super();
			this.node = node;
			this.cost = cost;
		}

		@Override
		public int compareTo(Walk arg0) {
			return this.cost < arg0.cost ? -1 : this.cost > arg0.cost ? 1 : 0;
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		ArrayList<ArrayList<Integer>> adj_cost = new ArrayList<ArrayList<Integer>>();		
		ArrayList<ArrayList<Integer>> adj_node = new ArrayList<ArrayList<Integer>>();		
		for(int i = 0; i < n; i++){
			adj_cost.add(new ArrayList<Integer>());
			adj_node.add(new ArrayList<Integer>());
		}
		
		for(int i = 0; i < n; i++){
			final int u = sc.nextInt();
			
			final int k = sc.nextInt();
			
			for(int j = 0; j < k; j++){
				final int v = sc.nextInt();
				final int c = sc.nextInt();
				
				adj_cost.get(u).add(c);
				adj_node.get(u).add(v);
			}
		}
		
		int[] times = new int[n];
		Arrays.fill(times, INF);
		times[0] = 0;
		
		PriorityQueue<Walk> queue = new PriorityQueue<Walk>();
		queue.add(new Walk(0, 0));
		
		while(!queue.isEmpty()){
			final Walk walk = queue.poll();
			final int cur_node = walk.node;
			final int cur_cost = walk.cost;
			
			if(times[cur_node] > cur_cost){
				continue;
			}
			
			final int size = adj_node.get(cur_node).size();
			for(int i = 0; i < size; i++){
				final int next = adj_node.get(cur_node).get(i);
				final int next_cost = cur_cost + adj_cost.get(cur_node).get(i);
				
				if(times[next] <= next_cost){
					continue;
				}else{
					times[next] = next_cost;
					queue.add(new Walk(next, next_cost));
				}
			}
		}
		
		for(int i = 0; i < n; i++){
			System.out.println(i + " " + times[i]);
		}
		
	}

	public static class Scanner {
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

		public void close() throws IOException {
			br.close();
		}
	}

}