
import java.io.*;
import java.util.*;
import java.util.function.DoublePredicate;
import java.util.function.DoubleUnaryOperator;
 
public class Main{
	public void solve(){
		int H = nextInt();
		int W = nextInt();
		int A = nextInt();
		int B = nextInt();
		init();
		long ans = 0;
		int x = B + 1;
		int y = H - A;
		while(x <= W && y > 0){
			ans = (ans + ncr(x + y - 2, x - 1) * ncr((W - x) + (H - y), (W - x))) % mod;
			
			
			x++;
			y--;
		}
		out.println(ans);
	}
	
	long mod = 10_0000_0007;

	long bpow(long a,long b){
		return b != 0 ? bpow(a*a%mod,b/2) * ((b&1) != 0?a:1)%mod : 1;
	}

	long[] f = new long[200100];
	long[] invf = new long[200100];

	void init(){
		f[0] = invf[0] = 1;
		for(int i = 1 ; i < 200100 ; i++)
			f[i] = (f[i-1] * i % mod);
		for(int i = 1 ; i < 200100 ; i++)
			invf[i] = bpow(f[i],mod-2);
	}

	long ncr(int n,int r){
		if( n < r ) return 0;
		return f[n] * invf[n-r] % mod * invf[r] % mod;
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