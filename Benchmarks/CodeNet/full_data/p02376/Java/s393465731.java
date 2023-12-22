
import java.io.*;
import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;


public class Main{
	public void solve(){
		int V = nextInt();
		int E = nextInt();
		Node[] nodes = new Node[V];
		for(int i = 0; i < V; i++){
			nodes[i] = new Node(i);
		}
		
		for(int i = 0; i < E; i++){
			int s = nextInt();
			int t = nextInt();
			int c = nextInt();
			nodes[s].addPath(nodes[t], c);
		}
		out.println(fordFulkerson(nodes[0], nodes[V - 1]));
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