import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 998244353;
    long[] fac, inv;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solve();
        out.flush();
    }
    void solve(){
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        fac = new long[n+1]; inv = new long[n+1];
        fac[0] = 1; inv[0] = 1;
        for(int i=1;i<=n;i++) fac[i] = i*fac[i-1]%mod;
        inv[n] = power(fac[n],mod-2);
        for(int i=n-1;i>0;i--){
            inv[i] = (i+1)*inv[i+1]%mod;
        }
        long ans = 0;
        for(int i=0;i<=k;i++){
            // there are exactly i pair of adjacent blocks that have the same color
            // then we lose i blocks
            long tempN = n-i;
            long cur = m*power(m-1,tempN-1)%mod*comb(n-1,i)%mod;
            ans = (ans+cur)%mod;
        }
        ans %= mod;
        out.println(ans);
    }
    long comb(int n, int m){
        if(n<m ) return 0;
        return fac[n]*inv[m]%mod*inv[n-m]%mod;
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

