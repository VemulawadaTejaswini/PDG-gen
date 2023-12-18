import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (InputReader in = new InputReader(); PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
            out.flush();
        }
    }

    void solve(final InputReader in, final PrintWriter out) {
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int k = in.nextInt();
        List<Long> aList = new ArrayList<>(x);
        for (int i = 0; i < x; i++) {
            aList.add(in.nextLong());
        }
        List<Long> bList = new ArrayList<>(y);
        for (int i = 0; i < y; i++) {
            bList.add(in.nextLong());
        }
        List<Long> cList = new ArrayList<>(z);
        for (int i = 0; i < z; i++) {
            cList.add(in.nextLong());
        }

        List<Long> abList = new ArrayList<>();
        for (Long a : aList) {
            for (Long b : bList) {
                abList.add(a + b);
            }
        }
        abList.sort(Comparator.reverseOrder());
        List<Long> abc = abList.subList(0, Math.min(k, abList.size()));

        List<Long> acList = new ArrayList<>();
        for (Long ab : abc) {
            for (Long c : cList) {
                acList.add(ab + c);
            }
        }
        acList.sort(Comparator.reverseOrder());
        for (Long ans : acList.subList(0, Math.min(k, acList.size()))) {
            out.println(ans);
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
