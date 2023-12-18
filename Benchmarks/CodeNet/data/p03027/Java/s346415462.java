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

    public static void main(String[] args)   throws Exception, IOException{        
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

        int n = sc.nextInt();
        mod = 1000003;
        int sz=1000004;
        long fr[] = new long[sz];
        long inv[]= new long[sz];

        fr[0] = inv[0] = 1;
        fr[1] = inv[1] = 1;

        for (int i = 2; i <sz; ++i){
            inv[i] = inv[(int)mod % i] * (mod - mod / i) % mod ;
        }

        for (int i = 2; i <sz; ++i){
            fr[i] = fr[i-1]*i %mod;
            inv[i] = inv[i-1]*inv[i] %mod;
        }
        
        for (int i = 0; i < n; i++) {
			int x=sc.nextInt();
			int d=sc.nextInt();
			int k=sc.nextInt();
			BigInteger v=new BigInteger(d+"");
			v = v.modPow(new BigInteger(k+""), new BigInteger(mod+""));
			
			long iv=1;
			if(d!=0)
				iv=exGCD(d, mod)[1];
			else {
				out.println(v.longValue());
				continue;
			}
			long dx=x*iv%mod;
			if(dx<0)dx+=mod;
			
			if(dx==0 || dx+k-1>=mod) {
				out.println(0);
			} else {
				out.println(fr[(int)(dx+k-1)]*v.longValue()%mod*inv[(int)(dx-1)]%mod);
			}
		}
        
//        out.println();
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
//	int x,w,id,ox;
//	P(int id, int x, int w) {
//		this.id=id;
//		this.x=x;
//		this.w=w;
//	}
//
//	public int compareTo(P p){
//		if(x==p.x) {
//			return w-p.w;
//		}
//		return x-p.x;
//	}
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
