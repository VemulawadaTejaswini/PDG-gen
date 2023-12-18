import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer[] a = new Integer[n];
        long result = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            result += a[i];
        }

        Arrays.sort(a, Collections.reverseOrder());
        for (int i = 0; i < m; i++) {
            int amount = a[0] / 2;
            result -= (a[0] - amount);
            a[0] = amount;
            Arrays.sort(a, Collections.reverseOrder());
        }

        System.out.println(result);
    }
}
