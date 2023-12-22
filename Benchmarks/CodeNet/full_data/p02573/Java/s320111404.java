import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main{
	
	static long mod = (int)1e9 + 7;
	

	public static void main(String[] args) throws Exception{

		FastScanner fs = new FastScanner();
		PrintWriter out = new PrintWriter(System.out);
		
		int n = fs.nextInt();
		int m = fs.nextInt();
		
		Node[] nodes = new Node[n];
		for(int i=0;i<n;i++) nodes[i] = new Node();
		
		for(int i=0;i<m;i++) {
			int a = fs.nextInt()-1, b = fs.nextInt()-1;
			if(nodes[a].set.add(b)) nodes[a].adjList.add(b);
			if(nodes[b].set.add(a)) nodes[b].adjList.add(a);
		}
		
		int ans = 0;
		
		for(int i=0;i<n;i++) {
			ans = Math.max(ans, dfs(nodes,nodes[i]));
		}
		
		out.println(ans);
		
		out.close();
		
		

		
	}
	
	static int dfs(Node[] nodes, Node node) {
		if(node.visited) return 0;
		int count = 1;
		node.visited = true;
		for(int i: node.adjList) {
			if(!nodes[i].visited) {
				count += dfs(nodes,nodes[i]);
			}
		}
		return count;
	}
	
	static class Node{
		ArrayList<Integer> adjList = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		boolean visited = false;
		
	}
	
	
	
	
	
	static class FastScanner{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		public String next(){
			while(!st.hasMoreElements()){
				try{
					st = new StringTokenizer(br.readLine());
				} catch(IOException e){
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		
		public String nextLine() throws IOException {
			return br.readLine();
		}
		
		public int nextInt(){
			return Integer.parseInt(next());
		}

		public int[] readArray(int n){
			int[] a = new int[n];
			for(int i=0;i<n;i++)
				a[i] = nextInt();
			return a;
		}
		
		public long nextLong() {
			return Long.parseLong(next());
		}
	}
	


}