import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;

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
        ArrayList<Integer> l[] = InputTree(n, sc);
        long dg[] = new long[n];
        for (int i = 0; i < dg.length; i++) {
			dg[i] = (long)l[i].size()<<20;
			dg[i] += i;
		}
        sort(dg);
        int c[]=new int[n];
        long a=0;
        for (int i = 0; i < c.length; i++) {
			c[i]=sc.nextInt();
			a+=c[i];
		}
        sort(c);
        a-=c[n-1];
        out.println(a);
        
        int e[]=new int[n];
        for (int i = 0; i < dg.length; i++) {
			int bt=1<<20, id= (int)(dg[i]&(bt-1));
			e[id]=c[i];
		}
        for (int i = 0; i < e.length; i++) {
			out.print(e[i]+" ");
		}
        
        
//        out.println();
        out.flush();
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

//class P {
//    int id, d;
//    P(int  id, int d) {
//        this.id=id;
//        this.d=d;
//    }
//}

//class P implements Comparable<P>{
//	int x,w,id,ox;
//	P(int id, int x, int w) {
//		this.id=id;
//		this.x=x;
//		this.w=w;
//	}
//
//	public int compareTo(P p){
//		if(x==p.x) {
//			return w-p.w;
//		}
//		return x-p.x;
//	}
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
