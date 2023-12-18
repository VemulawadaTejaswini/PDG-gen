import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = Integer.parseInt(scanner.nextLine());
        long[] A = new long[N];
        for (long i = 0; i < N; i++) {
            A[i] = Long.parseLong(scanner.nextLine());
        }

        Arrays.sort(A);
        long sumMin = new Main().resultFromMin(A, N);
        long sumMax = new Main().resultFromMax(A, N);
        System.out.println(Math.max(sumMin, sumMax));
    }

    // start from min.
    public long resultFromMin(long[] A, long N) {
        long sum = 0;
        long left = A[0];
        long right = A[0];
        long minIndex = 1;
        long maxIndex = N - 1;
        for (long i = 1; i < N; i++) {
            if ((((i - 1) / 2) % 2) == 0) {
                // left, right is small.
                if (i % 2 == 0) {
                    // compare with right (second).
                    long nextRight = A[maxIndex];
                    sum += Math.abs(nextRight - right);
                    maxIndex--;
                    right = nextRight;
                } else {
                    // compare with left (first).
                    long nextLeft = A[maxIndex];
                    sum += Math.abs(nextLeft - left);
                    maxIndex--;
                    left = nextLeft;
                }
            } else {
                // left, right is big.
                if (i % 2 == 0) {
                    // compare with right (second).
                    long nextRight = A[minIndex];
                    sum += Math.abs(right - nextRight);
                    minIndex++;
                    right = nextRight;
                } else {
                    // compare with left (first).
                    long nextLeft = A[minIndex];
                    sum += Math.abs(left - nextLeft);
                    minIndex++;
                    left = nextLeft;
                }
            }
        }
        return sum;
    }

    public long resultFromMax(long[] A, long N) {
        long sum = 0;
        long left = A[N - 1];
        long right = A[N - 1];
        long minIndex = 0;
        long maxIndex = N - 2;
        for (long i = 1; i < N; i++) {
            if ((((i - 1) / 2) % 2) == 0) {
                // left, right is big.
                if (i % 2 == 0) {
                    // compare with right (second).
                    long nextRight = A[minIndex];
                    sum += Math.abs(right - nextRight);
                    minIndex++;
                    right = nextRight;
                } else {
                    // compare with left (first).
                    long nextLeft = A[minIndex];
                    sum += Math.abs(left - nextLeft);
                    minIndex++;
                    left = nextLeft;
                }
            } else {
                // left, right is small.
                if (i % 2 == 0) {
                    // compare with right (second).
                    long nextRight = A[maxIndex];
                    sum += Math.abs(nextRight - right);
                    maxIndex--;
                    right = nextRight;
                } else {
                    // compare with left (first).
                    long nextLeft = A[maxIndex];
                    sum += Math.abs(nextLeft - left);
                    maxIndex--;
                    left = nextLeft;
                }
            }
        }
        return sum;
    }
}
