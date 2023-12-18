
import java.io.*;
import java.util.*;
 
public class Main{
	
	int N;
	int A;
	int[] X;
	long[][][] dp;
	public void solve(){
		N = nextInt();
		A = nextInt();
		X = new int[N];
		
		for(int i = 0; i < N; i++){
			X[i] = nextInt();
		}
		
		dp = new long[51][51][50 * 50 + 5];
		for(int i = 0; i < dp.length; i++){
			for(int j = 0; j < dp[i].length; j++){
				for(int k = 0; k < dp[i][j].length; k++){
					dp[i][j][k] = -1;
				}
			}
		}
		
		out.println(dfs(0, 0, 0));
	}
	
	public long dfs(int i, int cnt, int sum){
		if(i == N){
			if(cnt != 0 && A * cnt == sum){
				return 1;
			}else{
				return 0;
			}
		}else{
			if(dp[i][cnt][sum] != -1){
				return dp[i][cnt][sum];
			}
			long ans = 0;
			ans += dfs(i + 1, cnt, sum);
			ans += dfs(i + 1, cnt + 1, sum + X[i]);
			return dp[i][cnt][sum] = ans;
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