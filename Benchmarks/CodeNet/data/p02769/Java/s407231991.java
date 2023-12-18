import java.io.*;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int maxn;
    long[] frac,inv;
    long mod = 1000000000+7;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    long solve() throws IOException {
        int n = sc.nextInt(), k = sc.nextInt();
        maxn = 2*n;
        ini();
        long ans = comb(2*n-1,n-1);
        if(k>=n-1) return ans;
        // otherwise, the k is relatively small
        long sub = 0;
        for(int zero = k+1;zero <= n-1; zero++){
            sub += comb(n,zero)*comb(n-1,n-zero-1)%mod;
            sub %= mod;
        }
        ans = (ans+mod-sub)%mod;
        return ans;

    }
    long comb(int n, int m){
        if(n<m) return 0;
        return frac[n]*inv[m]%mod*inv[n-m]%mod;
    }
    void ini(){
        frac = new long[maxn+1]; inv = new long[maxn+1];
        frac[0]= 1;
        for(int i=1;i<=maxn;i++) frac[i] = i*frac[i-1]%mod;
        inv[0]=1;
        inv[maxn] = power(frac[maxn],mod-2);
        for(int i=maxn-1;i>0;i--){
            inv[i] = inv[i+1]*(i+1)%mod;
        }
    }
    long power(long base, long p){
        long ans = 1;
        while(p>0){
            if(p%2==1) ans = ans*base%mod;
            base = base*base%mod;
             p/= 2;
        }
        return ans;
    }

}

