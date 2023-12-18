import java.util.Scanner;

class MODnCk {
    private static final int mod = 1000000007;

    private static int[] factorialCache = new int[2000];
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

    static int mul(int a, int b){
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
		int n = stdIn.nextInt();
		int k = stdIn.nextInt();

		for(int i=1; i<=k; i++){
			if(n-k+1 < i){
				System.out.println(0);
			}else{
				System.out.println(MODnCk.mul(MODnCk.nCk(k-1, i-1), MODnCk.nCk(n-k+1, i)));
			}
		}
	}
}
