import java.io.*;
import java.util.*;
 
public class Main{
	class Pair{
		int begin;
		int end;
		public Pair(int begin, int end){
			this.begin = begin;
			this.end = end;
		}
	}
	
	
	int N;
	int W;
	int D;
	Pair[] teams;
	
	public void solve(){
		N = nextInt();
		W = nextInt();
		D = nextInt();
		teams = new Pair[N];
		for(int i = 0; i < N; i++){
			int x = nextInt();
			int y = nextInt();
			char d = next().charAt(0);
			int x1, x2;
			int y1, y2;
			switch(d){
			case 'N':
				if(D - y < x){
					x1 = x - (D - y);
					y1 = D;
				}else{
					x1 = 0;
					y1 = y + x;
				}
				
				if(D - y < W - x){
					x2 = x + (D - y);
					y2 = D;
				}else{
					x2 = W;
					y2 = y + (W - x);
				}
				
				break;
			case 'E':
				if(W - x < y){
					x2 = W;
					y2 = y - (W - x);
				}else{
					x2 = x + y;
					y2 = 0;
				}
				
				if(W - x < D - y){
					x1 = W;
					y1 = y + (W - x);
				}else{
					x1 = x + (D - y);
					y1 = D;
				}
				
				break;
			case 'W':
				if(x < y){
					x1 = 0;
					y1 = y - x;
				}else{
					x1 = x - y;
					y1 = 0;
				}
				
				if(x < D - y){
					x2 = 0;
					y2 = y + x;
				}else{
					x2 = x - (D - y);
					y2 = D;
				}
				
				
				break;
			case 'S':
				if(y < x){
					x2 = x - y;
					y2 = 0;
				}else{
					x2 = 0;
					y2 = y - x;
				}
				
				if(y < W - x){
					x1 = x + y;
					y1 = 0;
				}else{
					x1 = W;
					y1 = y - (W - x);
				}
				break;
			default: throw new RuntimeException();
			}
			int i1 = toIdx(x1, y1);
			int i2 = toIdx(x2, y2);
			if(i2 < i1){
				i2 += D + D + W + W;
			}
			teams[i] = new Pair(i1, i2);
		}
		
		Arrays.sort(teams, (a, b) -> Integer.compare(a.begin, b.begin));
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++){
			int cur = 1;
			int pos = teams[i].end;
			for(int j = 1; j < N; j++){
				Pair p = teams[(i + j) % N];
				if(teams[(i + j + N - 1) % N].begin > p.begin){
					pos -= D + D + W + W;
				}
				
				if(p.begin <= pos && pos <= p.end){
					
				}else{
					cur ++;
					pos = p.end;
				}
			}
			ans = Math.min(ans, cur);
		}
		out.println(ans);
		
	}
	public int toIdx(int x, int y){
		if(x == 0){
			return y;
		}else if(y == D){
			return D + x;
		}else if(x == W){
			return D + W + (D - y);
		}else{
			return D + W + D + (W - x);
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