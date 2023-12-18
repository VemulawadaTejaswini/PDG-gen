
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		long n = sc.nextLong();
		int res = Integer.MAX_VALUE;
		
		for (long i = 1; i <= (long)Math.sqrt(n*1.0); i++) {
			if (n % i == 0) {
				res = Math.min(res, F(i, n/i));
			} 
		}
		
		System.out.println(res);
	}
  
	private static int F(long a, long b) {
		return Math.max(findDigit(a), findDigit(b));
	}
	
	private static int findDigit(long num) {
		int n = 0;
		while (num != 0) {
			n++;
			num /= 10;
		}
		return n;
	}
	
    static class FastReader {
	    BufferedReader br;
	    StringTokenizer st;
	
	    public FastReader() {
	      br = new BufferedReader(new InputStreamReader(System.in));
	    }
	  
	    String next() { 
	      while (st == null || !st.hasMoreElements()) {
	        try {
	          st = new StringTokenizer(br.readLine());
	        } catch (IOException  e) {
	          e.printStackTrace();
	        }
	      }
	      return st.nextToken();
	    }
	
	    int nextInt() {
	      return Integer.parseInt(next());
	    }
	
	    long nextLong() {
	      return Long.parseLong(next());
	    }
	
	    double nextDouble() { 
	      return Double.parseDouble(next());
	    }
	
	    String nextLine() {
	      String str = "";
	        try{
	            str = br.readLine();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return str;
	      }
	  }
}
