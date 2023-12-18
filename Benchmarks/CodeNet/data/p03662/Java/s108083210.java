import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    // int N = scanner.nextInt();
    // scanner.nextLine();
    // int[] n = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    static void solve(Scanner scanner) {
        int N = scanner.nextInt();
        scanner.nextLine();

        List<List<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            edges.add(new ArrayList<>());
        }
        for (int i = 0; i < N - 1; i++) {
            int[] e = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            edges.get(e[0] - 1).add(e[1] - 1);
            edges.get(e[1] - 1).add(e[0] - 1);
        }

        int mid = dist(edges, 0, N - 1, new HashSet<>()) - 1;
        int b = reachable(edges, 0, N - 1, new HashSet<>()) - 1 - mid;
        int w = reachable(edges, N - 1, 0, new HashSet<>()) - 1 - mid;
        if (mid % 2 == 1) {
            b++;
        }
        if (b <= w) {
            System.out.println("Snuke");
        } else {
            System.out.println("Fennec");
        }

    }

    static int reachable(List<List<Integer>> edges, int start, int avoid, Set<Integer> visited) {
        if (start == avoid) {
            return 0;
        }
        visited.add(start);

        int d = 0;
        for (int ns : edges.get(start)) {
            if (!visited.contains(ns)) {
                d += reachable(edges, ns, avoid, visited);
            }
        }
        return d + 1;
    }

    static int dist(List<List<Integer>> edges, int start, int end, Set<Integer> visited) {
        if (start == end) {
            return 0;
        }
        visited.add(start);

        int d = Integer.MIN_VALUE / 2;
        for (int ns : edges.get(start)) {
            if (!visited.contains(ns)) {
                d = Math.max(d, dist(edges, ns, end, visited));
            }
        }
        return d + 1;
    }
}
