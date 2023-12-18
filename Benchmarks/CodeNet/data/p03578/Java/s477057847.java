import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final String ex1 = "15\n" +
            "1 2 2 3 3 3 4 4 4 4 5 5 5 5 5\n" +
            "9\n" +
            "5 4 3 2 1 2 3 4 5";
    private static final String ex2 = "7\n" +
            "100 200 500 700 1200 1600 2000\n" +
            "6\n" +
            "100 200 500 700 1600 1600";

    public static void main(String[] args) {
        solve(new Scanner(System.in));

//        solve(new Scanner(ex1));
//        solve(new Scanner(ex2));
    }

    private static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.nextLine());  // 1 <= N <= 200,000
        String[] line = scanner.nextLine().split(" ");
        int[] D = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();  // 1 <= d <= 10 ** 9
        int M = Integer.parseInt(scanner.nextLine());  // 1 <= M <= 200,000
        line = scanner.nextLine().split(" ");
        int[] T = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();  // 1 <= t <= 10 ** 9

        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < N; i ++) {
            count.put(D[i], count.getOrDefault(D[i], 0) + 1);
        }

        for (int i = 0; i < M; i ++) {
            if (! count.containsKey(T[i])) {
                System.out.println("NO");
                return;
            }

            int c = count.get(T[i]);

            if (c <= 0) {
                System.out.println("NO");
                return;
            }

            count.put(T[i], c - 1);
        }

        System.out.println("YES");
    }
}
