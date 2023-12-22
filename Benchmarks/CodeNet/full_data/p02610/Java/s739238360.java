import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.function.LongUnaryOperator;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.util.Queue;
import java.util.Comparator;
import java.util.ArrayDeque;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ECamelTrain solver = new ECamelTrain();
        solver.solve(1, in, out);
        out.close();
    }

    static class ECamelTrain {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int t = in.nextInt();
            for (int i = 0; i < t; i++) {
                solve(in, out);
            }
        }

        private void solve(InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long answer = 0;
            Pii[] c = new Pii[n];
            for (int i = 0; i < n; i++) {
                int k = in.nextInt() - 1;
                int l = in.nextInt(), r = in.nextInt();
                if (k == n - 1) {
                    answer += l;
                    c[i] = Pii.of(0, 0);
                    continue;
                }
                if (r - l > 0)
                    k++;
                c[i] = Pii.of(k, l - r);
                answer += Math.min(l, r);
            }
            long base = answer;

            Arrays.sort(c, Comparator.comparingInt(p -> -Math.abs(p.second)));

            LongUnaryOperator split = (long pivot) -> {
                Queue<Pii> q = new ArrayDeque<>();
                for (Pii p : c) {
                    if (p.second <= 0)
                        continue;
                    q.add(p);
                }

                long left = f(q, (int) pivot, n);

                q.clear();
                for (Pii p : c) {
                    if (p.second >= 0)
                        continue;
                    q.add(p);
                }
                long right = f(q, n - (int) pivot, n);

                return -(base + left + right);
            };

            long pivot = BinarySearch.ternarySearchLong(split, 0, n);
            answer = -split.applyAsLong(pivot);

            out.println(answer);
        }

        private int f(Queue<Pii> q, int count, int n) {
            TreeSet<Integer> avail = new TreeSet<>();
            for (int i = 0; i < n; i++)
                avail.add(i);
            int[] occupant = new int[n];

            int answer = 0;
            while (!q.isEmpty()) {
                if (n - avail.size() >= count)
                    break;

                Pii p = q.poll();
                int target = p.first;
                int score = p.second;

                if (avail.contains(target)) {
                    avail.remove(target);
                    occupant[target] = score;
                    answer += Math.abs(score);
                    continue;
                }

                if (occupant[target] > 0) {
                    Integer index = avail.floor(target);
                    if (index == null)
                        continue;

                    occupant[index] = occupant[target];
                    occupant[target] = score;
                    avail.remove(index);
                } else {
                    Integer index = avail.ceiling(target);
                    if (index == null)
                        continue;

                    occupant[index] = occupant[target];
                    occupant[target] = score;
                    avail.remove(index);
                }

                answer += Math.abs(score);
            }

            return answer;
        }

    }

    static class Pii implements Comparable<Pii> {
        public final int first;
        public final int second;

        public Pii(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public static Pii of(int first, int second) {
            return new Pii(first, second);
        }

        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Pii pair = (Pii) o;
            return first == pair.first && second == pair.second;
        }

        public int hashCode() {
            return Arrays.hashCode(new int[]{first, second});
        }

        public String toString() {
            return "(" + first + ", " + second + ')';
        }

        public int compareTo(Pii o) {
            if (first != o.first)
                return Integer.compare(first, o.first);
            return Integer.compare(second, o.second);
        }

    }

    static class InputReader {
        public final BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }

    static class BinarySearch {
        public static long ternarySearchLong(LongUnaryOperator f, long left, long right) {
            while (true) {
                long t = (right - left) / 3;
                if (t == 0) {
                    long answer = left;
                    long opt = f.applyAsLong(left);
                    for (long x = left + 1; x <= right; x++) {
                        long candidate = f.applyAsLong(x);
                        if (candidate < opt) {
                            answer = x;
                            opt = candidate;
                        }
                    }
                    return answer;
                }
                long a = left + t;
                long b = right - t;
                if (f.applyAsLong(a) > f.applyAsLong(b)) {
                    left = a;
                } else {
                    right = b;
                }
            }
        }

    }
}

