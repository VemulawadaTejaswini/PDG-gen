
import java.io.*;
import java.util.*;
 
public class Main{
	int N;
	int M;
	Node[] nodes;

	class Node{
		int idx;
		HashSet<Node> nodes;
		public Node(int idx){
			this.idx = idx;
			nodes = new HashSet<>();
		}
		
		public boolean equals(Object o){
			return idx == ((Node)o).idx;
		}
		
		public int hashCode(){
			return idx;
		}
	}
	
	public void solve(){
		N = nextInt();
		M = nextInt();
		nodes = new Node[N];
		for(int i = 0; i < N; i++){
			nodes[i] = new Node(i);
		}
		
		for(int i = 0; i < M; i++){
			int a = nextInt() - 1;
			int b = nextInt() - 1;
			nodes[a].nodes.add(nodes[b]);
			nodes[b].nodes.add(nodes[a]);
		}
		int ans = 0;
		for(int i = 0; i < N; i++){
			while(true){
				int ret = dfs(nodes[i], nodes[i], nodes[i], 0);
				if(ret == 0) break;
				ans += ret;
			}
		}
		out.println(ans);
	}
	public int dfs(Node base, Node prev, Node cur, int d){
		if(d == 3){
			if(base != cur && !base.nodes.contains(cur)){
				base.nodes.add(cur);
				cur.nodes.add(base);
				return 1;
			}else{
				return 0;
			}
			
		}else{
			int sum = 0;
			while(true){
				int val = 0;
				for(Node n : cur.nodes){
					if(n != prev){
						val = dfs(base, cur, n, d + 1);
						if(val != 0){
							sum += val;
							break;
						}
					}
				}
				if(val == 0) break;
			}
			return sum;
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