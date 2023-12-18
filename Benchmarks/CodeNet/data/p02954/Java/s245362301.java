import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
        DGatheringChildren solver = new DGatheringChildren();
        solver.solve(1, in, out);
        out.close();
    }

    static class DGatheringChildren {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            String x = in.next();
            int r[] = new int[x.length()];
            int l[] = new int[x.length()];
            int an[] = new int[x.length()];
            int ans = 0;
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) == 'R') {
                    ans = i;
                }
                r[i] = ans;
            }
            for (int i = x.length() - 1; i >= 0; i--) {
                if (x.charAt(i) == 'L') {
                    ans = i;
                }
                l[i] = ans;
            }
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) == 'L') {
                    if ((i - r[i] + 1) % 2 == 0) {
                        an[r[i] + 1]++;
                    } else {
                        an[r[i]]++;
                    }
                } else {
                    if ((l[i] - i + 1) % 2 == 0) {
                        an[l[i] - 1]++;
                    } else {
                        an[l[i]]++;
                    }
                }
            }
            for (int i = 0; i < x.length(); i++) {
                out.print(an[i] + " ");
            }
            out.println();
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

    }
}

