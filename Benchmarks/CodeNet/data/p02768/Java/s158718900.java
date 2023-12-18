import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();

        int mod = 10*9+7;

        int ans = (mod_pow(2, n, mod) - 1 - nCr_mod(n, a, mod) - nCr_mod(n, b, mod)) % mod;
        System.out.println(ans);
    }

    static int mod_pow(int a, int b, int mod) {
        if(b % 2 == 0) {
            return ((int)Math.pow(mod_pow(a,b/2,mod),2)) % mod;
        } else if(b == 1){
            return a % mod;
        } else {
            return ((int)Math.pow(mod_pow(a, b/2, mod),2) * a) % mod;
        }
    }

    static int mod_inverse(int mod, int b) {
        return mod_pow(b, mod-2, mod);
    }

    static int nCr_mod(int n, int r, int mod) {
        int num = 1;
        int den = 1;

        for(int i = 0; i < r; i++) {
            num = (num * (n-i)) % mod;
            den = (den * (i+1)) % mod;
        }

        return (num *mod_inverse(mod, den)) % mod;
    }


}