import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		new Main().exec();
	}
	
	int[] rc;
	int[] min;
	int n;

	public void exec() throws IOException {
		InputUtil in = new InputUtil();
		PrintWriter out = new PrintWriter(System.out);
		n = in.nextInt();
		rc = in.nextInt(new int[n*2]);
		min = new int[n*n];
		Arrays.fill(min, -1);
		out.println(minCount(0,n-1));
		out.flush();
	}
	
	private int minCount(int from, int to) {
		if(min[from*n+to] != -1)
			return min[from*n+to];
		int ans=Integer.MAX_VALUE;
		if(from==to) 
			ans = 0;
		else if(from+1==to) 
			ans = rc[from*2]*rc[to*2]*rc[to*2+1];
		else {
			for(int mid=from+1; mid<=to; mid++){
				ans = Math.min(ans, minCount(from,mid-1) + minCount(mid,to) + rc[from*2]*rc[mid*2]*rc[to*2+1]);
			}
		}
		return min[from*n+to] = ans;
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