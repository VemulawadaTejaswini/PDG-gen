import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        String[] a = scanner.nextLine().split(" ");
        int[] array = new int[N];
        long[] sums = new long[N];

        for (int i = 0; i < N; ++i) {
            array[i] = Integer.parseInt(a[i]);
            if (i == 0) {
                sums[i] = array[i];
            } else {
                sums[i] = sums[i - 1] + array[i];
            }
        }

        long min = Long.MAX_VALUE;

        for (int i0 = 0; i0 < N - 2; ++i0) {
            long sum0 = sums[i0];
            for (int i1 = i0 + 1; i1 < N - 1; ++i1) {
                long sum1 = sums[i1] - sums[i0];
                long l;
                long h;
                if (sum0 < sum1) {
                    l = sum0;
                    h = sum1;
                } else {
                    l = sum1;
                    h = sum0;
                }
                for (int i2 = i1 + 1; i2 < N; ++i2) {
                    long sum2 = sums[i2] - sums[i1];
                    long sum3 = sums[N - 1] - sums[i2];
                    long low;
                    long height;
                    if (sum2 < sum3) {
                        low = Math.min(l, sum2);
                        height = Math.max(h, sum3);
                    } else {
                        low = Math.min(l, sum3);
                        height = Math.max(h, sum2);
                    }

                    long diff = height - low;
                    if (diff < min) {
                        min = diff;
                    }
                }
            }
        }

        System.out.println(min);
    }
}