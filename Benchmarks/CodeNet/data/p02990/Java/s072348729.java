import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    private int redNum;
    private int blueNum;
    private static long MOD = (long)(Math.pow(10,9) + 7);

    private void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        redNum = N - K;
        blueNum = K;

        for (int i = 1; i <= K; i++) {
            double count = calcCount(i);
            System.out.println((int)(count));
        }
    }

    private long calcCount(int i) {
        long posCntToPlaceBlue = calcNumOfCombination(redNum + 1, i);
        long splitCntOfBlue = calcNumOfCombination(blueNum - 1, i - 1);
        long ansCount = posCntToPlaceBlue * splitCntOfBlue % MOD;
        return ansCount;
    }

    // 計算結果をmodしても、先にmodしてから計算しても、結果は同じ。
    private long calcNumOfCombination(int n, int r) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= r; i++) {
            result = result.multiply(BigInteger.valueOf(n - (i - 1))).divide(BigInteger.valueOf(i));
        }
        return result.mod(BigInteger.valueOf(MOD)).longValue();
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}