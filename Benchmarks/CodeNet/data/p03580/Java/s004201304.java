import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;


public class Main {
	
	public static void main(String[] args) throws IOException {
		Main m = new Main();
		m.input();
		m.solve();
		m.output();
	}
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//InputUtil in = new InputUtil();
	PrintWriter out = new PrintWriter(System.out);

	int N = 0;
	String S = null;
	long ans = 0L;
	
	public void input() throws IOException {
		N = Integer.parseInt(br.readLine());
		S = br.readLine();
	}

	public void solve() throws IOException {
		String[] S1 = S.split("00+");
		for(String s1: S1){
			ans += solveSub(s1);
		}
	}
	
	public int solveSub(String s) throws IOException {
		int ret = 0;
		int tmpLen = 0;
		int minSubstrLen = Integer.MAX_VALUE;
		int maxSplitLen = 0;
		int stridx = 0;
		if(s.charAt(0)=='0')
			stridx = 1;
		int endidx = s.length();
		if(s.charAt(endidx-1)=='0')
			endidx --;

		for(int i=stridx; i<endidx; i++){
			if(s.charAt(i)=='1') {
				tmpLen++;
			}else{
				ret += tmpLen-1;
				minSubstrLen = Math.min(minSubstrLen, tmpLen-1);
				tmpLen=0;
				int j=0;
				while(i+j*2 < endidx && s.charAt(i+j*2)=='0')
					j++;
				maxSplitLen = Math.max(maxSplitLen, j);
				i += j*2 - 1;
				ret += (j+1)/2;
			}
		}
		ret += tmpLen;
		minSubstrLen = Math.min(minSubstrLen, tmpLen);
		if(maxSplitLen < 3){
			ret -= minSubstrLen;
		}
		return ret;
	}
	
	public void output() {
		out.println(ans);
		out.flush();
		
	}
}



class InputUtil {
	//Static Fields
	private static final int BUFSIZ = 100000;
	
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
	
	//Number Input Reader/Parser
	private boolean isNum(byte b) {return '0' <= b && b <= '9'; }
	private boolean isMinus(byte b) {return b=='-'; }

	private int _nextInt() throws IOException {
		int sign = 1;
		int res = 0;
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
	
	public int nextInt() throws IOException {
		readBuf();
		return _nextInt();
	}

	public int[] nextInt(int[] result) throws IOException {
		readBuf();
		for(int i=0; i<result.length; i++) {
			result[i] = _nextInt();
		}
		return result;
	}
	
	//Close 
	public void close() throws IOException {
		if(!this.in.equals(System.in)) 
			this.in.close();
	}

}
