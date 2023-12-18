

import java.util.Scanner;

public class Main {

    public static long cal(long a, long b, long c, long d) {
        return Math.abs(Math.max(a, Math.max(b, Math.max(c, d))) -
                Math.min(a, Math.min(b, Math.min(c, d)))
        );
    }

    public static void main(String [] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int [] number = new int[n];
        final long [] sum = new long [n];
        for (int i = 0; i < n; ++i) {
            number[i] = sc.nextInt();
            if (i == 0) {
                sum[i] = number[i];
            } else {
                sum[i] = sum[i - 1] + number[i];
            }
        }

        int left = 0;
        long sum1 = number[0];
        long sum2 = number[1];
        long leftSumDiff = Math.abs(sum1 - sum2);
        int right = 2;
        long rightSumDiff = sum[n - 1];
        long sum3 = 0;
        long result = sum[n - 1];
        for (int i = 2; i < n; ++i) {
            sum3 = sum[i] - sum[1];
            long sum4 = sum[n - 1] - sum[i];
            if (rightSumDiff > Math.abs(sum3 - sum4)) {
                right = i;
                rightSumDiff = Math.abs(sum3 - sum4);
                result = cal(sum1, sum2, sum3, sum4);
            }
        }

        for (int mid = 2; mid < n - 1; ++mid) {
            // if move left
            leftSumDiff = Math.abs(
                    (sum[mid] - sum[left]) - sum[left]
            );
            long leftAvg = sum[mid] / 2;
            int currentLeft = left;
            while (currentLeft < mid && sum[currentLeft] < leftAvg) {
                long currentLeftSumDiff = Math.abs(
                        sum[currentLeft] - (sum[mid]- sum[currentLeft])
                );
                if (currentLeftSumDiff <= leftSumDiff) {
                    leftSumDiff = currentLeftSumDiff;
                    left = currentLeft;
                }
                ++currentLeft;
            }
            long currentLeftSumDiff = Math.abs(
                    sum[currentLeft] - (sum[mid]- sum[currentLeft])
            );
            if (currentLeftSumDiff <= leftSumDiff) {
                leftSumDiff = currentLeftSumDiff;
                left = currentLeft;
            }

            // if move right
            long rightAvg = (sum[n - 1] - sum[mid]) / 2;
            rightSumDiff = Math.abs(
                    sum[right] - sum[mid] - (sum[n - 1] - sum[right])
            );

            int currentRight = right;
            while (currentRight < n && (sum[currentRight] - sum[mid]) < rightAvg) {
                long currentRightSumDiff = Math.abs(
                        (sum[currentRight] - sum[mid]) - (sum[n - 1]- sum[currentRight])
                );
                if (currentRightSumDiff <= rightSumDiff) {
                    rightSumDiff = currentRightSumDiff;
                    right = currentRight;
                }
                ++currentRight;
            }
            long currentRightSumDiff = Math.abs(
                    (sum[currentRight] - sum[mid]) - (sum[n - 1]- sum[currentRight])
            );
            if (currentRightSumDiff <= rightSumDiff) {
                rightSumDiff = currentRightSumDiff;
                right = currentRight;
            }
            sum1 = sum[left];
            sum2 = sum[mid] - sum[left];
            sum3 = sum[right] - sum[mid];
            long sum4 = sum[n - 1] - sum[right];
            long currentResult = cal(sum1, sum2, sum3, sum4);
            result = Math.min(result, currentResult);

        }
        System.out.println(result);

    }
}
