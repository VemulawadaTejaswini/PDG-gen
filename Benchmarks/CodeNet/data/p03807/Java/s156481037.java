
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	private static final int MOD = (int)Math.pow(10, 9);
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		// count[0] is number of 0
		int[] count = new int[2];
		
		for (int i = 0; i < n; i++) {
			count[sc.nextInt() % 2]++;
		}
		
		while (count[0] > 1 && count[1] > 1) {
			if (count[0] >= 2) {
				count[0]--; // 兩個偶變成一個偶，所以全體偶數少一
			}
			if (count[1] >= 2) {
				count[1] -= 2; // 兩個奇數合成一個偶，所以全體奇數少二 
				count[0]++;    // 但是偶數會加一個
			}
		}
		
		if ((count[0] == 0 && count[1] == 1) && (count[0] == 1 && count[1] == 0)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
	private static int findDigit(int num) {
		int res = 0;
		while (num > 0) {
			res += (num % 10);
			num /= 10;
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
