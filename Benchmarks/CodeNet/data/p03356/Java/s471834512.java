import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


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
	
	int N=0,M=0;
	int[] p=null, x=null, y=null;
	long ans = 0;
//	boolean ans = false;
			
	public void input() throws IOException {
		N = in.nextInt();
		M = in.nextInt();
		p = in.nextInt(new int[N]);
		x = new int[M];
		y = new int[M];
		for (int i=0; i<M; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}
	}
	
	public void solve() throws IOException {
		int[] grpList = new int[N];
		Arrays.fill(grpList, -1);
		Set<Integer> noswapIndex = new HashSet<>();
		for (int i=1; i<=N; i++) {
			noswapIndex.add(i);
		}
		Map<Integer,Set<Integer>> grpMap = new HashMap<>();
		int maxGrpNum = 0;
		for (int i=0; i<M; i++) {
			int xgrp = grpList[x[i]-1];
			int ygrp = grpList[y[i]-1];
			if (xgrp != -1 && ygrp != -1) {
				if (xgrp != ygrp) {
					for (int j: grpMap.get(ygrp)) {
						grpMap.get(xgrp).add(j);
						grpList[j-1]=xgrp;
						grpMap.remove(ygrp);
					}
				} else {
					//なにもしない
				}
			} else if (xgrp != -1) {
				grpMap.get(xgrp).add(y[i]);
				grpList[y[i]-1]=xgrp;
				noswapIndex.remove(y[i]);
			} else if (ygrp != -1) {
				grpMap.get(ygrp).add(x[i]);
				grpList[x[i]-1]=ygrp;
				noswapIndex.remove(x[i]);
			} else {
				HashSet<Integer> s = new HashSet<>();
				s.add(x[i]);
				s.add(y[i]);
				grpList[x[i]-1]=maxGrpNum;
				grpList[y[i]-1]=maxGrpNum;
				noswapIndex.remove(x[i]);
				noswapIndex.remove(y[i]);
				grpMap.put(maxGrpNum++, s);
			}
		}
		
		for (int i: grpMap.keySet()) {
			HashSet<Integer> indexSet = new HashSet<>();
			HashSet<Integer> valueSet = new HashSet<>();
			for(int j: grpMap.get(i)){
				indexSet.add(j);
				valueSet.add(p[j-1]);
			}
			for (int j: indexSet) {
				if (valueSet.contains(j)) {
					ans ++;
				}
			}
		}
		
		
		Set<Integer> noswapValue = new HashSet<>();
		for (int i: noswapIndex) {
			noswapValue.add(p[i-1]);
		}
		for (int i: noswapIndex) {
			if (noswapValue.contains(i)) {
				ans ++;
			}
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
