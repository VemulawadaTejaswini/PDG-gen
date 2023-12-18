import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] array = new int[N];
        long sum = 0;

        long maxSum = 0;
        int startIndexOfmaxSum = 0;

        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();

            if (i < K) {
                sum += array[i];
                maxSum += array[i];

            } else {
                sum += array[i];
                sum -= array[i - K];

                if (sum > maxSum) {
                    startIndexOfmaxSum = i - K + 1;
                    maxSum = sum;
                }
            }
        }

        initSumInteger();
        double ans = 0;
        for (int i = startIndexOfmaxSum; i < startIndexOfmaxSum + K; i++) {
            ans += ((double) sumInteger[array[i]] / (double) array[i]);
        }

        System.out.println(ans);
    }

    private static long[] sumInteger = new long[1001];

    private static void initSumInteger() {
        for (int i = 1; i <= 1000; i++) {
            sumInteger[i] = i + sumInteger[i - 1];
        }
    }
}
