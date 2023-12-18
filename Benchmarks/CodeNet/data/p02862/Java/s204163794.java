import java.util.*;

public class Main {
    static int mod = 1_000_000_007;
    // global
    static long fact[];
    static long inverse[];

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
        fact=new long[2000000];
        fact[0]=1;
        inverse=new long[2000000];
        inverse[0]=1;
        for(int i=1;i<2000000;i++){
            fact[i]=(fact[i-1]*(long)i)%mod;
            inverse[i]=modinv(fact[i]);
        }
        Scanner sc = new Scanner(System.in);
        int X = Integer.parseInt(sc.next());
        int Y = Integer.parseInt(sc.next());
        long ans = 0;
        if ((X+Y)%3==0 && X>=(X+Y)/3 && Y>=(X+Y)/3) {
            ans = comb((X+Y)/3, X-(X+Y)/3);
        }
        System.out.println(ans);
    }
}