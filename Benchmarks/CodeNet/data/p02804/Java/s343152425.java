import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 1000000000+7;
    long[] fac, inv;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
//        main.solve();
        out.println(main.solve());
        out.flush();
    }
    long solve() throws IOException {
        int n = sc.nextInt(), k = sc.nextInt();
        ini(n);
        long[] a = new long[n];
        for(int i=0;i<n;i++) a[i] = sc.nextLong();
        Arrays.sort(a);
        long pos = 0, nega = 0;
        for(int i=k-1;i<n;i++){
            pos += a[i]*combine(i, k-1)%mod;
            pos %= mod;
        }
        for(int i=n-1;i>=0;i--){
            nega += a[i]*combine(n-1-i,k-1)%mod;
            nega %= mod;
        }
        long ans = (pos-nega+mod)%mod;
        return ans;
    }
    long combine(int n, int m){
        if(n<m) return 0;
        return fac[n]*inv[m]%mod*inv[n-m]%mod;
    }
    void ini(int n){
        fac = new long[n+1]; inv = new long[n+1];
        fac[0] = 1;
        for(int i=1; i<=n; i++) fac[i] = fac[i-1]*i%mod;
        inv[0] = 1; inv[n] = power(fac[n],mod-2);
        for(int i=n-1;i>0;i--){
            inv[i] = inv[i+1]*(i+1)%mod;
        }
    }
    long power(long base, long p){
        long ans = 1;
        while(p>0){
            if(p%2==1) ans = ans*base%mod;
            base = base*base%mod;
            p /= 2;
        }
        return ans;
    }
}