import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;


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
	
	int N = 0;
	int[] A = null;
	int ans = 0;
			
	public void input() throws Exception {
		N = in.nextInt();
		A = in.nextInt(new int[N]);
	}
	
	private TreeSet<Integer> createExp2Set() {
		TreeSet<Integer> ret = new TreeSet<>();
		int max=Integer.MAX_VALUE/2;
		int i=1;
		while (i<max) {
			ret.add(i);
			i*=2;
		}
		ret.add(i);
		return ret;
	}
	
	private Integer getExp2Complement(TreeSet<Integer> setExp2, int a) {
		return setExp2.higher(a);
		
	}
	
//	private Map<Integer,Integer> createExp2CompMap(TreeSet<Integer> setExp2) {
//		Map<Integer,Integer> ret = new HashMap<>();
//		for (int num : A) {
//			int exp2CompNum = getExp2Complement(setExp2, num);
//			if (ret.containsKey(exp2CompNum)) {
//				ret.put(exp2CompNum,ret.get(exp2CompNum)+1);
//			} else {
//				ret.put(exp2CompNum,1);
//			}
//		}
//		return ret;
//	}
	
	private TreeMap<Integer,Integer> createNumberCountMap() {
		TreeMap<Integer,Integer> ret = new TreeMap<>();
		for (int a : A) {
			if (ret.containsKey(a)) {
				ret.put(a,ret.get(a)+1);
			} else {
				ret.put(a,1);
			}
		}
		return ret;
	}

	public void solve() throws Exception {
		ans = 0;
		TreeSet<Integer> setExp2 = createExp2Set();
		TreeMap<Integer,Integer> mapNumCount = createNumberCountMap();
//		Map<Integer,Integer> mapExp2CompNum = createExp2CompMap(setExp2);
		int num = mapNumCount.lastKey();
		while(true) {
			int numCnt = mapNumCount.get(num);
			if (numCnt > 0) {
				int numComp = getExp2Complement(setExp2,num) - num;
				if (num == numComp) {
					ans += numCnt/2;
					mapNumCount.put(num, numCnt%2);
				} else if (mapNumCount.containsKey(numComp)) {
					int numCompCnt = mapNumCount.get(numComp);
					int pairNum = Math.min(numCnt, numCompCnt);
					ans += pairNum;
					mapNumCount.put(num, numCnt-pairNum);
					mapNumCount.put(numComp, numCompCnt-pairNum);
				}
			}
			Integer iTmp = mapNumCount.lowerKey(num);
			if (iTmp == null) {
				break;
			}
			num = iTmp;
		}
		
		
	}
	
	public void output() {
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
