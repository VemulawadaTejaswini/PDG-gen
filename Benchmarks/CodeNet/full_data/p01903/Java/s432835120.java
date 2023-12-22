
import java.io.*;
import java.util.*;

 
public class Main{
	
	int K;
	int N;
	int M;
	
	public void solve(){
		K = nextInt();
		N = nextInt();
		M = nextInt();
		
		Node[] nodes = new Node[N + K + 2];
		for(int i = 0; i < nodes.length; i++){
			nodes[i] = new Node(i);
		}
		Node sink = nodes[0];
		Node source = nodes[nodes.length - 1];
		for(int i = 0; i < K; i++){
			source.addPath(nodes[1 + i], Integer.MAX_VALUE);
		}
		for(int i = 0; i < M; i++){
			int a = nextInt();
			int b = nextInt();
			int c = nextInt();
			if((1 <= a && a <= K && b == 0) || (1 <= b && b <= K && a == 0)){
				out.println("overfuro");
				return;
			}
			nodes[a].addPath(nodes[b], c);
			nodes[b].addPath(nodes[a], c);
		}
		int base = fordFulkerson(source, sink);
		int ans = 0;
		for(int i = 0; i < nodes.length; i++){
			for(Path p : nodes[i].next){
				if(p.weight == p.value){
					Node[] copy = new Node[nodes.length];
					for(int j = 0; j < nodes.length; j++){
						copy[j] = new Node(j);
					}
					for(Node nn : nodes){
						for(Path pp : nn.next){
							Path np = new Path(copy[nn.idx], copy[pp.to.idx], pp.weight);
							np.value = pp.value;
							if(pp == p){
								np.weight = Integer.MAX_VALUE;
							}
							np.from.next.add(np);
							np.to.rev.add(np);
						}
					}
					ans = Math.max(ans, fordFulkerson(copy[nodes.length - 1], copy[0]));
				}
			}
		}
		out.println(base + ans);
	}
	


	class Node{
		int idx;
		int count;
		List<Path> next;
		List<Path> rev;
		public Node(int idx){
			this.idx = idx;
			this.count = 0;
			next = new LinkedList<>();
			rev = new LinkedList<>();
		}
		public void addPath(Node to, int weight){
			Path p = new Path(this, to, weight);
			next.add(p);
			to.rev.add(p);
		}
	}
	
	class Path{
		Node from;
		Node to;
		int weight;
		int value;
		
		public Path(Node from, Node to, int weight){
			this.from = from;
			this.to = to;
			this.weight = weight;
		}
	}
	
	public int fordFulkerson(Node source, Node sink){
		int count = 1;
		int ans = 0;
		while(true){
			int v = dfs(source, sink, Integer.MAX_VALUE, count);
			if(v == 0) break;
			ans += v;
			count++;
		}
		return ans;
	}
	
	public int dfs(Node current, Node sink, int v, int count){
		if(current.count < count){
			current.count = count;
			
			if(current == sink){
				return v;
				
			}else{
				for(Path next : current.next){
					if(next.weight - next.value > 0){
						int v2 = Math.min(v, next.weight - next.value);
						int v3 = dfs(next.to, sink, v2, count);
						if(v3 > 0){
							next.value += v3;
							return v3;
						}
					}
				}

				for(Path rev : current.rev){
					if(rev.value > 0){
						int v2 = Math.min(v, rev.value);
						int v3 = dfs(rev.from, sink, v2, count);
						if(v3 > 0){
							rev.value -= v3;
							return v3;
						}
					}
				}
			}
		}
		return 0;
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