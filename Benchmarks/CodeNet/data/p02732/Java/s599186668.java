
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        Map<Integer, Integer> numberTimes = new HashMap<>();
        long totalWays = 0;
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
            int times = numberTimes.getOrDefault(a[i], 0);
            numberTimes.put(a[i], times + 1);
        }
        for (Map.Entry<Integer, Integer> numberTime: numberTimes.entrySet()) {
            long currentTimes = numberTime.getValue();
            long currentWays = currentTimes * (currentTimes - 1) / 2;
            totalWays += currentWays;
        }
        for (int i = 0; i < n; ++i) {
            int currentNumber = a[i];
            int currentTimes = numberTimes.get(currentNumber);
            long newWays = totalWays - currentTimes * (currentTimes - 1) / 2 +
                    (currentTimes - 1) * (currentTimes - 2) / 2;
            System.out.println(newWays);
        }
    }
}
