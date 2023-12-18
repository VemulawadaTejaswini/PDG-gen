import java.util.*;
import java.io.*;
import java.time.chrono.MinguoDate;

import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{
    static final long mod=1000000007;
    static int dx[]={-1,0,1,0};
    static int dy[]={0,-1,0,1};

    public  static void main(String[] args)   throws Exception, IOException{        
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        // int n=sc.nextInt();
        // char c[][] = new char[h][w];
        // char c[]=sc.nextString().toCharArray();
        // int d[]=new int[n];
        // for(int i=0; i<n; i++) {d[i]=sc.nextInt();}

        
        int n=sc.nextInt();
        char c[]=sc.nextString().toCharArray();
        int q=sc.nextInt();
        long m[]=new long[c.length+1];
        
        for (int i = 0; i < c.length; i++) {
			m[i+1]+=m[i]+(c[i]=='M'?1:0);
		}
        
//        db(m);

        for (int i = 0; i < q; i++) {
			int d=sc.nextInt();
			long s=0,cs=0,cn=0;
			for (int t = 0; t < d-1; t++) {
				int w=n-t-1;
				if(c[w]=='C') {
					cs+=m[w+1];
					cn++;
				}
				if(c[w]=='D') {
					s+=cs;
					s-=cn*m[w+1];
				}
			}
//			db(d,cs,cn,s);

			for (int t = c.length-d; -1 < t; t--) {
				if(c[t]=='D') {
					s+=cs;
					s-=cn*m[t+1];
				}
				else if(c[t]=='C') {
					cn++;
					cs+=m[t+1];
				}
				if(c[t+d-1]=='C') {
					cn--;;
					cs-=m[t+d];
				}
//				db(d,s,cs,cn);
			}
	        out.println(s);
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

//class P implements Comparable<P>{
//    int id, d;
//    P(int  id, int d) {
//        this.id=id;
//        this.d=d;
//    }
//    public int compareTo(P p){
//        return d-p.d; //des
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
    public long nextLong() throws IOException
    {
        return Long.parseLong(nextString());
    }
    public double nextDouble() throws IOException
    {
        return Double.parseDouble(nextString());
    }
}
