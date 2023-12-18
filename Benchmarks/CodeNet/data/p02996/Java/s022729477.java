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
            List<List<Integer>> numList = args.stream().skip(1)
                    .map(s -> Arrays.stream(s.split(" ")).map(Integer::valueOf).collect(Collectors.toList()))
                    .sorted(Comparator.comparingInt(o -> o.get(1)))
                    .collect(Collectors.toList());
            int curr = 0;
            boolean ans = true;
            for (List<Integer> intPair: numList) {
                int load = intPair.get(0);
                int deadline = intPair.get(1);
                if (curr + load <= deadline) {
                    curr += load;
                } else {
                    ans = false;
                    break;
                }
            }
            System.out.println(ans ? "Yes" : "No");
        };
    }

}
