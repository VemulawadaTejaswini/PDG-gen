import java.util.*;
import java.io.*;
 
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
 
public class Main{
    static final long mod=1000000007;
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};

    public  static void main(String[] args)   throws Exception, IOException{
        Reader sc = new Reader(System.in);
        PrintWriter out=new PrintWriter(System.out);
        // int n=sc.nextInt();
        // char c[][] = new char[h][w];
        // char c[]=sc.nextString().toCharArray();
        // int d[]=new int[n];
        // for(int i=0; i<n; i++) {d[i]=sc.nextInt();}

//        int n=sc.nextInt();
        int h=sc.nextInt();
        int w=sc.nextInt();
        int k=sc.nextInt();

        int dp[][]=new int[h+1][w+2];
        dp[0][0]++;
        int d[]=new int[w];
        fill(d,1000);
        for (int i = 1; i < dp.length; i++) {
lp:			for (int t = 0; t < 1<<(w-1); t++) {
				for (int z = 0; z < w-1; z++) {
					if((t>>z)%2==1 && (t>>(z+1))%2==1)continue lp;
				}				
				for (int z = 0; z < w-1; z++) {
					if((t>>z)%2==1) {
						dp[i][z]+=dp[i-1][z+1];
						dp[i][z+1]+=dp[i-1][z];
						d[z]=t;
						d[z+1]=t;
						if(dp[i][z]>=mod)dp[i][z]-=mod;
						if(dp[i][z+1]>=mod)dp[i][z+1]-=mod;

					}
				}
				for (int z = 0; z < w; z++) {
					if(d[z]!=t)dp[i][z]+=dp[i-1][z];
					if(dp[i][z]>=mod)dp[i][z]-=mod;
				}
				//db(i,t,dp[i]);
			}
		}
        
        out.println(dp[h][k-1]);
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
