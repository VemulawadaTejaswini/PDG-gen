import java.util.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{
//    static final long mod=1000000007;
//    static int dx[]={-1,0,1,0};
//    static int dy[]={0,-1,0,1};

    public  static void main(String[] args)   throws Exception, IOException{        
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        // int n=sc.nextInt();
        // char c[][] = new char[h][w];
        // char c[]=sc.nextString().toCharArray();
        // int d[]=new int[n];
        // for(int i=0; i<n; i++) {d[i]=sc.nextInt();}

        int n=sc.nextInt();
        int a[]=sc.nextIntArray(n);
        long dp[][] = new long[n][n];
        for (int i = 0; i < dp.length; i++) {
			fill(dp[i],Long.MAX_VALUE);
		}

        out.println(rep(0,n-1,0,a,dp));
        out.flush();
    }
    
    static boolean validpos(int x,int y,int r, int c){
        return x<r && 0<=x && y<c && 0<=y;
    }
    static long rep(int l, int r, int c, int a[], long dp[][]) {
    	if(dp[l][r]!=Long.MAX_VALUE) return dp[l][r];
    	if(l==r) {
    		return dp[l][r] = c%2==0 ? a[l]:-a[l];
    	}
		long L=dp[l+1][r]!=Long.MAX_VALUE?dp[l+1][r]:rep(l+1,r,c+1,a,dp);
		long R=dp[l][r-1]!=Long.MAX_VALUE?dp[l+1][r-1]:rep(l,r-1,c+1,a,dp);
		return dp[l][r] = (c%2==0 ? max(a[l]+L, a[r]+R) : min(-a[l]+L, -a[r]+R));
    }

    static void db(Object... os){
        System.err.println(Arrays.deepToString(os));
    }  
}

//class P {
//    int id, d;
//    P(int  id, int d) {
//        this.id=id;
//        this.d=d;
//    }
//}

//class P implements Comparable<P>{
//    int id, d;
//    P(int  id, int d) {
//        this.id=id;
//        this.d=d;
//    }
//    public int compareTo(P p){
//        return d-p.d; //des
//    }
//}

class Reader
{ 
    private BufferedReader x;
    private StringTokenizer st;
    
    public Reader(InputStream in)
    {
        x = new BufferedReader(new InputStreamReader(in));
        st = null;
    }
    public String nextString() throws IOException
    {
        while( st==null || !st.hasMoreTokens() )
            st = new StringTokenizer(x.readLine());
        return st.nextToken();
    }
    public int nextInt() throws IOException
    {
        return Integer.parseInt(nextString());
    }
    public int[] nextIntArray(int size) throws IOException{
    	int r[] = new int[size];
    	for (int i = 0; i < size; i++) {
			r[i] = this.nextInt(); 
		}
    	return r;
    }
    public long nextLong() throws IOException
    {
        return Long.parseLong(nextString());
    }
    public double nextDouble() throws IOException
    {
        return Double.parseDouble(nextString());
    }
}
