import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Main{
	final FastScanner s=new FastScanner(System.in);

	static final long mod=1000000007;
	static final BigInteger MOD=BigInteger.valueOf(1000000007);

	static BigInteger lcm(BigInteger a,BigInteger b){
		return a.divide(a.gcd(b)).multiply(b);
	}

	void solve(){
		int n=gInt();
		BigInteger[] a=INTS(n).mapToObj(BigInteger::valueOf).toArray(BigInteger[]::new);
		ArrayDeque<BigInteger>q=new ArrayDeque<>(n);
		for(BigInteger i:a)
			q.add(i);

		while(q.size()>1)
			q.add(lcm(q.poll(),q.poll()));
		BigInteger lcm=q.peek();

		long r=0;
		for(BigInteger o:a){
			r+=lcm.divide(o).mod(MOD).intValue();
			r%=mod;
		}
		System.out.println(r);
	}

	public static void main(String[] args){
		new Main().solve();
	}

	int gInt(){
		return Integer.parseInt(s.next());
	}
	IntStream INTS(int n){
		return IntStream.generate(this::gInt).limit(n);
	}
}

class FastScanner{
	private final BufferedInputStream	in;
	private static final int			bufSize	=1<<16;
	private final byte					buf[]	=new byte[bufSize];
	private int							i		=bufSize,k=bufSize;
	private final StringBuilder			str		=new StringBuilder();

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