import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.rmi.server.UnicastRemoteObject;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main implements Runnable{
    static long mod=1000000007;
//    static int dx[]={-1,0,1,0};
//    static int dy[]={0,-1,0,1};
    public static void main(String[] args)   throws Exception, IOException{        
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
    }

    public void run() {
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int n = 0;
        int k = 0;
        ArrayList<Integer> d[] = null;
        
		try {
			n = sc.nextInt();
			k = sc.nextInt();
			d = InputTree(n, sc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        out.println(rep(k, 0, -1, d));
        out.flush();
    }
    
    long rep(int k, int cur, int pre, ArrayList<Integer> d[]) {
    	long r=1;
    	if(pre<0)r=k;
    	for (int i = 0,t=pre<0?-1:0; i < d[cur].size(); i++) {
			int c = d[cur].get(i);
			if(c==pre)continue;
			if(k-t-2<=0)return 0;
    		r*=k-t-2;
    		t++;
    		r%=mod;
			r*=rep(k, c, cur, d);
    		r%=mod;
    		if(r<1)return 0;
		}
    	return r;
    }
    
    static ArrayList[] InputTree(int n, Reader sc) throws IOException {
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

    static boolean validpos(int x,int y,int r, int c){
        return x<r && 0<=x && y<c && 0<=y;
    }

    static void db(Object... os){
        System.err.println(Arrays.deepToString(os));
    }
}

class P {
	int x, y;
	P(int  x, int y) {
	  this.x=x;
	  this.y=y;
	}
}


//class P {
//    int id, d;
//    P(int  id, int d) {
//        this.id=id;
//        this.d=d;
//    }
//}

//class P implements Comparable<P>{
//    int a,b;
//    P(int a, int b) {
//    	this.b=b;
//    	this.a=a;
//    }
//
//    public int compareTo(P p){
//        return b-p.b;
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
