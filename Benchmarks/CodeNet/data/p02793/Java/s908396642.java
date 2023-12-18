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
 
public class Main implements Runnable
{
    static int dx[]={-1,0,1,0};
    static int dy[]={0,-1,0,1};
    static long mod=1000000007;
    
    public static void main(String[] args) {        
        new Thread(null, new Main(), "", 200 * 1024 * 1024).start();        
    }

    public void run() {
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

        int n=sc.nextInt();
        int a[]=sc.nextIntArray(n);
        if(n==1) {
        	ret(1);
        }
        long b[]=new long[n];
        b[0]=a[1]; b[1]=a[0];
        long g;
        if(n==2) {
        	g=gcd(b[0],b[1]);
        	ret(b[0]/g+b[1]/g);
        }
//        b[0]/=g; b[1]/=g;
        long u[]=new long[n];
        long d[]=new long[n];
        u[0]=b[0]; u[1]=b[1];
        for (int i = 2; i < n; i++) {
        	u[i]=b[0]*b[1];
        	g=gcd(u[i],a[i]);
        	u[i]/=g;
        	d[i]=a[i]/g;
		}
        long l=d[2],g2=b[0];
        for (int i = 1; i < d.length; i++) {
			g2=gcd(g2,u[i]);
		}
        if(g2>1)
        for (int i = 0; i < d.length; i++) {
			u[i]/=g2;
		}
//        db(u);
//        db(d,l);
        d[0]=d[1]=1;
        for (int i = 3; i < d.length; i++) {
			l=gcd(l,d[i]);
		}
        long bb=l,aa=0;
        for (int i = 3; i < d.length; i++) {
			bb*=d[i]/l;
			bb%=mod;
		}
        long iv;
        for (int i = 0; i < d.length; i++) {
        	if(i>1)
        		iv=bb*exGCD(d[i], mod)[1]%mod;
        	else iv=bb;
//        	db(iv,d[i],bb);
			aa+=u[i]*iv%mod;
			aa%=mod;
			
		}
        if(aa<0)aa+=mod;

        out.println(aa);
     	out.flush();
    }
    
    public static long[] exGCD(long a, long b)
    {
        if(a == 0 || b == 0)return null;
        int as = Long.signum(a);
        int bs = Long.signum(b);
        a = Math.abs(a); b = Math.abs(b);
        long p = 1, q = 0, r = 0, s = 1;
        while(b > 0){
            long c = a / b;
            long d;
            d = a; a = b; b = d % b;
            d = p; p = q; q = d - c * q;
            d = r; r = s; s = d - c * s;
        }// can be minus! 
        return new long[]{a, p * as, r * bs};
    }

    
    static long gcd(long a, long b){
        if(min(a,b) == 0)return max(a,b);
        return gcd(max(a,b) % min(a,b),min(a,b));
    }
        
    static void ret(String ans) {
    	System.out.println(ans);
    	System.exit(0);
    }

    static void ret(long ans) {
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
//	int x,y; double d;
//	P(int  x, int y, double d) {
//	  this.x=x;
//	  this.y=y;
//	  this.d=d;
//	}
//}


class P implements Comparable<P>{
    int x,y;
    P(int x,int y) {
    	this.x=x;
    	this.y=y;
    }

    public int compareTo(P p){
        return y-p.y;
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
    public String nextString()
    {
        while( st==null || !st.hasMoreTokens() )
			try {
				st = new StringTokenizer(x.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        return st.nextToken();
    }
    public int nextInt()
    {
        return Integer.parseInt(nextString());
    }
    public int[] nextIntArray(int size) {
        int r[] = new int[size];
        for (int i = 0; i < size; i++) {
            r[i] = this.nextInt(); 
        }
        return r;
    }
    public long[] nextLongArray(int size) {
        long r[] = new long[size];
        for (int i = 0; i < size; i++) {
            r[i] = this.nextLong(); 
        }
        return r;
    }
    public char[] getCharSet() {
        return this.nextString().toCharArray();
    }    
    public long nextLong()
    {
        return Long.parseLong(nextString());
    }
    public double nextDouble() throws IOException
    {
        return Double.parseDouble(nextString());
    }
}
