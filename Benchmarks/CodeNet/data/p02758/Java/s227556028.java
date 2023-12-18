import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeSet;

import static java.util.Arrays.binarySearch;

public class Main {

    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;

        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }
}

class Task {

    private static int mod = 998244353;

    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int n = in.nextInt();
        Robot[] robots = new Robot[n];
        for (int i = 0; i < n; i++) {
            long x = in.nextLong();
            long d = in.nextLong();
            robots[i] = new Robot(x, d);
        }
        Arrays.sort(robots, new Comparator<Robot>() {
            public int compare(Robot o1, Robot o2) {
                return (int) (o1.x - o2.x);
            }
        });
        int[] r = new int[n];
        r[n - 1] = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            long x = robots[i].x + robots[i].d;
            int rr = i;
            while (rr + 1 < n && x > robots[rr + 1].x) {
                rr = r[rr + 1];
            }
            r[i] = rr;
        }
        long[] dp = new long[n + 1];
        dp[n - 1] = 2; dp[n] = 1;
        for (int i = n - 2; i >= 0; i--) {
            dp[i] = (dp[i + 1] + dp[r[i] + 1]) % mod;
        }
        out.println(dp[0]);
    }

    public class Robot {
        public long x, d;

        public Robot(long x, long d) {
            this.x = x;
            this.d = d;
        }
    }

}

class InputReader {

    private final BufferedReader reader;
    private StringTokenizer      tokenizer;

    public InputReader(InputStream stream){
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }

    public String nextLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            tokenizer = new StringTokenizer(nextLine());
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

}
