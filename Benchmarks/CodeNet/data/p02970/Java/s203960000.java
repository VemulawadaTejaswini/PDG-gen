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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        System.out.println(MathLib.divCeil(N, 2*D+1));
    }
}
