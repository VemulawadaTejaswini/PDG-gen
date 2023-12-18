



import java.util.*;
import java.io.*;
 
public class Main {
	
	
	
	public static void main(String args []) {
		InputReader obj = new InputReader(System.in);
		int m = obj.nextInt();
		int d = obj.nextInt();
		
		if(d<22) {
			System.out.println(0);
			return;
		}
		int cnt=0;
		for(int i=22;i<=d;i++) {
			if(i%10<2) {
				continue;
			}
			if((i%10)*(i/10)<=m) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	public static class InputReader {
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
 
	    public long nextLong() {
	        return Long.parseLong(next());
	    }
	    
 
	}
}