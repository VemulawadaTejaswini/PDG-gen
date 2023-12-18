import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		new Main().exec();
		
	}

	public void exec() throws IOException {
		InputUtil in = new InputUtil();
		PrintWriter out = new PrintWriter(System.out);
		int N = (int)in.nextInt();
		long[] T= in.nextInt(new long[N]);
		out.println(getLcm(T));
		out.flush();
	}
	
	private long getGcd(long a, long b){
		if(a<b)
			return getGcd(b,a);
		long tmp = 0;
		while (a%b!=0) {
			tmp = b;
			b = a%b;
			a = tmp;
		}
		return b;
	}
	
	private long getLcm(long a, long b){
		if(a<b)
			return getLcm(b,a);
		long gcd = getGcd(a,b);
		return (a/gcd)*b;
	}
	
	private long getLcm(long[] T) {
		long ans = 0;
		for(int i=1; i<T.length; i++) {
			ans = getLcm((ans == 0)?T[i-1]:ans,T[i]);
		}
		return ans;
	}
}






class InputUtil {
	//Static Fields
	private static final int BUFSIZ = 100000;
	
	//Fields
	protected InputStream in;
	private char[] buf = null;
	private int ptr = 0;
	private int max = -1;
	private BufferedReader br = null;
	
	//Constructors
	public InputUtil() {this(System.in,BUFSIZ);}
	public InputUtil(InputStream in, int bufsiz) {
		initBuf(bufsiz);
		initIn(in);
	}
	
	//Methods
	//Initializer
	protected void initIn(InputStream in) {br = new BufferedReader(new InputStreamReader(this.in = in));}
	protected void initBuf(int bufsiz) {buf = new char[bufsiz];}
	
	//buffer operation
	private void next() throws IOException {ptr++; readBuf();}
	private void readBuf() throws IOException {
		if(ptr >= max && br.ready()) {
			if(max>0) Arrays.fill(buf,0,max,(char)0);
			max = br.read(buf);
			ptr = 0;
		}
	}
	
	//Number Input Reader/Parser
	private boolean isNum(char b) {return '0' <= b && b <= '9'; }
	private boolean isMinus(char b) {return b=='-'; }

	private long _nextInt() throws IOException {
		long sign = 1;
		long res = 0;
		char c;
		while (!isNum(c=buf[ptr]) && !isMinus(c)) 
			next();
		if (isMinus(buf[ptr])) {
			sign = -1;
			next();
		}
		while (isNum(c=buf[ptr])) {
			res *= 10;
			res += c - '0' ;
			next();
		}
		next();
		return sign * res;
	}
	
	public long nextInt() throws IOException {
		readBuf();
		return _nextInt();
	}

	public long[] nextInt(long[] result) throws IOException {
		readBuf();
		for(int i=0; i<result.length; i++) {
			result[i] = _nextInt();
		}
		return result;
	}
	
	//Close 
	public void close() throws IOException {
		if(!this.in.equals(System.in)) 
			this.in.close();
	}

}