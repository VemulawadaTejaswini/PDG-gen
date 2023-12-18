    import java.io.*;
    import java.util.*;
    public class Main {
    	
    	public static void main(String[] args) {
    		InputReader in = new InputReader();
    		int n = in.nextInt();
    		int d = in.nextInt();
    		
    		int[][] pts = new int[n][d];
    		for (int i=0; i<n; i++)
    			for (int j=0; j<d; j++)
    				pts[i][j] = in.nextInt();
    		
    		int res = 0;
    		for (int i=0; i<n-1; i++) {
    			for (int j=i+1; j<n; j++) {
    				int inside = 0;
    				for (int k=0; k<d; k++)
    					inside += (pts[i][k]-pts[j][k])*(pts[i][k]-pts[j][k]);
    				double dist = Math.sqrt(inside);
    				if (isInteger(dist))
    					++res;
    			}
    		}
    		System.out.println(res);
    	}
    	
    	static final double EPSILON = 1e-6;
    	public static boolean isInteger(double d) {
    		for (int i=(int)(d-3); i<(int)(d+3); i++)
    			if (Math.abs(d - i)  < EPSILON)
    				return true;
    		return false;
    	}
     
    	static class InputReader {
    		public BufferedReader br;
    		public StringTokenizer st;
    		
    		public InputReader() {
    			br = new BufferedReader(new InputStreamReader(System.in));
    			st = null;
    		}
    		
    		public String next() {
    			while (st == null || !st.hasMoreTokens()) {
    				try {
    					st = new StringTokenizer(br.readLine());
    				}
    				catch (IOException e) {
    					throw new RuntimeException(e);
    				}
    			}
    			return st.nextToken();
    		}
    		
    		public int nextInt() {
    			return Integer.parseInt(next());
    		}
    	}
    }