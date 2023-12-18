
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Long> a = new HashSet<>();
        for (int i = 0; i < n; ++i) {
            a.add(scanner.nextLong());
        }
        int dup = n - a.size();

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
            if (pos - 1 >= 0 && numbers.get(pos - 1) < num) {
                numbers.set(pos - 1, num);
            } else {
                numbers.add(pos, num);
            }

        }
        System.out.println(numbers.size() + dup);

    }
}
