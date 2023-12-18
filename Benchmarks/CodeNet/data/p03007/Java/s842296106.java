import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

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
            List<Integer> numList = Arrays.stream(args.get(1).split(" "))
                    .map(Integer::valueOf)
                    .collect(Collectors.toList());

            PriorityQueue<Integer> pque = new PriorityQueue<>();
            pque.addAll(numList);

            StringBuilder process = new StringBuilder();
            boolean minus = numList.size() % 2 == 1;
            while (pque.size() > 1) {
                Integer min = pque.poll();
                Integer secondMin = pque.poll();
                if (minus) {
                    process.append(String.format("%d %d\n", min, secondMin));
                    pque.add(min - secondMin);
                } else {
                    process.append(String.format("%d %d\n", secondMin, min));
                    pque.add(secondMin - min);
                }
                minus = !minus;
            }

            System.out.println(pque.peek());
            System.out.println(process);
        };
    }

}
