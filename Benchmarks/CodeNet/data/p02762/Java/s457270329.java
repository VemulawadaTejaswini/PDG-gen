import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long M;
        M = sc.nextLong();
        long K;
        K = sc.nextLong();

        final Solver solver = new Solver();
        solver.solve(N, M, K, sc);
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
    final List<Integer> parents = new ArrayList<>();
    final List<Integer> ranks = new ArrayList<>();
    final List<Integer> sizes = new ArrayList<>();
    public void solve(long N, long M, long K, Scanner sc) {
        for (int i = 0; i < N; i++) {
            parents.add(i);
            ranks.add(0);
            sizes.add(1);
        }

        final Set<Pair> connected = new HashSet<>();
        for(int i = 0 ; i < M ; i++){
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            connected.add(new Pair(a, b));

            unite(a, b);
        }

        for(int i = 0 ; i < K ; i++){
            int c = sc.nextInt() - 1;
            int d = sc.nextInt() - 1;
            connected.add(new Pair(c, d));
        }

        final List<Integer> answers = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int ans = sizes.get(root(i)) - 1;
            for (int j = 0; j < N; j++) {
                if (!same(i, j)) {
                    continue;
                }
                if (connected.contains(new Pair(i, j))) {
                    ans--;
                }
            }
            answers.add(ans);
        }

        System.out.println(answers.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }

    private void unite(int x, int y) {
        int xRoot = root(x);
        int yRoot = root(y);

        if (xRoot == yRoot) return;

        if (ranks.get(xRoot) < ranks.get(yRoot)) {
            parents.set(xRoot, yRoot);
            sizes.set(yRoot, sizes.get(xRoot) + sizes.get(yRoot));
        }
        else {
            parents.set(yRoot, xRoot);
            if (ranks.get(xRoot).equals(ranks.get(yRoot))) {
                ranks.set(xRoot, ranks.get(xRoot) + 1);
            }
            sizes.set(xRoot, sizes.get(xRoot) + sizes.get(yRoot));
        }

    }

    private int root(int x) {
        if (parents.get(x) == x) {
            return x;
        }
        else {
            int root = root(parents.get(x));
            parents.set(x, root);
            return root;
        }
    }

    private boolean same(int x, int y) {
        int xRoot = root(x);
        int yRoot = root(y);

        return xRoot == yRoot;
    }
}

