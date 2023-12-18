import java.io.PrintWriter;
import java.util.Scanner;

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
        int cL = 0;
        int cR = N + 1;
        for (int i = 0; i < M; i++) {
            int L = in.nextInt();
            int R = in.nextInt();

            cL = Math.max(cL, L);
            cR = Math.min(cR, R);
        }

        if (cR - cL < 0) {
            out.println(0);
        } else if (cR == cL) {
            out.println(1);
        } else {
            out.println(cR - cL + 1);
        }
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
