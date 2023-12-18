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
            memo = new int[N + 1];
            Arrays.fill(memo, 0);
            Set<Integer> dangerSet = args.stream().skip(1).map(Integer::valueOf).collect(Collectors.toSet());
            System.out.println(rec(N, dangerSet));
        };
    }

    private static int[] memo;

    private static int rec(Integer n, Set<Integer> dangerSet) {
        if (n < 0 || dangerSet.contains(n)) {
            return 0;
        }
        if (n.equals(0)) {
            return 1;
        }
        if (memo[n] > 0) {
            return memo[n];
        }
        memo[n] = (rec(n - 1, dangerSet) + rec(n - 2, dangerSet)) % 1_000_000_007;
        return memo[n];
    }

}
