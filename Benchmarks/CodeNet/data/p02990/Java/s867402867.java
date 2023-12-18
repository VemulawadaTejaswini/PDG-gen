import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = 1_000_000_007;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int r = n - k + 1;
        int b = k - 1;
        Combination conR = new Combination(r, mod);
        Combination conB = new Combination(b, mod);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= k; i++) {
            long tmp = 0L;
            if (i - 1 <= n - k) {
                tmp = ( conB.comb(b, i - 1) * conR.comb(r, i)) % mod;
            }
            sb.append(tmp).append("\n");
        }
        System.out.println(sb.toString());
        sc.close();

    }

}

class Combination {

    /** factorial:階乗 */
    private long fac[];
    /** inverse:逆元（ここでは、fac[i]をMOD-2乗したものをMODで割った余り） */
    private long inv[];
    /** 除数 */
    private int mod;

    /**
     * コンストラクタ
     * @param size 組み合わせの対象となる個数
     * @param mod 除数
     */
    public Combination(int size, int mod) {
        this.fac = new long[size + 1];
        this.inv = new long[size + 1];
        this.mod = mod;

        this.fac[0] = 1;
        this.inv[0] = 1;

        for (int i = 1; i <= size; i++) {
            fac[i] = (fac[i - 1] * i) % mod;
            inv[i] = modPow(fac[i], (int) mod - 2) % mod;
        }
    }

    /**
     * n個の中からr個選ぶ組み合わせの数（nCr）をmodで割った余りを算出する
     * @param n 元の集合の要素数
     * @param r 組み合わせる要素数
     * @return nCr % mod
     */
    public long comb(int n, int r) {
        return fac[n] * inv[r] % mod * inv[n - r] % mod;
    }

    /**
     * base^exp をmodで割った余りを算出する
     * @param base 基数
     * @param exp 指数
     * @return base^exp % mod
     */
    private long modPow(long base, int exp) {
        long ret = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                ret = ret * base % mod;
            }
            base = base * base % mod;
            exp >>= 1;
        }
        return ret;
    }

}
