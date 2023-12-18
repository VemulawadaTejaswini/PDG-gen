import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        Map<Integer, Integer> map = IntStream.range(0, n)
                .map(i -> scanner.nextInt())
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.reducing(0, e -> 1, Integer::sum)));
        System.out.println(map.entrySet().stream()
                .mapToInt(entry -> entry.getValue() + map.getOrDefault(entry.getKey() - 1, 0) + map.getOrDefault(entry.getKey() + 1, 0))
                .max()
                .getAsInt());
    }
}