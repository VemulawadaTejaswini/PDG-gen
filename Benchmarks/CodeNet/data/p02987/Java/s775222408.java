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

    void solve(InputReader in, PrintWriter out) {
        String s = in.next();
        Map<Character, Integer> map = new HashMap<>();
        char tmp = '\0';
        for (char c : s.toCharArray()) {
            map.merge(c, 1, Integer::sum);
            tmp = c;
        }

        if (map.size() == 2 && map.get(tmp) == 2) {
            out.println("Yes");
        } else {
            out.println("No");
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
