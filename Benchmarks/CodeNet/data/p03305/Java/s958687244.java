
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.ToLongFunction;
import java.util.stream.IntStream;

public class Main{
	class Node{
		int idx;
		List<Edge> next;
		
		long cost;
		
		public Node(int idx) {
			this.next = new ArrayList<>();
			this.idx = idx;
		}
	}
	
	class Edge{
		Node n1;
		Node n2;
		long a;
		long b;
		
		public Edge(Node n1, Node n2, long a, long b) {
			this.n1 = n1;
			this.n2 = n2;
			this.a = a;
			this.b = b;
		}
	}
	
	int N, M, S, T;
	Node[] nodes;
	
	public void solve(){
		N = nextInt();
		M = nextInt();
		S = nextInt() - 1;
		T = nextInt() - 1;
		
		nodes = IntStream.range(0, N).mapToObj(Node::new).toArray(Node[]::new);
		
		for(int i = 0; i < M; i++) {
			int u = nextInt() - 1;
			int v = nextInt() - 1;
			long a = nextLong();
			long b = nextLong();
			nodes[u].next.add(new Edge(nodes[u], nodes[v], a, b));
			nodes[v].next.add(new Edge(nodes[v], nodes[u], a, b));
		}

		long[] c1 = dijkstra(S, n -> n.a);
		long[] c2 = dijkstra(T, n -> n.b);
		
		for(int i = 0; i < N; i++) {
			nodes[i].cost = c1[i] + c2[i];
		}
		
		Arrays.sort(nodes, Comparator.comparingLong(v -> v.cost));
		
		int current = 0;
		
		for(int i = 0; i < N; i++) {
			while(nodes[current].idx < i) {
				current++;
			}
			out.println(1_000_000_000_000_000L - nodes[current].cost);
		}
		
	}
	
	public long[] dijkstra(int begin, ToLongFunction<Edge> func) {
		final long[] cost = new long[N];
		Arrays.fill(cost, (long)Integer.MAX_VALUE * N);
		cost[begin] = 0;
		
		Queue<Integer> queue = new PriorityQueue<>(Comparator.comparingLong(v -> cost[v]));
		queue.offer(begin);
		
		while(!queue.isEmpty()) {
			int idx = queue.poll();
			for(Edge e : nodes[idx].next) {
				long sum = cost[idx] + func.applyAsLong(e);
				if(cost[e.n2.idx] > sum) {
					cost[e.n2.idx] = sum; 
					queue.offer(e.n2.idx);
				}
			}
		}
		return cost;
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