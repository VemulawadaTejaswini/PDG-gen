import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{
    static long mod=1000000007;
//    static int dx[]={-1,0,1,0};
//    static int dy[]={0,-1,0,1};

    public  static void main(String[] args)   throws Exception, IOException{        
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

        int n = sc.nextInt();
        int a[]=new int[n];
        int s=0;
        for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
			s+=a[i];
		}
        int mx=90000;
        long ans=0;
        long dp[][][]=new long[2][n+1][mx+2];
//        dp[1][a[0]]++;
        dp[1][0][0]++;
        dp[0][0][0]++;
        mod=998244353;
        
        for (int i = 0; i < n; i++) {
			for (int t = 1; t <=i+1  ; t++) {
				for (int j = 1; j <= mx; j++) {
					if(j-a[i]>=0)dp[i%2][t][j]=
							dp[(i+1)%2][t][j]+dp[(i+1)%2][t-1][j-a[i]];
					else dp[i%2][t][j]=dp[(i+1)%2][t][j];
					if(dp[i%2][t][j]>=mod)dp[i%2][t][j]-=mod;
				}
			}
//			db();
//			for (int w = 0; w <= n; w++) {
//				db(dp[i%2][w]);
//			}for (int w = 0; w <= n; w++) {
//				db(dp[(i+1)%2][w]);
//			}
		}
        
       
        long th=1,bi=1;
        long b[]=new long[n+1];
        b[0]=bi;
        for (int i = 1; i <=n ; i++) {
        	th*=3;
        	th%=mod;
        	bi*=2;
        	bi%=mod;
        	b[i]=bi;
        }
        th-=bi*3-3;

//        for (int w = 0; w <= n; w++) {
//			db(w,dp[(n-1)%2][w]);
//		}    
        
        for (int i = 1; i < n-1 ; i++) {
			for (int j = 2; j <= mx ; j++) {
				if(j<(s+1)/2)continue;
				ans+=dp[(n+1)%2][i][j]*(b[n-i-1]-1);
				ans%=mod;
//				db(j,s-j,dp[(n+1)%2][i][j],ans);
			}
		}
        th-=ans*6;
        th=(th+mod)%mod;

        out.println(th);
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
//    int id,T;
//    P(int id, int T) {
//        this.id=id;
//        this.T=T;
//    }
//    public int compareTo(P p){
//        return id-p.id; //des
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
