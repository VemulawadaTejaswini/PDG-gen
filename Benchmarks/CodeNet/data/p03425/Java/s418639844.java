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
	
	public void debug() {
		int h=300;
		int w=300;
		int[][] A = new int[h][w];
		for (int i=0; i<h*w; i++) {
			int i2 = i%4;
			int i3 = i/4;
			int offx = (i2==0||i2==2)?0:(h/2);
			int offy = (i2==0||i2==1)?0:(w/2);
			int x = i3%(h/2);
			int y = i3/(h/2);
			A[offx+x][offy+y]=i+1;
		}
		for(int x=0; x<h; x++) {
			for(int y=0; y<w; y++) {
				if(y>0)
					System.out.print(" ");
				System.out.print(A[x][y]);
			}
			System.out.println("");
		}
	}
	
	InputUtil in = new InputUtil();
	PrintWriter out = new PrintWriter(System.out);
	
	int N = 0;
	String[] S = null;
	int countM = 0;
	int countA = 0;
	int countR = 0;
	int countC = 0;
	int countH = 0;
	int countAll = 0;
//	int M = 0;
//	int[] A = null;
//	String S = null;

//	boolean ansb = false;
	long ans = 0;
	
	public void input() throws IOException {
//		N = in.nextInt();
//		M = in.nextInt();
//		A = in.nextInt(new int[N]);
//		S = in.nextLine();
		N = in.nextInt();
		S = new String[N];
		for (int i=0; i<N; i++) {
			S[i] = in.nextLine();
			switch(S[i].charAt(0)) {
			case 'M':
				countM++;
				countAll++;
				break;
			case 'A':
				countA++;
				countAll++;
				break;
			case 'R':
				countR++;
				countAll++;
				break;
			case 'C':
				countC++;
				countAll++;
				break;
			case 'H':
				countH++;
				countAll++;
				break;
			}
			
		}
	}
	
	public void solve() throws IOException {
		if (countAll < 3) {
			ans = 0;
		} else {
			solveSub(countM , countA , countR);
			solveSub(countM , countA , countC);
			solveSub(countM , countA , countH);
			solveSub(countM , countR , countC);
			solveSub(countM , countR , countH);
			solveSub(countM , countC , countH);
			solveSub(countA , countR , countC);
			solveSub(countA , countR , countH);
			solveSub(countA , countC , countH);
			solveSub(countR , countC , countH);
		}
	}
	
	private void solveSub(int a, int b, int c) {
		if (a+b+c>=3) {
			ans += a*b*c;
		}	
	}
	

	
	public void output() {
//		out.println(ansb?"Yes":"No");
		out.println(ans);
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
