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
        int m=sc.nextInt();
        int p=sc.nextInt();
        int e[][]=new int[m][3];
        
        for (int i = 0; i < e.length; i++) {
			int a=sc.nextInt()-1;
			int b=sc.nextInt()-1;
			int c=sc.nextInt();
			e[i][0]=a;
			e[i][1]=b;
			e[i][2]=-c+p;
        }
        
        long cs[]=new long[n];
        long cs2[]=new long[n];
        fill(cs, 1L<<50);
        cs[0]=0;
        
        for (int i = 0; i < cs.length; i++) {
			for (int j = 0; j < e.length; j++) {
				int fr=e[j][0];
				int to=e[j][1];
				int ex=e[j][2];
				if(cs[to]>cs[fr]+ex) {
					cs[to]=cs[fr]+ex;
					cs2[to]=cs[to];
				}
			}
		}

        for (int i = 0; i < 2*cs.length; i++) {
			for (int j = 0; j < e.length; j++) {
				int fr=e[j][0];
				int to=e[j][1];
				int ex=e[j][2];
				if(cs[to]>cs[fr]+ex) {
					cs[to]=cs[fr]+ex;
				}
			}
		}
        
        long ans=-cs[n-1];
        if(ans<0)ans=0;
        if(cs[n-1]<cs2[n-1])ans=-1;
       
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
//	int x, y;
//	P(int  x, int y) {
//	  this.x=x;
//	  this.y=y;
//	}
//}


//class P {
//    int id, d;
//    P(int  id, int d) {
//        this.id=id;
//        this.d=d;
//    }
//}

class P implements Comparable<P>{
    int a,b;
    P(int a, int b) {
    	this.b=b;
    	this.a=a;
    }

    public int compareTo(P p){
    	if(a==p.a) return b-p.b;
        return -p.a+a;
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
    public long nextLong() throws IOException
    {
        return Long.parseLong(nextString());
    }
    public double nextDouble() throws IOException
    {
        return Double.parseDouble(nextString());
    }
}
