import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author /\
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        D756 solver = new D756();
        solver.solve(1, in, out);
        out.close();
    }

    static class D756 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            Map<Integer, Integer> factors = new HashMap<>();
            for (int k = 1; k <= n; k++) {
                int i = k;
                while (i % 2 == 0) {
                    factors.put(2, factors.getOrDefault(2, 0) + 1);
                    i /= 2;
                }
                for (int j = 3; j <= Math.sqrt(i); j += 2) {
                    while (i % j == 0) {
                        factors.put(j, factors.getOrDefault(j, 0) + 1);
                        i /= j;
                    }
                }
                if (i > 2) {
                    factors.put(i, factors.getOrDefault(i, 0) + 1);
                }
            }
            int[] divNum = new int[]{2, 4, 24, 14, 74};
            long[] num = new long[5];
            for (int v : factors.values()) {
                for (int i = 0; i < 5; i++) {
                    if (v >= divNum[i]) {
                        num[i]++;
                    }
                }
            }
            long res = 0;
            res += num[4];
            res += num[3] * (num[1] - 1);
            res += num[2] * (num[0] - 1);
            res += num[1] * (num[1] - 1) / 2 * (num[0] - 2);
            out.println(res);
        }

    }

    static class Scanner {
        private StringTokenizer st;
        private BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

