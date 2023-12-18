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
	ModUtil mu = new ModUtil();
	
	int N, A, B;
	long K;
	int ans = 0;
			
	public void input() throws IOException {
		N = in.nextInt();
		A = in.nextInt();
		B = in.nextInt();
		K = in.nextLong();
	}
	
	
	public void solve() throws IOException {
		for(int NA=0; NA<=N; NA++) {
			long tmp = NA*A;
			if (tmp > K) {
				break;
			}
			tmp = K - tmp;
			if (tmp%B != 0 || tmp/B>N) {
				continue;
			}
			int na_ = NA;
			int nb_ = (int)(tmp/B);
			int nc_ = 0;
			ans = mu.add(ans, count(na_,nb_,nc_,N));
			while (na_ > 0 && nb_ > 0) {
				na_--;
				nb_--;
				nc_++;
				ans = mu.add(ans,count(na_,nb_,nc_,N));
			}
		}
	}
	
	//場合の数をカウント
	private int count(int a, int b, int c, int n) {
		int ret = 0;
		if (a+b+c<=N) {
			ret = mu.calcC(n, a);
			n -= a;
			ret = mu.multiple(ret, mu.calcC(n, b));
			n -= b;
			ret = mu.multiple(ret, mu.calcC(n, c));
		}
		long tmp = (long)a * (long)A;
		tmp += (long)b * (long)B;
		tmp += (long)c * (long)(A+B);
		
		return ret;
	}
	
	public void output() {
		out.println(ans);
		out.flush();
	}
}

class ModUtil {
	//Static Fields
	public static final int BASE_DEF = 998244353;
	public static final int CAPACITY_F = 300001;
	
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
