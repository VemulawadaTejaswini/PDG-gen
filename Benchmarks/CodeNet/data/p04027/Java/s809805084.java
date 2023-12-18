import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;
public class Main
{
    static class Scanner
    {
        BufferedReader br;
        StringTokenizer tk=new StringTokenizer("");
        public Scanner(InputStream is) 
        {
            br=new BufferedReader(new InputStreamReader(is));
        }
        public int nextInt() throws IOException
        {
            if(tk.hasMoreTokens())
                return Integer.parseInt(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextInt();
        }
        public long nextLong() throws IOException
        {
            if(tk.hasMoreTokens())
                return Long.parseLong(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextLong();
        }
        public String next() throws IOException
        {
            if(tk.hasMoreTokens())
                return (tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return next();
        }
        public String nextLine() throws IOException
        {
            tk=new StringTokenizer("");
            return br.readLine();
        }
        public double nextDouble() throws IOException
        {
            if(tk.hasMoreTokens())
                return Double.parseDouble(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextDouble();
        }
        public char nextChar() throws IOException
        {
            if(tk.hasMoreTokens())
                return (tk.nextToken().charAt(0));
            tk=new StringTokenizer(br.readLine());
            return nextChar();
        }
        public int[] nextIntArray(int n) throws IOException
        {
            int a[]=new int[n];
            for(int i=0;i<n;i++)
                a[i]=nextInt();
            return a;
        }
        public long[] nextLongArray(int n) throws IOException
        {
            long a[]=new long[n];
            for(int i=0;i<n;i++)
                a[i]=nextLong();
            return a;
        }
        public int[] nextIntArrayOneBased(int n) throws IOException
        {
            int a[]=new int[n+1];
            for(int i=1;i<=n;i++)
                a[i]=nextInt();
            return a;
        }
        public long[] nextLongArrayOneBased(int n) throws IOException
        {
            long a[]=new long[n+1];
            for(int i=1;i<=n;i++)
                a[i]=nextLong();
            return a;
        }
    
    
    }
    public static void main(String args[]) throws IOException
    {
        new Thread(null, new Runnable() {
            public void run() {
                try
                {
                    solve();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }, "1", 1 << 26).start();
        
    }
    static long mod=1000000007;
    static long pow[][];
    static long powSum(int l, int r, int p){
        return (pow[p][r]-pow[p][l-1]+mod)%mod;
    }
    static long dp[][];
    static int a[],b[],n;
    static long sol(int i,int c){
        if(i==n)
            if(c==0)
                return 1;
            else 
                return 0;
        if(dp[i][c]!=-1)
            return dp[i][c];
        long ans=0;
        for(int can=0;can<=c;can++){
            ans+=(powSum(a[i], b[i], can)*sol(i+1, c-can))%mod;
            ans%=mod;
        }
        return dp[i][c]=ans;
        
    }
    static void solve() throws IOException
    {
        Scanner in=new Scanner(System.in);
        PrintWriter out=new PrintWriter(System.out);
        pow=new long[401][401];
        for(int i=1;i<=400;i++){
            pow[0][i]=1;
        }
        for(int i=1;i<=400;i++){
            for(int j=1; j<=400;j++){
                pow[i][j]=(j*pow[i-1][j])%mod;
            }
        }
        for(int i=0;i<=400;i++){
            for(int j=1;j<=400;j++)
                pow[i][j]=(pow[i][j]+pow[i][j-1])%mod;
        }
        dp=new long[400][401];
        n=in.nextInt();
        int c=in.nextInt();
        a=in.nextIntArray(n);
        b=in.nextIntArray(n);
        for(int i=0;i<n;i++)
            for(int j=0;j<=c;j++)
                dp[i][j]=-1;
        out.println(sol(0,c));
        out.close();
        
    }
}
