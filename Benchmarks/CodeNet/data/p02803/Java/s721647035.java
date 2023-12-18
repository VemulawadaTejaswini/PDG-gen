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
        int m=sc.nextInt(),v=n*m;
        char c[][]=new char[n][m];
        for (int i = 0; i < c.length; i++) {
			c[i]=sc.nextString().toCharArray();
		}
        
        PriorityQueue<P> q=new PriorityQueue<>();
        int u[][]=new int[n][m], ans=0;
        for (int i = 0; i < c.length; i++) {
        	for (int j = 0; j < m; j++) {
        		if(c[i][j]=='#')continue;
        		q.add(new P(i,j,0));
        		for (int k = 0; k < u.length; k++) {
					fill(u[k],-1);
				}
        		u[i][j]=0;
        		while(!q.isEmpty()) {
        			P p=q.poll();
        			for (int k = 0; k < dx.length; k++) {
    					int xx=p.x+dx[k];
    					int yy=p.y+dy[k];
    					if(!validpos(xx, yy, n, m))continue;
    					if(c[xx][yy]=='#' || u[xx][yy]>=0)continue;
    					u[xx][yy]=p.ds+1;
    					ans=max(ans,u[xx][yy]);
    					q.add(new P(xx,yy,p.ds+1));
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
    int x,y,ds;
    P(int x,int y, int ds) {
    	this.x=x;
    	this.y=y;
    	this.ds=ds;
    }

    public int compareTo(P p){
        return ds-p.ds;
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
