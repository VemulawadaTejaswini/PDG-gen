import java.util.*;
import java.util.stream.IntStream;

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

        int[] zdist = new int[N];
        Queue<Node> q = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();
        q.add(new Node(0, 0));
        while (!q.isEmpty()) {
            Node n = q.poll();
            if (visited.contains(n.n)) {
                continue;
            }
            visited.add(n.n);
            zdist[n.n] = n.c;
            for (int e: edges.get(n.n)) {
                q.add(new Node(e, n.c + 1));
            }
        }

        int[] ndist = new int[N];
        q.clear();
        visited.clear();
        q.add(new Node(N - 1, 0));
        while (!q.isEmpty()) {
            Node n = q.poll();
            if (visited.contains(n.n)) {
                continue;
            }
            visited.add(n.n);
            ndist[n.n] = n.c;
            for (int e: edges.get(n.n)) {
                q.add(new Node(e, n.c + 1));
            }
        }

        int b = IntStream.range(0, N).map(i -> zdist[i] <= ndist[i] ? 1 : 0).sum();
        if (b > N - b) {
            System.out.println("Fennec");
        } else {
            System.out.println("Snuke");
        }
    }

    static class Node {
        int n;
        int c;

        public Node(int n, int c) {
            this.n = n;
            this.c = c;
        }
    }

}
