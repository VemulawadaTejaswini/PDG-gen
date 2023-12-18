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
        String targert = "AKIHABARA";
        String s = in.next();

        int tmpIndex = 0;
        for (int i = 0; i < targert.length(); i++) {
            if (tmpIndex == s.length()) {
                break;
            }

            if (targert.charAt(i) != s.charAt(tmpIndex) && targert.charAt(i) != 'A') {
                out.println("NO");
                return;
            }
            tmpIndex++;
        }

        out.println((tmpIndex == targert.length()) ? "YES" : "NO");
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
