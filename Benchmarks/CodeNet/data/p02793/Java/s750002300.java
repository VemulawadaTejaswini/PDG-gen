import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    static int mod = 1000000007;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());

        int gcd = 0;
        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<n ; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        long lcm = a[0];
        for(int i=1 ; i<n ; i++) {
            lcm = lcm(lcm, a[i]);
        }

        long ans = 0;
        for(int i=0 ; i<n ; i++) {
            ans += (lcm * modInverse(a[i], mod))%mod;
            ans %= mod;
        }

        pw.print(ans);





        pw.flush();
        pw.close();
    }

    static long lcm(long a, long b) {
        long ans = (a%mod*b%mod)%mod;
        ans = (ans * modInverse(gcd(a,b), mod))%mod;
        return ans%mod;
    }

    static long gcd(long a, long b) {
        return b==0?a:gcd(b,a%b);
    }

    static long modInverse(long a, long m) {
        long m0 = m;
        long y = 0, x = 1;
        if (m == 1) return 0;
        while (a > 1) {
            long q = a / m;
            long t = m;
            m = a % m;
            a = t;
            t = y;
            y = x - q * y;
            x = t;
        }
        if (x < 0)
            x += m0;
        return x;
    }
}
