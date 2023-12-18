//import java.util.*;
//
//public class Main{
//
//
//    public static void main(String args[]){
//
//        Scanner sc = new Scanner(System.in);
//
//
//        int n = sc.nextInt();
//
//        int k = sc.nextInt();
//
//
//
////        int nCk = factorical(n)/(factorical(n-k)*factorical(k));
//
//        int mod = (int)1e9 + 7;
//
//        for (int i=1; i<=k; i++){
//            int first = (factorical(n-k+1)/(factorical(n-k+1-i)*(factorical(i))))%mod;
//            int second = (factorical(k-1)/(factorical(k-i)*factorical(i-1)))%mod;
//
//            System.out.println(first*second%mod);
//
//
//        }
//
////        System.out.println(nCk);
//
//
//        }
//
//    static int factorical(int x){
//        int mod = (int)1e9 + 7;
//
//        int fact = 1;
//        if (x==0) return fact;
//        else{
//            for (int i=x; i>0; i--){
//                fact *= i;
//            }
//        }
//        return fact%mod;
//    }
//}


public class Main {
    int n;
    long mod;
    long[] facts;

    public Main(int n, long mod) {
        this.n = n;
        this.mod = mod;
        facts = new long[n];
        facts[0] = 1;
        for (int i = 1; i < n; i++) {
            facts[i] = facts[i - 1] * i % mod;
        }
    }

    long modpow(long a, long b) {
        if (b == 0) return 1;
        else if (b == 1) return a;

        long x = modpow(a, b / 2);
        return b % 2 == 0 ? x * x % mod : x * (x * a % mod) % mod;
    }

    long inv(long n) {
        return modpow(n, mod - 2);
    }

    public long nck(int n, int k) {
        return facts[n] * (inv(facts[n - k]) * inv(facts[k]) % mod) % mod;
    }
}