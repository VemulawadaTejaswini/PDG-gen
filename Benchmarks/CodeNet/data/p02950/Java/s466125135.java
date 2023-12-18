import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;

public class Main {
    static class Scanner {
        BufferedReader br;
        StringTokenizer tk = new StringTokenizer("");

        public Scanner(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }

        public int nextInt() throws IOException {
            if (tk.hasMoreTokens())
                return Integer.parseInt(tk.nextToken());
            tk = new StringTokenizer(br.readLine());
            return nextInt();
        }

        public long nextLong() throws IOException {
            if (tk.hasMoreTokens())
                return Long.parseLong(tk.nextToken());
            tk = new StringTokenizer(br.readLine());
            return nextLong();
        }

        public String next() throws IOException {
            if (tk.hasMoreTokens())
                return (tk.nextToken());
            tk = new StringTokenizer(br.readLine());
            return next();
        }

        public String nextLine() throws IOException {
            tk = new StringTokenizer("");
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            if (tk.hasMoreTokens())
                return Double.parseDouble(tk.nextToken());
            tk = new StringTokenizer(br.readLine());
            return nextDouble();
        }

        public char nextChar() throws IOException {
            if (tk.hasMoreTokens())
                return (tk.nextToken().charAt(0));
            tk = new StringTokenizer(br.readLine());
            return nextChar();
        }

        public int[] nextIntArray(int n) throws IOException {
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArray(int n) throws IOException {
            long a[] = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }

        public int[] nextIntArrayOneBased(int n) throws IOException {
            int a[] = new int[n + 1];
            for (int i = 1; i <= n; i++)
                a[i] = nextInt();
            return a;
        }

        public long[] nextLongArrayOneBased(int n) throws IOException {
            long a[] = new long[n + 1];
            for (int i = 1; i <= n; i++)
                a[i] = nextLong();
            return a;
        }


    }

    public static void main(String args[]) throws IOException {
        new Thread(null, new Runnable() {
            public void run() {
                try {
                    solve();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "1", 1 << 26).start();

    }
    static long fact[];
    static long ifact[];
    static long mod_exp(long base,long exp,long mod)
    {
        long ans=1;
        while(exp>0)
        {
            if(exp%2==1)
            {
                ans*=base;
                ans%=mod;
            }
            exp/=2;
            base*=base;
            base%=mod;
        }
        return ans;
    }

    static long modexp(long base,long exp)
    {
        long ans=1;
        while(exp>0)
        {
            if(exp%2==1)
            {
                ans*=base;

            }
            exp/=2;
            base*=base;

        }
        return ans;
    }
    static void mod_fact(int n,long mod)
    {
        long l[]=new long[n+1];
        l[0]=l[1]=1;
        for(int i=2;i<=n;i++)
            l[i]=(i*l[i-1])%mod;
        ifact=new long[n+1];
        ifact[n]=mod_inv(l[n],mod);
        for(int i=n-1;i>=0;i--)
            ifact[i]=((i+1)*(ifact[i+1]))%mod;
        fact=l;
        return;
    }
    static long mod_inv(long x,long mod)
    {
        return mod_exp(x,mod-2,mod);
    }
    static void solve() throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int p=in.nextInt();
        mod_fact(p-1, p);
        int a[]=in.nextIntArray(p);
        int fwd[][]=new int[p][p];
        fwd[0]=a.clone();
        for(int i=1;i<p;i++){
            for(int j=0;j<p-i;j++)
                fwd[i][j]=(p+fwd[i-1][j+1]-fwd[i-1][j])%p;
        }
        int dp[][]=new int[p][p+1];
        dp[0][0]=1;
        for(int i=1;i<p;i++){
            dp[i][0]=1;
            for(int j=1;j<i;j++){
                dp[i][j]=(dp[i-1][j]+dp[i-1][j-1]*i)%p;
            }
            dp[i][i]=(i*dp[i-1][i-1])%p;
        }
        out.print(fwd[0][0]+" ");
        for(int i=1;i<p;i++){
            int ans=0;
            int sgn=1;
            for(int j=i;j<p;j++){
                int v=sgn*dp[j-1][j-i];
                if(v<0)
                    v+=p;
                v*=fwd[j][0];
                v%=p;
                v*=ifact[j];
                v%=p;
                ans+=v;
                if(ans>=p)
                    ans-=p;
                sgn*=-1;
            }
            out.print(ans+" ");
        }
        out.println();
        out.close();

    }
}
