import java.util.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long k = s.nextLong();
        int[] perm = new int[n];
        BigInteger[] cost = new BigInteger[n];
        for (int i = 0; i < n; ++i) {
            perm[i] = s.nextInt();
        }
        BigInteger totalScore = BigInteger.valueOf(Long.MIN_VALUE);
        for (int i = 0; i < n; ++i) {
            cost[i] = s.nextBigInteger();
            totalScore = totalScore.min(cost[i]);
        }
        for (int i = 0; i < n; ++i) {
            BigInteger currentScore = BigInteger.ZERO;
            int curPos = i;
            for (long j = 0; j < k; ++j) {
                curPos = perm[curPos] - 1;
                currentScore = currentScore.add(cost[curPos]);
                totalScore = totalScore.max(currentScore);
            }
        }
        System.out.println(totalScore.toString());
    }
}
