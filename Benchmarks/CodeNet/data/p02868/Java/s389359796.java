import java.util.Arrays;
import java.util.Scanner;

/**
 * Counting of Trees
 */
public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            LRC[] lrcs = new LRC[M];
            for (int i = 0; i < M; i++) {
                LRC lrc = new LRC();
                lrc.L = sc.nextInt() - 1;
                lrc.R = sc.nextInt() - 1;
                lrc.C = sc.nextLong();
                lrcs[i] = lrc;
            }

            Arrays.sort(lrcs, (o1, o2) -> {
                int compare = Integer.compare(o1.L, o2.L);
                if (compare != 0) {
                    return compare;
                }
                return Long.compare(o1.C, o2.C);
            });

            long[] d = new long[N];
            for (int i = 1; i < N; i++) {
                d[i] = Long.MAX_VALUE;
            }

            for (LRC lrc : lrcs) {
                int L = lrc.L;
                int R = lrc.R;
                long C = lrc.C;

                if (d[L] == Long.MAX_VALUE) {
                    break;
                }

                for (int i = R; i >= L + 1; i--) {
                    if (d[i] < d[L] + C) {
                        break;
                    }
                    d[i] = d[L] + C;
                }
            }

            long ans = d[N - 1];
            if (ans == Long.MAX_VALUE) {
                ans = -1;
            }

            System.out.println(ans);
        }
    }

    static class LRC {

        int L;

        int R;

        long C;

    }

}
