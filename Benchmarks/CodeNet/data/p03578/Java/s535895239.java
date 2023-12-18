import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (InputReader in = new InputReader(); PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
            out.flush();
        }
    }

    private void solve(InputReader in, PrintWriter out) {
        int n = in.nextInt();
        Map<Integer, Integer> map = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            int d = in.nextInt();
            map.compute(d, (key, old) -> (old == null) ? 1 : old + 1);
        }

        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int t = in.nextInt();
            int tmp = map.compute(t, (key, old) -> (old == null) ? -1 : old - 1);
            if (tmp < 0) {
                out.println("NO");
                return;
            }
        }

        out.println("YES");
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
