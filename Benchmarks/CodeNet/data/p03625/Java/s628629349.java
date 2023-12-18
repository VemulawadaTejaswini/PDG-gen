import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        List<Integer> list = IntStream.range(0, n)
                .map(i -> scanner.nextInt())
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.reducing(0, e -> 1, Integer::sum)))
                .entrySet().stream()
                .flatMapToInt(entry -> IntStream.range(0, entry.getValue() / 2).map(i -> entry.getKey()))
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(list.size() < 2 ? 0 : list.get(0) * list.get(1));
    }
}