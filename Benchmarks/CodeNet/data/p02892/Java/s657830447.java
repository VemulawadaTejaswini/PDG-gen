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
        char c[][]=new char[n][];
        for (int i = 0; i < c.length; i++) {
			c[i]=sc.getCharSet();
		}
       
        LinkedList<P> q=new LinkedList();
        int ans=0;
        for (int i = 0; i < c.length; i++) {
			q.add(new P(i,-1,1));
			int d[]=new int[n];
			fill(d,-1);
			d[i]=0;
//			db(i);
			while(!q.isEmpty()) {
				P p=q.poll();
				int id=p.x, pre=p.y;
//				db(id,pre);
				for (int j = 0; j < d.length; j++) {
					if(c[id][j]=='1' && pre!=j) {
						if(d[j]<0) {
							d[j]=d[id]+1;
							ans=max(ans,p.d+1);
							q.add(new P(j,id,p.d+1));
						}
						else if(abs(d[j]-d[id])!=1) {
							ret("-1");
						}
					}
				}
			}
		}

        
        out.println(ans);
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

class P {
	int x, y, d;
	P(int  x, int y, int d) {
	  this.x=x;
	  this.y=y;
	  this.d=d;
	}
}

//class P implements Comparable<P>{
//    int a,b;
//    P(int a, int b) {
//    	this.b=b;
//    	this.a=a;
//    }
//
//    public int compareTo(P p){
//        return p.a-a;//des
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
