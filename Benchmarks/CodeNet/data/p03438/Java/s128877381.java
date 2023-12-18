import java.util.stream.*;
import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt(), i = 1, sum = 0;
        int[] a = IntStream.range(0, n).map(k -> scanner.nextInt()).toArray();
        for (int k = 0; k < n; k++) {
            int b = scanner.nextInt();
            sum += b - a[k];
            if (a[k] < b)
                i += b - a[k];
        }
        System.out.println(i / 2 <= sum ? "Yes" : "No");
    }
}