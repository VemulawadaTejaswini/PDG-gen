import java.io.*;
import java.util.*;
 
public class Main {
    static long[][]memo;
    static int[]a;
    static int mod = 998244353;
    static long dp(int idx,int sum){
        if (sum<0)
            return 0;
        if (idx==a.length)
            return sum==0?1:0;
        if (memo[idx][sum]!=-1)
            return memo[idx][sum];
        if (sum==0)
            return memo[idx][sum]=(2l*dp(idx+1,sum))%mod;
        long ans = 2*dp(idx+1,sum);
        ans%=mod;
        ans+=dp(idx+1,sum-a[idx]);
        return memo[idx][sum]=ans%mod;
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int s = sc.nextInt();
        a= new int[n];
        memo = new long[n+1][s+1];
        for (long[]z:memo)Arrays.fill(z,-1);
        int[]pow= new int[n+1];
        pow[0]=1;
        for (int i =1;i<=n;i++){
           pow[i]=(2*pow[i-1])%mod;
        }
        for (int i =0;i<n;i++)a[i]=sc.nextInt();
        long ans=0;
        pw.println(dp(0,s));
        pw.flush();
    }
    static long gcd(long a,long b){
        if (a==0)
            return b;
        return gcd(b%a,a);
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