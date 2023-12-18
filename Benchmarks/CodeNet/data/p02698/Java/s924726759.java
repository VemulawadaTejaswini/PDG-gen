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
        int a[]=sc.nextIntArray(n);
        int r[]=new int[n];
        double d[]=new double[n];
        fill(d,1<<28);
        d[0]=a[0];
        ArrayList<Integer> e[]=InputTree(n, sc);
        rep(0,-1,1,e,a,d,r);
        for (int i = 0; i < e.length; i++) {
            out.println(r[i]);
		}

        out.println();
     	out.flush();
    }
    
    static void rep(int k, int pr, int cr, ArrayList<Integer> e[], int a[], double d[], int r[]) {
    	r[k]=cr;
    	for (int i = 0,t,w,mm; i < e[k].size(); i++) {
			t=e[k].get(i);
			if(pr==t)continue;
			w=~binarySearch(d, (double)a[t]-0.1);
			mm=(int)d[w];
			d[w]=a[t];
//			db(k,w,d);
			rep(t,k,max(cr,w+1),e,a,d,r);
			d[w]=mm;
		}
    }
        
    static ArrayList[] InputTree(int n, Reader sc) {
        ArrayList<Integer> ret[] = new ArrayList[n];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = new ArrayList<>();
        }
        for (int i = 0; i < n-1; i++) {
            int a=sc.nextInt()-1;
            int b=sc.nextInt()-1;
            ret[a].add(b);
            ret[b].add(a);
        }
        return ret;
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
