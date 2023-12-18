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
import static java.util.Arrays.copyOfRange;

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

    private static int mod = 1000000007;

    public int cal(int n, int m) {
        while (n > 0) {
            int nn = n % 2;
            int mm = m % 2;
            if (mm > nn) {
                return 0;
            }
            n /= 2;
            m /= 2;
        }
        return 1;
    }

    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int nn = in.nextInt();
        String s = in.next();
        for (int k = 1; k <= 10 && s.length() > 1; k++) {
            StringBuilder sb = new StringBuilder();
            int pre = -1, cnt = 0;
            for (int i = 1; i < s.length(); i++) {
                int ch = Math.abs(s.charAt(i) - s.charAt(i - 1));
                if (ch != pre) {
                    if (cnt > 1) {
                        sb.append(pre);
                    }
                    sb.append(ch);
                    pre = ch;
                    cnt = 1;
                } else {
                    cnt++;
                    if (i == s.length() - 1) {
                        sb.append(pre);
                    }
                }
            }
            s = sb.toString();
            //out.println(s);
        }
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            ans ^= cal(n, i) * (s.charAt(i) - '0');
        }
        out.println(ans);
    }

}

class InputReader {

    private final BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
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
