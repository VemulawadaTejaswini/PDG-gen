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
        int a[]=sc.nextIntArray(n);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
			map.put(a[i], i+1);
		}

        TreeMap<Integer, Integer> tm = new TreeMap<>();
        tm.put(0, 0);
        tm.put(n+1, 0);
        tm.put(map.get(n), 0);
        long s=0;
        for (int i = n-1; 0 < i; i--) {
			int l=i,r=i,x=map.get(i),ll,rr;
			tm.put(x, 0);
			l=ll=tm.lowerKey(x);
			r=rr=tm.higherKey(x);
			if(0<l) {
				ll=tm.lowerKey(ll);
				s+=(long)i*(l-ll)*(r-x);
//				db(i,x,ll,l,r,rr);
//				db(s);
			}
			if(r<n+1) {
				rr=tm.higherKey(rr);
				s+=(long)i*(rr-r)*(x-l);
//				db(i,x,ll,l,r,rr);
//				db(s);
			}
		}
        
        out.println(s);
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
//	int x, y;
//	P(int  x, int y) {
//	  this.x=x;
//	  this.y=y;
//	}
//}

//class P implements Comparable<P>{
//    int a,b;
//    P(int a, int b) {
//    	this.b=b;
//    	this.a=a;
//    }
//
//    public int compareTo(P p){
//    	if(a==p.a) return b-p.b;
//        return -p.a+a;
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
