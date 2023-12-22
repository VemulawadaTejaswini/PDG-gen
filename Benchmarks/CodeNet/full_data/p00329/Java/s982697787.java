import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.BitSet;
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


	int n,usedno[];
	BitSet[]col;
	BitSet used=new BitSet();
	private void solve() throws IOException{
		n=gInt()-1;
		col=new BitSet[n];
		for(int i=0;i<n;++i) {
			col[i]=new BitSet();
		}
		for(int i=0;i<n;++i){
			for(int j=0;j<n;++j){
				col[j].set(i,gLong()==1);
			}
		}
		usedno=new int[n];
		if(search(n-1)) {
			System.out.println("yes");
			Arrays.stream(usedno).forEach(System.out::println);
			return;
		}
		System.out.println("no");
	}
	private boolean search(int curcol){
		if(curcol==-1)
			return true;
		for(int i=col[curcol].previousSetBit(n);i!=-1;i=col[curcol].previousSetBit(i-1)) if(!used.get(i)){
			usedno[curcol]=i+1;
			used.set(i);
			if(search(curcol-1))
				return true;
			used.clear(i);
		}
		return false;
	}


	static void yesno(boolean f) {
		yesno(f,"YES","NO");
	}
	static void yesno(boolean f,String yes,String no) {
		System.out.println(f?yes:no);
	}
}
class FastScanner{
	private final BufferedInputStream   in;
	private static final int			bufSize =1<<16;
	private final byte				  buf[]   =new byte[bufSize];
	private int						 i	   =bufSize;
	private int						 k	   =bufSize;
	private final StringBuilder		 str	 =new StringBuilder();

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