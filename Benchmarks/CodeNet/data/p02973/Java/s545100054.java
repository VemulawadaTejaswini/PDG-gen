import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            int numColors = 1;
            int[] colorToA = new int[N];
            Arrays.fill(colorToA, -100000);
            colorToA[N - 1 - 0] = A[0];
            for (int i = 1; i < N; i++) {
                int maxAColor = upper_bound(colorToA, A[i] - 1) - 1;
                colorToA[maxAColor] = A[i];
                numColors = Math.max(numColors, Math.abs(N - maxAColor));
            }
            System.out.println(numColors);
        }
    }

    public static final int upper_bound(int[] vs, int v) {
        int n = vs.length;
        if (vs[n - 1] <= v) {
            return n;
        }
        if (vs[0] > v) {
            return 0;
        }
        int l = 0;
        int r = n - 1;
        assert vs[l] <= v;
        assert vs[r] > v;
        for (; l + 1 < r;) {
            int c = (l + r) >>> 1;
            if (vs[c] <= v) {
                l = c;
            } else {
                r = c;
            }
        }
        return r;
    }
}
