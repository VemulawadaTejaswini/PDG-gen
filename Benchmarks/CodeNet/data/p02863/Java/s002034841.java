import java.util.*;
import java.util.Map.Entry;

import javax.swing.text.Segment;
import javax.xml.ws.WebEndpoint;

import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main //implements Runnable
{
//    static int dx[]={-1,0,1,0};
//    static int dy[]={0,-1,0,1};
	static double s;
	
    public static void main(String[] args)   throws Exception, IOException{        
//        long mod=1000000007;
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        PriorityQueue<Integer> q=new PriorityQueue<>();
        
        int n=sc.nextInt();
        int T=sc.nextInt();
        P p[]=new P[n];
        int mx[]=new int [n];
        for (int i = 0; i < p.length; i++) {
			p[i]=new P(sc.nextInt(),sc.nextInt());
		}
        sort(p);
        mx[p.length-1]=p[p.length-1].b;
        for (int i = p.length-2; 0 <= i; i--) {
			mx[i]=max(mx[i+1],p[i].b);
		}
        long ans=mx[0];
//        db(mx);
        
        long dp[][]=new long[3001][3001];
        
        for (int i = 1; i <= n; i++) {
			for (int j = 0; j <= T-1; j++) {
				if(i>0)dp[i][j] = dp[i-1][j];
				if(j-p[i-1].a>=0)
					dp[i][j] = max(dp[i][j], dp[i-1][j-p[i-1].a]+p[i-1].b);
			}
		}
        for (int i = 1; i < n; i++) {
//			db(dp[i][T-1],ans);
			ans=max(ans, mx[i]+dp[i][T-1]);
		}

        out.println(ans);
     	out.flush();
    }


    static void ret(String ans) {
    	System.out.println(ans);
    	System.exit(0);
    }
    
    static boolean validpos(int x,int y,int r, int c){
        return x<r && 0<=x && y<c && 0<=y;
    }

    static void db(Object... os){
        System.err.println(Arrays.deepToString(os));
    }
}

//
//class P {
//	int x, y, d;
//	P(int  x, int y, int d) {
//	  this.x=x;
//	  this.y=y;
//	  this.d=d;
//	}
//}

class P implements Comparable<P>{
    int a,b;
    P(int a, int b) {
    	this.b=b;
    	this.a=a;
    }

    public int compareTo(P p){
        return -p.a+a;//as
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
    public char[] getCharSet() throws IOException{
        return this.nextString().toCharArray();
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
