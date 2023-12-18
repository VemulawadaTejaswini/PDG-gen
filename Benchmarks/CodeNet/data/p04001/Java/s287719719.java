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
        String s = in.next();

        long ans = 0;
        for (int i = 0; i < (1 << s.length() - 1); i++) {
            StringBuilder sb = new StringBuilder(String.valueOf(s.charAt(0)));
            for (int j = 0; j < s.length() - 1; j++) {
                if (((i >> j) & 1) == 1) {
                    sb.append("+");
                }
                sb.append(s.charAt(j + 1));
            }

            String[] ss = sb.toString().split("\\+");
            for (String tmpS : ss) {
                ans += Long.parseLong(tmpS);
            }
        }

        out.println(ans);
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
