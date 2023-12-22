import java.util.*;
import java.io.*;

public class Main {
    static int mod = (int)1e9+7;
    static long[]fact;
    static long pow(long a,int pow){
        long res=1;
        while (pow>0){
            if (pow%2==1){
                res=(res*a)%mod;
            }
            a=(a*a)%mod;
            pow>>=1;
        }
        return res;
    }
    static long ncr(int n,int r){
        if (r>n)
            return 0;
        long ans = fact[n]*pow(fact[n-r],mod-2);
        ans%=mod;
        ans*=pow(fact[r],mod-2);
        return ans%mod;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        fact= new long[(int)3e6];
        fact[0]=1;
        for (int i =1;i<fact.length;i++){
            fact[i]=(i*fact[i-1])%mod;
        }
        long ans =0;int k = sc.nextInt();
        int n = sc.nextLine().length();
        for (int i =n;i<=n+k;i++){
            long here=(ncr(i-1,n-1)*pow(25,i-n))%mod;
            here*=pow(26,n+k-i);
            ans+=here;
            ans%=mod;
        }
        pw.println(ans);
        pw.flush();
    }
    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
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
            return Double.parseDouble(next());
        }

        public int[] nextIntArr(int n) throws IOException {
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++)
                arr[i] = nextInt();
            return arr;
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

    }
}