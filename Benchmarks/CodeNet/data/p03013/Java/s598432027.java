import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Consumer<List<String>> consumer = solve();

    public static void main(String[] args) {
        List<String> input = readInput();
        int N = Integer.valueOf(input.get(0).split(" ")[0]);
        memo = new long[N + 1];
        Arrays.fill(memo, 0);
        memo[0] = 1;
        input.stream().skip(1).map(Integer::valueOf).forEach(x -> {
            memo[x] = 0;
        });
        System.out.println(rec(N));
    }

    private static List<String> readInput() {
        final List<String> lineList = new ArrayList<>();
        while (scanner.hasNextLine()) {
            lineList.add(scanner.nextLine());
        }
        return lineList;
    }

    private static long[] memo;

    private static long rec(int n) {
        if (n < 0) {
            return 0;
        }
        if (memo[n] >= 0) {
            return memo[n];
        }
        memo[n] = (rec(n - 1) + rec(n - 2)) % 1_000_000_007;
        return memo[n];
    }

}
