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

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();

        int ten_hat_n = 1;
        for(int i=0; i<n; i++)
            ten_hat_n = MOD.mul(ten_hat_n, 10);

        int nine_hat_n = 1;
        for(int i=0; i<n; i++)
            nine_hat_n = MOD.mul(nine_hat_n, 9);

        int eight_hat_n = 1;
        for(int i=0; i<n; i++)
            eight_hat_n = MOD.mul(eight_hat_n, 8);

        int ans = 0;
        ans = MOD.add(ans, ten_hat_n);
        ans = MOD.sub(ans, nine_hat_n);
        ans = MOD.sub(ans, nine_hat_n);
        ans = MOD.add(ans, eight_hat_n);
        
        System.out.println(ans);
    }
}