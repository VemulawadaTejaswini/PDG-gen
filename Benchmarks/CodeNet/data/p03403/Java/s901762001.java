import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            new Main().solve(sc);
        }
    }

    void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] as = new int[n];
        int max = -5001;
        int secondMax = -5001;
        int min = 5001;
        int secondMin = 5001;
        for (int i = 0; i < n; i++) {
            as[i] = sc.nextInt();

            if (as[i] > max) {
                secondMax = max;
                max = as[i];
            } else {
                secondMax = Math.max(secondMax, as[i]);
            }

            if (as[i] < min) {
                secondMin = min;
                min = as[i];
            } else {
                secondMin = Math.min(secondMin, as[i]);
            }
        }

        for (int i = 0; i < n; i++) {
            if (as[i] == max) {
                System.out.println(2 * Math.abs(Math.max(0,secondMax) - Math.min(0, min)));
            } else if (as[i] == min) {
                System.out.println(2 * Math.abs(Math.max(0, max) - Math.min(0, secondMin)));
            } else {
                System.out.println(2 * Math.abs(Math.max(0, max) - Math.min(0, min)));
            }
        }
    }
}
