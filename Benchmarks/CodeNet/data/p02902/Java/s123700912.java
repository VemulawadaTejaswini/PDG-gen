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
        int m=sc.nextInt();
        int r[][]=dr_graph_in(sc, n, m);
        
//        db(r);

		boolean u[] = new boolean[n];
		PriorityQueue<Integer> q = new PriorityQueue<>();
		int a=n+1,s;
		int pr[]=new int[n];
		int as[]=new int[n];
		int ds[]=new int[n];
		boolean f;
		
        for (int i = 0; i < r.length; i++) {
        	q.clear();
        	fill(u,false);
        	fill(ds,0);
			q.add(i);
			u[i]=true;
			s=0;
			f=false;
			lp:
			while(!q.isEmpty()) {
				s++;
				int p=q.poll();
				for (int j = 0,to; j < r[p].length; j++) {
					to=r[p][j];
					if(to==i) {
						pr[i]=p;
						ds[i]=ds[p]+1;
						f=true;
						break lp;
					}
					if(u[to])continue;
					q.add(to);
					u[to]=true;
					pr[to]=p;
					ds[to]+=ds[p]+1;
				}
			}
			if(f && ds[i]<a) {
				a=ds[i];
				int c=i;
				for (int j = 0; j < ds[i]; j++) {
					as[j]=pr[c]+1;
					c=pr[c];
				}
			}
		}
        
        if(a<n+1) {
            out.println(a);
        	for (int i = 0; i < a; i++) {
    			out.println(as[i]);
    		}        	
        }
        else
        
        
        out.println(-1);
     	out.flush();
    }
    
    static int[][]   dr_graph_in(Reader sc, int n, int m) throws Exception, IOException{
    	//n nodes, m edges
    	int r[][] = new int[n][];

        int fr[] = new int[m];
        int to[] = new int[m];
        int dg[] = new int[n];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            a--;b--;
            fr[i] = a;
            to[i] = b;
            dg[a]++;
        }
        
        for (int i = 0; i < n; i++) {
			r[i] = new int[dg[i]];
		}

        for (int i=0; i<m; i++) {
        	int a = fr[i], b = to[i];
        	r[a][--dg[a]] = b;
        }
        
        return r;
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
