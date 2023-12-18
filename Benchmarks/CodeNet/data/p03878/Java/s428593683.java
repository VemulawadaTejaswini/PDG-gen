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
        long f[] = new long[n+1];
        long d[] = new long[n*2];
        
        f[1]=1;
        for (int i = 2; i <= n; i++) {
        	f[i] = f[i-1] * i;
        	f[i] %= mod;
        }
        
        
        for (int i = 0; i < n; i++) {
        	d[i] = sc.nextLong()<<40;
        }
        for (int i = 0; i < n; i++) {
        	d[i+n] = sc.nextLong()<<40;
        	d[i+n] += 1;
        }
        sort(d);
        
        int pre=(int)(d[0]%2),mx=1,c=0,s=0;
        long ans=1;
        for (int i = 1; i < n*2; i++) {
        	if(d[i]%2==pre) {mx++;}
        	else {
        		c++; pre=(int)(d[i]%2);
        		if(c==2) {
        		  c=0;  
        		  if(mx>=s)mx=1+abs(mx-s);
        		  else {c=1;mx=s-mx;}
        		  ans*=f[min(mx,s)]; ans%=mod; 
        		}
        		else {s=mx;mx=1;}  
        	}
        }
    	ans*=f[mx];
    	ans%=mod;

        out.println(ans);
        out.flush();
    }

    static void db(Object... os){
        System.err.println(Arrays.deepToString(os));
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
