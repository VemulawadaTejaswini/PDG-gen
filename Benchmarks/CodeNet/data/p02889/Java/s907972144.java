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
        int m=sc.nextInt();
        int l=sc.nextInt();
        long inf=1L<<60;
        int e[][][]=dr_graph_in(n, m, sc);
        
        PriorityQueue<P> q=new PriorityQueue<>();
        long d[][]=new long[n][n];
        long rm[]=new long[n];
        
        for (int i = 0,id,r,c; i < n; i++) {
			q.add(new P(i,0,l));
			fill(d[i],inf);
			d[i][i]=0;
			rm[i]=l;
			while(!q.isEmpty()) {
				P p=q.poll();
				id=p.id;
				r=p.rm;
				c=p.c;
				if(p.c > d[i][id] || (p.c==d[i][id] && p.rm < rm[id]))continue;
				for (int j = 0,to,co,ds,rr; j < e[id].length; j++) {
					to=e[id][j][0];
					ds=e[id][j][1];
					if(r<ds) {
						co=c+1;
						rr=l-ds;
					}else {
						co=c;
						rr=r-ds;
					}
					
					if(co<d[i][to]) {
						d[i][to]=co;
						rm[to]=rr;
						q.add(new P(to,co,rr));
					} else if(co==d[i][to] && rr<rm[to]) {
						rm[to]=rr;
						q.add(new P(to,co,rr));						
					}
				}
			}
		}

        int w=sc.nextInt();
        for (int i = 0; i < w; i++) {
			int fr=sc.nextInt()-1;
			int to=sc.nextInt()-1;
			out.println(d[fr][to]==inf?-1:d[fr][to]);
		}

        out.println();
     	out.flush();
    }
    
    static int[][][]   dr_graph_in(int n, int m, Reader sc) throws Exception, IOException{
        //n nodes, m edges
        int r[][][] = new int[n][][];

        int fr[] = new int[m];
        int to[] = new int[m];
        int ds[] = new int[m]; //distance
        int dg[] = new int[n];   //degree

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), d = sc.nextInt();
            a--;b--;
            fr[i] = a; to[i] = b; ds[i] = d;
            dg[a]++;
            dg[b]++;
        }
        
        for (int i = 0; i < n; i++) {
            r[i]=new int[dg[i]][2];
        }

        for (int i=0; i<m; i++) {
           int a=fr[i], b=to[i], d=ds[i];
           r[a][dg[a]-1][0] = b;
           r[a][dg[a]-1][1] = d;
           r[b][dg[b]-1][0] = a;
           r[b][dg[b]-1][1] = d;
           dg[a]--;        
           dg[b]--;
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

class P implements Comparable<P>{
    int id,rm,c;
    P(int id, int c, int rm) {
    	this.id=id;
    	this.c=c;
    	this.rm=rm;
    }

    public int compareTo(P p){
        return p.c-c;//des
    }
}


//class P {
//	int x, y, d;
//	P(int  x, int y, int d) {
//	  this.x=x;
//	  this.y=y;
//	  this.d=d;
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
