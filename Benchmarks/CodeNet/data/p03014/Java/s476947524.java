
import java.io.*;
import java.util.*;
 
public class Main{
	int H;
	int W;
	boolean[][] S;
	int[][] tate;
	int[][] yoko;
	void solve() {
		H = nextInt();
		W = nextInt();
		S = new boolean[H + 1][W + 1];
		tate = new int[H + 1][W + 1];
		yoko = new int[H + 1][W + 1];
		for(int r = 0; r < H; r++) {
			String str = next();
			for(int c = 0; c < W; c++) {
				if(str.charAt(c) == '.') {
					S[r][c] = true;
				}else {
					S[r][c] = false;
				}
			}
		}
		
		for(int r = 0; r < H; r++) {
			int si = 0;
			for(int c = 0; c <= W; c++) {
				if(!S[r][c]) {
					int len = c - si;
					for(int i = c - 1; i >= si; i--) {
						yoko[r][i] = len;
					}
					yoko[r][c] = 0;
					si = c + 1;
				}
			}
		}
		
		for(int c = 0; c < W; c++) {
			int si = 0;
			for(int r = 0; r <= H; r++) {
				if(!S[r][c]) {
					int len = r - si;
					for(int i = r - 1; i >= si; i--) {
						tate[i][c] = len;
					}
					tate[r][c] = 0;
					si = r + 1;
				}
			}
		}
		
		int max = 0;
		for(int r = 0; r < H; r++) {
			for(int c = 0; c < W; c++) {
				max = Math.max(max, tate[r][c] + yoko[r][c] - 1);
			}
		}
		out.println(max);
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