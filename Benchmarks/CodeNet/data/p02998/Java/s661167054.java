import java.util.*;
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

        int n = sc.nextInt();
        P p[] = new P[n];
        HashMap<Integer, Integer> mx = new HashMap<>();
        HashMap<Integer, Integer> my = new HashMap<>();
        QuickUnionWeighted uf = new QuickUnionWeighted(n);
        
        for (int i = 0; i < p.length; i++) {
        	int x=sc.nextInt();
        	int y=sc.nextInt();
			p[i]=new P(x,y);
			if(mx.containsKey(x)) {
				int id = mx.get(x);
				uf.union(id, i);
			} else {
				mx.put(x, i);
			}
			if(my.containsKey(y)) {
				int id = my.get(y);
				uf.union(id, i);
			} else {
				my.put(y, i);
			}
		}
        
        HashSet<Integer> hx[] = new HashSet[n]; 
        HashSet<Integer> hy[] = new HashSet[n]; 
        
        for (int i = 0; i < p.length; i++) {
			int rt = uf.root(i);
			if(hx[rt]==null)hx[rt]=new HashSet<Integer>();
			if(hy[rt]==null)hy[rt]=new HashSet<Integer>();
			hx[rt].add(p[i].x);
			hy[rt].add(p[i].y);
		}
        long ans=0;
        for (int i = 0; i < hy.length; i++) {
			if(hx[i]==null)continue;
			long szx=hx[i].size(), szy=hy[i].size();
//			db(szx,szy);
			ans+=(long)szx*szy-uf.sz(i);
		}

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

class P {
	int x, y;
	P(int  x, int y) {
	  this.x=x;
	  this.y=y;
	}
}

class QuickUnionWeighted {
    public int[] id;
    private int[] sz;
    public QuickUnionWeighted(int N)
    {
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }
    
    public int root(int p) {
        while (id[p] != p) p = id[p];
        return p;
    }
    
    public boolean connected(int id1, int id2) {
        return root(id1) == root(id2);
    }
    
    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if( i==j )return;
        if (sz[i] < sz[j]) { id[i] = j; sz[j] += sz[i];   }
        else               { id[j] = i; sz[i] += sz[j];   }  
    }
    public int sz(int x){
        return sz[ root(x) ];// weight
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
