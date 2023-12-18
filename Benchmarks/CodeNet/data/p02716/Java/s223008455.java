
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final List<Long> list = IntStream.range(0, n)
                .mapToObj(i -> scanner.nextLong())
                .collect(Collectors.toList());

        if (n % 2 == 0) {
            long sumOfEvens = 0;
            long sumOfOdds = 0;
            for (int i = 0; i < list.size(); i++) {
                if (i % 2 == 0) {
                    sumOfEvens += list.get(i);
                } else {
                    sumOfOdds += list.get(i);
                }
            }
            System.out.println(Math.max(sumOfEvens, sumOfOdds));
            return;
        } else if (n == 3) {
            System.out.println(list.stream().max(Comparator.comparingLong(Long::longValue)).get());
            return;
        }

        final long[][] dpTable = new long[n][3];
        dpTable[0][0] = list.get(0);
        dpTable[1][1] = list.get(1);
        dpTable[2][2] = list.get(2);
        for (int i = 2; i < n; i++) {
            final Long current = list.get(i);
            dpTable[i][0] = dpTable[i - 2][0] + current;
            if (i >= 3) {
                dpTable[i][1] = Math.max(dpTable[i - 2][1], dpTable[i - 3][0]) + current;
            }
            if (i >= 4) {
                dpTable[i][2] = Stream.of(dpTable[i - 2][2], dpTable[i - 3][1], dpTable[i - 4][0]).max(Long::compareTo).get() + current;
            }
        }

        System.out.println(Stream.of(dpTable[n - 1][2], dpTable[n - 2][1], dpTable[n - 3][0]).max(Long::compareTo).get());
    }
}
