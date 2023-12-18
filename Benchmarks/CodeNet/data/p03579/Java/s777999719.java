
import java.io.*;
import java.util.*;
 
public class Main{
	int N;
	int M;
	Node[] nodes;

	class Node{
		int idx;
		int c;
		ArrayList<Node> nodes;
		public Node(int idx){
			this.idx = idx;
			nodes = new ArrayList<>();
			c = -1;
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
		
		if(dfs(nodes[0], 0)){
			long black = 0;
			for(int i = 0; i < N; i++){
				black += nodes[i].c;
			}
			long white = N - black;
			out.println(black * white - M);
		}else{
			
			out.println((long)N * (N - 1) / 2 - M);
		}
	}
	
	public boolean dfs(Node cur, int c){
		if(cur.c != -1){
			return cur.c == c;
		}
		cur.c = c;
		boolean flg = true;
		for(Node n : cur.nodes){
			flg &= dfs(n, (c + 1) % 2);
		}
		return flg;
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