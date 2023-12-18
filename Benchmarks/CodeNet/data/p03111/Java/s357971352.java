import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        long ans;
        int a;
        int b;
        int c;
        ArrayList<Integer> l;
        long n;

        public void calc(int i, int as, int bs, int cs, int al, int bl, int cl) {
            if (i == n) {
                if (al == 0 || bl == 0 || cl == 0) return;
                long temp = Math.abs(a - as) + Math.abs(c - cs) + Math.abs(b - bs) + (al - 1) * 10 + (bl - 1) * 10 + (cl - 1) * 10;
                ans = Math.min(ans, temp);
                return;
            }
            calc(i + 1, as + l.get(i), bs, cs, al + 1, bl, cl);
            calc(i + 1, as, bs + l.get(i), cs, al, bl + 1, cl);
            calc(i + 1, as, bs, cs + l.get(i), al, bl, cl + 1);
            calc(i + 1, as, bs, cs, al, bl, cl);
            return;
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            n = in.nextInt();
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            ans = Integer.MAX_VALUE;
            l = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) l.add(in.nextInt());
            calc(0, 0, 0, 0, 0, 0, 0);
            out.println(ans);
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

