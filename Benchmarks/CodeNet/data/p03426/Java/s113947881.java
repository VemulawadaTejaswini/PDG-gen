import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Main m = new Main();
		//*
		m.input();
		m.solve();
		m.output();
		/*/
		m.debug();
		//*/
	}
	
//	public void debug() {
//	}
	
	InputUtil in = new InputUtil();
	PrintWriter out = new PrintWriter(System.out);
	
	int H = 0;
	int W = 0;
	int D = 0;
	int[] A = null;
	int Q = 0;
	int[] L = null;
	int[] R = null;
	int[] AX = null;
	int[] AY = null;
//	int M = 0;
//	int[] A = null;
//	String S = null;

//	boolean ansb = false;
	int[] ans = null;
	
	public void input() throws IOException {
//		N = in.nextInt();
//		M = in.nextInt();
//		A = in.nextInt(new int[N]);
//		S = in.nextLine();
		
		H = in.nextInt();
		W = in.nextInt();
		D = in.nextInt();
		A = in.nextInt(new int[H*W]);
		Q = in.nextInt();
		L = new int[Q];
		R = new int[Q];
		for (int i=0; i<Q; i++) {
			L[i] = in.nextInt();
			R[i] = in.nextInt();
		}
		AX = new int[H*W];
		AY = new int[H*W];
		for (int x=0; x<H; x++) {
			for (int y=0; y<W; y++) {
				int a = getA(x,y);
				AX[a-1] = x;
				AY[a-1] = y;
			}
		}
		ans = new int[Q];
	}
	
	private int getA(int x, int y) {
		return A[y * H + x];
	}
	
	public void solve() throws IOException {
		for (int i=0; i<Q; i++) {
			ans[i] = 0;
			int l = L[i];
			int r = R[i];
			int num = l;
			while (num < r) {
				int x0 = AX[num-1];
				int y0 = AY[num-1];
				num += D;
				int x1 = AX[num-1];
				int y1 = AY[num-1];
				ans[i] += Math.abs(x1-x0) + Math.abs(y1-y0);
			} 
		}
	}
	

	
	public void output() {
//		out.println(ansb?"Yes":"No");
		for (int i=0; i<Q; i++)
			out.println(ans[i]);
		out.flush();
	}
}

class InputUtil {
	//Static Fields
	private static final int BUFSIZ = 100000;
	boolean lineMode = false;
	
	//Fields
	protected InputStream in;
	private byte[] buf = null;
	private int ptr = 0;
	private int max = -1;
	private DataInputStream dis = null;
	//Constructors
	public InputUtil() {this(System.in,BUFSIZ);}
	public InputUtil(InputStream in, int bufsiz) {
		initBuf(bufsiz);
		initIn(in);
	}
	
	//Methods
	//Initializer
	protected void initIn(InputStream in) {dis = new DataInputStream(this.in = in);}
	protected void initBuf(int bufsiz) {buf = new byte[bufsiz];}
	
	//buffer operation
	private void next() throws IOException {ptr++; readBuf();}
	private void readBuf() throws IOException {
		if(ptr >= max && dis.available()>0) {
			if(max>0) Arrays.fill(buf,0,max,(byte)0);
			max = dis.read(buf);
			ptr = 0;
		}
	}


	//String Input Reader/Parser
	private boolean isCrLf(byte b) {return b == 0x0a || b == 0x0d; }

	private void skipOneCrLf() throws IOException {
		byte b = buf[ptr];
		if (isCrLf(b)) {
			ptr++;
			if (b == 0x0d) {
				readBuf();
				if (ptr < max && buf[ptr] == 0x0a) {
					ptr++;
				}
			}
		}
	}
	
	public String nextLine() throws IOException {
		StringBuilder sb = new StringBuilder();
		boolean isFirst = true;
		for(readBuf(); ptr < max ;readBuf()) {
			byte b = buf[ptr];
			if(isCrLf(b)) {
				skipOneCrLf();
				if (!isFirst || lineMode) {
					break;
				}
			}else{
				int strPtr = ptr++;
				int endPtr = -1;
				for(int i = ptr; i<max; i++) {
					if(isCrLf(buf[i])) {
						endPtr = i;
						break;
					}
				}
				if(endPtr == -1) endPtr = max;
				sb.append(new String(buf,strPtr,endPtr-strPtr,"UTF-8"));
				ptr = endPtr;
			}
			isFirst = false;
		}
		lineMode = true;
		return sb.toString();
	}
	
	public byte nextByte() throws IOException {
		lineMode=false;
		readBuf();
		if(ptr < max) {
			return buf[ptr++];
		}else{
			return -1;
		}
	}
	
	//Number Input Reader/Parser
	private boolean isNum(byte b) {return '0' <= b && b <= '9'; }
	private boolean isMinus(byte b) {return b=='-'; }
	
	public int nextInt() throws IOException {
		lineMode=false;
		readBuf();
		return (int)_nextLong();
	}

	public int[] nextInt(int[] result) throws IOException {
		lineMode=false;
		readBuf();
		for(int i=0; i<result.length; i++) {
			result[i] = (int)_nextLong();
		}
		return result;
	}

	private long _nextLong() throws IOException {
		int sign = 1;
		long res = 0;
		byte c;
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
	
	public long nextLong() throws IOException {
		lineMode=false;
		readBuf();
		return _nextLong();
	}

	public long[] nextLong(long[] result) throws IOException {
		lineMode=false;
		readBuf();
		for(int i=0; i<result.length; i++) {
			result[i] = _nextLong();
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
	public static final String EOF = System.lineSeparator();

	public static void outputDivSpace(PrintWriter out, int[] a) {
		OutputUtil.output(out,a,0,a.length," ");
	}
	
	public static void outputDivEOF(PrintWriter out, int[] a) {
		OutputUtil.output(out,a,0,a.length,EOF);
	}
	
	public static void output(PrintWriter out, int[] a, int off, int len, String delim) {
		out.print(a[off]);
		for(int i=off+1; i<len; i++){
			out.print(delim);
			out.print(a[i]);
		}
		out.println("");
		out.flush();
	}
}
