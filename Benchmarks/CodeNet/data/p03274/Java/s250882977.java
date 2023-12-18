import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int K = in.nextInt();
            int[] x = new int[N + 1];
            for (int i = 0; i < N; i++) {
                x[i] = in.nextInt();
            }
            x[N] = 0;
            Arrays.sort(x);

            int index0 = 0;
            for (int i = 0; i < N + 1; i++) {
                if (x[i] == 0) {
                    index0 = i;
                    break;
                }
            }

            int start = index0 - K;
            int end = index0 + K;
            int Start = Math.max(0, start);
            int End = Math.min(N, end);

            int min = (int) 1e9;
            if (Start == start) {
                min = Math.min(min, -1 * x[Start]);
            }
            for (int i = Start + 1; i <= index0; i++) {
                if (i + K < x.length) {
                    min = Math.min(min, -2 * x[i] + x[i + K]);
                }
            }
            for (int i = index0; i < End; i++) {
                if (i - K >= 0) {
                    min = Math.min(min, -x[i - K] + 2 * x[i]);
                }
            }
            if (End == end) {
                min = Math.min(min, x[End]);
            }

            System.out.println(min);
        }
    }
}
