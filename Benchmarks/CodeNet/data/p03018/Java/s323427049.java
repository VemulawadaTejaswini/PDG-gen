import java.io.*;

class Main{
	public static void main(String[] $){
		FastScanner s=new FastScanner(System.in);
		char[]c=s.next().replaceAll("BC","#").toCharArray();

		int r=0;
		for(int i=0;i<c.length-1;++i) {
			if(c[i]=='A'&&c[i+1]=='#') {
				++r;
				c[i]='#';
				c[i+1]='A';
				if(i!=0)i-=2;
				System.err.println(c);
			}
		}
		System.out.println(r);
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
}