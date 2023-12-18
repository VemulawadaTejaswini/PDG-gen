
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int m = sc.nextInt();
		int d = sc.nextInt();
		int res = 0;
		
		for (int i = 1; i <= m; i++) {
			for (int j = 10; j <= d; j++) {
				int d1 = j / 10;
				int d2 = j % 10;
				
				if (d1 >= 2 && d2 >= 2 && (d1 * d2 == i)) {
					// System.out.println(i + " " + j);
					res++;
				}
			}
		}
		System.out.println(res);
	}
  
	private static boolean isPalindromic(int n) {
		int num = n;
		int total = 0;
		while (num != 0) {
			total *= 10;
			total += (num % 10);
			num /= 10;
		}
		return n == total;
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
