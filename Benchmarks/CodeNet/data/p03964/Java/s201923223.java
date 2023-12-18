import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] T = new int[N];
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                T[i] = in.nextInt();
                A[i] = in.nextInt();
            }

            long[] T2 = new long[N];
            long[] A2 = new long[N];
            T2[0] = T[0];
            A2[0] = A[0];
            for (int i = 1; i < N; i++) {

                long l = 0;
                long r = (long) 1e15;
                for (; Math.abs(l - r) > 1;) {
                    long c = (l + r) / 2;
                    T2[i] = T[i] * c;
                    A2[i] = A[i] * c;
                    if (isValid(T2, A2, i)) {
                        r = c;
                    } else {
                        l = c;
                    }
                }

                T2[i] = T[i] * r;
                A2[i] = A[i] * r;
            }

            System.out.println(T2[N - 1] + A2[N - 1]);
        }
    }

    private static boolean isValid(long[] T2, long[] A2, int i) {
        return T2[i] >= T2[i - 1] && A2[i] >= A2[i - 1];
    }
}
