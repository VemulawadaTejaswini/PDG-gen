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
	static double s;
	
    public static void main(String[] args)   throws Exception, IOException{        
//        long mod=1000000007;
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

        int n=sc.nextInt();
        int m=sc.nextInt();
        char c[]=sc.getCharSet();
        int d[]=new int[n+1];
        int inf=n+10;
        fill(d,inf);
        LinkedList<Integer> q=new LinkedList<>();
        d[n]=0;
        q.addLast(n);
        
        for (int i = n-1,l; 0 <= i ; i--) {
        	if(q.isEmpty())break;
        	l=q.peekLast();
			if(c[i]=='0') {
				d[i]=d[l]+1;
				q.addFirst(i);
			}
			if(n>=i+m && c[i+m]=='0') {
				q.pollLast();
        	}
		}
//        db(d);
        if(d[0]==inf)ret("-1");
        
        for (int i = 1,x=d[0]-1,f=1; i < d.length; i++) {
			if(d[i]==x) {
		        out.print(f+" ");		        
				if(x==0)break;
				f=1;
				x--;
			} else f++;
		}
        	

        out.println();
     	out.flush();
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

class P implements Comparable<P>{
    int a,b;
    P(int a, int b) {
    	this.b=b;
    	this.a=a;
    }

    public int compareTo(P p){
        return -p.a+a;//as
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
