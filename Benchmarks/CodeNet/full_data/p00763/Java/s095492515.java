
import java.io.*;
import java.util.*;
 
public class Main{
	
	int N, M, C, S, G;
	Node[][] nodes;
	int[][][] table;
	public void solve(){
		while(true){
			N = nextInt();
			if(N == 0) break;
			M = nextInt();
			C = nextInt();
			S = nextInt() - 1;
			G = nextInt() - 1;
			nodes = new Node[C][N];
			for(int i = 0; i < C; i++){
				for(int j = 0; j < N; j++){
					nodes[i][j] = new Node(i, j);
				}
			}
			
			for(int i = 0; i < M; i++){
				int x = nextInt() - 1;
				int y = nextInt() - 1;
				int d = nextInt();
				int c = nextInt() - 1;
				for(int j = 0; j < C; j++){
					nodes[j][x].addPath(nodes[c][y], d);
					nodes[j][y].addPath(nodes[c][x], d);
				}
			}
		
			
			table = new int[C][][];
			for(int i = 0; i < C; i++){
				table[i] = new int[nextInt()][2];
			}

			for(int i = 0; i < C; i++){
				for(int j = 0; j < table[i].length - 1; j++){
					table[i][j][0] = nextInt();
				}
				table[i][table[i].length - 1][0] = Integer.MAX_VALUE;

				for(int j = 0; j < table[i].length; j++){
					table[i][j][1] = nextInt();
				}
			}
			
			Node start = new Node(0, 0);
			for(int i = 0; i < C; i++){
				start.addPath(nodes[i][S], 0);
			}
			Node goal = new Node(0, 0);
			for(int i = 0; i < C; i++){
				nodes[i][G].addPath(goal, 0);
			}
			dijkstra(start);
			out.println(goal.distance == Integer.MAX_VALUE ? -1 : goal.distance);
		}
	}
	
	class Node{
		int idx;
		int no;
		int distance;
		List<Path> next;
		public Node(int idx, int no){
			this.idx = idx;
			this.no = no;
			this.distance = Integer.MAX_VALUE;
			next = new LinkedList<>();
		}
		public void addPath(Node to, int weight){
			next.add(new Path(this, to, weight));
		}
		public int getDistance(){
			return distance;
		}
		public String toString(){
			return "(" + idx +"," + no + ")";
		}
	}
	
	class Path{
		Node from;
		Node to;
		int weight;
		
		public Path(Node from, Node to, int weight){
			this.from = from;
			this.to = to;
			this.weight = weight;
		}
	
		public String toString(){
			return from + "->" + to;
		}
	}

	class Pair{
		int distance;
		int c;
		int len;
		int base;
		Node n;
		public Pair(Node n, int distance, int c, int len, int base){
			this.n = n;
			this.distance = distance;
			this.c = c;
			this.len = len;
			this.base = base;
		}
	}
	
	public void dijkstra(Node start){
		start.distance = 0;
		PriorityQueue<Pair> queue = new PriorityQueue<>((a, b) -> Integer.compare(a.distance, b.distance));
		queue.offer(new Pair(start, 0, 0, 0, 0));
		while(!queue.isEmpty()){
			Pair n = queue.poll();
			for(Path p : n.n.next){
				Pair np;
				if(p.to.idx == n.c){
					int d = n.base + calcCost(n.c, n.len + p.weight);
					np = new Pair(p.to, d, p.to.idx, n.len + p.weight, n.base);
					
				}else{
					int d = n.distance + calcCost(p.to.idx, p.weight);
					np = new Pair(p.to, d, p.to.idx, p.weight, n.distance);
				}
				
				if(np.distance < p.to.distance){
					p.to.distance = np.distance;
					queue.offer(np);
				}
			}
		}
	}
	
	public int calcCost(int c, int len){
		int ans = 0;
		int cur = 0;
		for(int i = 0; i < table[c].length; i++){
			if(table[c][i][0] >= len){
				ans += (len - cur) * table[c][i][1];
				break;
			}else{
				ans += (table[c][i][0] - cur) * table[c][i][1];
				cur = table[c][i][0];
			}
		}
		return ans;
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