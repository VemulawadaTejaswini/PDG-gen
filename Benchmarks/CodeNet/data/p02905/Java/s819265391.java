import java.util.*;
import java.util.Map.Entry;

import javax.swing.text.Segment;

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

    public static void main(String[] args)   throws Exception, IOException{        
        long mod=1000000007;
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

        int n=sc.nextInt();
        int a[]=sc.nextIntArray(n);
        int m=1000000;
        int b[]=new int[m+1];
        int c[]=new int[m+1];
        long w[]=new long[m+1];

        long sa[]=new long[m+1];
        long sw[]=new long[m+1];
        int ac[]=new int[m+1];
        for (int i = 0; i < a.length; i++) {
			ac[a[i]]++;
		}

        int md=998244353;
        w[1] = 1;
        for (int i = 2; i <= m; ++i)
            w[i] = w[md % i] * (md - md / i) % md;
        
        for (int i = 1; i <= m; i++) {
			for (int j = i; j <= m; j+=i) {
				if(j!=i) {
					w[j]-=w[i];
					w[j]%=md;
				}
				if(ac[j]>0) {
					for (int t = 0; t < ac[j]; t++) {
						sw[i]+=sa[i]*j%md;
						sa[i]+=j;						
						if(sa[i]>md)sa[i]-=md;
						if(sw[i]>md)sw[i]-=md;
					}
				}
			}
		}
                
        long ans=0;
        for (int i = 1; i < sw.length; i++) {
			ans+=w[i]*sw[i];
			ans%=md;
		}
        if(ans<0)ans+=md;

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

//class P {
//	int x, y;
//	P(int  x, int y) {
//	  this.x=x;
//	  this.y=y;
//	}
//}

class P implements Comparable<P>{
    int a,b;
    P(int a, int b) {
    	this.b=b;
    	this.a=a;
    }

    public int compareTo(P p){
        return p.a-a;//des
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
