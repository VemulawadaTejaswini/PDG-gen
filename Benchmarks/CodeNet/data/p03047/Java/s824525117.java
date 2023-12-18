import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Consumer<List<String>> consumer = solve();

    public static void main(String[] args) {
        consumer.accept(readInput());
    }

    private static List<String> readInput() {
        final List<String> lineList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            lineList.add(scanner.nextLine());
        }
        return lineList;
    }

    private static Consumer<List<String>> solve() {
        return args -> {
            List<Integer> numList = Arrays.stream(args.get(0).split(" ")).map(Integer::valueOf).collect(Collectors.toList());
            int n = numList.get(0);
            int k = numList.get(1);
            System.out.println(n - k + 1);
        };
    }

    private static int makeFactorial(int n) {
        return (n == 1) ? 1 : n * makeFactorial(n - 1);
    }

}
