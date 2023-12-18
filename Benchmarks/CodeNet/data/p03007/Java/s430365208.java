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

            boolean isMaxMinus = numList.stream()
                    .sorted(Comparator.comparingInt(i -> -Math.abs(i)))
                    .collect(Collectors.toList()).get(0) < 0;
            PriorityQueue<Integer> pque = new PriorityQueue<>(Comparator.comparingInt(Math::abs));
            pque.addAll(numList);

            StringBuilder process = new StringBuilder();
            while (pque.size() > 2) {
                Integer min = pque.poll();
                Integer secondMin = pque.poll();
                if (isMaxMinus) {
                    if (min - secondMin < secondMin - min) {
                        process.append(String.format("%d %d\n", secondMin, min));
                        pque.add(secondMin - min);
                    } else {
                        process.append(String.format("%d %d\n", min, secondMin));
                        pque.add(min - secondMin);
                    }
                } else {
                    if (min - secondMin < secondMin - min) {
                        process.append(String.format("%d %d\n", min, secondMin));
                        pque.add(min - secondMin);
                    } else {
                        process.append(String.format("%d %d\n", secondMin, min));
                        pque.add(secondMin - min);
                    }
                }
            }

            int ans = 0;
            Integer min = pque.poll();
            Integer secondMin = pque.poll();
            if (min - secondMin < secondMin - min) {
                process.append(String.format("%d %d\n", secondMin, min));
                ans = secondMin - min;
            } else {
                process.append(String.format("%d %d\n", min, secondMin));
                ans = min - secondMin;
            }

            System.out.println(ans);
            System.out.println(process);
        };
    }

}
