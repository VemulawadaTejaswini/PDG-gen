import java.util.*;


import java.io.*;

public class Main {
	private static void solve(){
		//Implement solution here.
		int n = ni();
		int q = ni();
		//Build graph.
		Graph graph = new Graph(n,true);
		
		for(int i = 0; i < n - 1; i++) {
			graph.addEdge(ni(), ni());
		}
		for(int i = 0; i < q; i++) {
			graph.addValue(ni(), ni());
		}
		
		for(int i = 1; i <= n; i++) {
			System.out.print(graph.values[i] + " ");
		}
	}

	//Switch input source (stdin/file)
	private static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args){
		String debugDataPath = System.getenv("DD_PATH");        
		if(debugDataPath != null){
			try{
				br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(debugDataPath))));
			}catch(Exception e){
				throw new RuntimeException(e);
			}
		} 
		solve();
	}

	//Input read utility
	private static StringTokenizer tokenizer = null;
	public static String next() {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			try {
				tokenizer = new StringTokenizer(br.readLine());
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return tokenizer.nextToken();
	}
	//Get next single int
	private static int ni() {
		return Integer.parseInt(next());
	}
	//Get next single long
	private static long nl() {
		return Long.parseLong(next());
	}
	//Get next single double
	private static double nd() {
		return Double.parseDouble(next());
	}
	//Get next int array from one line
	private static int[] na(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = ni();
		return a;
	}
	//Get next char array from one line
	private static char[] ns() {
		return next().toCharArray();
	}
	//Get next long array from one line
	private static long[] nal(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)
			a[i] = nl();
		return a;
	}
}

class Graph{
	int nodeNum;
	private final boolean directed;
	ArrayList<Integer>[] edges;
	int[] values;

	Graph(int nodeNum,boolean directed){
		this.nodeNum = nodeNum;
		this.directed = directed;
		this.edges = new ArrayList[nodeNum + 1];
		this.values = new int[nodeNum + 1];
		for(int i = 0;i<nodeNum + 1;i++){
			edges[i] = new ArrayList<Integer>();
		}
	}

	public void addEdge(int node1,int node2){
		edges[node1].add(node2);
		if(!this.directed){
			edges[node2].add(node1);
		}
	}
	
	public void addValue(int root, int value) {
		values[root] += value;
		if(edges[root].size() > 0) {
			for(int i:edges[root]) {
				addValue(i, value);
			}
		}
	}
}