import java.io.*;
import java.nio.IntBuffer;
import java.util.*;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        final Map<Integer, List<Integer>> edges = new HashMap<>();
        for(int i = 0 ; i < N-1 ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (!edges.containsKey(a)) {
                edges.put(a, new ArrayList<>());
            }
            if (!edges.containsKey(b)) {
                edges.put(b, new ArrayList<>());
            }

            edges.get(a).add(b);
            edges.get(b).add(a);
        }

        final Solver solver = new Solver();
        solver.solve(N, edges);
    }
}

class Pair {
    final int x;
    final int y;

    Pair(int x, int y) {
        this.x = Math.min(x, y);
        this.y = Math.max(x, y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        final Pair other = (Pair) obj;
        return (this.x == other.x && this.y == other.y);
    }
}

class Solver {
    public void solve(long N, Map<Integer, List<Integer>> edges) {

        final Set<Pair> threes = new HashSet<>();
        for (int i = 0; i < N; ++i) {
            final Set<Integer> visited = new HashSet<>();
            visited.add(i);

            // one step
            Set<Integer> first = visit(i, edges, visited);

            // second step
            Set<Integer> second = new HashSet<>();
            for (Integer j : first) {
                second.addAll(visit(j, edges, visited));
            }

            // third step
            Set<Integer> third = new HashSet<>();
            for (Integer j : second) {
                third.addAll(visit(j, edges, visited));
            }

            for (Integer j : third) {
                threes.add(new Pair(i, j));
            }
        }

        System.out.println(-1);
    }

    private Set<Integer> visit(int from, Map<Integer, List<Integer>> edges, Set<Integer> visited) {
        final Set<Integer> tos = new HashSet<>();
        if (!edges.containsKey(from)) return tos;

        for (Integer to : edges.get(from)) {
            if (visited.contains(to)) {
                continue;
            }
            visited.add(to);
            tos.add(to);
        }
        return tos;
    }
}

