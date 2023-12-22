import java.util.*;

public class Main {

    private static final long[] lp = new long[1000000 + 1];
    private static final List<Long> pr = new ArrayList<>();

    static  {
        for (long i = 2; i <= 1000000; ++i) {
            if (lp[(int) i] == 0) {
                lp[(int) i] = i;
                pr.add(i);
            }
            for (int j = 0; j < pr.size() && pr.get(j) <= lp[(int) i] && i*pr.get(j) <= 1000000; ++j) {
                lp[(int) (i * pr.get(j))] = pr.get(j);
            }
        }
    }

    public static void main (String[] args) throws Exception {

        final Scanner in = new Scanner(System.in);
        long N = in.nextLong();

        final long B = (long)Math.sqrt(N) + 1;
        long count = 0;

        for (long prime = 2; prime <= Math.min(B, 1000000); ++prime) {

            if (lp[(int) prime] == prime && (N % prime == 0)) {
                long cnt = 0;
                while (N % prime == 0) {
                    cnt++;
                    N = N/prime;
                }
                long k = 0;
                long term = 1;

                while (cnt >= 0) {
                    if (cnt >= term) {
                        k++;
                        cnt -= term;
                        term++;
                    } else {
                        break;
                    }
                }

                count += k;
            }
        }

        System.out.println(count);

    }
}