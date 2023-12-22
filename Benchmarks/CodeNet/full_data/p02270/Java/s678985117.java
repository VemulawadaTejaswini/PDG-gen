import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
   
public class Main {
    boolean[] dictionary = new boolean[33554432];
    public static void main(String[] args) throws IOException {
//    	long l = System.currentTimeMillis();
        new Main().exec();
//    	long l2 = System.currentTimeMillis();
//    	System.out.println(l2 - l);
    }
      
    public void exec() throws IOException {
        InputUtil in = new InputUtil();
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] w = new int[n];
        int maxBagWeight = 0;
        int avgBagCntPerTrk = n/k + ((n%k==0)?0:1);
        int sumBagWeightPerTrk = 0;
        int maxBagWeightPerTrk = 0;
        for(int i=0; i<n; i++) {
        	int bagWeight = w[i] = in.nextInt();
        	if(maxBagWeight < bagWeight) maxBagWeight = bagWeight;
    		sumBagWeightPerTrk += bagWeight;
        	if((i+1)%avgBagCntPerTrk==0) {
        		if(maxBagWeightPerTrk < sumBagWeightPerTrk) maxBagWeightPerTrk = sumBagWeightPerTrk;
        		sumBagWeightPerTrk = 0;
        	}
        }
        out.println(searchMinOfP(k,w,maxBagWeight,maxBagWeightPerTrk));
        out.flush();
    }
    
    private int searchMinOfP(int k, int[] w, int pMin, int pMax) {
    	if(pMin==pMax) return pMin;
    	int p = (pMin + pMax)/2;
    	if(checkP(k,w,p)){
    		if(p==pMin){
    			return p;
    		}else{
    			return searchMinOfP(k,w,pMin,p);
    		}
    	} else {
			return searchMinOfP(k,w,p+1,pMax);
    	}
    }
    
    HashSet<Integer> okP = new HashSet<>();
    HashSet<Integer> ngP = new HashSet<>();
    
    private boolean checkP(int k, int[] w, int p) {
    	if(okP.contains(p)) return true;
    	if(ngP.contains(p)) return false;
    	int countK=0;
    	int sumBagWeightPerTrk=0;
    	int i;
    	for(i=0; i<w.length; i++) {
    		if(sumBagWeightPerTrk + w[i] > p) {
    			countK++;
    			if(countK==k) {
    				ngP.add(p);
    				return false;
    			}
    			sumBagWeightPerTrk=0;
    		}
    		sumBagWeightPerTrk += w[i];
    	}
		okP.add(p);
    	return true;
    }
}

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