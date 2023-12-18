
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	private static final int MOD = (int)Math.pow(10, 9);
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[] c = new int[n];
		int[] colors = new int[h*w];
		
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		
		int pos = 1;
		int row = 0;
		int[][] res = new int[h][w];
		
		while (row < h) {
			int col = (row % 2 == 0) ? 0 : w - 1;
			
			if (row % 2 == 0) {
				while (col < w) {
					int color = pos;
					c[pos-1]--;
					if (c[pos-1] == 0) { pos++; }
					res[row][col] = color;
					col++;
				}
			} else {
				while (col >= 0) {
					int color = pos;
					c[pos-1]--;
					if (c[pos-1] == 0) { pos++; }
					res[row][col] = color;
					col--;
				}
			}

			row++;
		}

		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println("");
		}
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
