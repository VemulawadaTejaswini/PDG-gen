import java.util.*;

public class Main{
    static int mod = 1000000007;
    static long[] fac, finv, inv;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        fac = new long[H+W];
        finv = new long[H+W];
        inv = new long[H+W];
        COMinit(H, W);

        long ans = 0;
        for(int i = 0; i <=H-A-1; i++){
            ans = (ans + COM(B+i-1, i)*COM(W-B-1+H-i-1, H-i-1)%mod)%mod;
        }
        System.out.println(ans);
    }

    static void COMinit(int H, int W) {
        fac[0] = fac[1] = 1;
        finv[0] = finv[1] = 1;
        inv[1] = 1;
        for (int i = 2; i < H+W; i++){
            fac[i] = fac[i - 1] * i % mod;
            inv[i] = mod - inv[mod%i] * (mod / i) % mod;
            finv[i] = finv[i - 1] * inv[i] % mod;
        }
    }

    static long COM(int n, int k){
        if(n < k)
            return 0;
        if(n < 0 || k < 0)
            return 0;
        return fac[n]*(finv[k]*finv[n-k]%mod)%mod;
    }
    
}