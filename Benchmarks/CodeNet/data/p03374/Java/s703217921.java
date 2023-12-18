import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.Arrays;


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


	public void input() throws IOException {
		Status.N = in.nextInt();
		Status.C = in.nextLong();
		Status.X = new long[Status.N];
		Status.V = new int[Status.N];
		for(int i=0; i<Status.N; i++) {
			Status.X[i] = in.nextLong();
			Status.V[i] = in.nextInt();
		}
	}
	
	public void solve() throws IOException {
		ArrayDeque<Status> q = new ArrayDeque<>();
		q.add(new Status());
		while (!q.isEmpty()) {
			Status st = q.poll();
			if (!st.check()) continue;
			if (st.hasChoice()) {
				q.add(st.goL());
				q.add(st.goR());
			} else {
				st.goNear();
			}
		}
	}
	
	
	public void output() {
		out.println(Status.maxCa);
		out.flush();
	}
}

class Status {
	public static int N = 0;
	public static long C = 0;
	public static long[] X = null;
	public static int[] V = null;
	public static long maxCa = 0;

	int li = 0;
	int ri = 0;
	long nx = 0;
	long lx = 0;
	long rx = 0;
	int lv = 0;
	int rv = 0;
	long ca = 0;
	
	public Status() {
		li = 0;
		ri = N-1;
		nx = 0;
		setDistanceL();
		setDistanceR();
		lv = V[li];
		rv = V[ri];
	}
	
	public void setDistanceL() {
		lx = getDistanceL();
	}
	public void setDistanceR() {
		rx = getDistanceR();
	}

	private long getDistanceL() {
		return distance(nx, X[li]);
	}
	private long getDistanceR() {
		return distance(nx, X[ri]);
	}

	public static long distance(long nowPos, long targetPos) {
		long a = targetPos-nowPos;
		a = Math.abs(a);
		long b = C-a;
		b = Math.abs(b);
		long c = Math.min(a,b);
		return c;
	}
	
	public Status goNear() {
		return (getDistanceL() > getDistanceR()) ? goR():goL();
	}
	
	public boolean check() {
		long catmp = ca;
		for (int i=li; i<=ri; i++) {
			catmp += V[i];
		}
		long dis = X[ri]-X[li];
		dis += Math.min(lx, rx);
		return (catmp-dis>maxCa);
	}
	
	
	public Status goL() {
		Status c = clone();
		c.ca += c.lv - c.lx;
		maxCa = Math.max(maxCa,c.ca);
		c.nx = X[c.li];
		c.li = (c.li+1)%N;
		c.setDistanceL();
		c.setDistanceR();
		c.lv = V[c.li];
		return c;
	}
	
	public Status goR() {
		Status c = clone();
		c.ca += c.rv - c.rx;
		maxCa = Math.max(maxCa,c.ca);
		c.nx = X[c.ri];
		c.ri = (c.ri+N-1)%N;
		c.setDistanceL();
		c.setDistanceR();
		c.rv = V[c.ri];
		return c;
	}
	
	public Status clone() {
		Status c = new Status();
		c.li=li;
		c.ri=ri;
		c.nx=nx;
		c.lx=lx;
		c.rx=rx;
		c.lv=lv;
		c.rv=rv;
		c.ca=ca;
		return c;
	}
	
	public boolean hasChoice() {
		return li < ri;
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
