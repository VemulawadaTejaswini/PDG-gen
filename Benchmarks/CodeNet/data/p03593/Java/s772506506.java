
import java.io.*;
import java.util.*;
 
public class Main{
	int H, W;
	int[] count;
	public void solve(){
		H = nextInt();
		W = nextInt();
		count = new int[26];
		for(int i = 0; i < H; i++){
			String str = next();
			for(int j = 0; j < W; j++){
				count[str.charAt(j) - 'a']++;
			}
		}
		int odd = 0;
		int ni = 0;
		int yo = 0;
		for(int i = 0; i < 26; i++){
			if(count[i] % 4 == 0){
				yo++;
			}else if(count[i] % 2 == 0){
				ni++;
			}else{
				odd++;
			}
		}
		
		if(H % 2 == 0 && W % 2 == 0){
			if(odd == 0 && ni == 0){
				out.println("Yes");
			}else{
				out.println("No");
			}
		}else if(H % 2 == 1 && W % 2 == 0){
			if(odd == 0 && ni <= W / 2){
				out.println("Yes");
			}else{
				out.println("No");
			}	
		}else if(H % 2 == 0 && W % 2 == 1){
			if(odd == 0 && ni <= H / 2){
				out.println("Yes");
			}else{
				out.println("No");
			}
		}else{
			if(odd <= 1 && ni <= (H / 2) + (W / 2)){
				out.println("Yes");
			}else{
				out.println("No");
			}
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