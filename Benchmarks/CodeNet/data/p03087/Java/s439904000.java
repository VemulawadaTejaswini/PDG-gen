
import java.io.*;
import java.util.*;
 
public class Main{
	
	int N;
	int Q;
	String S;
	int[] dp;
	
	public void solve(){
		N = nextInt();
		Q = nextInt();
		S = next();
		dp = new int[S.length() + 1];
		dp[0] = 0;
		dp[1] = 0;
		for(int i = 1; i < S.length(); i++) {
			if(S.charAt(i - 1) == 'A' && S.charAt(i) == 'C') {
				dp[i + 1] = dp[i] + 1;
			}else {
				dp[i + 1] = dp[i];
			}
		}
		
		for(int i = 0; i < Q; i++) {
			int l = nextInt() - 1;
			int r = nextInt() - 1;
			
			int ans = dp[r + 1] - dp[l];
			if(l >= 1 && S.charAt(l - 1) == 'A' && S.charAt(l) == 'C') {
				ans--;
			}
			out.println(ans);
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