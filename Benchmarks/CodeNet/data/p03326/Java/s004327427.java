import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        long[] X = new long[N];
        long[] Y = new long[N];
        long[] Z = new long[N];
        long[] sums = new long[N];

        long[] maxes = new long[M];
        Loop:
        for (int i = 0; i < N; i++) {
            X[i] = Math.abs(scanner.nextLong());
            Y[i] = Math.abs(scanner.nextLong());
            Z[i] = Math.abs(scanner.nextLong());
            sums[i] = X[i] + Y[i] + Z[i];

            for (int m = 0; m < M; m++) {
                if (maxes[m] == 0) {
                    maxes[m] = sums[i];
                    continue Loop;
                }
            }

            int index = 0;
            long min = -1;

            for (int m = 0; m < M; m++) {
                if (min == -1 || maxes[m] < min) {
                    min = maxes[m];
                    index = m;
                }
            }

            maxes[index] = sums[i];
        }

        long ans = 0;
        for (int m = 0; m < M; m++) {
            ans += maxes[m];
        }
        System.out.println(ans);
    }
}
