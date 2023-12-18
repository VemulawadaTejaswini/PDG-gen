import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;


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
	
	int N, K, Q;
	int[] A,ASorted;
	Map<Integer,List<Integer>> Amap = new HashMap<>();
	long ans = 0;
//	boolean ans = false;
			
	public void input() throws IOException {
		N = in.nextInt();
		K = in.nextInt();
		Q = in.nextInt();
		A = in.nextInt(new int[N]);
		ASorted = new int[N];
		System.arraycopy(A, 0, ASorted, 0, N);
		Arrays.sort(ASorted);
		for (int i=0; i<N; i++) {
			addAmap(A[i],i);
		}
	}
	
	private void addAmap (int key, int val) {
		List<Integer> valList;
		if (Amap.containsKey(key)) {
			valList = Amap.get(key);
		} else {
			valList = new ArrayList<>();
			Amap.put(key, valList);
		}
		valList.add(val);
	}
	
	public void solve() throws IOException {
		ans = Integer.MAX_VALUE;
		LOOP1:
		for (int i=0; i<N-Q && ans > 0; i++) {
			if (ans > A[i+Q-1] - A[i]) {
				int result = check(i);
				switch (result) {
				case -1:
					// この数字はNGだがそれ以上のチェックも必要
					break;
				case -2:
					// それ以上のチェック不可
					break LOOP1;
				default:
					//この数字はOK
					ans = (ans>result)?result:ans;
					break;
				}
			}
		}
	}
	
	private int check(int idx) {
		int checkResult = 0;
		if (idx==0) {
			checkResult = ASorted[Q-1] - ASorted[0];
		} else if (idx>0) {
			//選択しない数字の最大値と、選択する可能性のある数字の最小値が等しい場合、その数字では分けられないためスキップ
			if (ASorted[idx-1] == ASorted[idx]) {
				return -1;
			}
			//選択しない数字の位置を格納
			TreeSet<Integer> ngIdxSet = new TreeSet<>();
			for (int i=0; i<idx; i+=Amap.get(ASorted[i]).size()) {
				for (int elem: Amap.get(ASorted[i])) {
					ngIdxSet.add(elem);
				}
			}
			//選択しない数字の位置で分割される領域を確定させる
			int[][] ranges = new int[idx+1][2];
			int startIdx = 0;
			for (int i=0; i<idx; i++){
				ranges[i][0] = startIdx;
				ranges[i][1] = ngIdxSet.ceiling(startIdx) - 1;
				startIdx = ranges[i][1] + 2;
			}
			ranges[idx][0] = startIdx;
			ranges[idx][1] = N-1;
			
			List<Integer> exList = new ArrayList<>();
			//領域ごとに選択できる要素を取り出す
			LOOP2:
			for (int i=0; i<=idx; i++) {
				int sidx = ranges[i][0];
				int eidx = ranges[i][1];
				int rangeCount = (eidx-sidx+1) - K;
				for (int j=idx; j<N; j+=Amap.get(ASorted[j]).size()) {
					for (int elem: Amap.get(ASorted[j])) {
						if (sidx<=elem && elem<=eidx) {
							exList.add(A[elem]);
							rangeCount --;
							if (rangeCount < 0) {
								break LOOP2;
							}
						}
					}
				}
			}
			if (exList.size() < Q) {
				return -2;
			}
			Collections.sort(exList);
			checkResult = exList.get(Q-1) - exList.get(0);
			
		} else {
			return -2;
		}
		return checkResult;
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
