import java.util.*;
import java.io.*;

public class Main {
    static long cnt[];
    public static void main(String[] args) throws Exception {
        FastReader sc = new FastReader();
        int n=sc.nextInt(),k=sc.nextInt();
        cnt=new long[k+1];
        for (int i=1;i<=k;i++)p(i);
        int mod=1000000007;
        for (int i=1;i<=k;i++){
            cnt[i]=pow(cnt[i],n,mod);
        }
        long ans=0;
        for (int j=k;j>=1;j--){
            for (int i=2*j;i<=k;i+=j){
                cnt[j]=(cnt[j]-cnt[i]+mod)%mod;
            }
            ans=(ans+(j*cnt[j])%mod)%mod;
        }
        System.out.println(ans);
    }
    static void p(int x){
        for (int i=1;i*i<=x;i++){
            if (x%i==0){
                cnt[i]++;
                if (x/i==i)continue;
                cnt[x/i]++;
            }
        }
    }
    static long pow(long a,long p,int m){
        if (p==0)return 1;
        long res=pow(a,p/2,m)%m;
        if (p%2==0)return (res*res)%m;
        return (a*((res*res)%m))%m;
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}