import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DRobotArms solver = new DRobotArms();
        solver.solve(1, in, out);
        out.close();
    }

    static class DRobotArms {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            node[] a = new node[n];
            for (int i = 0; i < n; i++) {
                a[i] = new node(in.nextInt(), in.nextInt());
            }
            boolean eve = ((a[0].x + a[0].y) % 2 == 0);
            long max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (eve != ((a[i].x + a[i].y) % 2 == 0)) {
                    out.println(-1);
                    return;
                }
                max = Math.max(a[i].x + a[i].y, max);
            }
            ArrayList<Long> m = new ArrayList<Long>();
            long y = 1;
            long tsum = 0;
            while (true) {
                if ((tsum) < max) {
                    tsum += y;
                    m.add(y);
                    y = y << 1;
                } else {
                    break;
                }
            }
            int d = m.size();
            out.println(d);
            for (int i = 0; i < d; i++) {
                out.print(m.get(i) + " ");
            }
            if (eve) out.print(1);
            out.println();
            for (int i = 0; i < n; i++) {
                StringBuilder ans = new StringBuilder("");
                long sum = tsum;
                if (eve) {
                    a[i].x += 1;
                    ans.append("L");
                }
                for (int j = 0; j < d; j++) {
                    long x = m.get(d - j - 1);
                    sum -= x;
                    if (Math.abs(a[i].x + x) + Math.abs(a[i].y) <= sum) {
                        a[i].x += x;
                        ans.append("L");
                        continue;
                    }
                    if (Math.abs(a[i].x) + Math.abs(a[i].y + x) <= sum) {
                        a[i].y += x;
                        ans.append("D");
                        continue;
                    }
                    if (Math.abs(a[i].x - x) + Math.abs(a[i].y) <= sum) {
                        a[i].x -= x;
                        ans.append("R");
                        continue;
                    }
                    if (Math.abs(a[i].x) + Math.abs(a[i].y - x) <= sum) {
                        a[i].y -= x;
                        ans.append("U");
                        continue;
                    }
                }
                out.println(ans.reverse().toString());
            }

        }

        class node {
            int x;
            int y;

            node(int x, int y) {
                this.x = x;
                this.y = y;
            }

        }

    }

    static class InputReader {
        public BufferedReader reader;
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
}

