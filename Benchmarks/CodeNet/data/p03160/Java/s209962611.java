import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] h = new int[N];
        for (int i = 0; i < N; i++) h[i] = scanner.nextInt();

        int result = solve(h, N);
        System.out.println(result);

        //test();
    }

    private static int solve(int[] h, int N) {
        int known = 0;
        int tentativeNext = Integer.MAX_VALUE;

        for (int i = 0; i < N-1; i++) {
            int nextKnown = Math.min(tentativeNext, known + Math.abs(h[i+1] - h[i]));
            if (i + 2 < N) tentativeNext = known + Math.abs(h[i+2] - h[i]);
            known = nextKnown;
        }

        return known;
    }

    private static void test() {
        testCase(new int[] { 10, 20, 30, 40 }, 30);
        testCase(new int[] { 10, 10 }, 0);
        testCase(new int[] { 30, 10, 60, 10, 60, 50 }, 40);
        System.out.println("DONE");
    }

    private static void testCase(int[] h, int expected) {
        int result = solve(h, h.length);
        if (result != expected) {
            System.out.println("FAILED " + Arrays.toString(h) + ", was " + result + " expected " + expected);
        }
    }
}
