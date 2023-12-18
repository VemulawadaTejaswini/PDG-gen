
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int[] array = new int[n + 1];
        int max = -1_000_001;
        int maxIndex = -1;
        int min = 1_000_001;
        int minIndex = -1;
        for (int i = 1; i <= n; i++) {
            final int a = scanner.nextInt();
            array[i] = a;
            if (a > max) {
                max = a;
                maxIndex = i;
            }
            if (a < min) {
                min = a;
                minIndex = i;
            }
        }

        int count = n;
        final List<Pair> operations;
        if (max == min) {
            System.out.println(0);
            return;
        } else if (min > 0 || max >= -min) {
            for (int i = 1; i <= n; i++) {
                array[i] += max;
            }
            int finalized = maxIndex;
            operations = IntStream.rangeClosed(1, n)
                    .mapToObj(i -> new Pair(finalized, i))
                    .collect(Collectors.toList());
            for (int i = 1; i <= n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    array[i + 1] += array[i];
                    count++;
                    operations.add(new Pair(i, i + 1));
                }
            }
        } else {
            for (int i = 1; i <= n; i++) {
                array[i] += min;
            }
            int finalized = minIndex;
            operations = IntStream.rangeClosed(1, n)
                    .mapToObj(i -> new Pair(finalized, i))
                    .collect(Collectors.toList());
            for (int i = n; i > 1; i--) {
                if (array[i - 1] > array[i]) {
                    array[i - 1] += array[i];
                    count++;
                    operations.add(new Pair(i, i - 1));
                }
            }
        }

        System.out.println(count);
        operations.stream()
                .map(Pair::toString)
                .forEach(System.out::println);
    }

    private static class Pair {
        final int addFrom;
        final int addTo;

        Pair(final int addFrom, final int addTo) {
            this.addFrom = addFrom;
            this.addTo = addTo;
        }

        @Override
        public String toString() {
            return addFrom + " " + addTo;
        }
    }
}
