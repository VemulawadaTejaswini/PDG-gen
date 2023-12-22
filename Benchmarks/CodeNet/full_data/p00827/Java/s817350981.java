import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.function.BiFunction;
import java.util.Scanner;
import java.util.function.BinaryOperator;

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
        TheBalance solver = new TheBalance();
        try {
            int testNumber = 1;
            while (true)
                solver.solve(testNumber++, in, out);
        } catch (UnknownError e) {
            out.close();
        }
    }

    static class TheBalance {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            int d = in.nextInt();
            if (a == 0 && b == 0 && d == 0) {
                throw new UnknownError();
            }

            BinaryOperator<Pair> check = new BinaryOperator<Pair>() {

                public Pair apply(Pair p1, Pair p2) {
                    if (p1.sum() < p2.sum()) {
                        return p1.clone();
                    } else if (p1.sum() > p2.sum()) {
                        return p2.clone();
                    } else {
                        if (p1.first * a + p1.second * b < p2.first * a + p2.second * b) {
                            return p1.clone();
                        } else {
                            return p2.clone();
                        }
                    }
                }
            };
            Pair ans = new Pair((int) 2e4, (int) 2e4);
            for (int ac = 0; ac < 1e5; ac++) {
                Pair cand = new Pair(ac, (int) 2e4);
                if ((d - a * ac) >= 0 && (d - a * ac) % b == 0) {
                    cand.second = (d - a * ac) / b;
                    ans = check.apply(ans, cand);
                }
                if ((a * ac + d) % b == 0) {
                    cand.second = (a * ac + d) / b;
                    ans = check.apply(ans, cand);
                }
                if ((a * ac - d) >= 0 && (a * ac - d) % b == 0) {
                    cand.second = (a * ac - d) / b;
                    ans = check.apply(ans, cand);
                }
            }
            out.println(ans.first + " " + ans.second);
        }

        class Pair {
            public int first;
            public int second;

            public Pair(int f, int s) {
                this.first = f;
                this.second = s;
            }

            public int sum() {
                return this.first + this.second;
            }

            public Pair clone() {
                return new Pair(this.first, this.second);
            }

        }

    }
}


