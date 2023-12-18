import java.util.*;
import java.io.*;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{
    static final long mod=1000000007;
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
        long a[]=sc.nextLongArray(n);
        long dp[][] = new long[n+1][5];
        for (int i = 0; i < dp.length; i++) {
			fill(dp[i],1L<<60);
		}
        dp[0][0]=0;

        for (int i = 1; i <= n; i++) {
        	for (int t = 0; t < 5; t++) {
        		long c=1<<60;
        		for (int w = t; -1 < w; w--) {
    				if(t==0) c=dp[i-1][w] + a[i-1];
    				else if(t==1) {
    					c=min(dp[i-1][w],dp[i-1][t]) + (a[i-1]==0 ?2:(a[i-1]%2));
    				}
    				else if(t==2) {
    					c=min(dp[i-1][w],dp[i-1][t]) + (a[i-1]+1)%2;
    				}
    				else if(t==3) {
    					c=min(dp[i-1][w],dp[i-1][t]) + (a[i-1]==0 ?2:(a[i-1]%2));
    				}
    				else {
    					c=min(dp[i-1][w],dp[i-1][t]) + a[i-1];
    				}
    				dp[i][t]=min(dp[i][t],c);
				}
        	}
        	db(dp[i]);
		}
        long ans=Long.MAX_VALUE;
		for (int t = 0; t < 5; t++) {
			ans=min(dp[n][t],ans);
		}

        out.println(ans);
        out.flush();
    }
    
    static boolean validpos(int x,int y,int r, int c){
        return x<r && 0<=x && y<c && 0<=y;
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
//    int a,b;
//    P(int a, int b) {
//        this.a=a;
//        this.b=b;
//    }
//    public int compareTo(P p){
//        return b-p.b; //des
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
    public long[] nextLongArray(int size) throws IOException{
    	long r[] = new long[size];
    	for (int i = 0; i < size; i++) {
			r[i] = this.nextLong(); 
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
