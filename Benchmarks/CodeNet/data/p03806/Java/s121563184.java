import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

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

    static Consumer<List<String>> solve() {
        return args -> {
            int N = Integer.parseInt(args.get(0).split(" ")[0]);
            int A = Integer.parseInt(args.get(0).split(" ")[1]);
            int B = Integer.parseInt(args.get(0).split(" ")[2]);
            int[][] items = new int[N][3];
            for (int i = 0; i < N; i++) {
                items[i] = Arrays.stream(args.get(1 + i).split(" "))
                        .mapToInt(Integer::parseInt).toArray();
            }

            int[][][] dp = new int[N + 1][401][401];
            for (int[][] a : dp) {
                for (int[] b : a) {
                    Arrays.fill(b, Integer.MAX_VALUE / 2);
                }
            }
            dp[0][0][0] = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 1; i <= N; i++) {
                for (int a = 1; a < 401; a++) {
                    for (int b = 1; b < 401; b++) {
                        if (a >= items[i - 1][0] && b >= items[i - 1][1]) {
                            dp[i][a][b] = Math.min(
                                    dp[i - 1][a][b],
                                    dp[i - 1][a - items[i - 1][0]][b - items[i - 1][1]] + items[i - 1][2]);
                        } else {
                            dp[i][a][b] = dp[i - 1][a][b];
                        }
                        if (A * b == B * a) {
                            min = Math.min(min, dp[i][a][b]);
                        }
                    }
                }
            }

            System.out.println(min == Integer.MAX_VALUE / 2 ? -1 : min);
        };
    }
}