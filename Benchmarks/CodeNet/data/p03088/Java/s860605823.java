
import java.io.*;
import java.util.*;
 
public class Main{
	
	long MOD = 1000000007;
	int N;
	int[][][][] memo;
	// a = 0, c = 1, g = 2, t == 3
	public void solve(){
		N = nextInt();
		memo = new int[N + 1][4][4][4];
		for(int i = 0; i < memo.length; i++) {
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 4; k++) {
					for(int l = 0; l < 4; l++) {
						memo[i][j][k][l] = -1;
					}
				}
			}
		}
		
		long sum = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				for(int k = 0; k < 4; k++) {
					sum += dfs(N, i, j, k);
				}
			}
		}
		
		out.println(sum % MOD);
		
	}
	
	private boolean valid(int a, int b, int c, int d) {
		return valid(a, b, c) &&
			valid(b, a, c) &&
			valid(a, c, b) &&
			valid(a, b, d) &&
			valid(a, c, d);
		
	
	}
	
	private boolean valid(int a, int b, int c) {
		return !(a == 0 && b == 2 && c == 1);
	}
	
	private int dfs(int len, int n1, int n2, int n3) {
		if(memo[len][n1][n2][n3] != -1) {
			return memo[len][n1][n2][n3];
		}
		
		if(len == 2) {
			return memo[len][n1][n2][n3] =  1;
		}
		if(len == 3) {
			if(valid(n1, n2, n3, -1)) {
				return memo[len][n1][n2][n3] =  1;
			}else {
				return memo[len][n1][n2][n3] =  0;
			}
		}
		
		long sum = 0;
		for(int i = 0; i < 4; i++) {
			if(valid(n1, n2, n3, i)) {
				sum += dfs(len - 1, n2, n3, i);
			}
		}
		
		return memo[len][n1][n2][n3] = (int)(sum % MOD);
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