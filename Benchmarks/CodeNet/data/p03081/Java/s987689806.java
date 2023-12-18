import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;

import javax.crypto.spec.GCMParameterSpec;


public class Main {
	
	public static void main(String[] args) throws Exception {
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
	
	int N,Q = 0;
	char[] S = null;
	Spell[] td = null;
	int ans = 0;
	int maxL=0;
	int maxR=0;

	public void input() throws Exception {
		N = in.nextInt();
		Q = in.nextInt();
		S = in.nextLine().toCharArray();
		td = new Spell[Q];
		for (int i=0; i<Q; i++) {
			String S = in.nextLine();
			td[i] = new Spell(S.charAt(0),S.charAt(2));
		}
	}
	
	public void solve() throws Exception {

		ArrayDeque<GolemCount> lgcFin = new ArrayDeque<>();
		ArrayDeque<GolemCount> lgc = new ArrayDeque<>();
		lgc.add(new GolemCount(new Spell(S[0],'L'),null,0,0));
		lgc.add(new GolemCount(new Spell(S[N-1],'R'),null,N-1,0));
		
		for (int i=Q-1; i>=0; i--) {
			ArrayDeque<GolemCount> lgc2 = new ArrayDeque<>();
			while (!lgc.isEmpty()) {
				GolemCount gc = lgc.poll();
				if (gc.plus != null && gc.plus.equals(td[i])) {
					gc.golemCount++;
					gc.zero = gc.plus.getReverse();
					gc.index += (gc.plus.d == 'R') ? -1 : 1;
					if (gc.index < 0 || gc.index >= N) {
						lgcFin.add(gc);
						continue;
					} else {
						gc.plus.t = S[gc.index];
					}
				} else if (gc.zero != null && gc.zero.equals(td[i])) {
					continue;
				}
				lgc2.add(gc);
			}
			lgc = lgc2;
		}
		lgcFin.addAll(lgc);
		
		for(GolemCount gc : lgcFin) {
			if (gc.plus.d == 'R') {
				maxR = Math.max(maxR, gc.golemCount);
			} else {
				maxL = Math.max(maxL, gc.golemCount);
			}
		}
		
	}
	

	public void output() {
		out.println(Math.max(N - maxR - maxL,0));
		out.flush();
	}
	
}

class Spell {
	char t;
	char d;
	public Spell(char t, char d) {
		this.t=t;
		this.d=d;
	}
	public boolean equals(Spell s) {
		return (this.t==s.t && this.d==s.d);
	}
	public Spell getReverse() {
		if (d == 'R') return new Spell(t,'L');
		if (d == 'L') return new Spell(t,'R');
		else return null;
	}
}

class GolemCount {
	Spell plus;
	Spell zero;
	int index;
	int golemCount = 0;
	public GolemCount(Spell p, Spell d, int index, int gc) {
		this.plus = p;
		this.zero = d;
		this.index=index;
		this.golemCount=gc;
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

	public static void outputDivSpace(PrintWriter out, Integer[] a) {
		OutputUtil.output(out,a,0,a.length," ");
	}
	
	public static void outputDivEOF(PrintWriter out, Integer[] a) {
		OutputUtil.output(out,a,0,a.length,EOF);
	}
	
	public static void output(PrintWriter out, Integer[] a, int off, int len, String delim) {
		out.print(a[off]);
		for(int i=off+1; i<len; i++){
			out.print(delim);
			out.print(a[i]);
		}
		out.println("");
		out.flush();
	}

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
