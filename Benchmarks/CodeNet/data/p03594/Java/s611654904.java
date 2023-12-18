
import java.io.*;
import java.util.*;
 
public class Main{
	class Node implements Comparable<Node>{
		@Override
		public String toString() {
			return "Node [r=" + r + ", c=" + c + ", color=" + Arrays.toString(color) + ", mine=" + mine + ", sum=" + sum + "]";
		}

		int r, c;
		boolean[] color;
		int mine;
		int sum;
		public Node(int r, int c){
			this.r = r;
			this.c = c;
			color = new boolean[4];
			mine = -1;
		}
		
		@Override
		public int compareTo(Node o) {
			if(o.r == r && o.c == c){
				return 0;
			}
			if(o.sum != sum){
				return -Integer.compare(sum, o.sum);
			}
			if(o.r != r){
				return Integer.compare(r, o.r);
			}
			return Integer.compare(c, o.c);
		}
	}
	
	public Node get(int r, int c){
		if(0 <= r && r < H && 0 <= c && c < W){
			return map[r][c];
		}else{
			return null;
		}
	}
	
	int H, W, D;
	Node[][] map;
	public void solve(){
		H = nextInt();
		W = nextInt();
		D = nextInt();
		map = new Node[H][W];
		for(int i = 0; i < H; i++){
			for(int j = 0; j < W; j++){
				map[i][j] = new Node(i, j);
			}
		}
		for(int i = 0; i < H; i++){
			for(int j = 0; j < W; j++){
				dfs(map[i][j]);
			}
		}
		
		char[] cc = {'R', 'Y', 'G', 'B'};
		for(int i = 0; i < H; i++){
			for(int j = 0; j < W; j++){
				out.print(cc[map[i][j].mine]);
			}
			out.println();
		}
	}
	int[] DX = {1, -1, 1, -1};
	int[] DY = {1, 1, -1, -1};
	
	public boolean dfs(Node node){
		if(node.mine != -1){
			return true;
		}
		int[] psum = new int[(D + 1) * 4];
		Node[] nodes = new Node[(D + 1) * 4];
		for(int i = 0; i < 4; i++){
			if(node.color[i]) continue;

			int idx = 0;
			for(int j = 0; j <= D; j++){
				for(int k = 0; k < 4; k++){
					int r = node.r + DX[k] * j;
					int c = node.c + DY[k] * (D - j);
					Node nn = get(r, c);
					if(nn != null && nn.mine == -1){
						nodes[idx] = nn;
						psum[idx++] = nn.sum;
						if(!nn.color[i]){
							nn.color[i] = true;
							nn.sum++;
						}
					}
				}
			}
			
			node.mine = i;
			node.color[i] = true;
			node.sum++;
			boolean flg = true;
			for(int j = 0; j < idx; j++){
				if(!dfs(nodes[j])){
					flg = false;
					break;
				}
			}
			if(flg){
				return true;
			}
			node.mine = -1;
			node.color[i] = false;
			node.sum--;
			
			idx = 0;
			for(int j = 0; j <= D; j++){
				for(int k = 0; k < 4; k++){
					int r = node.r + DX[k] * j;
					int c = node.c + DY[k] * (D - j);
					Node nn = get(r, c);
					if(nn != null  && nn.mine == -1){
						if(psum[idx++] != nn.sum){
							nn.color[i] = false;
							nn.sum--;
						}
					}
				}
			}
		}
		return false;
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