import java.util.*;
public class Main {
    static int mod = 1000000007;
    static long modpow(long a, int p) {
        if (p == 0) return 1;
        if (p % 2 == 0) {
            int halfP = p / 2;
            long half = modpow(a, halfP);
            return half * half % mod;
        } else {
            return a * modpow(a, p - 1) % mod;
        }
    }
    static long calcComb(int a, int b) {
        if (b > a - b) return calcComb(a, a - b);
        long ansMul = 1;
        long ansDiv = 1;
        for (int i = 0; i < b; i++) {
            ansMul *= (a - i);
            ansDiv *= (i + 1);
            ansMul %= mod;
            ansDiv %= mod;
        }
        long ans = ansMul * modpow(ansDiv, mod - 2) % mod;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        sc.close();
        int MNokori = M;
        long ans = 1;
        for (int i = 2; i * i <= MNokori; i++) {
            if (MNokori % i == 0) {
                int cnt = 0;
                while (MNokori % i == 0) {
                    cnt++;
                    MNokori /= i;
                }
                ans *= calcComb(N + cnt - 1, N - 1);
                ans %= mod;
            }
        }
        if (MNokori != 1) {
            ans *= calcComb(N + 1 - 1, N - 1); 
            ans %= mod;
        }
        System.out.println(ans);
    }
}