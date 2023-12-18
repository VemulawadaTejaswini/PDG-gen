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
 
public class Main //implements Runnable
{
//    static int dx[]={-1,0,1,0};
//    static int dy[]={0,-1,0,1};
	
    public static void main(String[] args)   throws Exception, IOException{        
        long mod=1000000007;
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

        int n=sc.nextInt();
        long m=sc.nextLong();
        int a[]=sc.nextIntArray(n);
        sort(a);
        long d[]=new long[n];
        d[0]=a[0];
        for (int i = 1; i < d.length; i++) {
			d[i]=d[i-1]+a[i];
		}

        int up=a[n-1]*2+10,dw=0,md,x=0;
        long r;
        for (int i = 0; i < 50; i++) {
			md=(up+dw)/2;
			r=0;
			for (int j = 0,t; j < a.length; j++) {
				t=lower_bound(a, md-a[j]);
				if(0<=t && t<=j) {
					r+=(long)(j-t+1)*2-1;
				}
				if(r>=m)break;
			}
			if(r>=m) {
				x=max(md,x);
				dw=md;
			} else up=md;			
		}
		r=0;
		long ans=0;
		for (int j = 0,t; j < a.length; j++) {
			t=lower_bound(a, x-a[j]+1);
			if(0<=t && t<=j) {
				r+=(long)(j-t+1)*2-1;
				ans+=(d[j]-(t==0?0:d[t-1]))*2+(long)a[j]*(j-t)*2;
//				db(ans,r,j,t,d[j]-d[max(t-1,0)]);
			}
		}
		ans+=(m-r)*x;

        out.println(ans);
     	out.flush();
    }

    static int lower_bound(int v[], int find) {
        int right, left;
        int res = -1;
        left = 0; right = v.length;
        for(int i=0; i<40; i++) {
            int middle = (left + right) / 2;
     
            if(find <= v[middle]) {
                res = middle;
                right = middle;
            }
            else {
                left = middle;
            }
        }
        return res;
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

//
//class P {
//	int x, y, d;
//	P(int  x, int y, int d) {
//	  this.x=x;
//	  this.y=y;
//	  this.d=d;
//	}
//}
//

//class P implements Comparable<P>{
//    int a,b;
//    P(int a, int b) {
//    	this.b=b;
//    	this.a=a;
//    }
//
//    public int compareTo(P p){
//        return -p.a+a;//as
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
