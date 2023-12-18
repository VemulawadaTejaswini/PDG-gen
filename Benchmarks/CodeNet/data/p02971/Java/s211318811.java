import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int max = 0;
        int maxSecond = 0;
        int maxNum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (max < a[i]) {
                max = a[i];
            }
            if (maxSecond < a[i] && a[i] < max) {
                maxSecond = a[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (a[i] == max) {
                System.out.println(maxSecond);
            } else {
                System.out.println(max);
            }
        }
    }
}
