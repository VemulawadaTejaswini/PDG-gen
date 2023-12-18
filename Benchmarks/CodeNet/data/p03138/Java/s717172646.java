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

            long m = 0;
            for (long i = 0; i < K; i++) {
                m = Math.max(m, f(A, i));
            }

            long sum = 0;
            for (long i = 1; i < K; i <<= 1) {
                long max = 0;
                max = Math.max(max, f(A, i, 0));
                max = Math.max(max, f(A, i, i));
                sum += max;
            }


            System.out.println(sum);
        }
    }

    private static long f(long[] a, long mask, long x) {
        long f = 0;
        for (int i = 0; i < a.length; i++) {
            f += (a[i] ^ x) & mask;
        }
        return f;
    }

    private static long f(long[] a, long x) {
        long f = 0;
        for (int i = 0; i < a.length; i++) {
            f += a[i] ^ x;
        }
        return f;
    }

}
