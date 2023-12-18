
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextLong();
        }
        int dup = (int)(n - Arrays.stream(a).distinct().count());
        List<Long> numbers = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            int value = Collections.binarySearch(
                    numbers, a[i]
            );
            int pos = -1 * (value + 1);
            if (pos - 1 >= 0 && numbers.get(pos - 1) < a[i]) {
                numbers.set(pos - 1, a[i]);
            } else {
                numbers.add(pos, a[i]);
            }

        }
        System.out.println(numbers.size() + dup);

    }
}
