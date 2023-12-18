import java.io.PrintWriter;
import java.util.*;

public class Main {
    PrintWriter out = new PrintWriter(System.out);
    final long mod = 1000000000+7;
    int maxn;
    long[] frac;
    long[] inv;
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solve());
    }
    // segment tree to record minimum value
    // Each point has a infinite distance from 0 (except itself)
    long solve() {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(), Y = sc.nextInt();
        if((X+Y)%3!=0) return 0;
        // suppose in the x-direction, a moves of +1 and b moves of +2
        // then in the y-direction, a*(+2) and b*(+1)
        // a+2*b = X, 2*a+b = Y
        int a3 = 2*Y-X, b3 = 2*X-Y;
        if(a3<=0||a3%3!=0||b3<=0||b3%3!=0) return 0;
        int a = a3/3, b = b3/3;
        this.maxn = Math.max(X,Y)+10;
        ini();
        long ans = frac[a+b]*inv[a]%mod*inv[b]%mod;
        return ans;
    }
    void ini(){
        frac = new long[maxn+1];
        frac[0] = 1;
        for(int i=1;i<=maxn;i++) frac[i] = i*frac[i-1]%mod;
        inv = new long[maxn+1];
        inv[0] = 1;
        inv[maxn] = power(frac[maxn], mod-2);
        for(int i=maxn-1;i>0;i--){
            inv[i] = (i+1)*inv[i+1]%mod;
        }
    }
    long power(long base, long q){
        long ans = 1;
        while(q>0){
            if(q%2==1) ans = ans*base%mod;
            base = base*base%mod;
            q /= 2;
        }
        return ans;
    }
}

