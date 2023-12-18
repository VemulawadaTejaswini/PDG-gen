
import java.io.*;
import java.math.BigInteger;
import java.util.*;
 
public class Main{
	
 
	public void solve(){
		long A = nextLong();
		long B = nextLong();
		long C = nextLong();

		BigInteger a = BigInteger.valueOf(A);
		BigInteger b = BigInteger.valueOf(B);
		BigInteger c = BigInteger.valueOf(C);
		
		
		BigInteger aa = BigInteger.valueOf(A / 2);
		BigInteger aaa = BigInteger.valueOf(A - (A / 2));
		
		BigInteger ans = aaa.multiply(b).multiply(c).subtract(aa.multiply(b).multiply(c));

		

		aa = BigInteger.valueOf(B / 2);
		aaa = BigInteger.valueOf(B - (B / 2));

		BigInteger ans2 = aaa.multiply(a).multiply(c).subtract(aa.multiply(a).multiply(c));
		if(ans2.compareTo(ans) < 0){
			ans = ans2;
		}
		

		aa = BigInteger.valueOf(C / 2);
		aaa = BigInteger.valueOf(C - (C / 2));
		 ans2 = aaa.multiply(a).multiply(b).subtract(aa.multiply(a).multiply(b));
			if(ans2.compareTo(ans) < 0){
				ans = ans2;
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