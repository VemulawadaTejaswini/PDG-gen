import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        if (N%2 == 0) {
            // even
            long sum1 = 0;
            long sum2 = 0;
            for (int i = 0; i < N; i++) {
                if (i%2 == 0) {
                    sum1 += A[i];
                } else {
                    sum2 += A[i];
                }
            }
            System.out.println(Math.max(sum1, sum2));
        } else {
            // odd
            long[] evenSum = new long[N];
            long[] oddSum = new long[N];
            for (int i = 0; i < N; i++) {
                if (i == 0) {
                    evenSum[0] = A[0];
                } else if (i == 1) {
                    oddSum[1] = A[1];
                } else if (i%2 == 0) {
                    evenSum[i] = evenSum[i-2]+A[i];
                } else {
                    oddSum[i] = oddSum[i-2]+A[i];
                }
            }
            long ans = Long.MIN_VALUE;
            for (int i = 1; i < N; i++) {
                long tmp = 0;
                if (i == 1) {
                    tmp = evenSum[N-1]-evenSum[0];
                } else if (i%2 == 0) {
                    tmp += evenSum[i-2];
                    tmp += oddSum[N-2]-oddSum[i-1];
                } else {
                    tmp += evenSum[N-1]-evenSum[i-2];
                    tmp += oddSum[i-2];
                }
                ans = Math.max(tmp, ans);
            }
            System.out.println(ans);
        }
    }
}
