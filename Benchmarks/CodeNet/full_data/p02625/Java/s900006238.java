import java.util.*;
import java.io.*;
public class Main {
    static int INF = 1001001009;
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 1000000000+7;
    long[] inv, fac;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Main main = new Main();
        main.solve();
//        long ans = main.solve();
//        out.println(ans);
//        main.solve();
        out.flush();
    }
    void solve() throws Exception{
        int n = sc.nextInt(), m = sc.nextInt();
        ini(m);
        // Calculate basic case with inclusion-exclusion
        long base = 0, co = 1;
        for(int i=0; i<=n; i++){
            base += co*(comb(n,i)*permu(m-i, n-i)%mod);
            base = (base+mod)%mod;
            co *= -1;
        }
        base = base*permu(m,n)%mod;
        out.println(base);
    }
    long permu(int n, int m){
        if(n<m) return 0;
        return fac[n]*inv[n-m]%mod;
    }
    long comb(int n, int m){
        if(n<m) return 0;
        return fac[n]*inv[m]%mod*inv[n-m]%mod;
    }
    void ini(int n){
        inv = new long[n+1]; fac = new long[n+1];
        fac[0] = 1;
        for(int i=1; i<=n; i++) fac[i] = fac[i-1]*i%mod;
        inv[0] = 1;
        inv[n] = power(fac[n], mod-2);
        for(int i=n-1;i>0;i--) inv[i] = inv[i+1]*(i+1)%mod;
    }
    int paIn(String s){return Integer.parseInt(s);}
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