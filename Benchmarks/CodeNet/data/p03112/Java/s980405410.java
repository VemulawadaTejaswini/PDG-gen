import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
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
        LazyFaith solver = new LazyFaith();
        solver.solve(1, in, out);
        out.close();
    }

    static class LazyFaith {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            int q = in.nextInt();
            ArrayList<Long> s = new ArrayList<>();
            ArrayList<Long> t = new ArrayList<>();
            long[] x = new long[q];
            for (int i = 0; i < a; i++) {
                s.add(Long.parseLong(in.next()));
            }
            for (int i = 0; i < b; i++) {
                t.add(Long.parseLong(in.next()));
            }
            for (int i = 0; i < q; i++) {
                x[i] = Long.parseLong(in.next());
            }
            s.add(Long.MAX_VALUE);
            s.add(Long.MIN_VALUE);
            t.add(Long.MAX_VALUE);
            t.add(Long.MIN_VALUE);

            Collections.sort(s);
            Collections.sort(t);

            for (int i = 0; i < q; i++) {
                long ans1 = Long.MAX_VALUE;
                long pos = x[i];

                for (int j = 0; j < 2; j++) {
                    int p = (j == 0) ? lowerSearch(s, pos) : upperSearch(s, pos);
                    if (p <= 0 || p == s.size()) {
                        continue;
                    }
                    long next = s.get(p);
                    for (int k = 0; k < 2; k++) {
                        int r = (k == 0) ? lowerSearch(t, next) : upperSearch(t, next);
                        if (r <= 0 || r == t.size()) {
                            continue;
                        }
                        long next2 = t.get(r);
                        ans1 = Math.min(ans1, Math.abs(pos - next) + Math.abs(next - next2));
                    }
                }

                long ans2 = Long.MAX_VALUE;
                for (int j = 0; j < 2; j++) {
                    int p = (j == 0) ? lowerSearch(t, pos) : upperSearch(t, pos);
                    if (p <= 0 || p == t.size()) {
                        continue;
                    }
                    long next = t.get(p);
                    for (int k = 0; k < 2; k++) {
                        int r = (k == 0) ? lowerSearch(s, next) : upperSearch(s, next);
                        if (r <= 0 || r == s.size()) {
                            continue;
                        }
                        long next2 = s.get(r);
                        ans2 = Math.min(ans2, Math.abs(pos - next) + Math.abs(next - next2));
                    }
                }
                out.println(Math.min(ans1, ans2));
            }
        }

        public int lowerSearch(List<Long> list, long target) {
            int k = Collections.binarySearch(list, target, new LowerBoundComparator<>());
            if (k < 0) {
                // -k -1
                k = ~k;
            }
            if (list.get(k) == target) {
                return k;
            } else if (0 < k) {
                return k - 1;
            }
            return k;
        }

        public int upperSearch(List<Long> list, long target) {
            int k = Collections.binarySearch(list, target, new UpperBoundComparator<>());
            if (k < 0) {
                // -k -1
                k = ~k;
            }
            return k;
        }

        class LowerBoundComparator<T extends Comparable<? super T>> implements Comparator<T> {
            public int compare(T x, T y) {
                return (x.compareTo(y) >= 0) ? 1 : -1;
            }

        }

        class UpperBoundComparator<T extends Comparable<? super T>> implements Comparator<T> {
            public int compare(T x, T y) {
                return (x.compareTo(y) > 0) ? 1 : -1;
            }

        }

    }
}

