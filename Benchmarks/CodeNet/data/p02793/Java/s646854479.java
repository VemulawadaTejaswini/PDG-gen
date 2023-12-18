import java.io.*;
import java.math.*;
import java.util.*;

public class Main{

	private static final int mod=1000000007;
	private static final BigInteger MOD=BigInteger.valueOf(mod);

	static int gcd(int a,int b){
		return b==0?a:gcd(b,a%b);
	}
	static long lcm(int a,int b){
		return (long)a/gcd(a,b)*b;
	}
	static BigInteger lcm(BigInteger a,BigInteger b){
		return a.divide(a.gcd(b)).multiply(b);
	}

	public static void main(String[] args){
		FastScanner s=new FastScanner(System.in);
		int n=s.nextInt();
		BigInteger[] b=new BigInteger[n];
		ArrayDeque<BigInteger> q=new ArrayDeque<>(n/2+1);

		for(int i=0;i<n;i+=2){
			int a=s.nextInt();
			b[i]=BigInteger.valueOf(a);
			if(i<n-1){
				int c=s.nextInt();
				b[i+1]=BigInteger.valueOf(c);
				q.add(BigInteger.valueOf(lcm(a,c)));
			}else {
				q.add(b[i]);
			}
		}

		while(q.size()>=2)
			q.add(lcm(q.poll(),q.poll()));
		BigInteger lcm=q.poll();

		int r=0;
		for(BigInteger o:b)
			r=(r+lcm.divide(o).remainder(MOD).intValue())%mod;
		System.out.println(r);
	}
}

class FastScanner{
	private final BufferedInputStream in;
	private static final int bufSize=1<<16;
	private final byte buf[]=new byte[bufSize];
	private int i=bufSize,k=bufSize;
	private final StringBuilder str=new StringBuilder();

	FastScanner(InputStream in){
		this.in=new BufferedInputStream(in,bufSize);
	}
	int nextInt(){
		return (int)nextLong();
	}
	long nextLong(){
		int c;
		long x=0;
		boolean sign=true;
		while((c=nextChar())<=32)
			;
		if(c=='-'){
			sign=false;
			c=nextChar();
		}
		if(c=='+'){
			c=nextChar();
		}
		while(c>='0'){
			x=x*10+(c-'0');
			c=nextChar();
		}
		return sign?x:-x;
	}
	private int nextChar(){
		if(i==k){
			try{
				k=in.read(buf,i=0,bufSize);
			}catch(IOException e){
				System.exit(-1);
			}
		}
		return i>=k?-1:buf[i++];
	}
	String next(){
		int c;
		str.setLength(0);
		while((c=nextChar())<=32&&c!=-1)
			;
		if(c==-1)
			return null;
		while(c>32){
			str.append((char)c);
			c=nextChar();
		}
		return str.toString();
	}
	String nextLine(){
		int c;
		str.setLength(0);
		while((c=nextChar())<=32&&c!=-1)
			;
		if(c==-1)
			return null;
		while(c!='\n'){
			str.append((char)c);
			c=nextChar();
		}
		return str.toString();
	}
}
