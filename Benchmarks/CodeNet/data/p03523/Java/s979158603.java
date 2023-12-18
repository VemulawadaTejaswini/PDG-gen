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
        String s = in.next();
        String[] ss = { "KIHBR", "KIHBRA", "KIHBAR", "KIHBARA", "KIHABR", "KIHABRA", "KIHABAR", "KIHABARA", "AKIHBR",
                "AKIHBRA", "AKIHBAR", "AKIHBARA", "AKIHABR", "AKIHABRA", "AKIHABAR", "AKIHABARA", };

        for (String target : ss) {
            if (s.equals(target)) {
                out.println("YES");
                return;
            }
        }

        out.println("NO");
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
