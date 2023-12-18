import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        solve();
    }

    static void solve() {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] values = new int[n];
        int sumNegative = 0;
        int sumPositive = 0;
        int posAmount = 0;
        int negAmount = 0;
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        Arrays.sort(values);

        int firstPositive = -1;
        for (int i = 0; i < n; i++) {
            if (values[i] >= 0) {
                if (firstPositive == -1) {
                    firstPositive = i;
                }
                sumPositive += values[i];
                posAmount++;
            } else {
                sumNegative += values[i];
                negAmount++;
            }
        }
        if (negAmount > 0 && posAmount > 0) {
            System.out.println(sumPositive - sumNegative);

            int sum1 = values[firstPositive];
            for (int i = firstPositive - 2; i > -1; i--) {
                System.out.println(sum1 + " " + values[i]);
                sum1 = sum1 - values[i];
            }
            int sum2 = values[firstPositive - 1];
            for (int i = firstPositive + 1; i < n; i++) {
                System.out.println(sum2 + " " + values[i]);
                sum2 = sum2 - values[i];
            }
            System.out.println(sum1 + " " + sum2);
            return;
        }

        if (sumPositive > 0) {
            int sum = values[0];
            for (int i = 1; i < n - 1; i++) {
                sum -= values[i];
            }
            System.out.println(values[n - 1] - sum);
            sum = values[0];
            for (int i = 1; i < n - 1; i++) {
                System.out.println(sum + " " + values[i]);
                sum -= values[i];
            }
            System.out.println(values[n - 1] + " " +  sum);
            return;
        } else {
            for (int i = 0; i < n; i++) {
                values[i] *= -1;
            }
            Arrays.sort(values);
            int sum = values[0];
            for (int i = 1; i < n - 1; i++) {
                sum -= values[i];
            }
            System.out.println(values[n - 1] - sum);
            sum = -values[0];
            for (int i = 1; i < n - 1; i++) {
                System.out.println(sum + " " + -values[i]);
                sum -= -values[i];
            }
            System.out.println(sum + " " + -values[n - 1]);
        }

    }

}
