import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	//噴水通過180度
	final double FH = 10 * Math.PI - 20;
	//噴水通過90度
	final double FQ = 5 * Math.PI - 20;

	public static long l=0,l2=0;
	public static void main(String[] args) throws IOException {
		l = System.currentTimeMillis();
		new Main().exec();
		l2 = System.currentTimeMillis();
		
	}

	public void exec() throws IOException {
		
		InputUtil in = new InputUtil();
		PrintWriter out = new PrintWriter(System.out);
		int x1 = (int)in.nextInt();
		int y1 = (int)in.nextInt();
		int x2 = (int)in.nextInt();
		int y2 = (int)in.nextInt();
		int N = (int)in.nextInt();
		int dx = (x2 - x1>0)?1:-1;
		int dy = (y2 - y1>0)?1:-1;
		TreeMap<Integer,Integer> FXMap = new TreeMap<>();
		for(int i=0; i<N; i++) {
			int fx = in.nextInt();
			int fy = in.nextInt();
			if(checkBetween(x1,x2,fx) && checkBetween(y1,y2,fy)) {
				FXMap.put(fx,fy);
			}
		}
		Integer key = null;
		int max = 0;
/*
		TreeMap<Integer,Integer> FYMap = new TreeMap<>();
		while((key = nextEntry(FXMap,key,-dx)) != null){
			int count = 1;
			int y = FXMap.get(key);
			Integer nextY = nextEntry(FYMap,y,dy);
			if(nextY != null) {
				count += FYMap.get(nextY);
			}
			FYMap.put(y,count);
			max = Math.max(max, count);
		}
/*/
		int[] minPathY = new int[N];
		while((key = nextEntry(FXMap,key,-dx)) != null){
			int y = FXMap.get(key);
			if(max==0){
				minPathY[0] = y;
				max=1;
			}else{
				int i=max-1;
				for(; i>=0; i--) {
					if((dy==1 && y<minPathY[i]) || (dy==-1 && y>minPathY[i])){
						minPathY[i+1] = y;
						if(i==max-1) max++;
						break;
					}
				}
				if(i<0){
					minPathY[0] = y;
				}
			}
		}
//*/			
			
		int dirX=(x2-x1)*dx;
		int dirY=(y2-y1)*dy;
		long base_dir = dirX + dirY;
		base_dir *= 100;
		double gosa = 0;
		if(x1==x2 || y1==y2){
			gosa += FH * max;
		} else {
			gosa += FQ * max;
			if(max == Math.min(dirX+1, dirY+1)) {
				gosa += FH - FQ;
			}
		}
		double dir = base_dir + gosa;
		out.println(max);
		out.printf("%.12f\n",dir);
		out.flush();
	}
	
	Integer nextEntry(TreeMap<Integer,Integer> FXMap, Integer key, int dir) {
		if(FXMap.isEmpty())
			return null;
		else if(dir == 1){
			if(key == null)
				return FXMap.firstKey();
			else  
				return FXMap.ceilingKey(key+1);
		}else{
			if(key == null)
				return FXMap.lastKey();
			else  
				return FXMap.floorKey(key-1);
		}
	}
	
	boolean checkBetween(int v1, int v2, int vc) {
		if(v1==v2){
			return v1==vc;
		}else if(v1>v2) {
			return (v2 <= vc && vc <= v1);
		} else {
			return (v1 <= vc && vc <= v2);
		}
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