import java.util.Scanner;

public class Main {
    static final int MOD = (int) Math.pow(10, 9) + 7;
    static final boolean TEST = false;// !!!!!!!!!!!!!!!!!!!!!!

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
        int[] A = new int[N], B = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
            B[i] = in.nextInt();
        }
        long ans = 0;
        for (int i = N - 1; i > -1; i--) {
            final int add;
            if (A[i] < B[i]) {
                add = B[i] - A[i];
            } else {
                int amari = A[i] % B[i];
                if (amari == 0) {
                    add = 0;
                } else {
                    add = B[i] - (amari);
                }
            }
            for (int j = 0; j <= i; j++) {
                A[j] += add;
            }
            ans += add;
        }
        // debug(Arrays.toString(A));
        // debug(Arrays.toString(B));
        System.out.println(ans);
    }
}