import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int[] h = new int[N];
        for (int i = 0; i < N; i++) h[i] = scanner.nextInt();

        int result = solve(h, N, K);
        System.out.println(result);

        //test();
    }

    private static int solve(int[] h, int N, int K) {
        int bufSize = Math.min(K, N);

        int[] cost = new int[bufSize];
        Arrays.fill(cost, Integer.MAX_VALUE);
        cost[0] = 0;

        for (int i = 0; i <= N-2; i++) {
            int ahead = Math.min(bufSize, N - i - 1);
            int startCost = cost[0];
            for (int k = 0; k < ahead; k++) {
                int candidate = startCost + Math.abs(h[i + k + 1] - h[i]);
                cost[k] = (k + 1 < bufSize) ? Math.min(cost[k+1], candidate): candidate;
            }
        }

        return cost[0];
    }

    private static void test() {
        testCase(new int[] { 10, 30, 40, 50, 20}, 3, 30);
        testCase(new int[] { 10, 20, 10 }, 1,20);
        testCase(new int[] { 10, 10 }, 100,0);
        testCase(new int[] { 40, 10, 20, 70, 80, 10, 20, 70, 80, 60 }, 4,40);
        System.out.println("DONE");
    }

    private static void testCase(int[] h, int K, int expected) {
        int result = solve(h, h.length, K);
        if (result != expected) {
            System.out.println("FAILED " + Arrays.toString(h) + " K=" + K + ", was " + result + " expected " + expected);
        }
    }
}
