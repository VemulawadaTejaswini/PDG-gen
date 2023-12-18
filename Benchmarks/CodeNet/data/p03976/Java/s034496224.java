
import java.io.*;
import java.util.*;

 
public class Main{
	class Pair{
		int idx;
		int cnt;
		public Pair(int idx, int cnt){
			this.idx = idx;
			this.cnt = cnt;
		}
	}
	public void solve(){
		int N = nextInt();
		int K = nextInt();
		int[] P = new int[26];
		for(int i = 0; i < N; i++){
			String str = next();
			P[str.charAt(0) - 'A']++;
		}
		PriorityQueue<Pair> queue = new PriorityQueue<>((a, b) -> Integer.compare(b.cnt, a.cnt));
		for(int i = 0; i < 26; i++){
			if(P[i] != 0){
				queue.add(new Pair(i, P[i]));
			}
		}
		Pair[] tmp = new Pair[K];
		int ans = 0;
		LOOP:
		while(true){
			for(int i = 0; i < K; i++){
				if(queue.isEmpty()) break LOOP;
				tmp[i] = queue.poll();
			}
			ans++;
			for(int i = 0; i < K; i++){
				tmp[i].cnt--;
				if(tmp[i].cnt > 0) queue.add(tmp[i]);
			}
		}
		out.println(ans);
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