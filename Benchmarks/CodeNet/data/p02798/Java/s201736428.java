import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        var a = new int[n];
        Arrays.setAll(a, $ -> Integer.parseInt(sc.next()));
        var b = new int[n];
        Arrays.setAll(b, $ -> Integer.parseInt(sc.next()));
        sc.close();

        var x = new int[n];
        int inf = 1000000000;
        int min = inf;
        for (int k = 0; k < 1 << n; k++) {
            for (int i = 0; i < n; i++) {
                if ((k & (1 << i)) == 0) { // Front
                    x[i] = a[i];
                } else {                   // Back
                    x[i] = ~b[i];
                }
            }
            // Normal Bubblesort. 
            // The variable c means the inversion number (= the number of swap-and-flip operations) of the array x.
            int c = bubblesort(x, n);
            // Adjusting Front/Back.
            for (int i = 0; i < n - 1; i++) {
                if (x[i] < 0) {
                    // ~2, 2, 2, ~2 => ~2, ~2, ~2, ~2
                    if (x[i + 1] >= 0 && i + 2 < n) {
                        swapAndFlip(x, i + 1, i + 2);
                        c++;
                    }
                    // ~2, ~2, ~2, ~2 => 2, 2, ~2, ~2
                    swapAndFlip(x, i, i + 1);
                    c++;
                }
            }
            // Making sure the array x is correctly sorted
            if (allPositive(x, n) && isAscending(x, n)) {
                min = Math.min(min, c);
            }
        }
        System.out.println(min == inf ? -1 : min);
    }

    public static int bubblesort(int[] x, int n) {
        int c = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i; j--) {
                int u = x[j - 1] < 0 ? ~x[j - 1] : x[j - 1];
                int v = x[j]     < 0 ? ~x[j]     : x[j]    ;
                if (u > v) {
                    swapAndFlip(x, j - 1, j);
                    c++;
                }
            }
        }
        return c;
    }

    public static void swapAndFlip(int[] x, int i, int j) {
        int tmp = x[i];
        x[i] = ~x[j];
        x[j] = ~tmp;
    }

    public static boolean allPositive(int[] x, int n) {
        for (int i = 0; i < n; i++) {
            if (x[i] < 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAscending(int[] x, int n) {
        for (int i = 0; i < n - 1; i++) {
            if (x[i] > x[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
