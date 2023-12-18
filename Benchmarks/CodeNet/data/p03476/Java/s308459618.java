import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ShekharN
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        private final int LIM = 100002;
        boolean[] prime = new boolean[LIM];
        int[] cnt = new int[LIM];

        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            for (int i = 0; i < LIM; i++) {
                prime[i] = true;
            }
            prime[0] = prime[1] = false;
            for (int i = 2; i * i < LIM; i++) {
                if (prime[i]) {
                    for (int j = i + i; j < LIM; j += i) {
                        prime[j] = false;
                    }
                }
            }
            cnt[0] = 0;
            for (int i = 1; i < LIM; i++) {
                cnt[i] = cnt[i - 1];
                if (prime[i] && prime[(i + 1) / 2])
                    cnt[i]++;
            }
            int q = in.nextInt();
            for (int i = 0; i < q; i++) {
                int l = in.nextInt(), r = in.nextInt();
                out.println(cnt[r] - cnt[l - 1]);
            }
        }

    }

    static class FastScanner {
        private BufferedReader br;
        private StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        public String nextString() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(nextString());
        }

    }
}

