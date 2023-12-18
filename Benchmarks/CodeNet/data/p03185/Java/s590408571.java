import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        long C = stdIn.nextInt();
        long[] heights = new long[N];

        for (int i = 0; i < N; i++) {
            long h = stdIn.nextLong();
            heights[i] = h;
        }

        System.out.println(solve(heights, C));
    }

    private static long solve(long[] h, long c) {
        long[] w = new long[h.length];

        w[0] = 0;

        for (int i = 1; i < h.length; i++) {
            long min = Long.MAX_VALUE;
            for (int j = 1; j <= i; j++) {
                min = Math.min(min, w[i - j] + (h[i - j] - h[i]) * (h[i - j] - h[i]));
            }

            w[i] = min + c;
        }

        return w[w.length - 1];
    }
}