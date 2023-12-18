import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Integer[] a1 = new Integer[n];
        Integer[] a2 = new Integer[n];
        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            a2[i] = sc.nextInt();
        }

        Arrays.sort(a1, Comparator.reverseOrder());

        boolean top = true;
        int candy = 0;
        for (int i = 0; i < n - 1; i++) {
            if (top) {
                candy += a1[i];
                if (a1[i+1] < a2[i]) {
                    top = false;
                    candy += a2[i];
                }
            } else {
                candy += a2[i];
            }
        }
        candy += (top)? a1[n-1] + a2[n-1]: a2[n-1];

        System.out.println(candy);
    }
}