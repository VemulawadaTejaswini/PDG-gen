import java.util.*;

public class Main {
    static long[] fact;
    static long[] revFact;
    static long mod = (long) Math.pow(10, 9) + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        // 素因数分解
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 2; i < Math.sqrt(M) + 2; i++) {
            while (M % i == 0) {
                if (map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }

                M /= i;
            }
        }

        if (M > 1) {
            map.put(M, 1);
        }

        // 階乗とその逆元を求める
        fact = new long[(int) Math.pow(10, 7)];
        revFact = new long[(int) Math.pow(10, 7)];
        setFact();

        // answer
        long ret = 1;
        for (int b : map.values()) {
            ret *= select(N - 1 + b, b);
            ret %= mod;
        }

        System.out.println(ret);
    }

    static long select(int a, int b) {
        return (((fact[a] * revFact[b]) % mod) * revFact[a - b]) % mod;
    }

    static void setFact() {
        fact[0] = 1;
        for (int i = 1; i < (long) Math.pow(10, 7); i++) {
            fact[i] = fact[i - 1] * i;
            fact[i] %= mod;
        }

        revFact[(int) Math.pow(10, 7) - 1] = powmod(fact[(int) Math.pow(10, 7) - 1], mod - 2);
        for (int i = (int) Math.pow(10, 7) - 2; i >= 0; i--) {
            revFact[i] = revFact[i + 1] * (i + 1);
            revFact[i] %= mod;
        }
    }

    static long powmod(long a, long p) {
        long ans = 1;
        long mul = a;

        for (; p > 0; p >>= 1, mul = (mul * mul) % mod) {
            if ((p & 1) == 1) ans = (ans * mul) % mod;
        }

        return ans;
    }
}