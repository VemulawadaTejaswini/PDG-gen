import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        DPairs solver = new DPairs();
        solver.solve(1, in, out);
        out.close();
    }

    static class DPairs {
        ArrayList<Long> minus = new ArrayList<>();
        ArrayList<Long> plus = new ArrayList<>();
        long zero = 0;
        long n;

        public void solve(int testNumber, Scanner in, PrintWriter out) {

            n = in.nextLong();
            long k = in.nextLong();
            for (int i = 0; i < n; i++) {
                long x = in.nextLong();
                if (x == 0) {
                    zero++;
                } else if (x < 0) {
                    minus.add(-x);
                } else {
                    plus.add(x);
                }
            }

            minus.sort(Comparator.naturalOrder());
            plus.sort(Comparator.naturalOrder());

            long ng = -(long) 1e18;
            long ok = (long) 1e18;
            while (Math.abs(ok - ng) > 1) {
                long mid = (ok + ng) / 2;
                //out.println(mid + " " + f(mid));
                if (f(mid) >= k) {
                    ok = mid;
                } else {
                    ng = mid;
                }
            }

            out.println(ok);

        }

        long f(long key) {
            long res = 0;
            if (key < 0) {
                for (long mi : minus) {
                    int ng = -1;
                    int ok = plus.size();
                    while (Math.abs(ok - ng) > 1) {
                        int mid = (ok + ng) / 2;
                        if (mi * plus.get(mid) >= Math.abs(key)) {
                            ok = mid;
                        } else {
                            ng = mid;
                        }
                    }
                    res += (plus.size() - ok);
                }
            } else {
                res += (n * (n - 1) - ((n - zero) * (n - zero - 1))) / 2 + plus.size() * minus.size();
                for (int i = 0; i < minus.size(); i++) {
                    int ng = i;
                    int ok = minus.size();
                    while (Math.abs(ok - ng) > 1) {
                        int mid = (ok + ng) / 2;
                        if (minus.get(i) * minus.get(mid) > key) {
                            ok = mid;
                        } else {
                            ng = mid;
                        }
                    }
                    res += (ng - i);
                }

                for (int i = 0; i < plus.size(); i++) {
                    int ng = i;
                    int ok = plus.size();
                    while (Math.abs(ok - ng) > 1) {
                        int mid = (ok + ng) / 2;
                        if (plus.get(i) * plus.get(mid) > key) {
                            ok = mid;
                        } else {
                            ng = mid;
                        }
                    }
                    res += (ng - i);
                }
            }
            return res;
        }

    }
}

