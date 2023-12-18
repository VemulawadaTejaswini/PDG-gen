import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
	
	int N,M;
	long[] X,Y,Z;
	int[][] sign = {
			{1,1,1},
			{-1,1,1},
			{1,-1,1},
			{-1,-1,1},
			{1,1,-1},
			{-1,1,-1},
			{1,-1,-1},
			{-1,-1,-1}
	};
	long ans=0;
			
	public void input() throws IOException {
		N = in.nextInt();
		M = in.nextInt();
		X = new long[N];
		Y = new long[N];
		Z = new long[N];
		for (int i=0; i<N; i++) {
			X[i] = in.nextLong();
			Y[i] = in.nextLong();
			Z[i] = in.nextLong();
		}
	}
	
	public void solve() throws IOException {
		for(int s=0; s<sign.length; s++) {
			boolean[] ch = new boolean[N]; 
			long vmax=0;
			long vx=0;
			long vy=0;
			long vz=0;
			for(int i=0; i<M; i++) {
				int jmax2=0;
				long vx2=0;
				long vy2=0;
				long vz2=0;
				long vmax2=0;
				for(int j=0; j<N; j++) {
					if (ch[j])
						continue;
					long v2 = sign[s][0]*(vx+X[j])+sign[s][1]*(vy+Y[j])+sign[s][2]*(vz+Z[j]);
					if (vmax2 < v2) {
						vmax2 = v2;vx2=X[j];vy2=Y[j];vz2=Z[j];
						jmax2 = j;
					}
				}
				ch[jmax2]=true;
				vx = vx+vx2;
				vy = vy+vy2;
				vz = vz+vz2;
				long v = sign[s][0]*vx+sign[s][1]*vy+sign[s][2]*vz;
				if (vmax < v) {
					vmax = v;
				}
			}
			if (ans < vmax) {
				ans = vmax;
			}
		}
	}
	
	public void output() {
		out.println(ans);
		out.flush();
	}
	
}

class ModUtil {
	//Static Fields
	public static final int BASE_DEF = 1000000007;
	public static final int CAPACITY_F = 100001;
	
	//Fields
	protected int mod = BASE_DEF;
	protected int capacity = CAPACITY_F;
	private int[] Farray = null;;
	private int[] FInvarray = null;

	//Constructors
	public ModUtil() {
		initF();
	}
	public ModUtil(int m, int cap) {
		mod = m;
		capacity=cap;
		initF();
	}
	
	//Methods
	//Initializer
	protected void initF() {
		if(Farray != null) return;
		Farray = new int[capacity+1];
		FInvarray = new int[capacity+1];
		for(int n=0; n<Farray.length; n++) {
			Farray[n] = (n==0) ? 1 : multiple(n, Farray[n-1]);
			FInvarray[n] = divide(1, Farray[n]);
		}
	}

	//Basic Opertion
	public int modulo(long v) {return (int)(v%mod);}
	public int add(int a, int b) {return modulo(a + b);}
	public int sub(int a, int b) {return add(a, mod - b);}
	public int multiple(int a, int b) {return modulo((long)a * modulo(b));}
	public int divide(int a, int b) {return multiple(a, power(b, mod-2));}
	
	public int divideF(int a, int fn) {
		if(fn<=capacity) {
			return multiple(a, getFInv(fn));
		}else{
			return divide(a, getF(fn));
		}
	}
	
	public int power(int a, int b) {
		int ret = 1;
		for (int bitMask = 1; bitMask<=b; bitMask<<=1) {
			if ( (b & bitMask) != 0 ) ret = multiple(ret, a);
			a = multiple(a, a);
		}
		return ret;
	}

	//Factorial Operation
	public int getF(int n) {return Farray[n];}
	public int getFInv(int n) {return FInvarray[n];}

	//Permutation Operation
	protected int calcP(int n, int r) {
		if (n < 0 || r < 0 || n < r) throw new IllegalArgumentException("n=" +n+ ",r=" +r);
		if (n <= 1 || r == 0) return 1;
		if (r == 1) return n;
		return divideF(getF(n), n-r);
		
	}

	public int getP(int n, int r) {return calcP(n, r);}

	//Combination Operation
	protected int calcC(int n, int r) {
		if(n < 0 || r < 0 || n < r) throw new IllegalArgumentException("n=" +n+ ",r=" +r);
		if(n == 0 || n == 1) return 1;
		if(n - r < r) r = n - r;
		return divideF(divideF(getF(n), r),n-r);
	}
	
	public int getC(int n, int r) {return calcC(n,r);}
	public int getH(int n, int r) {return calcC(n+r-1, r);}

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
