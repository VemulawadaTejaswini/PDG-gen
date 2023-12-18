import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
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
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        int gcd(int a, int b) {
            if (a == 0) {
                return b;
            }
            return gcd(b % a, a);
        }

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt();
            if (n == 3) {
                out.println("2 5 63");
                return;
            }
            List<Integer> ans = new ArrayList<>();

            int rem = n / 8, mod = n % 8;

            for (int i = 0; i < 2 * rem; i++) {
                ans.add(i * 6 + 2);
                ans.add(i * 6 + 3);
                ans.add(i * 6 + 4);
                ans.add(i * 6 + 6);
            }
            long sum = 0;
            for (int x : ans) {
                sum += x;
            }
            int[] ar = new int[]{2, 3, 4, 6, 8, 9, 10, 12};
            boolean ok = false;
            for (int mask = 0; mask < 1 << 8; mask++) {
                if (Integer.bitCount(mask) == mod) {
                    int gcd = (rem == 0) ? 0 : 1;
                    long newS = sum;
                    for (int i = 0; i < 8; i++) {
                        if ((mask & (1 << i)) != 0) {
                            newS += ar[i] + rem * 12;
                            gcd = gcd(gcd, ar[i] + rem * 12);
                        }
                    }
                    if (newS % 6 == 0 && gcd == 1) {
                        ok = true;
                        for (int i = 0; i < 8; i++) {
                            if ((mask & (1 << i)) != 0) {
                                ans.add(ar[i] + rem * 12);
                            }
                        }
                        break;
                    }
                }
            }
            if (!ok) {
                throw new AssertionError();
            }
            for (int i : ans) {
                out.print(i + " ");
            }
            out.println();
        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                String line = null;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                }
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

    }
}

