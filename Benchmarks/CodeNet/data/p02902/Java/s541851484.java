import java.util.*;
import java.util.stream.Collectors;

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

    static List<Integer>[] edges;
    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.next());
        int M = Integer.parseInt(scanner.next());
        edges = new List[N];
        for (int i = 0; i < N; i++) {
            edges[i] = new ArrayList<>();
        }
        for (int i = 0; i < M; i++) {
            int s = Integer.parseInt(scanner.next()) - 1;
            int t = Integer.parseInt(scanner.next()) - 1;
            edges[s].add(t);
        }


        minPath = Collections.emptyList();
        backtrack(0, new HashSet<>(), new LinkedHashSet<>());

        if (minPath.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(minPath.size());
            for (int n : minPath) {
                System.out.println(n + 1);
            }
        }
    }

    static List<Integer> minPath;
    static void backtrack(int curr, Set<Integer> visited, LinkedHashSet<Integer> processing) {
        if (visited.contains(curr)) return;
        if (processing.add(curr)) {
            for (int next: edges[curr]) {
                backtrack(next, visited, processing);
            }
            processing.remove(curr);
            visited.add(curr);
        } else {
            List<Integer> path = new ArrayList<>(processing);
            while (path.get(0) != curr) {
                path.remove(0);
            }
            if (minPath.isEmpty() || minPath.size() > path.size()) {
                minPath = path;
            }
        }
    }
}
