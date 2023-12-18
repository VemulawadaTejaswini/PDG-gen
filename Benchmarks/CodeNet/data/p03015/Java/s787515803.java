import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        int MOD = 1000000000 + 7;

        FastScanner sc = new FastScanner();
        String L = sc.nextToken();
        int b[] = new int[L.length()];
        int one = 0;
        int len = L.length();

        for (int i=0;i<b.length;i++) {
            b[i] = L.charAt(i) == '0' ? 0 : 1;

            if (b[i] == 1) {
                one++;
            }
        }

        long ans = 0;
        for (int i=0;i<=one;i++) {
            long a = nCk(one, i, MOD);
            long n = pow(2, one - i, MOD);
            long m = pow(2, len - one - i, MOD);
//            System.out.printf("--\ni = %d\n", i);
//            System.out.printf("a = %d\n", a);
//            System.out.printf("n = %d\n", n);
//            System.out.printf("m = %d\n", m);

            ans += (a * n * m) % MOD;

            ans %= MOD;
        }

        System.out.println(ans);
    }

    public static int nCk(int n,int k,int M) {
        long ret = 1;
        int min = Math.min(k, n-k);
        for(int i=1;i<=min;i++) {
            ret = (ret * pow(i,M-2,M)) % M;
        }
        for(int i=n-min+1;i<=n;i++) {
            ret = (ret * i) % M;
        }
        return (int)ret;
    }

    public static long pow(long a,long b,int M) {
        long ret = 1;
        long tmp = a;
        while(b>0) {
            if((b&1)==1) ret = (ret * tmp) % M;
            tmp = (tmp * tmp) % M;
            b = b>>1;
        }
        return ret;
    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
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
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }
}