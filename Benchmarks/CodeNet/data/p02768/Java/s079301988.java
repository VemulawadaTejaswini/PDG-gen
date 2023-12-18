import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.CookieHandler;
import java.util.*;

public class Main {
    static PrintWriter out = new PrintWriter(System.out);
    static Scanner sc = new Scanner(System.in);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long[] frac;
    long mod = 1000000000+7;
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.solve();
//        System.out.println(main.solve());
    }
    void solve() throws IOException {
        int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        frac = new long[b+1];
        frac[0] = 1;
        for(int i=1;i<=b;i++) frac[i] = frac[i-1]*i%mod;
        long ans = power(2,n)+mod-1;
        ans %= mod;
        ans -= helper(n-a+1,n)*inv(a)%mod;
        ans -= helper(n-b+1,n)*inv(b)%mod;
        ans = (ans+10*mod)%mod;
        System.out.println(ans);
    }
    // returns the inv of m!
    long inv(int m){
        if(m==0) return 1;
        return power(frac[m],mod-2);
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
    long helper(long from, long to){
        if(from>to){
            long mid = to;
            to = from; from = mid;
        }
        long ans = from;
        for(long i=from+1;i<=to;i++){
            ans = ans*i%mod;
        }
        return ans;
    }

}

