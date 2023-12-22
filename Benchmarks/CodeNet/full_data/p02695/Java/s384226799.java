import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

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
        ManyRequirements solver = new ManyRequirements();
        solver.solve(1, in, out);
        out.close();
    }

    static class ManyRequirements {
        int n;
        int m;
        int q;
        List<Pair> pairs;
        long result = 0;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 数列の長さ
            n = in.nextInt();
            // 整数の範囲
            m = in.nextInt();
            q = in.nextInt();

            pairs = new ArrayList<>();
            for (int i = 0; i < q; i++) {
                pairs.add(new Pair(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()));
            }

            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= m; i++) {
                list.add(i);
                dfs(list);
                list.remove(list.size() - 1);
            }
            out.append(String.valueOf(result));
        }

        public void dfs(List<Integer> list) {

            if (list.size() == n) {
                long score = 0;
                for (Pair pair : pairs) {
                    if (list.get(pair.b) - list.get(pair.a) == pair.c) {
                        score += pair.d;
                    }
                }
                result = Math.max(result, score);
                return;
            }

            for (int i = Math.min(list.get(list.size() - 1), m); i <= m; i++) {
                list.add(i);
                dfs(list);
                list.remove(list.size() - 1);
            }
        }

        public class Pair implements Comparable<Pair> {
            int a;
            int b;
            int c;
            int d;

            public Pair(int a, int b, int c, int d) {
                this.a = a - 1;
                this.b = b - 1;
                this.c = c;
                this.d = d;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Pair pair = (Pair) o;
                return a == pair.a &&
                        b == pair.b &&
                        c == pair.c &&
                        d == pair.d;
            }

            public int hashCode() {
                return Objects.hash(a, b, c, d);
            }

            public int compareTo(Pair o) {
                return Integer.compare(a, o.a);
            }

        }

    }
}

