import java.util.*;
import java.io.*;

class Mod{
    static final int MOD = 1000_000_007;
    static final long[] fact = makeFactorialArray(1000000);
    static final long[] factInv = makeInversedArray(fact);

    public static long add(long a, long b){
        long tmp = (a+b)%MOD;
        return tmp>=0 ? tmp : tmp+MOD;
    }
    public static long sub(long a, long b){
        return add(a,-b);
    }
    public static long mult(long a, long b){
        long tmp = (a*b)%MOD;
        return tmp>=0 ? tmp : tmp+MOD;
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
    public static long[] makeFactorialArray(int size){
        long[] array = new long[size];
        array[0]=1;
        for(int i=1;i<size;i++){
            array[i]=mult(array[i-1],i);
        }
        return array;
    }
    public static long[] makeInversedArray(long[] original){
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
        String K = sc.next();
        int N = K.length();
        int D = sc.nextInt();
        int[] digit = new int[N];
        for(int n=0; n<N; n++) digit[n] = K.charAt(n)-'0';

        long[][] just = new long[N][D];
        long[][] less = new long[N][D];

        for(int firstDig=0; firstDig<digit[0]; firstDig++) less[0][firstDig%D]++;
        just[0][digit[0]%D]++;

        for(int n=1; n<N; n++){
            for(int d=0; d<D;d++)for(int dig=0; dig<10; dig++) less[n][d] = Mod.add(less[n][d], less[n-1][(100*D+d-dig)%D]);
            for(int d=0; d<D;d++)for(int dig=0; dig<digit[n]; dig++) less[n][d] = Mod.add(less[n][d], just[n-1][(100*D+d-dig)%D]);
            for(int d=0; d<D;d++) just[n][d] = just[n-1][(100*D+d-digit[n])%D];
        }

        System.out.println(just[N-1][0] + less[N-1][0] - 1);


    }
}