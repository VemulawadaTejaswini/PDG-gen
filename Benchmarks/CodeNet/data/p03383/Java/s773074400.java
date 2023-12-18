import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;


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
	}
	
	InputUtil in = new InputUtil();
	PrintWriter out = new PrintWriter(System.out);
	int H = 0;
	int W = 0;
	String[] S = null;;
	char[][] HW = null;
	
	boolean ans = false;
	public void input() throws IOException {
		H = in.nextInt();
		W = in.nextInt();
		S = new String[H];
		HW = new char[H][W];
		for (int i=0; i<H; i++) {
			S[i] = in.nextLine();
			char[] tmp = S[i].toCharArray();
			Arrays.fill(HW[i],(char)0);
			System.arraycopy(tmp, 0, HW[i], 0, tmp.length);
		}
	}
	
	public void solve() throws IOException {
		boolean[] checkR = new boolean[H];
		int rcount=H;
		for (int r1=0; r1<H; r1++) {
			if (checkR[r1]) continue;
			for (int r2=r1+1; r2<H; r2++) {
				if (checkR[r2]) continue;
				if (solveSubR(r1,r2)){
					checkR[r1] = true;
					checkR[r2] = true;
					rcount-=2;
				}
			}
		}
		if (rcount > H%2) {
			return;
		}
		boolean[] checkC = new boolean[W];
		int ccount=W;
		for (int c1=0; c1<W; c1++) {
			if (checkC[c1]) continue;
			for (int c2=c1+1; c2<W; c2++) {
				if (checkC[c2]) continue;
				if (solveSubC(c1,c2)){
					checkR[c1] = true;
					checkR[c2] = true;
					ccount-=2;
				}
			}
		}
		if (ccount > W%2) {
			return;
		}
		ans = true;
		
	}
	
	public boolean solveSubC(int c1, int c2) {
		HashMap<Character,HashSet<Character>> hm = new HashMap<>();
		for (int i=0; i<H; i++) {
			if (hm.containsKey(HW[i][c2])) {
				hm.get(HW[i][c2]).add(HW[i][c1]);
			} else {
				HashSet<Character> tmp = new HashSet<>();
				tmp.add(HW[i][c1]);
				hm.put(HW[i][c2],tmp);
			}
		}
		for(char k : hm.keySet()) {
			for (char v : hm.get(k)) {
				if (!hm.containsKey(v) || !hm.get(v).contains(k)) {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean solveSubR(int r1, int r2) {
		HashMap<Character,HashSet<Character>> hm = new HashMap<>();
		for (int i=0; i<H; i++) {
			if (hm.containsKey(HW[r2][i])) {
				hm.get(HW[r2][i]).add(HW[r1][i]);
			} else {
				HashSet<Character> tmp = new HashSet<>();
				tmp.add(HW[r1][i]);
				hm.put(HW[r2][i],tmp);
			}
		}
		for(char k : hm.keySet()) {
			for (char v : hm.get(k)) {
				if (!hm.containsKey(v) || !hm.get(v).contains(k)) {
					return false;
				}
			}
		}
		return true;
	}
	
	public void output() {
		out.println(ans ? "YES":"NO");
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
