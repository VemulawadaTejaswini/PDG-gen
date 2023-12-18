import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
 
 
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
	
	/*
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	/*/
	InputUtil in = new InputUtil();
	//*/
	PrintWriter out = new PrintWriter(System.out);
	int Q = 0;
	int[] L = null;
	int[] R = null;
	int[] ans = null;

	int[] isPrime = new int[100000];
	private static final int PRIME_UNKNOWN = 0;
	private static final int PRIME_YES = 1;
	private static final int PRIME_NO = 2;
	
	public void input() throws IOException {
		/*
		String[] tmp = br.readLine().split(" ");
		A = Integer.parseInt(tmp[0]);
		B = Integer.parseInt(tmp[1]);
		S = br.readLine().toCharArray();
		/*/
		Q = in.nextInt();
		L = new int[Q];
		R = new int[Q];
		ans = new int[Q];
		for(int i=0; i<Q; i++) {
			L[i] = in.nextInt();
			R[i] = in.nextInt();
			ans[i] = 0;
		}
		//*/
		
		initPrime();
		
	}
	
	private void initPrime() {
		isPrime[1] = PRIME_NO;
		for(int i=2; i<100000; i++) {
			if(isPrime[i] == PRIME_UNKNOWN){
				isPrime[i] = PRIME_YES;
				for(int j=i*2; j<100000; j+=i){
					isPrime[j] =  PRIME_NO;
				}
			}
		}
	}
	
	public void solve() throws IOException {
		for(int i=0; i<Q; i++) {
			for(int j=L[i]; j<=R[i]; j+=2) {
				ans[i] += (isSimilar2017(j))?1:0;
			}
		}
	}
	
	private boolean isSimilar2017(int number) {
		return isPrime[number]==PRIME_YES && isPrime[(number+1)/2]==PRIME_YES;
	}
	
	
	public void output() {
		for(int i=0; i<Q; i++) {
			out.println(ans[i]);
		}
		out.flush();
	}
}

//*
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
//*/