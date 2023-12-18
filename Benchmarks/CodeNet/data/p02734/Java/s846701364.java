
import java.io.*;
import java.util.*;
public class Main {
    static long[][]memo;
    static int mod=998244353;
    static int n,s;
    static int[]a;
    static long dp(int idx,int sum){
        if (sum>s||idx>n)
            return 0;
        if(sum==s)return 1;
        if (idx==n)
            return sum==s?1:0;
        if (memo[idx][sum]!=-1)
            return memo[idx][sum];
        long ans= dp(idx+1,sum)+dp(idx+1,sum+a[idx]);
        return memo[idx][sum]=ans%mod;
    }
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        n = sc.nextInt();
        s= sc.nextInt();
        a= new int[n];
        for (int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        long ans=0;
        long[][]dp =  new long[2][s+1];
        int idx=0;
        dp[0][0]=1;
        for (int i =n-1;i>=0;i--){
            int nidx=1-idx;
            for (int j=0;j<=s;j++){
                if (j<a[i])
                    continue;
                dp[nidx][j]+=dp[idx][j-a[i]];
                dp[nidx][j]%=mod;
            }
            for (int j=0;j<=s;j++){
                dp[nidx][j]+=dp[idx][j];
                dp[nidx][j]%=mod;
            }
            idx=nidx;
            ans+=dp[nidx][s];
//            ans+=dp[idx][s];
            ans%=mod;
        }
        pw.println(ans);
        pw.flush();
    }
    static int gcd(int x,int y){
        if (x==0)
            return y;
        return gcd(y%x,x);
    }
    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }

}