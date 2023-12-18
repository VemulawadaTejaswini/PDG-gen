import java.io.*;
import java.util.*;


public class Main {
    static long mod = 1000000000+7;
    static int maxn=2;
    static long[] frac, inv;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String[] buf = reader.readLine().split(" ");
        int n = sc.nextInt(), m = sc.nextInt();
        int k = sc.nextInt();
        maxn = n*m;
        init();
        long ans = 0,time = comb(k-2,n*m-2);
        for(int row=1;row<=n;row++){
            for(int col=1;col<=m;col++){
                // first compute the yi part
                /*ans  = (ans + (m*row*(row-1)/2%mod)*time%mod)%mod;
                long neg = ((n-row)*(n-row+1)/2)%mod*time%mod;
                ans = (ans-neg+2*mod*/
                long pos = row*(row-1)*m%mod*time%mod;
                long neg = row*m*(n-row)%mod*time%mod;
                // then do the xi part
                pos += col*n*(col-1)%mod*time%mod;
                neg += col*n*(m-col)%mod*time%mod;
                pos %= mod; neg %=mod;
                ans = (ans+pos-neg+10*mod)%mod;
            }
        }
        System.out.println(ans);
    }
    static long comb(int m, int n){
        if(m>n) return 0;
        // we should put m<=n
        return frac[n]*inv[m]%mod*inv[n-m]%mod;
    }
    static void init(){
        frac = new long[maxn+1]; inv = new long[maxn+1];
        frac[0]=1; inv[0]=1;
        for(int i=1;i<=maxn;i++) frac[i]=frac[i-1]*i%mod;
        inv[maxn] = pow(frac[maxn],mod-2);
        for(int i=maxn-1;i>=1;i--){
            inv[i] = inv[i+1]*(i+1)%mod;
        }
    }
    static long pow(long base, long t){
        long ans = 1;
        while(t>0){
            if(t%2==1) ans = ans*base%mod;
            t /= 2;
            base = base*base%mod;
        }
        return ans;
    }
}

