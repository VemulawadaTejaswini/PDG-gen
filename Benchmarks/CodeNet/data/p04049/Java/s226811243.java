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
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.StringTokenizer;
 
public class Main {
	
	public static final int INF = Integer.MAX_VALUE /2 - 1;
	
	public static int double_sweep(ArrayList<HashSet<Integer>> adj, boolean[] deleted, final int K){
		int start = -1;
		for(int i = 0; i < deleted.length; i++){
			if(!deleted[i]){ start = i; }
		}
		
		LinkedList<Integer> node_queue = new LinkedList<Integer>();
		LinkedList<Integer> parent_queue = new LinkedList<Integer>();
		int[] node_depth = new int[adj.size()];
		Arrays.fill(node_depth, INF);
		
		node_queue.add(start);
		node_depth[start] = 0;
		parent_queue.add(-1);
		
		int max_depth = 0, max_node = start;
		while(!node_queue.isEmpty()){
			final int node   = node_queue.poll();
			final int parent = parent_queue.poll();
			
			for(final int next : adj.get(node)){
				if(next == parent){ continue; }
				if(deleted[next]){ continue; }
				
				node_depth[next] = node_depth[node] + 1;
				if(max_depth < node_depth[next]){
					max_depth = node_depth[next];
					max_node = next;
				}
				node_queue.add(next);
				parent_queue.add(node);
			}
		}
		
		node_queue.clear();
		parent_queue.clear();
		Arrays.fill(node_depth, INF);
		
		node_queue.add(max_node);
		parent_queue.add(-1);
		node_depth[max_node] = 0;
		max_depth = 0;
		
		while(!node_queue.isEmpty()){
			final int node   = node_queue.poll();
			final int parent = parent_queue.poll();
			
			for(final int next : adj.get(node)){
				if(next == parent){ continue; }
				if(deleted[next]){ continue; }
				
				node_depth[next] = node_depth[node] + 1;
				max_depth = Math.max(max_depth, node_depth[next]);
				node_queue.add(next);
				parent_queue.add(node);
			}
		}
		
		if(max_depth <= K){ return 0; }
		
		int delete_count = 0;
		for(int i = 0; i < node_depth.length; i++){
			if(node_depth[i] == max_depth){
				deleted[i] = true;
				delete_count++;
			}
		}
		
		return delete_count;
	}
	
	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		
		final int N = sc.nextInt();
		final int K = sc.nextInt();
		
		ArrayList<HashSet<Integer>> adj = new ArrayList<HashSet<Integer>>();
		for(int i = 0; i < N; i++){
			adj.add(new HashSet<Integer>());
		}
		
		for(int i = 0; i < N - 1; i++){
			final int fst = sc.nextInt() - 1;
			final int snd = sc.nextInt() - 1;
			
			adj.get(fst).add(snd);
			adj.get(snd).add(fst);
		}
		
		boolean[] deleted = new boolean[N];
		int count = 0;
		while(true){
			final int ret = double_sweep(adj, deleted, K);
			if(ret == 0){ break; }
			
			count += ret;
		}
		System.out.println(count);
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