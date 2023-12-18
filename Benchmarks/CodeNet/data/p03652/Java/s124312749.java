import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
  
public class Main {
	
    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
    public void exec() throws IOException {
    	InputUtil in = new InputUtil();
        PrintWriter out = new PrintWriter(System.out);
    	
        int N = in.nextInt();
    	int M = in.nextInt();
    	int[][] A = new int[N][M];
    	int[] Aptr = new int[N];
    	for(int i=0; i<N; i++){
    		in.nextInt(A[i]);
    	}
    	int count = 300;
    	int favoliteSport = -1;
    	boolean[] sportsNotExists = new boolean[M];
    	int[] favoliteCount = new int[M];
    	int sportCount = M;
    	while(true){
        	//第一位スポーツカウント
    		Arrays.fill(favoliteCount, 0);
        	for(int i=0; i<N; i++) {
        		favoliteCount[ A[ i ][ Aptr[i] ]-1 ] ++;
        	}
        	int maxCount = 0;
        	//参加者最大スポーツカウント
        	for(int i=0; i<M; i++) {
        		if(maxCount < favoliteCount[i]) {
        			maxCount = favoliteCount[i];
        			favoliteSport = i;
        		}
        	}
        	if(maxCount < count) {
        		count = maxCount;
        	}
        	sportCount--;
        	if(sportCount == 0) break;
        	//参加者最大スポーツを非開催
        	sportsNotExists[favoliteSport] = true;
        	//参加者の第一位スポーツマトリクスを修正
        	for(int i=0; i<N; i++) {
        		while(sportsNotExists[ A[ i ][ Aptr[i] ]-1 ]){
        			Aptr[i]++;
        		}
        	}
    	}
        out.println(count);
    	out.flush();
    }
}




/**
 * --------------------------------------------------
 * Input Utility
 * --------------------------------------------------
 */
class InputUtil {
	//Static Fields
	private static final int BUFSIZ = 50000;
	
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