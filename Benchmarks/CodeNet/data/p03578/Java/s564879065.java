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
	
	//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	InputUtil in = new InputUtil();
	PrintWriter out = new PrintWriter(System.out);

	int N = 0;
	int M = 0;
	int[] D = null;
	int[] T = null;
	boolean ans = false;
	
	public void input() throws IOException {
		N = in.nextInt();
		D = in.nextInt(new int[N]);
		M = in.nextInt();
		T = in.nextInt(new int[M]);
				
	}

	public void solve() throws IOException {
		HashMap<Integer,Integer> DH = new HashMap<>();
		final Integer one = new Integer(1);
		for(Integer d : D){
			Integer value = null;
			if(DH.containsKey(d)){
				value = DH.get(d);
				value ++;
			}else{
				value = one;
			}
			DH.put(d, value);
		}
		HashMap<Integer,Integer> TH = new HashMap<>();
		for(Integer t : T){
			Integer value = null;
			if(TH.containsKey(t)){
				value = TH.get(t);
				value ++;
			}else{
				value = one;
			}
			TH.put(t, value);
		}
		
		for(Integer t : TH.keySet()){
			Integer tv = TH.get(t);
			Integer dv = DH.get(t);
			if(dv == null || tv > dv) {
				return;
			}
			
		}
		ans = true;
	}
	
	public void output() {
		out.println(ans ? "YES" : "NO");
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
