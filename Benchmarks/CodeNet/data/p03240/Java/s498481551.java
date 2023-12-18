import java.util.*;
import java.io.*;
 
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{
    static final long mod=1000000007;
    
    public  static void main(String[] args)   throws Exception, IOException{
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        // int n=sc.nextInt();
        // char c[][] = new char[h][w];
        // char c[]=sc.nextString().toCharArray();
        // int d[]=new int[n];
        // for(int i=0; i<n; i++) {d[i]=sc.nextInt();}

        int n=sc.nextInt();
        long dx[]=new long[n];
        long dy[]=new long[n];
        long h[]=new long[n];
        for (int i=0; i<n; i++) {
            dx[i]=sc.nextInt();
            dy[i]=sc.nextInt();
            h[i]=sc.nextInt();
        }
        int ans=0;
        lp:for (int x=0; x<=100; x++) {
            for (int y=0; y<=100 ; y++) {
                for (int i=0; i<n; i++) {
                    long e=abs(x-dx[i])+abs(y-dy[i])+h[i];
                    int f=0;
                    for (int t=0; t<n; t++) {
                        if(h[t]!=max( 0,e-abs(x-dx[t])-abs(y-dy[t]))){ f++;break;}
                    }
                    if(f==0){
                        ans++;
                        out.println(x+" "+y+" "+e);
                        break lp;
                    }
                }
            }
        }
        if(ans==0){
         lp:for (int x=0; x<=100; x++) {
            for (int y=0; y<=100 ; y++) {
                for (int e=0; e<400; e++) {
                    int f=0;
                    for (int t=0; t<n; t++) {
                        if(h[t]!=max( 0,e-abs(x-dx[t])-abs(y-dy[t]))){ f++;break;}
                    }
                    if(f==0){
                        out.println(x+" "+y+" "+e);
                        break lp;
                    }
                }
            }
        }
        }
       

        // out.println();
        out.flush();
        // out.println(ans);
    }


    static void db(Object... os){
        System.err.println(Arrays.deepToString(os));
    }  

    static long gcd(long a, long b){
        if(min(a,b) == 0)return max(a,b);
        return gcd(max(a,b) % min(a,b),min(a,b));
    }
}

class P implements Comparable<P>{
    int id, d;
    P(int  id, int d) {
        this.id=id;
        this.d=d;
    }
    public int compareTo(P p){
        return d-p.d; //des
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
    public long nextLong() throws IOException
    {
        return Long.parseLong(nextString());
    }
    public double nextDouble() throws IOException
    {
        return Double.parseDouble(nextString());
    }
}
