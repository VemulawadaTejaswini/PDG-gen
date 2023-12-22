
import java.io.*;
import java.util.*;
 
public class Main{
	
	class Node{
		int[] count;
		Node parent;
		ArrayList<Node> children;
		public Node(){
			count = new int[W];
			children = new ArrayList<>();
		}
	}
	
	int W;
	int H;
	int[][] blocks;
	int[][][] sum;
	int[] DX = {1, 0, -1, 0};
	int[] DY = {0, 1, 0, -1};
	
	public void solve(){
		LOOP:
		while(true){
			W = nextInt();
			H = nextInt();
			if(W == 0 && H == 0){
				break;
			}
			blocks = new int[H + 2][W + 2];
			for(int i = 1; i <= H; i++){
				String str = next();
				for(int j = 1; j <= W; j++){
					if(str.charAt(j - 1) != '.'){
						blocks[i][j] = str.charAt(j - 1) - '0';
					}
				}
			}
			for(int j = 0; j < W + 2; j++){
				blocks[H + 1][j] = 10;
			}
			sum = new int[H + 2][W + 2][W + 2];
			
			for(int i = 1; i <= H; i++){
				for(int j = 1; j <= W; j++){
					if(blocks[i][j] != 0){
						sum[i][j][j] = 1;
					}
				}
			}
			
			for(int i = 1; i <= H; i++){
				for(int j = 1; j <= W; j++){
					if(blocks[i][j] > 0){
						if(!check(j, i)){
							out.println("UNSTABLE");
							continue LOOP;
						}
					}
				}
			}
			out.println("STABLE");
		}
	}
	
	int left;
	int right;
	int px;
	int py;
	public boolean check(int x, int y){
		int[] s = sum[y][x];
		dfs(s, x, y);
		left = 100;
		right = -100;
		px = -1;
		py = -1;
		dfs2(x, y);
		int c = center(s);
		sum(sum[py][px], s, sum[py][px]);
		
		return left * 2 <= c && c <= right * 2;
	}
	
	public void dfs(int[] s, int x, int y){
		int c = blocks[y][x];
		blocks[y][x] = -blocks[y][x];
		for(int i = 0; i < 4; i++){
			int xx = DX[i] + x;
			int yy = DY[i] + y;
			if(blocks[yy][xx] == c){
				sum(s, sum[yy][xx], s);
				dfs(s, xx, yy);
			}
		}
	}
	public void dfs2(int x, int y){
		int c = blocks[y][x];
		blocks[y][x] = 0;
		for(int i = 0; i < 4; i++){
			int xx = DX[i] + x;
			int yy = DY[i] + y;
			if(blocks[yy][xx] == c){
				dfs2(xx, yy);
				
			}else if(blocks[yy][xx] > 0){
				left = Math.min(left, xx);
				right = Math.max(right, xx);
				px = xx;
				py = yy;
			}
			
		}
	}
	
	public void sum(int[] a, int[] b, int[] res){
		for(int i = 0; i < a.length; i++){
			res[i] = a[i] + b[i];
		}
	}
	public int center(int[] a){
		int sum = 0;
		for(int i = 0; i < a.length; i++){
			sum += a[i];
		}
		if(sum == 0) return -1;
		int a2 = 0;
		int idx;
		for(idx = 0; a2 < sum; idx++){
			sum -= a[idx];
			a2 += a[idx];
		}
		idx -= 1;
		idx *= 2;
		if(sum == a2){
			idx += 1;
		}
		return idx;
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