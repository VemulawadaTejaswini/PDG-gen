import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int H = scanner.nextInt(), W = scanner.nextInt();
        scanner.nextLine();
        int[][] dist = new int[10][10];
        for (int i = 0; i < 10; i++) {
            dist[i] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        for (int via = 0; via < 10; via++)
            for (int from = 0; from < 10; from++)
                for (int to = 0; to < 10; to++)
                    if (dist[from][to] > dist[from][via] + dist[via][to]) {
                        dist[from][to] = dist[from][via] + dist[via][to];
                    }

        int ans = 0;
        for (int i = 0; i < H; i++) {
             for (int n: Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray()) {
                 if (n >= 0) {
                     ans += dist[n][1];
                 }
             }
        }

        System.out.println(ans);
    }

}