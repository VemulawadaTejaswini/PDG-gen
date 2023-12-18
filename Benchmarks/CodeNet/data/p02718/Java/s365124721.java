import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();
        final int m = sc.nextInt();

        final Integer[] a = new Integer[n];
        int points = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            points += a[i];
        }

        Arrays.sort(a, Comparator.reverseOrder());

        if (a[m-1] * 4 * m >= points) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
