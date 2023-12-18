import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug != false) {
            return;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        long S;

        HashSet<Long> checkset = new HashSet<>();
        try (Scanner sc = new Scanner(System.in)) {
            S = sc.nextLong();
        }
        final long MAX = 1000000000L;
        long X1 = 1000000000L;
        long Y1 = 0L;
        long X2 = 0L;
        long Y2 = 1000000000L;

        long tempx = X1 * 2;
        long tempy = Y2 * 2;
        long delta = 1000000000L;

        while (true) {
            if ((X1 - 1) * (Y2 - 1) < S && S <= X1 * Y2) {
                break;
            }

            if (S < X1 * Y2) {
                X1 = X1 - delta;
                Y2 = Y2 - delta;
            } else {
                X1 = X1 + delta;
                Y2 = Y2 + delta;
            }
            delta = (delta / 2) + 1;
        }
        long target = (X1 * Y2) - S;
        if (target > 1) {
            long test = printPrimeNumbers2((int) target, target);
            Y1 = test;
            X2 = target / test;

        } else if (target == 1) {
            Y1 = 1;
            X2 = 1;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("0 0 ").append(X1).append(" ").append(Y1).append(" ");
        sb.append(X2).append(" ").append(Y2);
        System.out.println(sb.toString());
        return;
    }

    static private long calTri(long x1, long y1, long x2, long y2) {
        long res = (x1 * y2) - (x2 * y1);
        return Math.abs(res);
    }

    static long printPrimeNumbers2(int maxNumber, long target) {

        // ステップ1：「2から上限値までの整数」を探索リストに入れる。
        boolean[] targetNumbers = new boolean[maxNumber + 1];
        Arrays.fill(targetNumbers, true);
        targetNumbers[0] = false;
        targetNumbers[1] = false;

        int sqrt = (int) Math.sqrt(maxNumber);

        // ステップ3：探索リストの先頭の値が、引数の平方根に達するまでふるい落とし操作を続ける。
        for (int i = 2; i <= sqrt; i++) {
            // ステップ2：探索リストの先頭の数を素数とし、その倍数を探索リストから篩い落とす。
            // ※この時、既に篩い落とされた数（false）は除外する。
            int firstNum = i;
            if (targetNumbers[i]) {
                for (int j = i * firstNum; j < targetNumbers.length; j += firstNum) {
                    targetNumbers[j] = false;
                }
            }
        }

        // ステップ4：探索リストに残った値を素数リストに移して処理終了。
        for (int i = 2; i < targetNumbers.length; i++) {
            if (targetNumbers[i]) {
                if (target % i == 0)
                    return (long) i;
            }
        }
        return -1;
    }
}
