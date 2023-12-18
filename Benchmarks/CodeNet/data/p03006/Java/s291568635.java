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
            int N = Integer.valueOf(args.get(0).split(" ")[0]);
            if (N == 1) {
                System.out.println(1);
                return;
            }

            List<List<Long>> xyList = args.stream().skip(1)
                    .map(x -> Arrays.stream(x.split(" "))
                            .map(Long::valueOf)
                            .collect(Collectors.toList()))
                    .collect(Collectors.toList());

            Map<String, Integer> keyToCnt = new HashMap<>();
            for (int i = 0; i < xyList.size(); i++) {
                for (int j = 0; j < xyList.size(); j++) {
                    if (i == j) continue;
                    Long xd = xyList.get(i).get(0) - xyList.get(j).get(0);
                    Long yd = xyList.get(i).get(1) - xyList.get(j).get(1);
                    String key = String.format("%d:%d", xd, yd);
                    keyToCnt.put(key, keyToCnt.getOrDefault(key, 0) + 1);
                }
            }

            int max = keyToCnt.values().stream().mapToInt(Integer::intValue).max().getAsInt();
            System.out.println(N - max);
        };
    }

}
