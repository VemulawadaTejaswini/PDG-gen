
import java.io.*;
import java.util.*;
 
public class Main{
	String L;
	long MOD = 1000000007;
	long[] memo1, memo2;
	void solve() {
		L = next();
		memo1 = new long[L.length()];
		memo2 = new long[L.length() + 1];
		out.println(dfs(0));
	}
	
	long dfs(int idx) {
		if(memo1[idx] != 0) {
			return memo1[idx];
		}
		long ans;
		if(idx == L.length() - 1) {
			if(L.charAt(idx) == '1') {
				ans = 3;
			}else {
				ans = 1;
			}
		}else {
			if(L.charAt(idx) == '0') {
				ans = dfs(idx + 1);
			}else {
				ans = pow3(idx + 1) + 2 * dfs(idx + 1);
			}
		}
		return memo1[idx] = ans % MOD;
	}
	
	long pow3(int idx) {
		if(idx == L.length()) {
			return 1;
		}
		if(memo2[idx] != 0) {
			return memo2[idx];
		}
		return memo2[idx] = (3 * pow3(idx + 1)) % MOD;
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