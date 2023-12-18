
import java.io.*;
import java.util.*;
import java.util.function.IntPredicate;
 
public class Main{
	
	int N, M;
	int[] X;
	public void solve(){
		N = nextInt();
		M = nextInt();
		X = new int[100001];
		int max = 0;
		for(int i = 0; i < N; i++){
			int v = nextInt();
			max = Math.max(v, max);
			X[v]++;
		}
		int ans = 0;
		for(int i = 0; i <= max; i+=M){
			ans += X[i];
		}
		ans /= 2;
		for(int i = 1; i <= (M - 1) / 2; i++){
			int ii = M - i;
			int o1 = 0;
			int e1 = 0;
			for(int j = i; j <= max; j += M){
				if(X[j] % 2 == 0){
					e1 += X[j];
				}else{
					e1 += X[j] - 1;
					o1++;
				}
			}
			
			int o2 = 0;
			int e2 = 0;
			for(int j = ii; j <= max; j += M){
				if(X[j] % 2 == 0){
					e2 += X[j];
				}else{
					e2 += X[j] - 1;
					o2++;
				}
			}
			if(o1 > o2){
				ans += o2;
				o1 -= o2;
				o2 = 0;
			}else{
				ans += o1;
				o2 -= o1;
				o1 = 0;
			}
			int ov1 = o1 / 2 * 2;
			if(ov1 <= e2){
				e2 -= ov1;
				ans += ov1;
			}else{
				ans += e2;
				e2 = 0;
			}
			
			int ov2 = o2 / 2 * 2;
			if(ov2 <= e1){
				e1 -= ov2;
				ans += ov2;
			}else{
				ans += e1;
				e1 = 0;
			}
			ans += e2/2;
			ans += e1/2;
		}
		if(M % 2 == 0){
			int o = 0;
			int e = 0;
			for(int j = M / 2; j <= max; j += M){
				if(X[j] % 2 == 0){
					e += X[j];
				}else{
					o++;
					e += X[j] - 1;
				}
			}
			ans += o / 2;
			ans += e / 2;

		}
		out.println(ans);
	}
	
	/*
	int N, M;
	ArrayList<HashSet<Integer>> set;
	ArrayList<HashSet<Integer>> trans;
	public void solve(){
		N = nextInt();
		M = nextInt();
		set = new ArrayList<>(N);
		trans = new ArrayList<>(M);
		for(int i = 0; i < M; i++){
			trans.add(new HashSet<>());
		}
		
		for(int i = 0; i < N; i++){
			int k = nextInt();
			HashSet<Integer> ss = new HashSet<>(k * 2);
			for(int j = 0; j < N; j++){
				ss.add(nextInt());
			}
			for(int a : ss){
				for(int b : ss){
					trans.get(a).add(b);
				}
			}
			set.add(ss);
		}
		
		for(int i = 0; i < N; i++){
			for(int j = 0; j < )
		}
	}
*/
	public int lowerBound(int begin, int end, IntPredicate check){
		int l = begin - 1;
		int r = end;
		while(r - l > 1){
			int m = (r + l) / 2;
			if(check.test(m)){
				r = m;
			}else{
				l = m;
			}
		}
		return r;
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