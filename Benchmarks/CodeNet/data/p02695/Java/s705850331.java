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
    static int ans=0;

    public void run() {
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        
        int n=sc.nextInt();
        int m=sc.nextInt();
        int q=sc.nextInt();
        int[] a=new int [q];
        int[] b=new int [q];
        int[] c=new int [q];
        int[] d=new int [q];
        for (int i = 0; i < d.length; i++) {
			a[i]=sc.nextInt()-1;
			b[i]=sc.nextInt()-1;
			c[i]=sc.nextInt();
			d[i]=sc.nextInt();
		}
                
        rep(new int[n],0,n,1,m,a,b,c,d);
        out.println(ans);
     	out.flush();
    }
    
    static void rep(int x[], int k, int n, int f, int m,int a[],int b[],int c[],int d[]) {
    	if(n==k) {
    		int r=0;
    		for (int i = 0; i < d.length; i++) {
				if(x[b[i]]-x[a[i]]==c[i])r+=d[i];
			}
    		ans=max(ans,r);
    		return;
    	}
    	for (int i = f; i <= m; i++) {
    		x[k]=i;
			rep(x,k+1,n,i,m,a,b,c,d);
		}
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
