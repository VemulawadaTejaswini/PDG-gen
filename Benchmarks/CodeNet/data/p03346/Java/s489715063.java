
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final List<Integer> list = IntStream.range(0, n)
                .mapToObj(i -> scanner.nextInt())
                .collect(Collectors.toList());

        final UnaryOperator<List<Integer>> reverse = tmp -> {
            Collections.reverse(list);
            return list;
        };
        final IntUnaryOperator increment = v -> v + 1;
        final IntUnaryOperator decrement = v -> v - 1;

        final int answer = n - Math.max(count(list, 0, increment), count(reverse.apply(list), n + 1, decrement));
        System.out.println(answer);
    }

    private static int count(final List<Integer> list, final int initialValue, final IntUnaryOperator operator) {
        int current = initialValue;
        int count = 0;
        for (final int p : list) {
            if (p == operator.applyAsInt(current)) {
                count++;
                current = operator.applyAsInt(current);
            }
        }
        return count;
    }
}
