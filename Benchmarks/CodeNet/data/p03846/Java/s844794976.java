import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            if (!isValid(A, N)) {
                System.out.println(0);
                return;
            }

            final long mod = (long) (1e9 + 7);

            long count = 1;
            boolean[] used = new boolean[N];
            for (int i = 0; i < N; i++) {
                if (used[A[i]]) {
                    continue;
                }
                used[A[i]] = true;
                if (A[i] > 0) {
                    count *= 2;
                    count %= mod;
                }
            }

            System.out.println(count);
        }
    }

    private static boolean isValid(int[] A, int N) {
        int[] counts = new int[N];
        for (int i = 0; i < N; i++) {
            counts[A[i]]++;
        }

        if (N % 2 == 1) {
            if (counts[0] != 1) {
                return false;
            }
            for (int i = 1; i < counts.length; i++) {
                if (i % 2 == 0) {
                    if (counts[i] != 2) {
                        return false;
                    }
                } else {
                    if (counts[i] != 0) {
                        return false;
                    }
                }
            }
        } else {
            for (int i = 0; i < counts.length; i++) {
                if (i % 2 == 1) {
                    if (counts[i] != 2) {
                        return false;
                    }
                } else {
                    if (counts[i] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
