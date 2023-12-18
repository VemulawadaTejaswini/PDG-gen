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
        int b[]=new int[1000001];
        for (int i = 0,t; i < a.length; i++) {
        	t=a[i];
			for (int j = 2,p,c; j*j <= t; j++) {
				p=-1;c=0;
				while(t%j==0) {
					p=j;
					c++;
					t/=j;
				}
				if(p>1)b[p]=max(c,b[p]);
			}
			if(t!=1)b[t]=max(b[t],1);
		}
        long l=1;
        for (int i = 0; i < b.length; i++) {
        	while(b[i]>0) {
//        		db(b[i],i);
        		l*=i;
        		l%=mod;
        		b[i]--;        		
        	}
		}
//        db(l);
        long g,r=0;
        for (int i = 0; i < a.length; i++) {
			g=exGCD(a[i], mod)[1];
//			db(l,a[i],g);
			r+=l*g%mod;
			r%=mod;
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
