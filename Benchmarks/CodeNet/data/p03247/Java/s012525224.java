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
        int s=0;
        long dx[] = new long[n];
        long dy[] = new long[n];
        for (int i=0; i<n; i++) {
            dx[i] = sc.nextInt();
            dy[i] = sc.nextInt();
            s+=(abs(dx[i])+abs(dy[i]))%2;
        }

        if(s!=0 && s!=n){
            out.println(-1);
            out.flush();
            return;
        }

        long b[] = new long[35];
        b[0]=1;b[1]=1;
        for (int i=2; i<35; i++) {
            b[i]=b[i-1]*2;
        }
        if(s==n){
            out.println(34);
            for (int t=1; t<35; t++) {
                out.print(b[t]+" ");
            }
            out.println();
            for (int i=0; i<n; i++) {
                String a="";
                for (int t=34; 0<t; t--) {
                   if(abs(dx[i])<abs(dy[i])){
                       if(dy[i]<0){a+="U"; dy[i]+=b[t];}
                       else {a+="D"; dy[i]-=b[t];}
                   }
                   else{
                       if(dx[i]<0){a+="R"; dx[i]+=b[t];}
                       else {a+="L"; dx[i]-=b[t];}
                   }
                }      
                out.println(a);
            }
        }
        else{
            out.println(35);
             for (int t=0; t<35; t++) {
                out.print(b[t]+" ");
            }
            out.println();
            for (int i=0; i<n; i++) {
                String a="";
                for (int t=34; 0<=t; t--) {
                   if(abs(dx[i])<abs(dy[i])){
                       if(dy[i]<0){a+="U"; dy[i]+=b[t];}
                       else {a+="D"; dy[i]-=b[t];}
                   }
                   else{
                       if(dx[i]<0){a+="R"; dx[i]+=b[t];}
                       else {a+="L"; dx[i]-=b[t];}
                   }
                }      
                out.println(a);
            }
        }
        // out.println(ans);
        out.flush();
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
