import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long cash = 1000;
        long stocks = 0;

        int[] future = new int[n];
        for (int i = 0; i < n; i++) {
            future[i] = sc.nextInt();
        }

        int currentDay = 1;
        boolean isBuy = true;
        int next;
        while (currentDay <= n && (next = nextDay(future, currentDay, isBuy)) != -1) {
            int price = future[next - 1];

            if (isBuy) {
                long number = cash / price;
                cash -= price * number;
                stocks += number;
            } else {
                cash += price * stocks;
                stocks = 0;
            }

            isBuy = !isBuy;
            currentDay = next + 1;
        }

        System.out.println(cash);
    }

    private static int nextDay(int[] future, int currentDay, boolean isBuy) {
        int current = future[currentDay - 1];
        int nextDay = currentDay;

        for (int i = currentDay; i < future.length; i++) {
            int next = future[i];
            if (isBuy) {
                if (current >= next) {
                    current = next;
                    nextDay = i + 1;
                } else {
                    break;
                }
            } else {
                if (current <= next) {
                    current = next;
                    nextDay = i + 1;
                } else {
                    break;
                }
            }
        }

        if (isBuy && nextDay == future.length) return -1;
        else return nextDay;
    }
}
