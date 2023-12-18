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
    static int divBy2(int n){
        int a=0;
        while(n%2==0){
            n /= 2;
            a++;
        }
        return a;
    }
    static void answer(long n){
        System.out.println(n);
        System.exit(0);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] B = new int[N];
        for(int n=0; n<N; n++) B[n]=sc.nextInt()/2;

        for(int n=1; n<N; n++) if(divBy2(B[0])!=divBy2(B[n])) answer(0);

        long L = B[0];
        for(int n=1; n<N; n++){
            L = MathLib.lcm(L, B[n]);
            if(L>M) answer(0);
        }

        answer(((M/L)+1)/2);

    }

}
