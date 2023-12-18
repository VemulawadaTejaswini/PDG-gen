import java.util.*;
import java.lang.*;

class Mod{
    static final long MOD = 1_000_003;
    static final long[] fact = makeFactorialArray(1100000);
    static final long[] factInv = makeInversedArray(fact);

    public static long add(long a, long b){
        long tmp = (a+b)%MOD;
        return tmp>=0 ? tmp : tmp+MOD;
    }
    public static long adds(long... ar){
        long ans=0;
        for(long x:ar) ans = Mod.add(ans, x);
        return ans;
    }
    public static long sub(long a, long b){
        return add(a,-b);
    }
    public static long mult(long a, long b){
        long tmp = (a*b)%MOD;
        return tmp>=0 ? tmp : tmp+MOD;
    }
    public static long mults(long... ar){
        long ans=1;
        for(long x:ar) ans = Mod.mult(ans, x);
        return ans;
    }
    public static long power(long a, long x){ //calculate a^x
        if(x<0)return 0;
        if(x==0)return 1;
        if(x%2==0) {
            long half = power(a,x/2);
            return mult(half,half);
        }
        return (a*power(a,x-1)) % MOD;
    }
    public static long inverse(long a){
        return power(a,MOD-2);
    }
    public static long div(long a, long b){
        return mult(a, inverse(b));
    }
    private static long[] makeFactorialArray(int size){
        long[] array = new long[size];
        array[0]=1;
        for(int i=1;i<size;i++){
            array[i]=mult(array[i-1],i);
        }
        return array;
    }
    private static long[] makeInversedArray(long[] original){
        long[] array = new long[original.length];
        for(int i=0;i<original.length;i++){
            array[i] = inverse(original[i]);
        }
        return array;
    }
    public static long combination(int n, int r){
        if(n<0 || r<0 || n<r) return 0;
        return mult(fact[n], mult(factInv[r],factInv[n-r]));
    }
    public static long fact(long n){
        if(n>=MOD) return 0;
        return fact[(int)n];
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

}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        for(int q=0; q<Q; q++){
            long x = sc.nextLong();
            long d = sc.nextLong();
            long n = sc.nextLong();

            if(d==0){
                System.out.println(Mod.power(x,n));
            }else if(Mod.div(1000003-x, d)<n){//check whether the array have 0
                System.out.println(0);
            }else{
                //  Mults(x, x+d, x+2d,..., x+(n-1)d)
                //= Mults(x/d, x/d+1, ..., x/d+n-1) * d^n
                //= fact(x/d+n-1) / fact(x/d-1) * d^n
                long ans = Mod.mults(Mod.fact(Mod.add(Mod.div(x,d), n-1)),
                                     Mod.inverse(Mod.fact(Mod.sub(Mod.div(x,d),1))),
                                     Mod.power(d,n));

                System.out.println(ans);
            }
        }
    }
}