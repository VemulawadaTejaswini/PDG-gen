import java.util.*;
import java.lang.*;
class MathLib{
    public static long divCeil(long a, long b){
        return (a+b-1)/b;
    }

    public static long gcd(long a, long b){
        if(a<b) return gcd(b,a);
        if(b==0) return a;
        if(a%b==0) return b;
        return gcd(b,a%b);
    }
    public static long lcm(long a, long b){
        return (a/gcd(a,b))*b;
    }

    public static LinkedList<Long> divisors(long N){
        LinkedList<Long> ans = new LinkedList<>();
        for(long n = (long)(Math.sqrt(N)+2); n>0; n--){
            if(n*n>N) continue;
            else if(n*n==N) ans.add(n);
            else if(N%n==0){
                ans.addFirst(n);
                ans.addLast(N/n);
            }
        }
        return ans;
    }
}
public class Main {
    static long check(long N, long K){
        while(N>=K){
            if(N%K==0) N = N/K;
            else N %= K;
        }
        return N;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        /*
        * in mod-K world...
        * if(N%K==0) N = N/K;
        * else N = N; => never change
        *
        * K must be the divisor of N or divisor of N-1.
        * */
        int ans = 0;

        for(long k:MathLib.divisors(N)) if(k>1 && check(N,k)==1) ans++;
        for(long k:MathLib.divisors(N-1)) if(k>1 && (N%k>0) && check(N,k)==1) ans++;
        System.out.println(ans);
    }
}
