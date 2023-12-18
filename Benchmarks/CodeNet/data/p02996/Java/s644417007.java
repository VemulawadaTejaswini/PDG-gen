import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DMegalomania solver = new DMegalomania();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMegalomania {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            ArrayList<Pair<Integer, Integer>> alp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                alp.add(new Pair<>(in.nextInt(), in.nextInt()));
            }

            alp.sort(Comparator.comparing(p -> p.u));

            int time = 0;
            for (Pair<Integer, Integer> p : alp) {
                if (time + p.t > p.u) {
                    out.println("No");
                    return;
                }
                time += p.t;
            }

            out.println("Yes");


        }

    }

    static class Pair<T, U> {
        public T t;
        public U u;

        public Pair(T t, U u) {
            this.t = t;
            this.u = u;
        }

        public String toString() {
            return "Pair{" +
                    "t=" + t.toString() +
                    ", u=" + u.toString() +
                    '}';
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(t, pair.t) &&
                    Objects.equals(u, pair.u);
        }

        public int hashCode() {
            return Objects.hash(t, u);
        }

    }
}

