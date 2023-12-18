import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            long l = in.nextLong();
            long t = in.nextLong();

            ArrayList<Pair> list1 = new ArrayList<>();
            ArrayList<Pair> list2 = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                int w = in.nextInt();

                if (w == 1) {
                    list1.add(new Pair(x, i));
                } else {
                    list2.add(new Pair(x, i));
                }
            }

            long m = 2 * t / l;
            long p = 2 * t % l;

            int[] cnt = new int[n];
            int n1 = list1.size();
            int n2 = list2.size();
            for (int i = 0; i < n1; i++) {
                long x = list1.get(i).x;
                int id = list1.get(i).y;
                cnt[id] += m * n2;

                if (x + p + 1 >= l) {
                    cnt[id] += n2 - lowerBound(list2, x);
                    cnt[id] += lowerBound(list2, (x + p + 1) % l);
                } else {
                    cnt[id] += lowerBound(list2, x + p + 1) - lowerBound(list2, x);
                }
            }
            for (int i = 0; i < n2; i++) {
                long x = list2.get(i).x;
                int id = list2.get(i).y;
                cnt[id] += m * n1;

                if (x - p <= 0) {
                    cnt[id] += n1 - lowerBound(list1, (x - p + l) % l);
                    cnt[id] += lowerBound(list1, x);
                } else {
                    cnt[id] += lowerBound(list1, x) - lowerBound(list2, x - p);
                }
            }

            long[] ans = new long[n];
            for (int i = 0; i < n1; i++) {
                int id = (list1.get(i).y + cnt[list1.get(i).y]) % n;
                ans[id] = (list1.get(i).x + t) % l;
            }
            for (int i = 0; i < n2; i++) {
                int id = (list2.get(i).y - cnt[list2.get(i).y] % n + n) % n;
                ans[id] = (list2.get(i).x - t % l + l) % l;
            }

            for (int i = 0; i < n; i++) {
                out.println(ans[i]);
            }
        }

        int lowerBound(ArrayList<Pair> a, long x) {
            int high = a.size();
            int low = 0;
            while (high > low) {
                int mid = (high + low) / 2;
                if (a.get(mid).x < x) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }

        public class Pair {
            long x;
            int y;

            Pair(long x, int y) {
                this.x = x;
                this.y = y;
            }

        }

    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer tok;

        public String nextString() {
            while (!tok.hasMoreTokens()) {
                try {
                    tok = new StringTokenizer(in.readLine(), " ");
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
            }
            return tok.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

        public long nextLong() {
            return Long.parseLong(nextString());
        }

        public InputReader(InputStream inputStream) {
            in = new BufferedReader(new InputStreamReader(inputStream));
            tok = new StringTokenizer("");
        }

    }
}

