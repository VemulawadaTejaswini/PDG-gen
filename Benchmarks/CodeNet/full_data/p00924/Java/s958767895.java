import java.io.*;
import java.util.*;
 
public class Main{
	int N;
	int M;
	int[] bits;
	int[] rl;
	public void solve(){
		N = nextInt();
		M = nextInt();
		bits = new int[N];
		for(int i = 0; i < N; i++){
			bits[i] = nextInt();
		}
		
		rl = new int[M];
		for(int i = 0; i < M; i++){
			rl[i] = nextInt();
		}
		int[] bb = new int[N];
		int idx = 0;
		for(int i = 0; i < M; i++){
			for(int j = 0; j < rl[i]; j++){
				bb[idx++] = i % 2;
			}
		}
		int a = swap(bits, bb);

		idx = 0;
		for(int i = 0; i < M; i++){
			for(int j = 0; j < rl[i]; j++){
				bb[idx++] = (i + 1) % 2;
			}
		}
		int b = swap(bits, bb);
		out.println(Math.min(a, b));
	}
	
	public int swap(int[] a, int[] b){
		int ans = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i] != b[i]){
				
				int idx = -1;
				for(int j = i + 1; j < b.length; j++){
					if(a[i] == b[j]){
						idx = j;
						break;
					}
				}
				if(idx == -1) return Integer.MAX_VALUE;
				for(int j = idx; j > i; j--){
					swap(b, j, j - 1);
					ans++;
				}
			}
		}
		return ans;
	}
 
	public void swap(int[] a, int i, int j){
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
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