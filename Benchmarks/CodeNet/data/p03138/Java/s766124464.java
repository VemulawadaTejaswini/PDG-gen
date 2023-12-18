import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            long K = in.nextLong();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextLong();
            }

            long[] count = new long[64];
            for (int i = 0; i < N; i++) {
                for (int shift = 0; shift < 64; shift++) {
                    long mask = 1L << shift;
                    count[shift] += (A[i] & mask) == 0 ? 0 : 1;
                }
            }
//            Utils.debug(count);

            long sum = 0L;
            long k = 0L;
//            Utils.debug("k, sum", k, sum);
            for (int shift = 62; shift >= 0; shift--) {
                long mask = 1L << shift;
                if (mask > K) {
//                    Utils.debug("con", shift, "k, sum", k, sum);
                    continue;
                }

                if (k + mask <= K && N - count[shift] > count[shift]) {
                    sum += (N - count[shift]) * mask;
                    k += mask;
                } else {
                    sum += count[shift] * mask;
                    k += 0;
                }
//                Utils.debug(shift, "k, sum", k, sum);
            }

            System.out.println(sum);
        }
    }

}
