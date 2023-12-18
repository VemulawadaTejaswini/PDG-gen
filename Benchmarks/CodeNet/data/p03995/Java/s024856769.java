
import java.io.*;
import java.util.*;

 
public class Main{
	int R;
	int C;
	int N;
	
	class Graph{
		Node[] nodes;
		public Graph(int n){
			nodes = new Node[n];
			for(int i = 0; i < n; i++){
				nodes[i] = new Node(i);
			}
		}
		public void addEdge(int from, int to, int weight){
			nodes[from].add(new Edge(nodes[from], nodes[to], weight));
		}
		public void addBiEdge(int n1, int n2, int weight){
			addEdge(n1, n2, weight);
			addEdge(n2, n1, weight);
		}
	}
	
	class Node extends ArrayList<Edge>{
		int idx;
		int value;
		boolean flg;
		public Node(int idx){
			this.idx = idx;
		}
		
	}
	
	class Edge{
		Node from;
		Node to;
		int weight;
		public Edge(Node from, Node to, int weight){
			this.from = from;
			this.to = to;
			this.weight = weight;
		}
	}

	public void solve(){
		R = nextInt();
		C = nextInt();
		N = nextInt();
		
		Graph g = new Graph(R + C);
		
		for(int i = 0; i < N; i++){
			int r = nextInt() - 1;
			int c = nextInt() - 1;
			int a = nextInt();
			g.addBiEdge(r, c + R, a);
		}
		
		for(Node n : g.nodes){
			if(!n.flg){
				n.flg = true;
				n.value = 0;
				int[] min = new int[2];
				if(!dfs(n, min)){
					out.println("No");
					return;
				}
				if(min[0] + min[1] < 0){
					out.println("No");
					return;
				}
			}
		}
		out.println("Yes");
	}
	
	public boolean dfs(Node n, int[] min){
		if(n.idx < R){
			min[0] = Math.min(min[0], n.value);
		}else{
			min[1] = Math.min(min[1], n.value);
		}
		for(Edge p : n){
			if(p.to.flg){
				if(n.value + p.to.value != p.weight) return false;
			}else{
				p.to.flg = true;
				p.to.value = p.weight - n.value;
				if(!dfs(p.to, min)) return false;
			}
		}
		return true;
	}
	

	
	private static PrintWriter out;
	public static void main(String[] args){
		out = new PrintWriter(System.out);
		new Main().solve();
		out.flush();
	}
	
	
	
	public static int nextInt(){
		int num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(;i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10 + (c - '0');
		}
		return minus ? -num : num;
	}
	
	public static long nextLong(){
		long num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(;i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10l + (c - '0');
		}
		return minus ? -num : num;
	}
	public static String next(){
		int c;
		while(!isAlNum(c = read())){}
		StringBuilder build = new StringBuilder();
		build.append((char)c);
		while(isAlNum(c = read())){
			build.append((char)c);
		}
		return build.toString();
	}
	
	
	private static byte[] inputBuffer = new byte[1024];
	private static int bufferLength = 0;
	private static int bufferIndex = 0;
	private static int read(){
		if(bufferLength < 0) throw new RuntimeException();
		if(bufferIndex >= bufferLength){
			try{
				bufferLength = System.in.read(inputBuffer);
				bufferIndex = 0;
			}catch(IOException e){
				throw new RuntimeException(e);
			}
			if(bufferLength <= 0) return (bufferLength = -1);
		}
		return inputBuffer[bufferIndex++];
	}
	
	private static boolean isAlNum(int c){
		return '!' <= c && c <= '~';
	}
}