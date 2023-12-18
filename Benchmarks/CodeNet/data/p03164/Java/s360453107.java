import java.util.*;

public class Main {
    private final static int MAX_VALUE = 100*1000;

    private static int solve(int N, int W, int[] w, int[] v) {
        long[] minWeight = new long[MAX_VALUE + 1];
        Arrays.fill(minWeight, Long.MAX_VALUE);
        minWeight[0] = 0;

        for (int k = 0; k < N; k++) {
            for (int value = MAX_VALUE - v[k]; value >= 0; value--) {
                if (minWeight[value] == Long.MAX_VALUE) continue;

                int newValue = value + v[k];
                long newWeight = minWeight[value] + w[k];
                long currentMinWeight = minWeight[newValue];

                if (newWeight < currentMinWeight) minWeight[newValue] = newWeight;
            }
        }

        for (int value = MAX_VALUE; value > 0; value--) {
            if (minWeight[value] <= W) return value;
        }

        return 0;
    }

    public static void main(String[] args) {
        int N, W;
        int[] w;
        int[] v;
        try (Scanner scanner = new Scanner(System.in)) {
            N = scanner.nextInt();
            W = scanner.nextInt();

            w = new int[N];
            v = new int[N];
            for (int i = 0; i < N; i++) {
                w[i] = scanner.nextInt();
                v[i] = scanner.nextInt();
            }
        }

        long result = solve(N, W, w, v);
        System.out.println(result);

        //test();
    }

    private static void test() {
        testCase(3, 8, new int[] {3, 4, 5}, new int[] {30, 50, 60}, 90);
        testCase(1, 1000000000, new int[] { 1000000000 }, new int[] { 10 }, 10);
        testCase(6, 15, new int[] {6,5,6,6,3,7}, new int[] {5,6,4,6,5,2}, 17);

        timingTest(100);

        System.out.println("DONE");
    }

    private static void timingTest(int size) {
        int[] w = new int[size];
        int[] v = new int[size];
        for (int i=0; i < size; i++) {
            w[i] = i*i*i;
            v[i] = Math.max(i*i, 1000);
        }

        long start = System.currentTimeMillis();
        solve(size, 1000000, w, v);
        long elapsed = System.currentTimeMillis() - start;
        System.out.println("timing size=" + size + " elapsed=" + elapsed);
    }

    private static void testCase(int N, int W, int[] w, int[] v, int expected) {
        int result = solve(N, W, w, v);
        if (result != expected) {
            System.out.println("FAILED N=" + N + " W=" + W + " w=" + Arrays.toString(w) + " v=" + Arrays.toString(v)
                    + ", was " + result + " expected " + expected);
        }
    }
}
