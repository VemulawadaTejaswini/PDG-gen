import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

// D - Dice in Line
// https://atcoder.jp/contests/abc154/tasks/abc154_d
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int K = Integer.parseInt(scanner.next());

        Double[] d = new Double[N];

        for (int i = 0; i < N; i++) {
            int v = Integer.parseInt(scanner.next());
            // サイコロの期待値
            d[i] = (v + 1) / (double) 2;
        }
        scanner.close();

        double maxExpectedValue = 0;

        // K個ずつ確認する
        for (int i = 0; i < N - (K - 1); i++) {
            double expectedValue = 0;
            for (int j = i; j < i + K; j++) {
                expectedValue += d[j];
            }

            if (expectedValue > maxExpectedValue) {
                maxExpectedValue = expectedValue;
            }
        }

        BigDecimal bigDecimal = new BigDecimal(maxExpectedValue);
        bigDecimal = bigDecimal.setScale(12, RoundingMode.HALF_UP);

        System.out.println(bigDecimal.toString());
    }
}
