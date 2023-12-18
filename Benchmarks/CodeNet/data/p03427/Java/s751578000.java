
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	private static final int MOD = (int)Math.pow(10, 9);
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String s = sc.next();
		int res = 0;
		// if s = 1000, n = 3, we need 999
		int n = s.length() - 1;
		String nines = getNines(n);
		
		// 0999 , 1999 , 2999 ... which is max
		for (int i = 0; i < 10; i++) {
			String tmp = nines;
			if (i != 0) {
				tmp = i + tmp;
			}
			if (Long.parseLong(s) >= Long.parseLong(tmp)) {
				res = Math.max(res, findDigit(tmp)); 
			}
		}
		System.out.println(res);
	}
	
	private static String getNines(int n) {
		String res = "";
		for (int i = 0; i < n; i++) {
			res += "9";
		}
		return res;
	}
	
	private static int findDigit(int num) {
		int res = 0;
		while (num > 0) {
			res += (num % 10);
			num /= 10;
		}
		return res;
	}
	
	private static int findDigit(String num) {
		int res = 0;
		for (char c: num.toCharArray()) {
			res += (c - '0');
		}
		return res;
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
