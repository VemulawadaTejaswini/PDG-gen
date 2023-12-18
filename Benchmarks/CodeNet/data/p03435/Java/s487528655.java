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
	
	/*
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String S = null;
	/*/
	InputUtil in = new InputUtil();
	//*/
	PrintWriter out = new PrintWriter(System.out);
	
	int[][] c = new int[3][3];
	
//	int ans = -1;
	boolean ans = true;
	
	
	
	
	public void input() throws IOException {
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				c[i][j] = in.nextInt();
			}
		}
	}
	
	public void solve() throws IOException {
		for (int i=0; i<2; i++) {
			int dj0 = c[i+1][0]-c[i][0];
			int dj1 = c[i+1][1]-c[i][1];
			int dj2 = c[i+1][2]-c[i][2];
			if (dj0 != dj1 || dj1 != dj2) {
				ans = false;
				return;
			}
		}
		for (int j=0; j<2; j++) {
			int di0 = c[0][j+1]-c[0][j];
			int di1 = c[1][j+1]-c[1][j];
			int di2 = c[2][j+1]-c[2][j];
			if (di0 != di1 || di1 != di2) {
				ans = false;
				return;
			}
		}
	}

	
	public void output() {
		out.println(ans ? "Yes" : "No");
		out.flush();
	}
}

class Point {
	int y;
	int x;
	public Point(int y, int x) {
		this.x=x;
		this.y=y;
	}
	
	public Point move(Point d) {
		Point p = new Point(y, x);
		p.x += d.x;
		p.y += d.y;
		return p;
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
