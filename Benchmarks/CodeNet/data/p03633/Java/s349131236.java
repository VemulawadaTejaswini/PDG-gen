import java.math.BigInteger;
import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        long[] t = new long[n];
        for(int i = 0; i < n; i++){
            t[i] = sc.nextLong();
        }
        long ans = lcm(t[0], t[1]);

        for(int i = 2; i < n; i++){
            ans = lcm(ans,t[i]);
        }
        System.out.println(ans);
    }

    static long lcm(long a, long b){
        BigInteger b1 = BigInteger.valueOf(a);
        BigInteger b2 = BigInteger.valueOf(b);
        return a / b1.gcd(b2).longValue() * b;
    }
}