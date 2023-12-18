import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;


public class Main {
	public static final String EOF = System.lineSeparator();
	public static long l=0,l2=0;
	public static void main(String[] args) throws IOException {
		l = System.currentTimeMillis();
		new Main().exec();
		l2 = System.currentTimeMillis();
/*
		System.out.println((l2-l)+"msec");
//*/		
	}
	
	public void exec() throws IOException {
		InputUtil in = new InputUtil();
		PrintWriter out = new PrintWriter(System.out);
		int H = in.nextInt();
		int W = in.nextInt();
		int N = in.nextInt();
		int[] A = in.nextInt(new int[N]);
		int[] B = new int[N];
		int ptrA = 0;
		int[][] HW = new int[H][W];
		for(int y=0; y<H; y++){
			int x = (y%2==0)?0:W-1;
			int dx = (y%2==0)?1:-1;
			while(0<=x && x<W){
				if(A[ptrA] <= B[ptrA])
					ptrA++;
				HW[y][x] = ptrA+1;
				B[ptrA]++;
				x += dx;
			}
		}
		for(int y=0; y<H; y++){
			out.print(HW[y][0]);
			for(int x=1; x<W; x++){
				out.print(" ");
				out.print(HW[y][x]);
			}
			out.println("");
		}
		out.flush();
	}
	
	
	
}


class InputUtil {
	//Static Fields
	private static final int BUFSIZ = 100000;
	
	//Fields
	protected InputStream in;
	private char[] buf = null;
	private int ptr = 0;
	private int max = -1;
	private BufferedReader br = null;
	
	//Constructors
	public InputUtil() {this(System.in,BUFSIZ);}
	public InputUtil(InputStream in, int bufsiz) {
		initBuf(bufsiz);
		initIn(in);
	}
	
	//Methods
	//Initializer
	protected void initIn(InputStream in) {br = new BufferedReader(new InputStreamReader(this.in = in));}
	protected void initBuf(int bufsiz) {buf = new char[bufsiz];}
	
	//buffer operation
	private void next() throws IOException {ptr++; readBuf();}
	private void readBuf() throws IOException {
		if(ptr >= max && br.ready()) {
			if(max>0) Arrays.fill(buf,0,max,(char)0);
			max = br.read(buf);
			ptr = 0;
		}
	}
	
	//Number Input Reader/Parser
	private boolean isNum(char b) {return '0' <= b && b <= '9'; }
	private boolean isMinus(char b) {return b=='-'; }

	private int _nextInt() throws IOException {
		int sign = 1;
		int res = 0;
		char c;
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