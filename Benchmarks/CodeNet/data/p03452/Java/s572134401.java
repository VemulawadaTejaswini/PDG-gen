import java.util.*;
import java.util.function.Consumer;

import static java.util.stream.Collectors.toList;

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
            final List<List<Integer>> inputLineList =
                    args.stream()
                            .skip(1)
                            .map(line -> Arrays.stream(line.split(" ")).map(Integer::valueOf).collect(toList()))
                            .collect(toList());

            final Map<Integer, Map<Integer, Integer>> dest2Src2Cost = new HashMap<>();
            Boolean flag = true;
            for (List<Integer> line: inputLineList) {
                final Integer left = line.get(0);
                final Integer right = line.get(1);
                final Integer cost = line.get(2);
                if (dest2Src2Cost.containsKey(left)) {
                    if (dest2Src2Cost.get(left).containsKey(right) && !dest2Src2Cost.get(left).get(right).equals(cost)) {
                        flag = false;
                        break;
                    } else {
                        dest2Src2Cost.get(left).put(right, cost);
                        if (dest2Src2Cost.containsKey(right)) {
                            for (Map.Entry<Integer, Integer> entry: dest2Src2Cost.get(right).entrySet()) {
                                dest2Src2Cost.get(left).put(entry.getKey(), cost + entry.getValue());
                            }
                        }
                    }
                } else {
                    dest2Src2Cost.put(left, new HashMap<>());
                    dest2Src2Cost.get(left).put(right, cost);
                    if (dest2Src2Cost.containsKey(right)) {
                        for (Map.Entry<Integer, Integer> entry: dest2Src2Cost.get(right).entrySet()) {
                            dest2Src2Cost.get(left).put(entry.getKey(), cost + entry.getValue());
                        }
                    }
                }
                if (dest2Src2Cost.containsKey(right)) {
                    if (dest2Src2Cost.get(right).containsKey(left) && !dest2Src2Cost.get(right).get(left).equals(cost)) {
                        flag = false;
                        break;
                    } else {
                        dest2Src2Cost.get(right).put(left, cost);
                        if (dest2Src2Cost.containsKey(left)) {
                            for (Map.Entry<Integer, Integer> entry: dest2Src2Cost.get(left).entrySet()) {
                                dest2Src2Cost.get(right).put(entry.getKey(), cost + entry.getValue());
                            }
                        }
                    }
                } else {
                    dest2Src2Cost.put(right, new HashMap<>());
                    dest2Src2Cost.get(right).put(left, cost);
                    if (dest2Src2Cost.containsKey(left)) {
                        for (Map.Entry<Integer, Integer> entry: dest2Src2Cost.get(left).entrySet()) {
                            dest2Src2Cost.get(right).put(entry.getKey(), cost + entry.getValue());
                        }
                    }
                }
            }

            if (flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        };
    }

}
