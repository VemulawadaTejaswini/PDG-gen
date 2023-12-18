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
        long a[]=new long[n];
        long s=0;
        for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextLong();
			s^=a[i];
		}

        long x=0,y=0;
        int c=0;
        long v[]=new long[n];
        for (int i = 0; i < 60; i++) {
	    	if((s>>i)%2==0)x^=1L<<i;
	    }
        for (int i = 0; i < a.length; i++) {
			y=max(y,(s^a[i])+a[i]);
			a[i]&=x;
		}
        
        long ans=0;
        gauss(a);

        for (int i = 0,st=0; i < 60; i++) {
        	int b=60-i-1;
        	if((s>>b)%2==0)
        	out:
			for (int j = st; j < v.length; j++) {
				if((a[j]>>b)%2==1) {
//					ans^=1L<<b;
					ans^=a[j];
					st=j+1;
					break out;
				}
			}
		}

        ans=ans*2+s;
        ans=max(ans,y);
        out.println(ans);
     	out.flush();
    }
    
    static void gauss(long A[]) {
    	int rank = 0;
    	long tmp;
    	for (int d = 59; -1 < d; d--) {
    		int pivot = -1;
		    for (int i = rank; i < A.length; ++i) {
		      if ((A[i]&(1L<<d))>0) {
		        pivot = i;
		        break;
		      }
		    }
		    if (pivot == -1) continue;
		    tmp=A[rank];
		    A[rank]=A[pivot];
		    A[pivot]=tmp;
		    for (int j = 0; j < A.length; ++j) {
		      if (j == rank) continue;
		      if ((A[j]&(1L<<d))>0)
		    	  A[j] ^= A[rank];
		    }
		    ++rank;
    	}
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
