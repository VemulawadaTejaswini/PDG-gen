import java.io.*;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();

        int N = fs.nextInt();
        int M = fs.nextInt();
        int K = fs.nextInt();


        BigInteger mm = new BigInteger(String.valueOf(M));

        BigInteger result = BigInteger.ZERO;

        for (int j = 0; j <= K; ++j) {
            BigInteger tmp = mm.multiply(binomial(N - 1, j));
//            System.out.println(tmp);
            tmp = tmp.multiply(mm.subtract(BigInteger.ONE).pow(N - 1 - j));
//            System.out.println(tmp);

            result = result.add(tmp);
        }

        System.out.println(result.mod(new BigInteger(String.valueOf(998244353))));
    }

    static BigInteger binomial(final int N, final int K) {
        BigInteger ret = BigInteger.ONE;
        for (int k = 0; k < K; k++) {
            ret = ret.multiply(BigInteger.valueOf(N-k))
                    .divide(BigInteger.valueOf(k+1));
        }
        return ret;
    }

}
