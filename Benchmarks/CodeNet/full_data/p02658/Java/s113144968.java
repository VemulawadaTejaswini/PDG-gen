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
	public static int[][] parent;
	public static int col = 20;
	public static void main(String[] args) throws IOException{
		
		//Scanner sc = new Scanner(System.in);
	//	Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    BigInteger[] a = new BigInteger[n];
	    for(int i=0;i<n;++i) {
	    	a[i] = new BigInteger(sc.next());
	    }
	    Arrays.sort(a);
	  
	    if(a[0].longValue() == 0) out.print(0);
	    else {
	    	
	    
	    BigInteger k = BigInteger.ONE;
	    boolean found  = true;
	    for(int i=0;i<n;++i) {
	    	k = k.multiply(a[i]);
	    	 if(k.compareTo(BigInteger.valueOf((long) 1e18)) > 0) found = false;
	    	
	    }
	   if(found) out.print(k);
	    else out.print(-1);
	    }
	    
		out.close();
	}
}