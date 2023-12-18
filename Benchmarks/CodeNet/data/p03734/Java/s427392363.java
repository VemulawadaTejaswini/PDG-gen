import java.util.*;
import java.io.*;
import java.math.*;


import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;


public class Main{ 


    static long mod=1000000007;
    //  static int dx[]={1,-1,0,0};
    //  static int dy[]={0,0,1,-1};
    // static int dx[]={1,-1,0,0,1,1,-1,-1};
    // static int dy[]={0,0,1,-1,1,-1,1,-1}; 

public  static void main(String[] args)   throws Exception, IOException{

    
    Reader sc = new Reader(System.in);
    PrintWriter out=new PrintWriter(System.out);

//  int n=sc.nextInt();  
  // int n=sc.nextInt(), k=sc.nextInt();  
  // int s=sc.nextInt(), t=sc.nextInt(); 
    int n = sc.nextInt();
    int W = sc.nextInt();
    long dp[][][] = new long[2][103][310];
    long v[] = new long[n];
    long w[] = new long[n], a=0;

    for( int i=0; i<n; i++ ) {
       w[i] = sc.nextInt();
       v[i] = sc.nextInt();
    }
    // dp[0][1][0] = v[0];

    for( int i=0; i<n; i++ ){
        int cur = i%2, pr = (i+1)%2;
        int wx = (int)(w[i] - w[0]); 
        for( int t=1; t <= i + 1; t++ ){
            for( int j=0; j<305; j++ ){
                dp[cur][t][j + wx] = max(dp[cur][t][j + wx], dp[pr][t-1][j] + v[i]);
            }
        }
        for( int t=1; t <= i + 1; t++ ){
            for( int j=0; j<=305; j++ ){
                if( w[0] * t + j > W )break;
                dp[cur][t][j] = max(dp[cur][t][j], dp[pr][t][j]);
                a=max(a, dp[cur][t][j]);
            }
        }
    }

    out.println(a);
    out.flush();
}

static void db(Object... os){

    System.err.println(Arrays.deepToString(os));

}

static boolean validpos(int x,int y,int r, int c){
    
    return x<r && 0<=x && y<c && 0<=y;
    
}
 
static boolean bit(long x,int k){
    // weather k-th bit (from right) be one or zero
    return  ( 0 < ( (x>>k) & 1 )  )  ? true:false;
}

}







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
    public long nextLong() throws IOException
    {
        return Long.parseLong(nextString());
    }
    public double nextDouble() throws IOException
    {
        return Double.parseDouble(nextString());
    }
}

