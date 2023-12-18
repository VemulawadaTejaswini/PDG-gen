import java.io.PrintWriter;
import java.util.Arrays;
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
        Shop[] shops = new Shop[n];
        for (int i = 0; i < n; i++) {
            String s = in.next();
            int p = in.nextInt();
            shops[i] = new Shop(s, p, i + 1);
        }

        Arrays.sort(shops);
        for (Shop s : shops) {
            out.println(s.index);
        }
    }
}

class Shop implements Comparable<Shop> {
    String name;
    int p;
    int index;

    Shop(String name, int p, int index) {
        this.name = name;
        this.p = p;
        this.index = index;
    }

    @Override
    public int compareTo(Shop o) {
        if (name.compareTo(o.name) == 0) {
            if (this.p == o.p) {
                return 0;
            } else if (this.p < o.p) {
                return 1;
            } else {
                return -1;
            }
        }

        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name + " " + p;
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
