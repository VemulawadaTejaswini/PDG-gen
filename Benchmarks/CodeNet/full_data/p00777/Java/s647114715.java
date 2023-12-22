
import java.io.*;
import java.util.*;
 
public class Main{
	int N;
	int[] P = new int[1000];
	int[] D = new int[1000];

	public Node[] nodes;
	
	public void solve(){
		while((N = nextInt()) != 0){
			nodes = new Node[N];
			for(int i = 0; i < N; i++){
				nodes[i] = new Node(i);
			}
			
			for(int i = 0; i < N - 1; i++){
				P[i] = nextInt() - 1;
			}
			int wsum = 0;
			for(int i = 0; i < N - 1; i++){
				int d = nextInt();
				wsum += d;
				nodes[i + 1].addEdge(nodes[P[i]], d);
				nodes[P[i]].addEdge(nodes[i + 1], d);
			}
			for(Node n : nodes){
				if(n.next.size() == 1){
					n.isTerm = true;
				}
			}
			for(Node n : nodes){
				if(!n.isTerm){
					sumall = 0;
					Node s = diameterDFS(n, null, 0).a;
					wsum += sumall * 2;
					wsum -= diameterDFS(s, null, 0).b;
					
					break;
				}
			}
			out.println(wsum);
		}
		
	}
	
	class Node implements Iterable<Edge>{
		int idx;
		List<Edge> next;
		boolean isTerm = false;
		public Node(int idx){
			this.idx = idx;
			next = new ArrayList<>();
		}
		public void addEdge(Node to, int weight){
			next.add(new Edge(this, to, weight));
		}
		public Iterator<Edge> iterator(){
			return next.iterator();
		}
		public String toString(){
			StringBuilder build = new StringBuilder();
			build.append(idx);
			build.append(":(");
			boolean flg = true;
			for(Edge e : next){
				if(!flg){
					build.append(",");
				}
				flg = false;
				build.append(e.to.idx);
				build.append(":");
				build.append(e.weight);
			}
			build.append(")");
			return build.toString();
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

	Pair<Node, Integer> zero = new Pair<>(null, 0);
	int sumall;
	public Pair<Node, Integer> diameterDFS(Node current, Node from, int wsum){
		Pair<Node, Integer> ret = zero;
		for(Edge e : current){
			if(e.to != from && !e.to.isTerm){
				sumall += e.weight;
				Pair<Node, Integer> re = diameterDFS(e.to, current, wsum + e.weight);
				if(re.b.compareTo(ret.b) > 0){
					ret = re;
				}
			}
		}
		if(ret == zero){
			return new Pair<>(current, wsum);
		}else{
			return ret;
		}
	}
	

class Pair<A, B>{
	public A a;
	public B b;
	public Pair(A a, B b){
		this.a = a;
		this.b = b;
	}
	
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