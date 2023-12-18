import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
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
        EReversingAndConcatenating solver = new EReversingAndConcatenating();
        solver.solve(1, in, out);
        out.close();
    }

    static class EReversingAndConcatenating {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int n = in.nextInt(), k = in.nextInt();
            k = Math.min(k, 15);
            String s = in.next();
            String str = s + Utils.reverse(s);

            int best = n - 1;
            for (int i = n; i < str.length(); i++) {
                if (worse(str, best, i, n)) {
                    best = i;
                }
            }
            String result = str.substring(best - n + 1, best + 1);
            result = Utils.reverse(result);
            int tmp = 0;
            while (tmp < result.length() && result.charAt(tmp) == result.charAt(0)) {
                tmp++;
            }
            for (int i = 0; i < n && i < tmp << (k - 1); i++) {
                out.print(result.charAt(0));
            }
            for (int i = tmp << (k - 1), ptr = tmp; i < n; i++) {
                out.print(result.charAt(ptr++));
            }
            out.println();
        }

        private boolean worse(String str, int pos1, int pos2, int len) {
            for (int i = 0; i < len; i++) {
                if (str.charAt(pos1 - i) != str.charAt(pos2 - i)) {
                    if (str.charAt(pos1 - i) < str.charAt(pos2 - i)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
            return false;
        }

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        public FastScanner(String fileName) {
            try {
                br = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
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

    static class Utils {
        public static String reverse(String s) {
            return new StringBuilder(s).reverse().toString();
        }

    }
}

