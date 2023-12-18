import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created on 2017/09/30 21:17.
 */
public class Main {
    /**
     * p/qの分数を通分して返します。
     *
     * @param p 分子
     * @param q 分母
     * @return long[]{分子, 分母}
     */
    static long[] reduce(long p, long q) {
        BigInteger[] res = reduce(new BigInteger(Long.toString(p)), new BigInteger(Long.toString(q)));
        return new long[]{res[0].longValue(), res[1].longValue()};
    }

    /**
     * p/qの分数を通分して返します。
     *
     * @param p 分子
     * @param q 分母
     * @return BigInteger[]{分子, 分母}
     */
    static BigInteger[] reduce(BigInteger p, BigInteger q) {
        BigInteger gcd = p.gcd(q);
        p = p.divide(gcd);
        q = q.divide(gcd);
        return new BigInteger[]{p, q};
    }

    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLong()) {
            long N = sc.nextLong();
            long hAns = -1;
            long nAns = -1;
            long wAns = -1;

            for (long h = 1; hAns == -1 && h <= 3500; h++) {
                for (long n = h; n <= 3500; n++) {
                    long p = 4 * h * n - N * n - N * h;
                    if (p <= 0) {
                        continue;
                    }

                    long q = N * h * n;
                    long[] r = reduce(p, q);
                    if (r[0] == 1) {
                        hAns = h;
                        nAns = n;
                        wAns = r[1];
                        break;
                    }
                }
            }

            System.out.println(hAns + " " + nAns + " " + wAns);
        }
    }
}