import java.util.*;

public class Main {

    final static int mod = 1_000_000_007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int all = n*m;
        Combination comb = new Combination(all, mod);
        long com2 = comb.comb(all-2, k-2);
        long[][] sum = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum[i][j] += i + j;
                if(0 < i) sum[i][j] = (sum[i][j] + sum[i-1][j]) %mod;
                if(0 < j) sum[i][j] = (sum[i][j] + sum[i][j-1]) %mod;
                if(0 < i && 0 < j) sum[i][j] = (sum[i][j] - sum[i-1][j-1] + mod) %mod;
            }
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                long dsum = sum[i][j];
                if(0 < i && j < m-1){
                    dsum = (dsum + sum[i][m-1-j]) % mod;
                    dsum = (dsum - sum[0][m-1-j] + mod) % mod;
                    dsum = (dsum - sum[i][0] + mod) % mod;
                }
                ans += dsum *  com2 % mod;
                ans %= mod;
            }
        }

        System.out.println(ans);
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
