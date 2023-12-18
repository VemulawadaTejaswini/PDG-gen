
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	private static final long MOD = (long)Math.pow(10, 9) + 7;
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		String s = sc.next();
		String prefix = "";
		String postfix = "";
		int count = 0;
		
		
		for (char c: s.toCharArray()) {
			if (c == ')') {
				if (count == 0) {
					prefix += "(";
				} else {
					count -= 1;
				}
			} else {
				count++;
			}
		}
		
		if (count == 0) {
			// 全部匹配，加上prefix就可以
			System.out.println(prefix + s);
		} else {
			// count 比0大代表有沒匹配到的）
			postfix = nTimesChar(')', count);
			System.out.println(prefix + s + postfix);
		}
	}
	
	private static String nTimesChar(char c, int t) {
		String res = "";
		for (int i = 0; i < t; i++) {
			res += c;
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
