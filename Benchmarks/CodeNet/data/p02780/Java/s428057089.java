import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

// D - Dice in Line
// https://atcoder.jp/contests/abc154/tasks/abc154_d
public class Main {

    static class Dice {
        double expectedValue;
        int maxValue;

        Dice(int maxValue) {
            this.maxValue = maxValue;
            this.expectedValue = LongStream.rangeClosed(1, maxValue).sum() / (double) maxValue;
        }

        double getExpectedValue() {
            return expectedValue;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int K = Integer.parseInt(scanner.next());

        List<Dice> dices = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int v = Integer.parseInt(scanner.next());
            dices.add(new Dice(v));
        }
        scanner.close();

        double maxExpectedValue = 0;

        // K個ずつ確認する
        for (int i = 0; i < N - K - 1; i++) {
            double expectedValue = 0;
            for (int j = i; j < i + K; j++) {
                expectedValue += dices.get(j).expectedValue;
            }

            if (expectedValue > maxExpectedValue) {
                maxExpectedValue = expectedValue;
            }
        }

        System.out.println(maxExpectedValue);
    }
}
