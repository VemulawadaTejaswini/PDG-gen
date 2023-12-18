import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (InputReader in = new InputReader(); PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
            out.flush();
        }
    }

    void solve(final InputReader in, final PrintWriter out) {
        String abcd = in.next();
        for (int i = 0; i < (1 << 3); i++) {
            int tmp = Integer.parseInt(String.valueOf(abcd.charAt(0)));
            StringBuilder sb = new StringBuilder(String.valueOf(abcd.charAt(0)));
            for (int j = 0; j < 3; j++) {
                if (1 == ((i >> j) & 1)) {
                    tmp += Integer.parseInt(String.valueOf(abcd.charAt(j + 1)));
                    sb.append("+");
                } else {
                    tmp -= Integer.parseInt(String.valueOf(abcd.charAt(j + 1)));
                    sb.append("-");
                }
                sb.append(abcd.charAt(j + 1));
            }

            if (tmp == 7) {
                out.println(sb + "=7");
                return;
            }
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
