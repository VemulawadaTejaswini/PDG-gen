import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }


    // int N = Integer.parseInt(scanner.nextLine());
    // int N = scanner.nextInt(), M = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.nextLine());
        Map<Integer, Map<Integer, Integer>> edges = new HashMap<>();
        for (int i = 0; i < N - 1; i++) {
            int[] e = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (!edges.containsKey(e[0])) {
                edges.put(e[0], new HashMap<>());
            }
            edges.get(e[0]).put(e[1], e[2]);
            if (!edges.containsKey(e[1])) {
                edges.put(e[1], new HashMap<>());
            }
            edges.get(e[1]).put(e[0], e[2]);
        }

        boolean[] c = new boolean[N + 1];

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        while (!q.isEmpty()) {
            int curr = q.poll();
            if (visited.add(curr)) {
                for (Map.Entry<Integer, Integer> e: edges.getOrDefault(curr, Collections.emptyMap()).entrySet()) {
                    int next = e.getKey();
                    int cost = e.getValue();
                    c[next] = (cost % 2 == 0) ? c[curr] : !c[curr];
                    q.add(next);
                }
            }
        }

        for (int i = 1; i < N + 1; i++) {
            System.out.println(c[i] ? 0 : 1);
        }

    }

}
