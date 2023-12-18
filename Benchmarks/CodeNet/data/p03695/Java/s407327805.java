import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n = sc.nextInt();
		int[] colors = new int[8];
		int upper3200 = 0;
		int currColors = 0;
		
		for (int i = 0; i < n; i++) {
			int rate = sc.nextInt();
			
			if ((rate >= 1) && (rate < 400)) {
				colors[0]++;
			} else if ((rate >= 400) && (rate < 800)) {
				colors[1]++;
			} else if ((rate >= 800) && (rate < 1200)) {
				colors[2]++;
			} else if ((rate >= 1200) && (rate < 1600)) {
				colors[3]++;
			} else if ((rate >= 1600) && (rate < 2000)) {
				colors[4]++;
			} else if ((rate >= 2000) && (rate < 2400)) {
				colors[5]++;
			} else if ((rate >= 2400) && (rate < 2800)) {
				colors[6]++;
			} else if ((rate >= 2800) && (rate < 3200)) {
				colors[7]++;
			} else {
				upper3200++;
			}
		}
		
		for (int i = 0; i < 8; i++) {
			if (colors[i] == 0) { currColors++; }
		}
		
		int resMin = Math.max(8 - currColors, 1);
		int resMax = 8 - currColors + upper3200;
		
		
		System.out.println(resMin + " " + resMax);
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