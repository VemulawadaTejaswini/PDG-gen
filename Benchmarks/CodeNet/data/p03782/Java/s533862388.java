
import java.io.*;
import java.util.*;
import java.util.function.IntPredicate;
 
public class Main{
	int N, K;
	int[] A;
	public void solve(){
		N = nextInt();
		K = nextInt();
		A = new int[N];
		for(int i = 0; i < N; i++){
			A[i] = nextInt();
		}
		int ans = 0;
		TreeSet<Integer> set = new TreeSet<>();
		ArrayList<TreeSet<Integer>> a1 = new ArrayList<>();
		ArrayList<TreeSet<Integer>> a2 = new ArrayList<>();
		for(int i = 0; i < N; i++){
			a1.add(null);
			a2.add(null);
		}
		
		set.add(0);
		a1.set(0, set);
		for(int i = 0; i < N - 1; i++){
			TreeSet<Integer> ns = new TreeSet<>();
			for(int v : a1.get(i)){
				ns.add(v);
				if(v + A[i] < K){
					ns.add(v + A[i]);
				}
			}
			a1.set(i + 1, ns);
		}
		
		set = new TreeSet<>();
		set.add(0);
		a2.set(N - 1, set);
		for(int i = N - 1; i > 0; i--){
			TreeSet<Integer> ns = new TreeSet<>();
			for(int v : a2.get(i)){
				ns.add(v);
				if(v + A[i] < K){
					ns.add(v + A[i]);
				}
			}
			a2.set(i - 1, ns);
		}
		
		
		for(int i = 0; i < N; i++){
			if(A[i] >= K) continue;
			int kk = K - A[i];
			TreeSet<Integer> s1 = a1.get(i);
			TreeSet<Integer> s2 = a2.get(i);
			boolean flg = false;
			for(int v : s1){
				if(!s2.subSet(kk - v, K - v).isEmpty()){
					flg = true;
					break;
				}
			}
			if(!flg){
				ans++;
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