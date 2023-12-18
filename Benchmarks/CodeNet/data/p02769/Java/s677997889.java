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
//    static int dx[]={-1,0,1,0};
//    static int dy[]={0,-1,0,1};
    static long mod=1000000007;
    
    public static void main(String[] args) {        
        new Thread(null, new Main(), "", 200 * 1024 * 1024).start();        
    }

    public void run() {
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

        int n=sc.nextInt();
        int k=sc.nextInt();
        int sz=100000*2+1;
        long fr[] = new long[sz];
        long inv[]= new long[sz];

        fr[0] = inv[0] = 1;
        fr[1] = inv[1] = 1;
        int mod = 1000000007;

        for (int i = 2; i <sz; ++i){
            inv[i] = inv[mod % i] * (mod - mod / i) % mod ;
        }

        for (int i = 2; i <sz; ++i){
            fr[i] = fr[i-1]*i %mod;
            inv[i] = inv[i-1]*inv[i] %mod;
        }
        
        long r=k%2==0?1:0, x,y;
        for (int i = 1; i <= min(k,n-1) ; i++) {
			x=fr[n]*inv[n-i]%mod;
			x*=inv[i]*fr[n-1]%mod;
			x%=mod;
			x*=inv[n-i-1]*inv[i]%mod;
			x%=mod;
			r+=x;
			r%=mod;
//			db(r,x);
		}
        if(r<0)r+=mod;

        out.println(r);
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
    int p,h,f; long m;
    P(int p,int h, int f, long m) {
    	this.p=p;
    	this.h=h;
    	this.f=f;
    	this.m=m;
    }

    public int compareTo(P p){
    	if(this.p==p.p) {
    		if(this.f==-1) return 1;
    		return -1;
    	}
        return this.p-p.p;
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
