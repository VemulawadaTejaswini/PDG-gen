import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;


public class Main {
	public static long l=0,l2=0;
	public static void main(String[] args) throws IOException {
		l = System.currentTimeMillis();
		new Main().exec();
		l2 = System.currentTimeMillis();
/*
		System.out.println((l2-l)+"msec");
//*/		
	}
	
	public void exec() throws IOException {
		InputUtil in = new InputUtil();
		OutputUtil out = new OutputUtil();
		int n = in.nextInt();
		int[] A = in.nextInt(new int[n]);
		int p = partition(A,0,n-1);
		out.output(A,0,p," ");
		out.out.print(" [");
		out.out.print(A[p]);
		out.out.print("] ");
		out.output(A,p+1,n-p-1," ");
		out.crlf_flash();
	}
	
	private int partition(int[] A, int p, int r) {
		int x = A[r];
		int i=p;
		for(int j=i; j<r; j++) {
			if(A[j] <= x) {
				int tmp = A[i];
				A[i] = A[j];
				A[j] = tmp;
				i++;
			}
		}
		A[r] = A[i];
		A[i] = x;
		return i;
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
	private boolean next() throws IOException {ptr++; return readBuf();}
	private boolean readBuf() throws IOException {
		if(ptr >= max && br.ready()) {
			if(max>0) Arrays.fill(buf,0,max,(char)0);
			max = br.read(buf);
			ptr = 0;
		}
		return (max>0);
	}
	
	//Number Input Reader/Parser
	private boolean isNum(char b) {return '0' <= b && b <= '9'; }
	private boolean isMinus(char b) {return b=='-'; }

	private int _nextInt() throws IOException {
		int sign = 1;
		int res = 0;
		char c = buf[ptr];
		while (!isNum(c=buf[ptr]) && !isMinus(c)) 
			if(!next()) throw new IllegalStateException();
		if (isMinus(c)) {
			sign = -1;
			if(!next()) throw new IllegalStateException();
		}
		while (isNum(c=buf[ptr])) {
			res *= 10;
			res += c - '0' ;
			if(!next())
				break;
		}
		next();
		return sign * res;
	}
	
	public int nextInt() throws IOException {
		if(!readBuf()) throw new IllegalStateException();
		return _nextInt();
	}

	public int[] nextInt(int[] result) throws IOException {
		if(!readBuf()) throw new IllegalStateException();
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

class OutputUtil {
//	public static final String EOF = System.lineSeparator();
	PrintWriter out = new PrintWriter(System.out);

	public void outputDivSpace(int[] a) {
		output(a,0,a.length," ");
		crlf_flash();
	}

	public void crlf_flash() {
		out.println("");
		out.flush();
	}
	public void output(int[] a, int off, int len, String delim) {
		out.print(a[off]);
		for(int i=off+1; i<off+len; i++){
			out.print(delim);
			out.print(a[i]);
		}
	}
}