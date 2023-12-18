import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        try (InputReader in = new InputReader(); PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
            out.flush();
        }
    }

    int[] rootFrom;

    private void solve(InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();

        rootFrom = new int[n];
        for (int i = 0; i < n; i++) {
            rootFrom[i] = i;
        }

        for (int i = 0; i < m; i++) {
            int x = in.nextInt() - 1;
            int y = in.nextInt() - 1;
            int z = in.nextInt();

            unite(x, y);
        }

        Set<Integer> ansSet = new HashSet<>(n);
        for (int i = 0; i < n; i++) {
            ansSet.add(calcRoot(i));
        }

        out.println(ansSet.size());
    }

    int calcRoot(int node) {
        if (rootFrom[node] == node) {
            return node;
        }

        // rootFrom[node] = calcRoot(rootFrom[node]);
        return calcRoot(rootFrom[node]);
    }

    void unite(int x, int y) {
        int xroot = calcRoot(x);
        int yroot = calcRoot(y);

        if (xroot == yroot) {
            return;
        }

        rootFrom[x] = y;
    }
}

class InputReader implements AutoCloseable {
    private final Scanner sc = new Scanner(System.in);

    String next() {
        return this.sc.next();
    }

    int nextInt() {
        return Integer.parseInt(this.sc.next());
    }

    long nextLong() {
        return Long.parseLong(this.sc.next());
    }

    double nextDouble() {
        return Double.parseDouble(this.sc.next());

    }

    @Override
    public void close() {
        this.sc.close();
    }
}
