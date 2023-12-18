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
        int m = sc.nextInt();
        ArrayList<Integer> e[] = InputG(n, m, sc);
        LinkedList<Integer> q=new LinkedList<>();
        int S = sc.nextInt()-1;
        int T = sc.nextInt()-1;
        int max = Integer.MAX_VALUE;
        q.add(S*3);
        int us[][]=new int[3][n];
        for (int i = 0; i < us.length; i++) {
			fill(us[i], max);
		}
        us[0][S]=0;

        while(!q.isEmpty()) {
        	int p=q.poll(), k=p%3;
        	p/=3;
        	int d = us[k][p] + 1;
//        	db(p,k,d-1);
        	k=(k+1)%3;
        	for (int i = 0; i < e[p].size(); i++) {
				int t=e[p].get(i);
				if(us[k][t]<=d )continue;
		        us[k][t] = d;
				q.add((t*3)+k);
			}
        }
        
        out.println(us[0][T]==max?-1:us[0][T]/3);
        out.flush();
    }
    static ArrayList[] InputG(int n, int m, Reader sc) throws IOException {
        ArrayList<Integer> ret[] = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            ret[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int a=sc.nextInt()-1;
            int b=sc.nextInt()-1;
            ret[a].add(b);
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
