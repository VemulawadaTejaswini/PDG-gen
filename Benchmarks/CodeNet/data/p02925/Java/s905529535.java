import java.util.*;
import java.util.Map.Entry;
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
//        ArrayList<Integer> l[]=new ArrayList[n];
        int d[][]=new int[n][n];
        int cur[]=new int[n];
        for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d.length-1; j++) {
				d[i][j]=sc.nextInt()-1;
			}
		}
        boolean u[]=new boolean[n];
        boolean fin[]=new boolean[n];
        int a=0;
    	int c=0,v=0;
    	
    	ArrayList<Integer> l=new ArrayList<>();

    	lp:
        while(true) {
        	fill(u,false);
        	a++;
        	v=c;
        	if(a==1)
        	for (int i = 0,t; i < d.length; i++) {
				if(fin[i]) {continue;}
        		t=d[i][cur[i]];
				if(u[t]||u[i])continue;
				if(fin[t]) {a=-1;break lp;}
				if(i==d[t][cur[t]]) {
					cur[i]++;
					cur[t]++;
					u[i]=true;
					u[t]=true;
					c+=2;
//					db(i,t,a);
					if(cur[i]==cur.length-1) {fin[i]=true;}
					if(cur[t]==cur.length-1) {fin[t]=true;}
				}
			}
        	else
        	for (int i = 0,t,w=0; w < l.size(); w++) {
        		i=l.get(w);
//				db(i);
        		if(fin[i]) {continue;}
        		t=d[i][cur[i]];
				if(u[t]||u[i])continue;
				if(fin[t]) {a=-1;break lp;}
				if(i==d[t][cur[t]]) {
					cur[i]++;
					cur[t]++;
					u[i]=true;
					u[t]=true;
					c+=2;
//					db(i,t,a);
					if(cur[i]==cur.length-1) {fin[i]=true;}
					if(cur[t]==cur.length-1) {fin[t]=true;}
				}
			}
        	l.clear();

        	for (int i = 0; i < u.length; i++) {
				if(u[i])l.add(i);
			}
        	
//        	db(c,v);
			if(c==n*(n-1))break;
        	if(v==c) {
        		a=-1;break;
        	}
		}
        
        out.println(a);
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
