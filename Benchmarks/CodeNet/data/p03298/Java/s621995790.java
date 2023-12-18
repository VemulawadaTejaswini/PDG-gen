import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;
import java.util.HashMap;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CStringColoring solver = new CStringColoring();
        solver.solve(1, in, out);
        out.close();
    }

    static class CStringColoring {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            String s = in.next();
            String left = s.substring(0, n);
            String right = s.substring(n, n * 2);

            HashMap<CStringColoring.Pair, Integer> map = new HashMap<>();
            for (int i = 0; i < 1 << n; i++) {
                StringBuilder red = new StringBuilder();
                StringBuilder blue = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    if ((i >> j) % 2 == 1) {
                        red.append(right.charAt(j));
                    }
                }
                for (int j = n - 1; j >= 0; j--) {
                    if ((i >> j) % 2 == 0) {
                        blue.append(right.charAt(j));
                    }
                }
                CStringColoring.Pair tmp = new CStringColoring.Pair(red.toString(), blue.toString());
                if (map.containsKey(tmp)) {
                    int x = map.get(tmp);
                    map.put(tmp, x + 1);
                } else {
                    map.put(tmp, 1);
                }
            }

            long ans = 0;
            for (int i = 0; i < 1 << n; i++) {
                StringBuilder red = new StringBuilder();
                StringBuilder blue = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    if ((i >> j) % 2 == 1) {
                        red.append(left.charAt(j));
                    }
                }
                for (int j = n - 1; j >= 0; j--) {
                    if ((i >> j) % 2 == 0) {
                        blue.append(left.charAt(j));
                    }
                }
                CStringColoring.Pair tmp = new CStringColoring.Pair(blue.toString(), red.toString());
                if (map.containsKey(tmp)) {
                    ans += map.get(tmp);
                }
            }
            out.println(ans);
        }

        private static class Pair {
            String left;
            String right;

            Pair(String left, String right) {
                this.left = left;
                this.right = right;
            }


            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                CStringColoring.Pair pair = (CStringColoring.Pair) o;
                return Objects.equals(left, pair.left) &&
                        Objects.equals(right, pair.right);
            }


            public int hashCode() {
                return Objects.hash(left, right);
            }

        }

    }
}

