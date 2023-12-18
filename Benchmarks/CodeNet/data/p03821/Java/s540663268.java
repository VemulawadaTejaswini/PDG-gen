import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static final int MOD = (int) Math.pow(10, 9) + 7;
    static final boolean TEST = false;

    static void debug(Object... os) {
        if (TEST) {
            StringBuilder sb = new StringBuilder(os.length);
            for (Object o : os)
                sb.append(o);
            System.out.println(sb);
        }
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            do {
                solve(in);
            } while (TEST);
        }
    }

    private static void solve(Scanner in) {
        int N = in.nextInt();
        long[] A = new long[N], B = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
            B[i] = in.nextInt();
        }
        long ans = 0;
        long accum = 0;
        for (int i = N - 1; i > -1; i--) {
            long delta = 0;
            A[i] += (accum % B[i]);
//            A[i] += accum;
            if (A[i] < B[i]) {
                delta = B[i] - A[i];
            } else if (A[i] % B[i] != 0) {
                delta = B[i] - (A[i] % B[i]);
            }
            A[i] += delta;
            accum += delta;
            ans += delta;
        }
//        debug(Arrays.toString(A));
//        debug(Arrays.toString(B));
        System.out.println(ans);
    }
}