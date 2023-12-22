import java.util.Scanner;

class MOD {
    static final int mod = 1000000007;

    static int add(int a, int b){
        int x = a + b;
        return (x >= mod) ? x - mod : x;
    }

    static int sub(int a, int b){
        int x = a - b;
        return (x < 0) ? x + mod : x;
    }

    static int mul(int a, int b){
        long x = (long)a * (long)b;
        return (int)(x % mod);
    }

    static int div(int a, int b){
        return mul(a, modinv(b));
    }

    static int modinv(int a) {
        int b = mod;
        int u = 1;
        int v = 0;
        while (b != 0) {
            int t = a / b;
            a -= t * b;
            int temp = a; a = b; b = temp; // swap(a, b)
            u -= t * v;
            temp = u; u = v; v = temp; // swap(u, v)
        }
        u %= mod;
        if (u < 0) u += mod;
        return u;
    }
}

class MODnCk {
    private static final int mod = 1000000007;

    private static int[] factorialCache = new int[16000];
    private static int factorialCacheIdx = 0;

    static{
        factorialCache[0] = 1;
    }
    
    static int nCk(int n, int k){
        return div((div(factorial(n), factorial(k))), factorial(n-k));
    }

    private static int factorial(int n){
        if(factorialCacheIdx < n){
            setFactorialCache(factorialCacheIdx+1, n);
        }

        return factorialCache[n];
    }

    private static void setFactorialCache(int s, int e){
        for(int i=s; i<=e; i++){
            factorialCache[i] = mul(factorialCache[i-1], i);
        }
        factorialCacheIdx = e;
    }

    private static int div(int a, int b){
        return mul(a, modinv(b));
    }

    private static int mul(int a, int b){
        long x = (long)a * (long)b;
        return (int)(x % mod);
    }

    private static int modinv(int a) {
        int b = mod;
        int u = 1;
        int v = 0;
        while (b != 0) {
            int t = a / b;
            a -= t * b;
            int temp = a; a = b; b = temp; // swap(a, b)
            u -= t * v;
            temp = u; u = v; v = temp; // swap(u, v)
        }
        u %= mod;
        if (u < 0) u += mod;
        return u;
    }
}

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int s = stdIn.nextInt();

        int maxDigit = s / 3;
        int sum = 0;
        for(int i=1; i<=maxDigit; i++){
            sum = MOD.add(sum, patternOfShowNByK(s, i));
        }
        
        System.out.println(sum);
    }

    static int patternOfShowNByK(int n, int k){
        return MODnCk.nCk(n - 2 * k - 1, k - 1);
    }
}