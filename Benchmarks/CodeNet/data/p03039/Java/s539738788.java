import java.util.*;

public class Main {
    static int N;
    static int M;
    static int K;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();
        preCalcFactorials(N*M);
        int ans = h(N,M);
        // System.out.println(ans);
        ans = modProd(ans, invMod(N*M, MOD), MOD);
        ans = modProd(ans, invMod(N*M-1, MOD), MOD);
        // System.out.println(ans);
        //ans = E(pairwize)
        int combOfAllPairs = combMod(K, 2);
        // System.out.println(combOfAllPairs);
        ans = modProd(ans, combOfAllPairs, MOD);
        // System.out.println(ans);
        int combOfAllConfigs = combMod(N*M, K);
        // System.out.println(combOfAllConfigs);
        ans = modProd(ans, combOfAllConfigs, MOD);
        System.out.println(ans);

    }
    static int f(int i,int n) {
        int ans = ((i+1) * i + (n-i)*(n-i-1))/2;
        // System.out.println(ans);
        return ans%MOD;
    }
    static int g(int i, int j, int x, int y) {
        int ans = x * f(j,y) + y * f(i, x);
        // System.out.println(ans);

        return ans%MOD;
    }
    static int h(int x, int y) {
        int ans = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                ans += g(i,j,x,y);
                ans %= MOD;
            }
        }
        return ans;
    }
    
    //Copy & paste below codes
    public static final int MOD = 1_000_000_007;
    public static int[] fact;
    public static int[] invfact;

    /**
     * 
     * @param n Calculate factorials/inverse factorials for x = [0,n]
     */
    public static void preCalcFactorials(int n) {
        fact = new int[n + 1];
        invfact = new int[n + 1];
        fact[0] = 1;
        invfact[0] = 1;
        for (int i = 1; i < n + 1; i++) {
            fact[i] = modProd(i, fact[i-1], MOD);
            int inv = invMod(i, MOD);
            invfact[i] = modProd(inv, invfact[i-1], MOD);
        }
    }

    /**
     * preCalcFactorials() should be executed beforehand.
     * Calculate nCm modulo to global MOD.
     * @param n
     * @param m
     * @return
     */
    public static int combMod(int n, int m) {
        int ans = modProd(fact[n], invfact[n-m], MOD);
        ans = modProd(ans, invfact[m], MOD);
        return ans;
    }
    /**
     * Calculate a product of 2 integers modulo to mod
     * @param x
     * @param y
     * @param mod modulo
     * @return
     */
    public static int modProd(int x, int y, int mod) {
        long ans = ((long) x) * ((long) y); //prevent overflow
        ans %= mod;
        return (int) ans;
    }
    /**
     * Calculate a power of integer modulo to mod
     * @param x
     * @param pow
     * @param mod
     * @return
     */
    public static int modPow(int x, int pow, int mod) {
        if (pow == 0) return 1;
        int y = modProd(x,x,mod);
        int ans; 
        if (pow % 2 == 1) {
            ans = x;
        } else {
            ans = 1;
        }
        ans = modProd(ans, modPow(y, pow/2, mod), mod);
        return ans;
    }
    /**
     * Calculate a inverse of an integer modulo to mod, using Fermat's Theorem.
     * Assuming mod is a prime number.
     * @param x
     * @param mod
     * @return
     */
    public static int invMod(int x, int mod) {
        return modPow(x, mod - 2, mod);
    }

}
