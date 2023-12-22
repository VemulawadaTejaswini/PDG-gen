import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Objects;
import java.util.List;
import java.util.Comparator;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BracketSequencing solver = new BracketSequencing();
        solver.solve(1, in, out);
        out.close();
    }

    static class BracketSequencing {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();

            List<Pair> positivePair = new ArrayList<>();
            List<Pair> negativePair = new ArrayList<>();
            int total = 0;

            for (int i = 0; i < n; i++) {
                String line = in.next();
                int m = 0;
                int s = 0;
                for (char c : line.toCharArray()) {
                    s += ('(' == c) ? 1 : -1;
                    m = Math.min(m, s);
                }
                if (s >= 0) {
                    positivePair.add(new Pair((long) m, (long) s, line));
                } else {
                    negativePair.add(new Pair((long) m - s, (long) -s, line));
                }

                total += s;
            }
            if (total != 0) {
                out.append("No\n");
                return;
            }

            positivePair.sort(Comparator.reverseOrder());
            negativePair.sort(Comparator.reverseOrder());

            StringBuffer sb = new StringBuffer("");

            for (Pair p : positivePair) {
                sb.append(p.line);
            }
            for (Pair p : negativePair) {
                sb.append(p.line);
            }

            if (!check(sb.toString())) {
                out.append("No\n");
                return;
            }
            out.append("Yes\n");

        }

        public boolean check(String line) {
            int m = 0;
            int s = 0;
            for (char c : line.toCharArray()) {
                s += ('(' == c) ? 1 : -1;
                m = Math.min(m, s);
                if (m < 0) {
                    return false;
                }
            }
            return true;

        }

        class Pair implements Comparable<BracketSequencing.Pair> {
            public final Long first;
            public final Long second;
            public final String line;

            Pair(Long first, Long second, String line) {
                this.first = first;
                this.second = second;
                this.line = line;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof E.Pair))
                    return false;
                E.Pair pair = (E.Pair) obj;
                return pair.first.equals(first) && pair.second.equals(second);
            }

            public int hashCode() {
                return Objects.hash(first, second);
            }

            public int compareTo(Pair o) {
                int res = Long.compare(first, o.first);
                return res != 0 ? res : Long.compare(second, o.second);
            }

        }

    }

    static class E {
        class Pair implements Comparable<E.Pair> {
            public final Long first;
            public final Long second;

            Pair(Long first, Long second) {
                this.first = first;
                this.second = second;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof Pair))
                    return false;
                Pair pair = (Pair) obj;
                return pair.first.equals(first) && pair.second.equals(second);
            }

            public int hashCode() {
                return Objects.hash(first, second);
            }

            public int compareTo(Pair o) {
                int res = Long.compare(first, o.first);
                return res != 0 ? res : Long.compare(second, o.second);
            }

        }

    }
}

