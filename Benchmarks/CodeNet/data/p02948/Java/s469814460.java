
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();

        final List<Pair> pairs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            final int days = scanner.nextInt();
            final int value = scanner.nextInt();
            pairs.add(new Pair(days, value));
        }

        pairs.sort((o1, o2) -> o2.getValue() - o1.getValue());

        final boolean[] checked = new boolean[m];

        int res = 0;
        for (final Pair pair : pairs) {
            int days = pair.getDays() - 1;
            if (check(checked, days)) {
                res += pair.getValue();
            }
        }

        System.out.println(res);
    }

    private static boolean check(final boolean[] array, final int index) {
        if (index >= array.length) {
            return false;
        }

        if (!array[index]) {
            array[index] = true;
            return true;
        }

        return check(array, index + 1);
    }

    static class Pair {
        private final int days;
        private final int value;

        public Pair(final int days, final int value) {
            this.days = days;
            this.value = value;
        }

        public int getDays() {
            return days;
        }

        public int getValue() {
            return value;
        }
    }
}
