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

    public  static void main(String[] args)   throws Exception, IOException{        
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);

        int n = sc.nextInt();
        ArrayList<Integer> e[] = new ArrayList[n];
        for (int i = 0; i < e.length; i++) {
			e[i]=new ArrayList<>();
		}
        for (int i = 0; i < n-1; i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			int w=sc.nextInt(), f=1;
			if(w%2==1)f=-1;
			e[x-1].add(y*f);
			e[y-1].add(x*f);
		}
        
        boolean u[]=new boolean[n];
        LinkedList<P> q = new LinkedList<>();
        q.add(new P(0,0));
        int color[]=new int[n];

        while(!q.isEmpty()) {
        	P p=q.poll();
        	int id=p.id;
        	u[id]=true;
        	for (int i = 0; i < e[id].size(); i++) {
				int to = e[id].get(i), abs=abs(to);
//				db(id,to,abs);
				if(u[abs-1])continue;
				int col=0;
				if(p.d==0 && to<0)col=1;
				else if(p.d==1 && to>0)col=1;
				color[abs-1]=col;
				u[abs-1]=true;
				q.add(new P(abs-1, col));
			}
        }

        for (int i = 0; i < color.length; i++) {
        	out.println(color[i]);
		}
//        out.println();
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
    int id, d;
    P(int  id, int d) {
        this.id=id;
        this.d=d;
    }
}

//class P implements Comparable<P>{
//    int id,T;
//    P(int id, int T) {
//        this.id=id;
//        this.T=T;
//    }
//    public int compareTo(P p){
//        return id-p.id; //des
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
