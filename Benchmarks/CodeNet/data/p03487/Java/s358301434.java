import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(IntStream.range(0, scanner.nextInt())
                .boxed()
                .collect(Collectors.groupingBy(i -> scanner.nextInt(), Collectors.reducing(0, i -> 1, Integer::sum)))
                .entrySet().stream()
                .mapToInt(value -> value.getKey() > value.getValue() ? value.getValue() : value.getValue() - value.getKey())
                .sum());
    }
}