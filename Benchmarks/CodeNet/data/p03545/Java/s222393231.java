import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;


public class Main {
	
	public static void main(String[] args) throws IOException {
		Main m = new Main();
		m.input();
		m.solve();
		m.output();
	}
	/*
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	/*/
	InputUtil in = new InputUtil();
	PrintWriter out = new PrintWriter(System.out);
	//*/
	int ABCD = 0;
	String ans = "";
	
	public void input() throws IOException {
		/*
		S = br.readLine();
		/*/
		ABCD = in.nextInt();
		//*/
	}

	public void solve() throws IOException {
		int A = ABCD/1000;
		int B = (ABCD/100)%10;
		int C = (ABCD/10)%10;
		int D = ABCD%10;
		
		for(int i=0; i<2; i++){
			for(int j=0; j<2; j++){
				for(int k=0; k<2; k++){
					if(solveSub(A,i==0,B,j==0,C,k==0,D)==7){
						ans = A 
								+ ((i==0)?"+":"-") + B
								+ ((j==0)?"+":"-") + C
								+ ((k==0)?"+":"-") + D
								+ "=7";
						break;
					}
				}
			}
		}
		
		
	}
	public int solveSub(int a, boolean opIsPlus1, int b, boolean opIsPlus2, int c, boolean opIsPlus3, int d) {
		int ret = a;
		ret = (opIsPlus1) ? (ret+b) : (ret-b);
		ret = (opIsPlus2) ? (ret+c) : (ret-c);
		ret = (opIsPlus3) ? (ret+d) : (ret-d);
		return ret;
	}
	
	public void output() {
		out.println(ans);
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
