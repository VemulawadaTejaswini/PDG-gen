import java.util.*;

public class Main {

    // global
    static long fact[];
    static long inverse[];
    static int mod = 998244353;

    static long pow(long a,int n) {
        long res=1;
        while (n>0) {
            if ((n-n/2*2)==1) {
                res=res*a%mod;
            }
            a=a*a%mod;
            n>>=1;
        }
        return res;
    }

    static long modinv(long n) {
        return pow(n, mod-2);
    }

    static long comb(int n,int k){
        if(n<0 || k<0 || n<k)return 0;
        return fact[n]*(inverse[k]*inverse[n-k]%mod) %mod;
    }

    public static void main(String[] args) {

        // main method
        fact=new long[500000];
        fact[0]=1;
        inverse=new long[500000];
        inverse[0]=1;
        for(int i=1;i<500000;i++){
            fact[i]=(fact[i-1]*(long)i)%mod;
            inverse[i]=modinv(fact[i]);
        }

        Scanner sc = new Scanner(System.in);
        long N = Long.parseLong(sc.next());
        long A = Long.parseLong(sc.next());
        long B = Long.parseLong(sc.next());
        long K = Long.parseLong(sc.next());

        // solve Ax+By=K
        long ans = 0L;
        for (int i=0;i<=N;i++) {
            if ((K-A*i)%B==0) {
                long j = (K-A*i)/B;
                if (0<=j && j<=N) {
                    ans = (ans + comb((int)N, i)*comb((int)N, (int)j)%mod)%mod;
                }
            }
        }
        System.out.println(ans);
    }
}