import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static class FastReader {
		BufferedReader br;
		StringTokenizer root;
		
 
		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}
 
		String next() {
			while (root == null || !root.hasMoreTokens()) {
				try {
					root = new StringTokenizer(br.readLine());
				} catch (Exception addd) {
					addd.printStackTrace();
				}
			}
			return root.nextToken();
		}
 
		int nextInt() {
			return Integer.parseInt(next());
		}
 
		double nextDouble() {
			return Double.parseDouble(next());
		}
 
		long nextLong() {
			return Long.parseLong(next());
		}
 
		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (Exception addd) {
				addd.printStackTrace();
			}
			return str;
		}
	}
	
	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));
	
	public static FastReader sc = new FastReader();
 
	static int mod = (int) (1e9+7),MAX=(int) (2e5);
    static List<Integer>[] edges;
  
	public static void main(String[] args) {
	   
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int x = sc.nextInt();
	    int[][] tab = new int[n][m+1];
	    for(int i=0;i<n;++i) {
	    	for(int j=0;j<m+1;++j)
	    		tab[i][j] = sc.nextInt();
	    }
	  
	    long ans = Integer.MAX_VALUE;
	    for(int i=0;i<1<<n;++i) {
	    	int[] temp = new int[m+1];
	    	for(int j=0;j<n;++j) {
	    		if(((i>>j)&1) == 1) {
	    			for(int k=0;k<m+1;++k) temp[k]+=tab[j][k];
	    		}
	    	}
	    	boolean found = true;
	    	for(int k=1;k<m+1;++k) {
	    		if(temp[k] < x) found =false;
	    	}
	    	if(found) ans = Math.min(ans, temp[0]);
	    }
	    if(ans == Integer.MAX_VALUE) ans = -1;
	    out.print(ans);
		out.close();
   }
	
	
}

