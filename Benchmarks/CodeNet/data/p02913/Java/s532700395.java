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
    static long mod=1000000007;
//    static int dx[]={-1,0,1,0};
//    static int dy[]={0,-1,0,1};

    public static void main(String[] args)   throws Exception, IOException{        
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

        int n=sc.nextInt();
        String s=sc.nextString();
        long hs[]=new long[n],ans=0;
        for (int i = 0; i < hs.length; i++) {
			hs[i]=s.charAt(i)-'a';
		}
        long v[]=new long[n], x=13;
        long inv[]=new long[n];
        v[0]=inv[0]=1;
        for (int i = 1; i < v.length; i++) {
			v[i]=v[i-1]*x;
			v[i]%=mod;
			inv[i]=exGCD(mod, v[i])[2];
			if(inv[i]<0)inv[i]+=mod;
		}
        for (int i = 0; i < hs.length; i++) {
        	hs[i]*=v[i];
        	if(i>0)hs[i]+=hs[i-1];
        	hs[i]%=mod;			
		}
        boolean u[]=new boolean[n];
        for (int i = n-1; 1<=i ; i--) {
            HashMap<Long, Integer> mp=new HashMap<>();
			long w;
			for (int j = 0; j+i-1 < inv.length; j++) {
				w=hs[j+i-1];
				if(j>0)
					w-=hs[j-1];
				w*=inv[j];
				w%=mod;
				if(w<0)w+=mod;
				if(mp.containsKey(w)) {
					int r=mp.get(w);
					if(r<j) {
						ans=i;
						u[i]=true;
					}
				} else {
					mp.put(w, j+i-1);
				}
			}
		}
        
        mod=1000000009L;
        x=17;
        for (int i = 0; i < hs.length; i++) {
			hs[i]=s.charAt(i)-'a';
		}
        for (int i = 1; i < v.length; i++) {
			v[i]=v[i-1]*x;
			v[i]%=mod;
			inv[i]=exGCD(mod, v[i])[2];
			if(inv[i]<0)inv[i]+=mod;
		}
        for (int i = 0; i < hs.length; i++) {
        	hs[i]*=v[i];
        	if(i>0)hs[i]+=hs[i-1];
        	hs[i]%=mod;			
		}

        for (int i = n-1; 1<=i ; i--) {
            HashMap<Long, Integer> mp=new HashMap<>();
			long w;
			for (int j = 0; j+i-1 < inv.length; j++) {
				w=hs[j+i-1];
				if(j>0)
					w-=hs[j-1];
				w*=inv[j];
				w%=mod;
				if(w<0)w+=mod;
				if(mp.containsKey(w)) {
					int r=mp.get(w);
					if(r<j) {
						if(u[i])ret(i+"");
					}
				} else {
					mp.put(w, j+i-1);
				}
			}
		}
       
        out.println(0);
     	out.flush();
    }
    
    static long[] exGCD(long a, long b)
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
