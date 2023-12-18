/*
 * Code Author: Akshay Miterani
 * DA-IICT
 */
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	InputReader in;
	PrintWriter out;
	Main() throws IOException {
		in = new InputReader(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.close();
	}

	public static void main(String args[]) {
		new Thread(null, new Runnable() {
			public void run() {
				try {
					new Main();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}, "1", 1 << 26).start();
	}

	//--------------------My Code Starts Here----------------------
	long mod=(long)1e9+7;
	public void solve() throws IOException{
		int n=in.nextInt();
		long a=in.nextLong();
		long b=in.nextLong();
		long x[]=new long[n];
		for(int i=0;i<n;i++){
			x[i]=in.nextLong();
		}
		long dp[]=new long[n+1];
		Arrays.fill(dp, (long)1e15);
		dp[1]=0;
		for(int i=2;i<=n;i++){
			dp[i]=Math.min(dp[i-1]+a*(x[i-1]-x[i-2]), dp[i-1]+b);
		}
		out.println(dp[n]);
	}
	//---------------------My Code Ends Here------------------------
	static long modulo(long a,long b,long c) {
		long x=1;
		long y=a;
		while(b > 0){
			if(b%2 == 1){
				x=(x*y)%c;
			}
			y = (y*y)%c; // squaring the base
			b /= 2;
		}
		return  x%c;
	}
	static class Pair implements Comparable<Pair>{
		int x;
		int y;
		Pair(int xx,int yy){
			x=xx;
			y=yy;
		}
		@Override
		public int compareTo(Pair o) {
			if(Long.compare(this.x, o.x)!=0)
				return Long.compare(this.x, o.x);
			else
				return Long.compare(this.y, o.y);
		}
	}
	public static void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	static final class InputReader{
		private final InputStream stream;
		private final byte[] buf=new byte[1024];
		private int curChar;
		private int numChars;
		public InputReader(InputStream stream){this.stream=stream;}
		private int read()throws IOException{
			if(curChar>=numChars){
				curChar=0;
				numChars=stream.read(buf);
				if(numChars<=0)
					return -1;
			}
			return buf[curChar++];
		}
		public final int nextInt()throws IOException{return (int)nextLong();}
		public final long nextLong()throws IOException{
			int c=read();
			while(isSpaceChar(c)){
				c=read();
				if(c==-1) throw new IOException();
			}
			boolean negative=false;
			if(c=='-'){
				negative=true;
				c=read();
			}
			long res=0;
			do{
				if(c<'0'||c>'9')throw new InputMismatchException();
				res*=10;
				res+=(c-'0');
				c=read();
			}while(!isSpaceChar(c));
			return negative?(-res):(res);
		}
		public final int[] readIntBrray(int size)throws IOException{
			int[] arr=new int[size];
			for(int i=0;i<size;i++)arr[i]=nextInt();
			return arr;
		}
		public final String next()throws IOException{
			int c=read();
			while(isSpaceChar(c))c=read();
			StringBuilder res=new StringBuilder();
			do{
				res.append((char)c);
				c=read();
			}while(!isSpaceChar(c));
			return res.toString();
		}
		public final String nextLine()throws IOException{
			int c=read();
			while(isSpaceChar(c))c=read();
			StringBuilder res=new StringBuilder();
			do{
				res.append((char)c);
				c=read();
			}while(c!='\n'&&c!=-1);
			return res.toString();
		}
		private boolean isSpaceChar(int c){
			return c==' '||c=='\n'||c=='\r'||c=='\t'||c==-1;
		}
	}
}