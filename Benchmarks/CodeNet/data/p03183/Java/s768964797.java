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
 
	//static int mod = (int) (1e9+7),MAX=(int) (2e5+100);
    static List<Integer>[] edges;
    static long[][] dp;
    static int n,m;
    static Box[] box;
	public static void main(String[] args) {
	    n = sc.nextInt();
        box = new Box[n];
	    dp = new long[n][30001];
	    for(int i=0;i<n;++i) Arrays.fill(dp[i],-1);
	    for(int i=0;i<n;++i) {
	    	int w = sc.nextInt();
	    	int s = sc.nextInt();
	    	long v = sc.nextLong();
	    	box[i] = new Box(w,s,v);
	    }
	    Arrays.sort(box);
	    out.print(f(0,30000));
		out.close();
   }
	private static long f(int i,int wt) {
		if(i == n) return 0;
		if(dp[i][wt] != -1) return dp[i][wt];
		long o1=0,o2=0;
	    o1 = f(i+1,wt);
	    if(box[i].w <= wt)
	    o2 = box[i].v + f(i+1,Math.min(wt-box[i].w,box[i].s));
	   
		return dp[i][wt] = Math.max(o1, o2);
	}

	static class Box implements Comparable<Box>{
		int w;
		int s;
		long v;
		Box(int w,int s,long v){
			this.w = w;
			this.s = s;
			this.v = v;
		}
		@Override
		public int compareTo(Box o) {
			return -(this.w + this.s) + (o.w + o.s);
		}
		
	}
	
	

}

