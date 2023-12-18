import java.io.*;
import java.util.*;

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

class Main{

	public static void main(String[] $){
		FastScanner s=new FastScanner(System.in);
		int n=s.nextInt(),q=s.nextInt();
		int[] l=new int[n];
		int[] r=new int[n];
		int[] x=new int[n];
		for(int i=0;i<n;++i){
			l[i]=s.nextInt();
			r[i]=s.nextInt()-1;
			x[i]=s.nextInt();
		}
		int d[]=new int[q];
		int e[]=new int[q];
		for(int p=0;p<q;++p)
			d[p]=s.nextInt();
		Arrays.fill(e,2000000000);

		for(int i=0;i<n;++i){
			int b=Arrays.binarySearch(d,l[i]-x[i]);
			int c=Arrays.binarySearch(d,r[i]-x[i]);
			if(b<0) b=~b;
			if(c<0) c=~c-1;
			for(int j=b;j<=c;++j)
				e[j]=Math.min(e[j],x[i]);
		}
		for(int i:e)
			System.out.println(i==2000000000?-1:i);
	}
}