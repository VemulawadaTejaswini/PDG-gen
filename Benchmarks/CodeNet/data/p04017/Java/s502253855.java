
import java.io.*;
import java.util.*;
 
public class Main{
	class Query{
		int idx;
		int a;
		int b;
		public Query(int idx, int a, int b){
			this.idx = idx;
			this.a = a;
			this.b = b;
		}
	}
	
	int N;
	int[] X;
	int L;
	int Q;
	Query[] AB;
	
	public void solve(){
		N = nextInt();
		X = new int[N];
		for(int i = 0; i < N; i++){
			X[i] = nextInt();
		}
		L = nextInt();
		Q = nextInt();
		AB = new Query[Q];
		for(int i = 0; i < Q; i++){
			int a = nextInt() - 1;
			int b = nextInt() - 1;
			
			AB[i] = new Query(i, Math.min(a, b), Math.max(a, b));
		}
		

		int[] Xn = new int[N];
		int nn = 0;
		for(int i = 0; i < N; i++){
			while(nn < N && X[nn] - X[i] <= L) nn++;
			Xn[i] = nn - 1;
		}
		
		for(int i = 0; i < Q; i++){
			int ans = 0;
			int cur = AB[i].a;
			while(cur < AB[i].b){
				ans++;
				cur = Xn[cur];
			}
			out.println(ans);
		}
	}
	
	public long f(long b, long n){
		if(n < b){
			return n;
		}else{
			return f(b, n / b) + n % b;
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