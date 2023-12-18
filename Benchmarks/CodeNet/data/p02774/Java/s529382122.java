import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            long K = sc.nextLong();
            long[] A = new long[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }

            Arrays.sort(A);

            long max = 1000000000L * 1000000000L;
            long min = -max;
            long mid = 0;

            while (true) {
                long c = count(A, mid);

                //System.out.println(mid + " : " + c + " (" + min + ", " + max + ")");

                if (c < K * 2) {
                    min = mid;
                } else {
                    max = mid;
                }

                long mid2 = (min + max) / 2;
                if (mid == mid2) {
                    while (true) {
                        c = count(A, mid);
                        if (c >= K * 2) {
                            break;
                        }
                        mid++;
                    }
                    break;
                }

                mid = mid2;
            }

            System.out.println(mid);
        }
    }

    static long count(long[] A, long key) {
        int N = A.length;

        long count = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == 0) {
                if (key >= 0) {
                    count += (N - 1);
                }
                continue;
            }

            long target = key / A[i];

            if (key < 0) {
                if (key % A[i] != 0) {
                    if (A[i] < 0) {
                        target += 1;
                    } else {
                        target -= 1;
                    }
                }
            }

            if (A[i] < 0) {
                int c = countLessThan(A, target);
                count += (N - c);
                if (i >= c) {
                    count -= 1;
                }
            } else {
                int c = countLessThan(A, target + 1);
                count += c;
                if (i < c) {
                    count -= 1;
                }
            }
        }

        return count;
    }

    static int countLessThan(long[] array, long key) {
        int low = 0;
        int high = array.length - 1;

        if (array[low] >= key) {
            return 0;
        }

        if (array[high] < key) {
            return array.length;
        }

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

}
