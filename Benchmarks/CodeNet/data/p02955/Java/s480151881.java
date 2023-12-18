import java.util.*;
import java.util.Map.Entry;
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.rmi.server.UnicastRemoteObject;

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
        
        int n=sc.nextInt();
        int k=sc.nextInt();
        long d[]=sc.nextLongArray(n);
//        sort(d);
        long w=0;
        for (int i = 0; i < d.length; i++) {
			w+=d[i];
		}
        long ans=0;
        
        for (long i = 1; i*i <= w; i++) {
        	if(w%i!=0)continue;
			long r[]=new long[n];
			long s=0;
			long z=i;
			for (int j = 0; j < d.length; j++) {
				r[j]=d[j]%z;
				s+=r[j];
			}
			
			if(s%z==0) {
				long q=s/z;
				sort(r);
				long e=0;
				for (int j = n-1,t=0; t<q & -1 < j; t++,j--){
					e+=z-r[j];
				}
				if(e<=k) {
					ans=max(ans,z);
				}
			}

			z=w/i;
			s=0;
			for (int j = 0; j < d.length; j++) {
				r[j]=d[j]%z;
				s+=r[j];
			}
			
			if(s%z==0) {
				long q=s/z;
				sort(r);
				long e=0;
				for (int j = n-1,t=0; t<q & -1 < j; t++,j--){
					e+=z-r[j];
				}
				if(e<=k) {
					ans=max(ans,z);
				}
			}

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

class P {
	int x, y;
	P(int  x, int y) {
	  this.x=x;
	  this.y=y;
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
//    int a,b;
//    P(int a, int b) {
//    	this.b=b;
//    	this.a=a;
//    }
//
//    public int compareTo(P p){
//        return b-p.b;
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
