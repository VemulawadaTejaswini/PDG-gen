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
            Integer N = Integer.valueOf(args.get(0).split(" ")[0]);
            Integer K = Integer.valueOf(args.get(0).split(" ")[1]);
            boolean[][] edges = new boolean[N + 1][N + 1];
            for (int i = 0; i < N + 1; i++) {
                Arrays.fill(edges[i], false);
            }
            Arrays.fill(edges[1], true);
            edges[1][0] = false;
            edges[1][1] = false;

            int curr = IntStream.range(1, N - 1).sum();
            if (K > curr) {
                System.out.println(-1);
                return;
            }

            int m = N - 1;
            int from = 2;
            int to = from + 1;
            while (curr > K) {
                edges[from][to] = true;
                curr--;
                m++;
                if (to < N) {
                    to++;
                } else {
                    from++;
                    to = from + 1;
                }
            }

            System.out.println(m);
            for (int i = 0; i < N + 1; i++) {
                for (int j = 0; j < N + 1; j++) {
                    if (edges[i][j]) {
                        System.out.printf("%d %d\n", i, j);
                    }
                }
            }
        };
    }

}
