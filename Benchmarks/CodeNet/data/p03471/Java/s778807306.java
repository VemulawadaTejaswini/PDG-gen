import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
 
 
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
	//char[] S = null;
	int N = 0;
	int Y = 0;
	int ans10000 = -1;
	int ans5000 = -1;
	int ans1000 = -1;
	
	public void input() throws IOException {
		/*
		S = br.readLine().toCharArray();
		/*/
		N = in.nextInt();
		Y = in.nextInt();
		//*/
		
	}
	
	public void solve() throws IOException {
		//all 1000
		ans10000=0;
		ans5000=0;
		ans1000=Y/1000;

		if(!check()){
			//5000 1～possible
			//5000x2 -> 10000 1～possible
			for(int i=0; i<=Y/10000; i++){
				ans1000 -= 10*i;
				ans10000 += i;
				
				if(check()) return;

				while(ans1000>=5){
					ans1000 -= 5;
					ans5000 ++;
					
					if(check()) return;
				}
				
				ans1000 += ans5000*5 + ans10000 * 10;
				ans5000 = 0;
				ans10000 = 0;
			}
		}
		ans10000 = -1;
		ans5000 = -1;
		ans1000 = -1;
	}
	
	private boolean check() {
		return (ans10000*10000 + ans5000*5000 + ans1000*1000 == Y) && (ans10000+ans5000+ans1000 == N);
	}
	
	
	public void output() {
		out.println(ans10000+" "+ans5000+ " "+ans1000);
//		out.println(ans[0]==1?"Yes":"No");
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