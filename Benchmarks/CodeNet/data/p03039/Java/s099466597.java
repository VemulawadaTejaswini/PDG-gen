import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{
    static long mod=1000000007;
    static int dx[]={-1,0,1,0};
    static int dy[]={0,-1,0,1};

    public  static void main(String[] args)   throws Exception, IOException{        
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();

        int sz=200001;
        long fr[]=new long[sz];
        long inv[]=new long[sz];

        fr[0] = inv[0] = 1;
        fr[1] = inv[1] = 1;
        int mod = 1000000007;

        for (int i = 2; i <sz; ++i){
            inv[i] = inv[mod % i] * (mod - mod / i) % mod ;
        }

        for (int i = 2; i <sz; ++i){
            fr[i]=fr[i-1]*i %mod;
            inv[i]=inv[i-1]*inv[i] %mod;
        }
        long ans=0, c=0;
        for (int i = 1; i <= m-1 ; i++) {
			c = (long)n*n%mod * (fr[n*m-2]*inv[k-2]%mod*inv[n*m-k]%mod );
			c%=mod;
			c*=m-i;
			ans = (ans+c*i%mod)%mod;
		}

        for (int i = 1; i <= n-1 ; i++) {
			c = (long)m*m%mod * (fr[n*m-2]*inv[k-2]%mod*inv[n*m-k]%mod );
			c%=mod;
			c*=n-i;
			ans = (ans+c*i%mod)%mod;
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

class P implements Comparable<P>{
	int a,b; 
	P(int a, int b) {
	  this.a=a;
	  this.b=b;
	}
	public int compareTo(P p){			
	  return -b+p.b;
	}
}


//class P implements Comparable<P>{
//    long a,b; 
//    int id;
//    P(long a, long b,int id) {
//        this.a=a;
//        this.b=b;
//        this.id=id;
//    }
//    public int compareTo(P p){
//    	if(a*b-p.a*p.b>0) return 1;
//    	if(-a*b+p.a*p.b>0) return -1;    	
//        return 0;
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
