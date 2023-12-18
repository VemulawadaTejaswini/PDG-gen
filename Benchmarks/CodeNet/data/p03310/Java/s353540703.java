import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }

        long[] cumSum = new long[N + 1];
        for (int i = 1; i < N + 1; i++) {
            cumSum[i] = cumSum[i - 1] + A[i - 1];
        }

        long ret = Long.MAX_VALUE;

        int leftp = 0;
        int rightp = 2;

        for (int center = 1; center <= N - 3; center++) {
            long leftSum;
            long rightSum;
            long leftmin;
            leftSum = cumSum[leftp + 1] - cumSum[0];
            rightSum = cumSum[center + 1] - cumSum[leftp + 1];
            leftmin = Math.abs(leftSum - rightSum);

            while (true) {
                leftSum = cumSum[leftp + 2] - cumSum[0];
                rightSum = cumSum[center + 1] - cumSum[leftp + 2];
                if (Math.abs(leftSum - rightSum) > leftmin) break;
                leftmin = Math.abs(leftSum - rightSum);
                leftp++;
            }

            long rightmin;
            leftSum = cumSum[rightp + 1] - cumSum[center + 1];
            rightSum = cumSum[N] - cumSum[rightp + 1];
            rightmin = Math.abs(leftSum - rightSum);

            while (rightp + 2 <= N - 1) {
                leftSum = cumSum[rightp + 2] - cumSum[center + 1];
                rightSum = cumSum[N] - cumSum[rightp + 2];
                if (Math.abs(leftSum - rightSum) > rightmin) break;
                rightmin = Math.abs(leftSum - rightSum);
                rightp++;
            }

            long[] data = new long[4];
            data[0] = cumSum[leftp + 1] - cumSum[0];
            data[1] = cumSum[center + 1] - cumSum[leftp + 1];
            data[2] = cumSum[rightp + 1] - cumSum[center + 1];
            data[3] = cumSum[N] - cumSum[rightp + 1];
            Arrays.sort(data);

            ret = Math.min(ret, data[3] - data[0]);
        }

        System.out.println(ret);
    }
}