import java.io.*;
import java.util.*;
 
public class Main {
 
	void submit() {
	    String S = nextString();
	    int[] N = new int[S.length()];
	    
	    for(int i=0; i<S.length();i++){
	        N[i] = 0;
	    }

        int position = 0;
	    int count = 0;

	    while(position<S.length()){
	        while(S.charAt(position)=='R'){
                count++;
                position++;
                if(S.charAt(position)=='L'){
                    N[position] = count;                    
                    count = 0;
                    break;
                }
            }
//            out.println("Direct: " + S.charAt(position));
//            out.println("position: " + position);            
//            out.println("count: " + count);            
            
	    }
	    
	    for(int i=0; i<S.length();i++){
            out.println(N[i]);
	    }
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