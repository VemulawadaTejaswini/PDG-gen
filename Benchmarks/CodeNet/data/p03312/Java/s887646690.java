import java.util.*;
import java.io.*;
import java.math.*;
 
 
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
        // for(int i=0; i<n; i++) {a[i]=sc.nextInt();}
        int n=sc.nextInt();
        int a[] =new int[n];
        int b[] =new int[n];
        long l[] = new long[n+1];
        long r[] = new long[n+1];
        for(int i=0; i<n; i++) {
            a[i]=sc.nextInt();
            b[n-i-1] = a[i];
        }
        for(int i=1; i<=n; i++) {
            l[i] = l[i-1] + a[i-1];
            r[i] = r[i-1] + b[i-1];
        }
        db(l);
        db(r);
        long ans = 1L<<62;
        for(int i=1; i+2<n; i++) {
            long h = l[i+1]/2;
            int  e=n-i-1;
            int w = binarySearch(l,h); 
            if(w<0) w=~w;
            h = r[e]/2;
            int q = binarySearch(r,h);
            if(q<0) q=~q;
            long d[] = {l[w],l[i+1]-l[w], r[q], r[e]-r[q]};
            // db(d);
            sort(d);
            ans= min(ans, abs(d[0]-d[3]));

            if(w-1>0) {
                d[0]=l[w-1];
                d[1]=l[i+1]-l[w-1];
                d[2]=r[q]; 
                d[3]=r[e]-r[q];
                db(d);
                sort(d);
                ans= min(ans, abs(d[0]-d[3]));
                if(q-1>0) {
                    d[0]=l[w-1];
                    d[1]=l[i+1]-l[w-1];
                    d[2]=r[q-1]; 
                    d[3]=r[e]-r[q-1];
                    // db(d);
                    sort(d);
                    ans= min(ans, abs(d[0]-d[3]));
                }
            }
            if(q-1>0) {
                d[0]=l[w];
                d[1]=l[i+1]-l[w];
                d[2]=r[q-1]; 
                d[3]=r[e]-r[q-1];
                // db(d);
                sort(d);
                ans= min(ans, abs(d[0]-d[3]));
            }

                // if(w-1>0)
            // d = {l[w],l[i+1]-l[w], r[q], r[e]-r[q]};

            //             db(i+1,e);

        }


        out.println(ans);
        out.flush();
    }

    static void db(Object... os){
        System.err.println(Arrays.deepToString(os));
    }
     
    static boolean validpos(int x,int y,int r, int c){
        return x<r && 0<=x && y<c && 0<=y;
    }
    
    static boolean bit(long x,int k){
        // weather k-th bit (from right) be one or zero
        return  ( 0 < ( (x>>k) & 1 )  )  ? true:false;
    }    

    class P implements Comparable<P>{
        long x;
        double d;
        P(long x, double d) {
            this.x=x;
            this.d=d;
        } 
          
        public int compareTo(P p){
            return (d - p.d)>0?1:-1;//des
        } 
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