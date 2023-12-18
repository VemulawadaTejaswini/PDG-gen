import java.util.*;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.next());
        int M = Integer.parseInt(scanner.next());
        int L = Integer.parseInt(scanner.next());

        long[][] dist = new long[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(dist[i], Long.MAX_VALUE);
            dist[i][i]  = 0;
        }

        for (int i = 0; i < M; i++) {
            int s = Integer.parseInt(scanner.next()) - 1;
            int t = Integer.parseInt(scanner.next()) - 1;
            int c = Integer.parseInt(scanner.next());
            if (c > L) continue;
            dist[s][t] = c;
            dist[t][s] = c;
        }

        for (int via = 0; via < N; via++) {
            for (int from = 0; from < N; from++) {
                for (int to = 0; to < N; to++) {
                    if (dist[from][via] == Long.MAX_VALUE || dist[via][to] == Long.MAX_VALUE)
                        continue;
                    if (dist[from][to] > dist[from][via] + dist[via][to]) {
                        dist[from][to] = dist[from][via] + dist[via][to];
                    }
                }
            }
        }

        long[][] dist2 = new long[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(dist2[i], Long.MAX_VALUE);
            dist2[i][i]  = 0;
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (dist[i][j] <= L) {
                    dist2[i][j] = 1;
                }
            }
        }

        for (int via = 0; via < N; via++) {
            for (int from = 0; from < N; from++) {
                for (int to = 0; to < N; to++) {
                    if (dist2[from][via] == Long.MAX_VALUE || dist2[via][to] == Long.MAX_VALUE)
                        continue;
                    if (dist2[from][to] > dist2[from][via] + dist2[via][to]) {
                        dist2[from][to] = dist2[from][via] + dist2[via][to];
                    }
                }
            }
        }

        int Q = Integer.parseInt(scanner.next());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            int s = Integer.parseInt(scanner.next()) - 1;
            int t = Integer.parseInt(scanner.next()) - 1;
            sb.append(dist2[s][t] == Long.MAX_VALUE ? - 1 : dist2[s][t] - 1);
            sb.append('\n');
        }

        System.out.println(sb.toString());
    }
}
