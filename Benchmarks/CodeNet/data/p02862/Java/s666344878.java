import java.util.*;

public class Main {
    static long mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        if ((x+y)%3==0){
            long d = (x+y)/3;
            long m = x-d;
            long n = y-d;
            if (m>=0&&n>=0){
                long c = 1;
                for (long i=m+n;i>m;i--){
                    c = c*i%mod;
                }
                long e = 1;
                for (long i=1;i<=n;i++){
                    e=e*i%mod;
                }
                e = modinv(e,mod);
                c = c*e%mod;
                System.out.println(c);
            }else {
                System.out.println(0);
            }
        }else {
            System.out.println(0);
        }
    }

    static long modPow(long a, long n, long mod){
        long res = 1;
        while (n>0){
            if ((n&1)!=0)res = res*a%mod;
            a=a*a%mod;
            n >>= 1;
        }
        return res;
    }
    static long modinv(long a, long mod){return modPow(a,mod-2,mod);}
}
