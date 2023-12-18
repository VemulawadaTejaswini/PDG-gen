
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();

        final List<Integer> count = IntStream.range(0, n)
                .mapToObj(i -> scanner.nextInt())
                .collect(Collectors.groupingBy(k -> k))
                .values().stream()
                .map(List::size).collect(Collectors.toList());

        final List<Integer> numList = count.stream()
                .filter(size -> size > 1)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        if (numList.isEmpty()) {
            System.out.println(count.size());
            return;
        }

        int previous = numList.get(0);
        for (int i = 1; i < numList.size(); i++) {
            final int current = numList.get(i);
            if (previous == -1) {
                previous = current;
            } else if (previous == current) {
                previous = -1;
            } else {
                previous = Math.abs(previous - current) + 1;
            }
        }

        System.out.println(count.size() - (previous == -1 ? 0 : previous - 1));
    }
}
