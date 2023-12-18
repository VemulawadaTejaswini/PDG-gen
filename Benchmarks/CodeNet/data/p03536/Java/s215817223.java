import java.util.*;
import java.io.*;
import java.math.*;
 
 
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{ 
 
 
    static long mod=1000000007;
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    // static int dx[]={1,-1,0,0,1,1,-1,-1};
    // static int dy[]={0,0,1,-1,1,-1,1,-1};
    // PriorityQueue<Integer> que = new PriorityQueue<Integer>(); 
    //HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
 
    public  static void main(String[] args)   throws Exception, IOException{
     
        
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
     
        int n=sc.nextInt();
        // char c[][] = new char[h][w];
        // long a[] = new long [n];
        // for (int i=0; i<n; i++ ) {a[i]=sc.nextInt();}
        int ans=0;
        // int a[] = new int [n];
        Pair a[] = new Pair [n];
        for (int i=0; i<n ; i++) {
            a[i] = new Pair(sc.nextInt(),sc.nextInt());
        }
        sort(a);
        long dp[][] = new long[5001][5001], inf=1L<<62;
        for (int i=0 ; i <= n; i++)fill(dp[i],inf);
            dp[0][0]=0;
        for (int i=1 ; i <= n; i++) {
            int p=a[i-1].y,h=a[i-1].x;
            // db(i,h,p);
            for (int t=1; t<=i; t++) {
                dp[i][t] = min(dp[i-1][t], dp[i-1][t-1]<=h ? dp[i-1][t-1]+p:dp[i-1][t] );
                if(dp[i][t] < inf)ans=max(ans,t);
            }
        }
        out.println(ans);
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

class Pair implements Comparable<Pair>{
    int x,y;
    Pair(int x, int y) {
        this.x=x;
        this.y=y;
    } 
    public int compareTo(Pair p){
        return  x +y - p.x - p.y;//des
    } 
}
 
class XY {
    int x,y,d;
    XY(int x, int y, int d) {
        this.x=x;
        this.y=y;
        this.d=d;
    } 
}
 
class P implements Comparable<P>{
    int x,y;
    P(int x, int y) {
        this.x=x;
        this.y=y;
    } 
      
    public int compareTo(P p){
        return -x + p.x;//des
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