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

    void solve(InputReader in, PrintWriter out) {
        int N = in.nextInt();
        int M = in.nextInt();
        Set<Integer> set = new HashSet<>(N);
        for (int i = 1; i <= N; i++) {
            set.add(i);
        }
        for (int i = 0; i < M; i++) {
            int L = in.nextInt();
            int R = in.nextInt();

            Set<Integer> tmp = new HashSet<>(N);
            for (int j = L; j <= R; j++) {
                tmp.add(j);
            }

            set.retainAll(tmp);
        }

        out.println(set.size());
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
