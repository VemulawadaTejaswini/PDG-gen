import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    // int N = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int[] line = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long H = line[0], W = line[1], N = line[2];
        int[][] dir = {{0, 0}, {-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};
        Map<Long, Integer> m = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int[] q = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int[] d: dir) {
                int y = q[0] - 1 + d[0];
                int x = q[1] - 1 + d[1];
                if (x <= 0 || x >= W - 1 || y <= 0 || y >= H - 1) {
                    continue;
                }
                Long key = (((long) x) << 32) + y;
                m.put(key, m.getOrDefault(key, 0) + 1);
            }
        }
        long[] ans = new long[10];
        long sum = (H - 2) * (W - 2);
        for (Map.Entry<Long, Integer> e: m.entrySet()) {
            if (e.getValue() < 10) {
                ans[e.getValue()]++;
                sum--;
            }
        }
        ans[0] = sum;
        for (long n: ans) {
            System.out.println(n);
        }
    }

}
