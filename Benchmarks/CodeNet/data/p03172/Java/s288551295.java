import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */
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
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] a = new long[N];
        for(int n=0; n<N; n++) a[n]=sc.nextLong();

        long[][] dp = new long[N][2*K+1];
        //dp[n][k] : 'n' children share 'k' candies
        for(int k=0; k<=a[0]; k++) dp[0][k]=1;

        for(int n=1; n<N; n++){
            //dp[n][k] = dp[n-1][k-a] + dp[n-1][k-a+1] + ... + dp[n-1][k]
            dp[n][0]=1;
            for(int k=1; k<=K; k++){
                if(k-a[n]>0) dp[n][k] = Mod.sub(dp[n][k-1] + dp[n-1][k], dp[n-1][k-1-(int)(a[n])] );
                else dp[n][k] = Mod.add(dp[n][k-1], dp[n-1][k]);
            }

        }


        System.out.println(dp[N-1][K]);



    }
}
