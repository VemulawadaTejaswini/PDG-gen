
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
		int x = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int res = 0;
		
		for (int i = 0; i < n; i++) {
			int material = sc.nextInt();
			x -= material;
			min = Math.min(material, min);
			res++;
		}
		res += (x / min);
		System.out.println(res);
	}
	
	private static int findNiconicoLevel(String s) {
		int res = 0;
		String prev = "";
		int pos = 1;
		int level = 0;
		while (pos < s.length()) {
			String curr = "" + s.charAt(pos - 1) + s.charAt(pos);
			if (curr.equals("25")) {
				if (prev.equals("25")) {
					level += 2;
				} else {
					prev = "25";
					level = 2;
				}
				res = Math.max(res, level);
				pos += 2;
			} else {
				level = 0;
				prev = "";
				pos++;
			}
		}
		
		return res;
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
