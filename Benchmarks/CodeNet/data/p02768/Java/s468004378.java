import java.util.*;

public class Main {

    static long mod = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int a = sc.nextInt();
        int b = sc.nextInt();
        long all = modPow(2, n)-1;
        long ac = 1, bc = 1;
        for (int i = 0; i < a; i++) {
            ac = ac * (n-i) % mod;
            ac = ac * modPow(i+1, mod - 2) % mod;
        }
        for (int i = 0; i < b; i++) {
            bc = bc * (n-i) % mod;
            bc = bc * modPow(i+1, mod - 2) % mod;
        }
        System.out.println(((all - ac + mod)%mod - bc + mod) % mod);
        sc.close();

    }

    public static long modPow(long base, long exp) {
        long ret = 1;
        while(exp > 0){
            if((exp & 1) == 1){
                ret = ret * base %mod;
            }
            base = base * base %mod;
            exp >>= 1;
        }
        return ret;
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
    public Combination(int size, int mod){
        this.fac = new long[size +1];
        this.inv = new long[size +1];
        this.mod = mod;

        this.fac[0] = 1;
        this.inv[0] = 1;

        for(int i = 1; i <= size; i++){
            fac[i] = (fac[i -1] * i) %mod;
            inv[i] = modPow(fac[i], (int)mod -2) %mod;
        }
    }

    /**
     * n個の中からr個選ぶ組み合わせの数（nCr）をmodで割った余りを算出する
     * @param n 元の集合の要素数
     * @param r 組み合わせる要素数
     * @return nCr % mod
     */
    public long comb(int n, int r){
        return fac[n] * inv[r] %mod * inv[n - r] %mod;
    }

    /**
     * base^exp をmodで割った余りを算出する
     * @param base 基数
     * @param exp 指数
     * @return base^exp % mod
     */
    private long modPow(long base, int exp) {
        long ret = 1;
        while(exp > 0){
            if((exp & 1) == 1){
                ret = ret * base %mod;
            }
            base = base * base %mod;
            exp >>= 1;
        }
        return ret;
    }

}
