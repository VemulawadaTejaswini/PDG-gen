
import java.io.*;
import java.util.*;
 
public class Main{
	
	long H, W;
	public void solve(){
		H = nextLong();
		W = nextLong();
		
		long ans = Long.MAX_VALUE;
		for(int i = 1; i * 2 <= H; i++){
			long h = H - i;
			long h1 = h / 2;
			long h2 = h - h1;
			long w1 = W / 2;
			long w2 = W - w1;
			ans = Math.min(ans, max(i * W, h1 * W, h2 * W) - min(i * W, h1 * W, h2 * W));
			ans = Math.min(ans, max(i * W, h * w1, h * w2) - min(i * W, h * w1, h * w2));
			
		}
		

		for(int i = 1; i * 2 <= W; i++){
			long h = W - i;
			long h1 = h / 2;
			long h2 = h - h1;
			long w1 = H / 2;
			long w2 = H - w1;
			ans = Math.min(ans, max(i * H, h1 * H, h2 * H) - min(i * H, h1 * H, h2 * H));
			ans = Math.min(ans, max(i * H, h * w1, h * w2) - min(i * H, h * w1, h * w2));
			
		}
		out.println(ans);
	}
	
	private long max(long a, long b, long c){
		return Math.max(a,  Math.max(b, c));
	}
	
	private long min(long a, long b, long c){
		return Math.min(a, Math.min(b, c));
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