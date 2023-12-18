import java.util.*;
import java.util.Map.Entry;
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
        new Thread(null, new Main(), "", 200 * 1024 * 1024).start();
    }

    public void run() {
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        int n = 0, q = 0;
        long v[]=null;
        ArrayList<Integer> tr[] = null;
        
        
        try {
            n = sc.nextInt();
            q = sc.nextInt();
            tr = new ArrayList[n];
            v=new long[n];
            for (int i = 0; i < tr.length; i++) {
                tr[i] = new ArrayList<>();
            }
            for (int i = 0; i < n-1; i++) {
                int a=sc.nextInt()-1;
                int b=sc.nextInt()-1;
                tr[a].add(b);
                tr[b].add(a);
            }
            for (int i = 0; i < q; i++) {
				v[sc.nextInt()-1]+=sc.nextLong();
			}
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        rep(0,-1,tr,v,0);
        for (int i = 0; i < tr.length; i++) {
            out.print(v[i]+" ");			
		}
        out.println();
        out.flush();
    }
    
    void rep(int p, int pr, ArrayList<Integer>[] e, long v[], long cv) {
    	v[p]+=cv;
    	for (int i = 0; i < e[p].size(); i++) {
			int to=e[p].get(i);
			if(to==pr)continue;
			rep(to,p,e,v,v[p]);
		}
    }

//    public static void main(String[] args)   throws Exception, IOException{        
//        Reader sc = new Reader(System.in);
//        PrintWriter out=new PrintWriter(System.out);
//
//        int n=sc.nextInt();
//        int q=sc.nextInt();
//        ArrayList<Integer> tr[] = InputTree(n, sc);
//        long v[]=new long[n];
//        for (int i = 0; i < q; i++) {
//			v[sc.nextInt()-1]+=sc.nextLong();
//		}
//
//        out.println();
//        out.flush();
//    }


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
