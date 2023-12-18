
import java.io.*;
import java.util.*;
public class Main {
	static final int N=100005;

	public static void main(String[] args){
		InputReader in = new InputReader(System.in);
	    PrintWriter out = new PrintWriter(System.out);
	    int n=in.nextInt();
	    int c1=0,c2=0,c3=0,x;
	    for(int i=0;i<n;i++) {
	    	x=in.nextInt();
	    	if(x%4==0) c1++;
	    	else if(x==2) c2++;
	    	else c3++;
	    }
	    c2%=2;
	    if(c1>0&&c1+1>=c2+c3||(c1==0&&c3==0)) out.println("Yes");
	    else out.println("No");
	    out.flush();
	}
	static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;
        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}