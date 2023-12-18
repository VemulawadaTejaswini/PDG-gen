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

        int n=sc.nextInt();
        int k=sc.nextInt();
        int d[]=sc.nextIntArray(n);
        long ans=0;
        
        for (int i = 0; i <= d.length; i++) {
        	for (int t = 0; t <= d.length; t++) {
				if(i+t>k)break;
				boolean u[]=new boolean[n];
				long a=0;
				int v[]=new int[i+t],c=0, rem=k-i-t;
				for (int j = 0; j < i; j++) {
					v[c++]=d[j];
					u[j]=true;
				}
				for (int j = 0; j < t; j++) {
					if(u[n-1-j])break;
					v[c++]=d[n-1-j];
				}
				sort(v);
				for (int j = 0; j < v.length; j++) {
					if(v[j]<0 && rem>0) {
						v[j]=0;rem--;
					}
				}
				for (int j = 0; j < v.length; j++) {
					a+=v[j];
				}
				ans=max(a,ans);
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

//class P {
//    int id, d;
//    P(int  id, int d) {
//        this.id=id;
//        this.d=d;
//    }
//}

//class P implements Comparable<P>{
//	int v,id;
//	String s;
//	P(int id, int v, String s) {
//	  this.id=id;
//	  this.v=v;
//	  this.s=s;
//	}
//	public int compareTo(P p){			
//	 if(s.equals(p.s)) {
//		 return -v+p.v;
//	 }
//	  return s.compareTo(p.s);
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
