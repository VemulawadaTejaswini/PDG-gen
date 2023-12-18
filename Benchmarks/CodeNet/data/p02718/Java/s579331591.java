

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.next());
        int m = Integer.parseInt(scan.next());

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(scan.next());
        }

        scan.close();

        int sum = 0;

        for (int i : a) {
            sum += i;
        }

        double border = (double) sum / (4 * m);

        Arrays.sort(a);

        for (int i = 0; i < m; i++) {
            if (a[n - 1 - i] < border) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

}
