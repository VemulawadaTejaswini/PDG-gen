import java.util.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main implements Runnable
{
//    static int dx[]={-1,0,1,0};
//    static int dy[]={0,-1,0,1};
    static long mod=1000000007;
    
    public static void main(String[] args) {        
        new Thread(null, new Main(), "", 200 * 1024 * 1024).start();        
    }

    public void run() {
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x=sc.nextInt();
        int c[]=new int[n];
        int a[][]=new int[n][m];
        for (int i = 0; i < a.length; i++) {
			c[i]=sc.nextInt();
			a[i]=sc.nextIntArray(m);
		}
        long r=Long.MAX_VALUE;
        int d[]=new int[m];
        for (int i = 1,f; i < 1<<n; i++) {
        	long s=0;
        	f=0;
			for (int j = 0; j < n; j++) {
				if((i>>j)%2==1) {
					for (int t = 0; t < m; t++) {
						d[t]+=a[j][t];						
					}
					s+=c[j];
				}
			}
			for (int j = 0; j < d.length; j++) {
				if(d[j]>=x) {f++;}
			}
//			db(i,s,d);
			if(f==m)r=min(r,s);
			fill(d,0);
		}
        if(r==Long.MAX_VALUE)r=-1;

        out.println(r);
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
//	int x,c;long s;
//	P(int  x, int c, long s) {
//	  this.x=x;
//	  this.c=c;
//	  this.s=s;
//	}
//}


class P implements Comparable<P>{
	int x,c;long s;
	P(int  x, int c, long s) {
	  this.x=x;
	  this.c=c;
	  this.s=s;
	}

    public int compareTo(P p){
        return Long.signum(s-p.s);
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
