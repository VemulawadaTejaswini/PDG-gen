import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static Input in = new Input(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        int N = in.nextInt();
        int K = in.nextInt();
        List<Integer> Ap = new ArrayList<>();
        List<Integer> An = new ArrayList<>();
        for (int n = 0; n < N; n++) {
            int A = in.nextInt();
            if (A >= 0) {
                Ap.add(A);
            } else {
                An.add(-A);
            }
        }

        long ans = 1;
        Ap.sort(Comparator.reverseOrder());
        An.sort(Comparator.reverseOrder());
        if (Ap.size() + An.size() == K) {
            for (int a : Ap) {
                ans *= a;
                ans %= MOD;
            }
            for (int a : An) {
                ans *= -a;
                ans %= MOD;
            }
            ans += MOD;
            ans %= MOD;
        } else if (Ap.isEmpty() && K % 2 == 1) {
            An.sort(Comparator.naturalOrder());
            for (int k = 0; k < K; k++) {
                ans *= -An.get(k);
                ans %= MOD;
            }
            ans += MOD;
            ans %= MOD;
        } else {
            if (K % 2 == 1) {
                ans = Ap.remove(0);
                K--;
            }
            int iap = 0;
            int ian = 0;
            int sizeAp = Ap.size();
            int sizeAn = An.size();
            for (K /= 2; K > 0; K--) {
                long ap = -1;
                if (iap + 1 < sizeAp) {
                    ap = Ap.get(iap);
                    ap *= Ap.get(iap + 1);
                }
                long an = -1;
                if (ian + 1 < sizeAn) {
                    an = An.get(ian);
                    an *= An.get(ian + 1);
                }
                if (ap >= an) {
                    iap += 2;
                    ap %= MOD;
                    ans *= ap;
                } else {
                    ian += 2;
                    an %= MOD;
                    ans *= an;
                }
                ans %= MOD;
            }
        }
        ans %= MOD;
        out.println(ans);

        out.flush();
    }

    static class Input {
        private BufferedReader br;
        private String[] buff;
        private int index = 0;

        Input(InputStream is) {
            br = new BufferedReader(new InputStreamReader(is));
        }
        String nextLine() {
            try {
                return br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        String next() {
            while (buff == null || index >= buff.length) {
                buff = nextLine().split(" ");
                index = 0;
            }
            return buff[index++];
        }
        byte nextByte() {
            return Byte.parseByte(next());
        }
        short nextShort() {
            return Short.parseShort(next());
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        float nextFloat() {
            return Float.parseFloat(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        BigInteger nextBigInteger() {
            return new BigInteger(next());
        }
        BigDecimal nextBigDecimal() {
            return new BigDecimal(next());
        }
    }
}

