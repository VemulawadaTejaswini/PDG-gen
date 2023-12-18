import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
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
    static long mod=1000000007;
    static long dp[][];
    static int n, a, b, c, d;
    static long f[], inf[];
    static long modExp(long base, long exp){
        long ans=1;
        while(exp>0){
            if(exp%2==1){
                ans*=base;
                ans%=mod;
            }
            exp>>=1;
            base*=base;
            base%=mod;
        }
        return ans;
    }
    
    static long modInv(long a){
        return modExp(a, mod-2);
    }
    static long cg(int ng, int gs){
        long ans=f[ng*gs];
        ans*=modExp(inf[gs], ng);
        ans%=mod;
        ans*=inf[ng];
        ans%=mod;
        return ans;
    }
    static long ncr(int n, int r){
        long ans=inf[r]*inf[n-r];
        ans%=mod;
        ans*=f[n];
        ans%=mod;
        return ans;
    }
    
    static long sol(int a, int n){
        if(n==0)
            return 1;
        if(a>b)
            return 0;
        if(dp[a][n]!=-1)
            return dp[a][n];
        dp[a][n]=sol(a+1, n);
        for(int ng=c; n>=ng*a&&ng<=d; ng++){
            dp[a][n]+=(((sol(a+1, n-ng*a)*cg(ng,a))%mod)*ncr(n, ng*a))%mod;
            dp[a][n]%=mod;
        }
        return dp[a][n];
    }
    static void init(int l){
        f=new long[l+1];
        inf=new long[l+1];
        f[0]=1;
        for(int i=1;i<=l;i++){
            f[i]=(i*f[i-1])%mod;
        }
        inf[l]=modInv(f[l]);
        for(int i=l-1;i>=0;i--){
            inf[i]=((i+1)*inf[i+1])%mod;
        }
    }
    static void solve() throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        n=in.nextInt();
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        d=in.nextInt();
        dp=new long[n+1][n+1];
        for(int i=1;i<=n;i++)
            Arrays.fill(dp[i], -1);
        
        for(int i=a;i<=b;i++)
            dp[i][0]=1;
        init(n+1);
        long ans=sol(a, n);
        out.println(ans);
        out.close();

    }
    
}
