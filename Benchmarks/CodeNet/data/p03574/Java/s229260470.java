import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main{
	public static void main(String[]$) throws IOException{
		new Main().solve();
	}
	static FastScanner s=new FastScanner(System.in);
	static IntStream REPS(int v){return IntStream.range(0,v);}
	static IntStream REPS(int l,int r){return IntStream.rangeClosed(l,r);}
	static int gInt() throws IOException{return s.nextInt();}
	static long gLong() throws IOException{return s.nextLong();}
	static long gDouble() throws IOException{return s.nextLong();}

	int[] dx={-1,0,1,-1,1,-1,0,1},dy={-1,-1,-1,0,0,1,1,1};
	private void solve() throws IOException{
		int h=gInt(),w=gInt();
		char[][]f=new char[h][];
		for(int i=0;i<h;++i) {
			f[i]=s.next().toCharArray();
		}
		for(int i=0;i<h;++i) {
			for(int j=0;j<w;++j) if(f[i][j]!='#'){
				f[i][j]='0';
				for(int d=0;d<8;++d) if(0<=i+dx[d]&&i+dx[d]<h&&0<=j+dy[d]&&j+dy[d]<w){
					if(f[i+dx[d]][j+dy[d]]=='#')
						++f[i][j];
				}
			}
		}
		Arrays.stream(f).map(String::valueOf).forEach(System.out::println);
	}

	static void yesno(boolean f) {
		yesno(f,"Yes","No");
	}
	static void yesno(boolean f,String yes,String no) {
		System.out.println(f?yes:no);
	}
}
class FastScanner{
	private final BufferedInputStream	in;
	private static final int			bufSize	=1<<16;
	private final byte					buf[]	=new byte[bufSize];
	private int							i		=bufSize;
	private int							k		=bufSize;
	private final StringBuilder			str		=new StringBuilder();

	FastScanner(InputStream in){
		this.in=new BufferedInputStream(in,bufSize);
	}
	int nextInt() throws IOException{
		return (int)nextLong();
	}
	long nextLong() throws IOException{
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
	int nextChar() throws IOException{
		if(i==k){
			k=in.read(buf,0,bufSize);
			i=0;
		}
		return i>=k?-1:buf[i++];
	}
	String next() throws IOException{
		int c;
		str.setLength(0);
		while((c=nextChar())<=32&&c!=-1)
			;
		if(c==-1){
			return null;
		}
		while(c>32){
			str.append((char)c);
			c=nextChar();
		}
		return str.toString();
	}
	String nextLine() throws IOException{
		int c;
		str.setLength(0);
		while((c=nextChar())<=32&&c!=-1)
			;
		if(c==-1){
			return null;
		}
		while(c!='\n'){
			str.append((char)c);
			c=nextChar();
		}
		return str.toString();
	}
}