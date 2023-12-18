import java.io.*;
import java.util.*;
import java.math.BigDecimal; 
 
public class Main {
 
	void submit() {
	    String S = "CODEFESTIVAL2016";	    
	    char[] C= S.toCharArray();

	    String seikai_s = "C0DEFESTIVAL2O16";
	    char[] seikai_c = seikai_s.toCharArray();
	    
	    int kaisu = 0;

	    for(int i=0; i<S.length(); i++){
	        if(C[i] != seikai_c[i]) kaisu++;
	    }
	    out.println(kaisu);
	    
	}
	
	void preCalc() {
 
	}
 
	void stress() {
 
	}
 
	void test() {
 
	}
 
	Main() throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		preCalc();
		submit();
		//stress();
		//test();
		out.close();
	}
 
	static final Random rng = new Random();
 
	static int rand(int l, int r) {
		return l + rng.nextInt(r - l + 1);
	}
 
	public static void main(String[] args) throws IOException {
		new Main();
	}
 
	BufferedReader br;
	PrintWriter out;
	StringTokenizer st;
 
	String nextToken() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}
 
	String nextString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
 
	int nextInt() {
		return Integer.parseInt(nextToken());
	}
 
	long nextLong() {
		return Long.parseLong(nextToken());
	}
 
	double nextDouble() {
		return Double.parseDouble(nextToken());
	}
}