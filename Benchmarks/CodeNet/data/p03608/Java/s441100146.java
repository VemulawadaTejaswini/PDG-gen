import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = scanner.nextInt(), M = scanner.nextInt(), R = scanner.nextInt();
        scanner.nextLine();
        Set<Integer> rs = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).map(x -> x - 1).collect(Collectors.toSet());
        int[][] dist = new int[N][N];
        for (int i = 0; i < M; i++) {
            int[] e = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            dist[e[0] - 1][e[1] - 1] =  e[2];
            dist[e[1] - 1][e[0] - 1] =  e[2];
        }

        for (int via = 0; via < N; via++) {
            for (int from = 0; from < N; from++) {
                for (int to = 0; to < N; to++) {
                    if (dist[from][to] > dist[from][via] + dist[via][to]) {
                        dist[from][to] = dist[from][via] + dist[via][to];
                    }
                }
            }
        }

        System.out.println(dfs(rs, -1, dist));
    }

    private static int dfs(Set<Integer> remaining, int curr, int[][] dist) {
        if (remaining.isEmpty()) {
            return 0;
        }
        int ans = Integer.MAX_VALUE / 2;
        for (int r: new ArrayList<>(remaining)) {
            remaining.remove(r);
            if (curr == -1) {
                ans = Math.min(ans, dfs(remaining, r, dist));
            } else {
                ans = Math.min(ans, dfs(remaining, r, dist) + dist[curr][r]);
            }
            remaining.add(r);
        }
        return ans;
    }

}