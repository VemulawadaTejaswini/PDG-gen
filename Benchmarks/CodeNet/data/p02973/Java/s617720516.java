
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Long> set = new HashSet<>();
        long[] a = new long[n];
        for (int i = 0; i < n; ++i) {
            long current = scanner.nextLong();
            a[i] = current;
            set.add(current);
        }
        int dup = n - set.size();

        List<Long> numbers = new ArrayList<>();
        for (long num : a) {
            int value = Collections.binarySearch(
                    numbers, num
            );
            if (value >= 0 && value < numbers.size()) {
                ++dup;
                continue;
            }
            int pos = -1 * (value + 1);
         //   System.out.println("pos: " + pos);
            if (pos - 1 >= 0 && numbers.get(pos - 1) < num) {
                numbers.set(pos - 1, num);
            } else {
                numbers.add(pos, num);
            }
           

        }
        System.out.println(numbers.size() + dup);

    }
}
