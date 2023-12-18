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
        int n = in.nextInt();
        char[] s = in.next().toCharArray();
        int w = 0;
        int b = 0;
        int t = 0;
        boolean flag = false;
        for (char c : s) {
            if (c == '.') {
                b++;

                if (flag) {
                    t++;
                }
            }

            if (c == '#') {
                w++;
                flag = true;
            }
        }

        out.println(Math.min(w, Math.min(b, t)));
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
