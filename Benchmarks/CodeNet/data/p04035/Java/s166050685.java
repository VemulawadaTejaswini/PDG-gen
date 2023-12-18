import java.io.*;
import java.util.*;
import java.util.function.*;
 
public class Main{
	
	int N;
	int M;
	int L;
	int[] A;
	int[] dp;
	public void solve(){
		N = nextInt();
		L = nextInt();
		A = new int[N];
		for(int i = 0; i < N; i++){
			A[i] = nextInt();
		}
		dp = new int[N];
		for(int i = N - 2; i > 0; i--){
			r2(i);
		}
		if(r2(0)){
			out.println("Possible");
			for(int i = 0; i < N - 1; i++){
				if(dp[i] == 1){
					out.println(i + 1);
				}else{
					out.println(i + 2);
					out.println(i + 1);
					i++;
				}
			}
			
		}else{
			out.println("Impossible");
		}
	}
	public boolean r2(int idx){
		if(idx >= N){
			return false;
		
		}else if(dp[idx] != 0){
			return dp[idx] != -1;
			
		}else if(idx == N - 1){
			dp[idx] = 1;
			return true;
		
		}else if(idx == N - 2){
			if(A[idx] + A[idx + 1] >= L){
				dp[idx] = 1;
				return true;
			}else{
				dp[idx] = -1;
				return false;
			}
		}else if(r2(idx + 1)){
			dp[idx] = 1;
			return true;
		}else if(A[idx] + A[idx + 1] >= L && r2(idx + 2)){
			dp[idx] = 2;
			return true;
		}else{
			dp[idx] = -1;
			return false;
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