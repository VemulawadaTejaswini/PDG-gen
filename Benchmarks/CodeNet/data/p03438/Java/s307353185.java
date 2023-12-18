import java.util.stream.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int i = 0, j = 0;
        int[] a = IntStream.range(0, n).map(k -> scanner.nextInt()).toArray();
        for (int k = 0; k < n; k++) {
            a[k] -= scanner.nextInt();
            if (a[k] < 0) {
                i -= a[k];
            } else {
                j += a[k];
            }
        }
        System.out.println(j < 2 * i ? "Yes" : "No");
    }
}